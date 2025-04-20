package ma.enset.products.entities;

import lombok.Data;

@Data
public class product {
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
