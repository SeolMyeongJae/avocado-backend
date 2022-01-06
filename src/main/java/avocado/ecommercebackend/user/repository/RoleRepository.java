package avocado.ecommercebackend.user.repository;

import avocado.ecommercebackend.user.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
