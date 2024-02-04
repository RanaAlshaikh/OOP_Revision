package org.example;

public abstract class Product {
    private int id;
    private double price;
    private String name;
    private double weight;
    private static int quantity;

    public Product(int id, double price, String name, double weight ){
        this.id = id;
        this.price = price;
        this.name = name;
        this.weight = weight;
        quantity ++;
    }
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public final void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }
    
    public abstract void getSellableStatus();
    
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setWeight(double weight) {
        if (weight < 0){ 
                throw new IllegalArgumentException("invallied wegiht value");        
        }    
          this.weight= weight;
    }

    public int getTotalQuantity(){
        return quantity;
    }


    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }
}
