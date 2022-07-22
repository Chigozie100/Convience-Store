package ProductsEntry;

import ProductsEntry.Enums.ProductStatus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {
    private ArrayList<Products> products;
    private HashMap<String, List<Products>> productList = new HashMap<>();
    private ProductStatus productStatus;
    private ArrayList<Products> temp = new ArrayList<>();

    public void setProducts(){
        String path = "/Users/user/Documents/ Decagon java Assignments/week2 assignment/FoodSales.csv";
        try( BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";

            int iterate = 0;
            while ((line = br.readLine()) != null){
                if (iterate == 0){
                    iterate++;
                    continue;
                }
                String[] str = line.split(",");
                Products listOfProducts = new Products(str[3], str[4], Integer.parseInt(str[5]), Double.parseDouble(str[6]));

                boolean found = false;
                for (Products item: temp){
                        if(item.getProductName().equals(listOfProducts.getProductName())){
                        item.setProductQuantity(item.getProductQuantity() + listOfProducts.getProductQuantity());
                        found = true;
                    }
                    if(item.getProductQuantity() <= 0) productStatus = ProductStatus.OUT_OF_STOCK;
                    else productStatus = ProductStatus.IN_STOCK;
                }
                if (!found){
                    temp.add(listOfProducts);
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        for(Products item: temp){
            if (productList.containsKey(item.getProductCategory())){
                productList.get(item.getProductCategory()).add(item);
            }
            else{
                ArrayList<Products> temp2 = new ArrayList<>();
                temp2.add(item);
                productList.put(item.getProductCategory(), temp2);
            }
        }

    }

    public HashMap<String, List<Products>> getProductList() {
        return productList;
    }

    public void setProductList(HashMap<String, List<Products>> productList) {
        this.productList = productList;
    }
}
