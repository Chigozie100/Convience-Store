package ProductsEntry;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CustomerDTO {
    private String customerName;
    private String productName;
    private int productQuantity;
}

