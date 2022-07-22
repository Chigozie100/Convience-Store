package ProductsEntry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void getProductCategory() throws Exception {
        Products products = new Products("Snacks", "potato chips", 10, 1.35);
        assertEquals("Snacks", products.getProductCategory());
    }

    @Test
    void setProductCategory() {
    }

    @Test
    void getProductName() throws Exception {
        Products products = new Products("Snacks", "potato chips", 10, 1.35);
        assertEquals("potato chips", products.getProductName());
    }

    @Test
    void setProductName() {
    }

    @Test
    void getProductQuantity() throws Exception {
        Products products = new Products("Snacks", "potato chips", 10, 1.35);
        assertEquals(10, products.getProductQuantity());
    }

    @Test
    void setProductQuantity() {
    }

    @Test
    void getProductPrice() throws Exception {
        Products products = new Products("Snacks", "potato chips", 10, 1.35);
        assertEquals(1.35, products.getProductPrice());
    }

    @Test
    void setProductPrice() {
    }
}