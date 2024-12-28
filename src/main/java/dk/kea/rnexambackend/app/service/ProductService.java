package dk.kea.rnexambackend.app.service;

import com.fasterxml.jackson.databind.JsonNode;
import dk.kea.rnexambackend.app.dto.ProductDTO;

public interface ProductService {
    ProductDTO getProductById(Long id);
    ProductDTO convertProductToDTO(JsonNode product);
}
