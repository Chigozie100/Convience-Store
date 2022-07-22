package ProductsEntry;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        //STORE
        Store store = new Store();
        store.setProducts();
        Cashier cashier=new Cashier("Bla", 1234);

        //PRODUCTS
        List<Products> customercart = List.of( new Products("Snacks", "potato chips", 10, 1.35),
                                    new Products("Cookiesrm", "chocolate chip", 15, 1.87));

        //CUSTOMER
        Customer customer = new Customer("Gozie",1, store.getProductList());
        customer.buyProduct(customercart);

        System.out.println(customer.getCustomerCart());

        List<Customer> lisOfCustomers = List.of(new Customer("John", 101, List.of(new Products("Bars","Carrot",12,1.77), new Products("snacks", "potato Chips", 20, 1.68))),
                new Customer("Ada", 103, List.of(new Products("Crackers", "Whole Wheat", 456, 3.49), new Products("Bars", "Carrot", 10, 1.77))),
                new Customer("Obum", 104, List.of(new Products("Cookies", "Oatmeal Raisin", 754, 2.84), new Products("Carckers", "Whole Wheat", 5, 3.49))),
                new Customer("Kosi", 105, List.of(new Products("Snacks", "Potato Chips", 23, 1.68), new Products("Cookies", "Oatmeal Raisin", 25, 3.49))));

       // cashier
        Cashier cashier1 = new Cashier("Cjah", 1002);
        cashier1.setProductQueue(lisOfCustomers);

        cashier1.sellByPriority(cashier1.getCarrotList());
        cashier1.sellByPriority(cashier1.getOatmealList());
        cashier1.sellByPriority(cashier1.getPotatochipsList());
        cashier1.sellByPriority(cashier1.getWholewheatList());

    }
}
