package ProductsEntry;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getTotalItemInCart() throws Exception {

        List<Products> customercart = List.of(new Products("Snacks", "potato chips", 10, 1.35),
                new Products("Cookies", "chocolate chip", 15, 1.87));
        int balance = 0;
        for (Products i : customercart) {
            balance = i.getProductQuantity();
        }
        assertEquals(15, balance);

    }

    @Test
    void getCustomerName() throws Exception {
        Store store = new Store();
        Customer customer = new Customer("Gozie",1, store.getProductList());
        assertEquals("Gozie", customer.getCustomerName());

    }

    @Test
    void buyProduct() throws Exception {
        Products products = new Products("Cookies", "chocolate chip", 15, 1.87);
        int balance = products.getProductQuantity();
        assertEquals(15, balance, 0);
    }



}