package dk.kea.rnexambackend.app.service.impl;

import dk.kea.rnexambackend.app.dto.ProductDTO;
import dk.kea.rnexambackend.app.entity.Product;
import dk.kea.rnexambackend.app.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductDTO getProductById(Long id) {
        return null;
    }

    @Override
    public ProductDTO convertToDTO(Product product) {
        return null;
    }

    @Override
    public Product convertToEntity(ProductDTO productDTO) {
        return null;
    }
}
