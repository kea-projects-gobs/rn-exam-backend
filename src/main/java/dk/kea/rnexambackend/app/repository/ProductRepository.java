package dk.kea.rnexambackend.app.repository;

import dk.kea.rnexambackend.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
