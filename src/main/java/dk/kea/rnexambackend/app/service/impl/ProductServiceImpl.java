package dk.kea.rnexambackend.app.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import dk.kea.rnexambackend.app.dto.ProductDTO;
import dk.kea.rnexambackend.app.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ProductServiceImpl implements ProductService {
    private final RestTemplate restTemplate;
    private final String REMA_API_URL = "https://cphapp.rema1000.dk/api/v3/products";

    public ProductServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    @Override
    public ProductDTO getProductById(Long remaId) {
        String url = REMA_API_URL + "/" + remaId;
        JsonNode response = restTemplate.getForObject(url, JsonNode.class);

        if (response.has("data")) {
            return convertProductToDTO(response.get("data"));
        }
        throw new RuntimeException("Product not found");
    }
    @Override
    public ProductDTO convertProductToDTO(JsonNode product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.get("id").asLong());
        dto.setName(product.get("name").asText());

        // Get the current price from the rema price array
        JsonNode price = product.get("prices");
        if (price.isArray() && !price.isEmpty()) {
            dto.setPrice(price.get(0).get("price").asDouble());
        }
        return dto;
    }
}
