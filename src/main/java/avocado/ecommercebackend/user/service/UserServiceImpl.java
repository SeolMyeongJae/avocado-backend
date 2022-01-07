package avocado.ecommercebackend.user.service;

import avocado.ecommercebackend.user.dto.UserDto;
import avocado.ecommercebackend.user.model.Role;
import avocado.ecommercebackend.user.model.User;
import avocado.ecommercebackend.user.repository.RoleRepository;
import avocado.ecommercebackend.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if(user == null) {
            log.error("User not found in the database.");
            throw new UsernameNotFoundException("User not found in the database.");
        } else {
            log.info("User found in the database. : {}", username);
        }

        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getUserPassword(), authorities);
    }


    @Override
    public User addUser(UserDto userDto) {
        log.info("새로운 유저를 데이터베이스에 저장했습니다.: {}", userDto.getUserName());
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        User user = User.builder()
                .userName(userDto.getUserName())
                .userEmail(userDto.getUserEmail())
                .userPassword(userDto.getPassword())
                .build();
        addRoleByUser(user, "User");
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        log.info("모든 유저를 리스트로 불러왔습니다.");
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        log.info("해당 유저를 찾았습니다. : {}", id);
        return Optional.ofNullable(userRepository.findById(id)).get();
    }

    @Override
    public void addRole(Role role) {
        log.info("새로운 권한을 데이터베이스에 저장했습니다. : {}", role.getName());
        roleRepository.save(role);
    }

    @Override
    public void addRoleByUser(User user, String roleName) {
        log.info("{} 권한을 추가했습니다. ", roleName);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }
}

