package ProductsEntry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class StoreTest {

    @Test
    public void setProducts() throws Exception {
        HashMap<String, String> testData = new HashMap<>();
        testData.put("Bars", "Carrot");
        testData.put("Cookies", "Oatmeal Raisin");
        testData.put("Crackers", "Whole Wheat");
        testData.put("Snacks", "Potato Chips");

        assertEquals(testData.containsKey("Bars"), testData.containsValue("Carrot"));
        assertEquals(testData.containsKey("Cookies"), testData.containsValue("Oatmeal Raisin"));
        assertEquals(testData.containsKey("Crackers"), testData.containsValue("Whole Wheat"));
        assertEquals(testData.containsKey("Snacks"), testData.containsValue("Potato Chips"));

    }

    @Test
    void getProductList() {
    }

    @Test
    void setProductList() {
    }
}