// Ex.3.12: Invoice class
// An invoice for an item sold at the store
package com.company;

public class Invoice {

    private String number, description;
    private int quantity;
    private double price;

    // a constructor that initializes the four instance variables
    public Invoice(String number, String description, int quantity, double price){

        //assign names to instance variables
        this.number = number;

        this.description = description;

        if (quantity > 0)
        this.quantity = quantity;

        if (price > 0.0)
        this.price = price;
    }

    //methods to set and retrieve the variables
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public void setQuantity(int quantity){
        if (quantity > 0)
        this.quantity = quantity;
        else this.quantity = 0;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price){
        if (price > 0.0)
        this.price = price;
        else this.price = 0.0;
    }
    public double getPrice(){
        return price;
    }

    //a method that calculates the invoice amount
    public double getInvoiceAmount(){
        double amount = quantity * price;
        return amount;
    }

}
