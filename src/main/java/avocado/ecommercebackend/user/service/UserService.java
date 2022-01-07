package avocado.ecommercebackend.user.service;

import avocado.ecommercebackend.user.dto.UserDto;
import avocado.ecommercebackend.user.model.Role;
import avocado.ecommercebackend.user.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User addUser(UserDto userDto);

    List<User> getAllUser();

    Optional<User> getUser(Long id);

    void addRole(Role role);

    void addRoleByUser(User user, String roleName);
}

