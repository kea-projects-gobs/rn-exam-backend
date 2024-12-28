package dk.kea.rnexambackend.app.service;

import dk.kea.rnexambackend.app.dto.ProductDTO;
import dk.kea.rnexambackend.app.entity.Product;

public interface ProductService {
    ProductDTO getProductById(Long id);
    ProductDTO convertProductToDTO(Product product);
    Product convertProductToEntity(ProductDTO productDTO);
}
