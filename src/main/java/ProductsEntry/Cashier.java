package ProductsEntry;

import java.util.*;

public class Cashier extends Employees{
private Queue<CustomerDTO> carrotList = new PriorityQueue<>(new CustomerDTOComparation());
private Queue<CustomerDTO> potatochipsList = new PriorityQueue<>(new CustomerDTOComparation());
private Queue<CustomerDTO> oatmealList = new PriorityQueue<>(new CustomerDTOComparation());
private Queue<CustomerDTO> wholewheatList = new PriorityQueue<>(new CustomerDTOComparation());

    public Queue<CustomerDTO> getCarrotList() {
        return carrotList;
    }

    public Queue<CustomerDTO> getPotatochipsList() {
        return potatochipsList;
    }

    public Queue<CustomerDTO> getOatmealList() {
        return oatmealList;
    }

    public Queue<CustomerDTO> getWholewheatList() {
        return wholewheatList;
    }

    public Cashier(String employeeName, int employeeId) {
        super(employeeName, employeeId);
    }

    public void setProductQueue(List<Customer> customer){
        for (Customer cus : customer) {
            for (Products pro : cus.getCustomerCart()) {
                if (pro.getProductName().equalsIgnoreCase("Carrot")) {
                    carrotList.offer(new CustomerDTO(cus.getCustomerName(), pro.getProductName(), pro.getProductQuantity()));
                } else if (pro.getProductName().equalsIgnoreCase("Potato Chips")) {
                    potatochipsList.offer(new CustomerDTO(cus.getCustomerName(), pro.getProductName(), pro.getProductQuantity()));
                } else if (pro.getProductName().equalsIgnoreCase("oat meal")) {
                    oatmealList.offer(new CustomerDTO(cus.getCustomerName(), pro.getProductName(), pro.getProductQuantity()));
                } else if (pro.getProductName().equalsIgnoreCase("whole wheat")) {
                    wholewheatList.offer(new CustomerDTO(cus.getCustomerName(), pro.getProductName(), pro.getProductQuantity()));
                }
            }
        }
    }

    public void sellByPriority(Queue<CustomerDTO> products){
            while (!products.isEmpty()){
                System.out.println(products.poll());
        }
    }


    public void makeSales(Customer myCustomer){

    }

}
