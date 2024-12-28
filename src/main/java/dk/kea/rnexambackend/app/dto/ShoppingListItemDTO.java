package dk.kea.rnexambackend.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingListItemDTO {
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
    private Double totalPrice;  // price * quantity
}
