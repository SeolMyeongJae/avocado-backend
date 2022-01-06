package avocado.ecommercebackend.user.repository;

import avocado.ecommercebackend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}

