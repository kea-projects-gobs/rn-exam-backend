package dk.kea.rnexambackend.security.repository;

import dk.kea.rnexambackend.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
