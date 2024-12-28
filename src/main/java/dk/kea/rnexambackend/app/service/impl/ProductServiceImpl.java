package dk.kea.rnexambackend.app.service.impl;

import dk.kea.rnexambackend.app.dto.ProductDTO;
import dk.kea.rnexambackend.app.entity.Product;
import dk.kea.rnexambackend.app.repository.ProductRepository;
import dk.kea.rnexambackend.app.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.map(this::convertProductToDTO)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public ProductDTO convertProductToDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getRemaId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        return dto;
    }

    @Override
    public Product convertProductToEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setRemaId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return product;
    }
}
