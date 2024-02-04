package org.example;

import java.time.LocalDate;

public class App{

    public static void main(String[]args){
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",100.10 ,LocalDate.parse("2024-01-01"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",500,LocalDate.parse("2024-02-02"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta",600.60 , LocalDate.parse("2024-02-04"));
        System.out.println("Total Quantity: " + p3.getTotalQuantity());
        
        
          Product p4 = new FoodProduct(1234, 9.99, "water", 700.71 ,LocalDate.parse("2024-02-24"));
          FoodProduct p5 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 880
               ,LocalDate.parse("2022-06-07"));
             ElectricProduct p6 = new ElectricProduct(4875, 30.0,"Extension cord",900, "220v");
             
             
       Product[] products = {p1,p2,p3,p4,p5,p6};
       for(Product p: products){
           System.out.println(p);
       }
       
       p1.setWeight(11);
       
             
    }
}
