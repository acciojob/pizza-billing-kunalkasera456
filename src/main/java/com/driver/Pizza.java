package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;

    private int toppings;

    boolean isExtraCheesAdded;
    boolean isExtraTopingsAdded;
    boolean isTakeaway;
    boolean isBillCreated;

    public Pizza(boolean isVeg){   //constructor
        this.isVeg = isVeg;
        // your code goes here
        isExtraCheesAdded = false;
        isExtraTopingsAdded = false;
        isTakeaway = false;
        isBillCreated = false;
        this.bill = "";


        if(isVeg)
        {
            this.price = 300;
            this.toppings = 70;
        }
        else
        {
            this.price = 400;
            this.toppings = 120;
        }

        this.bill += "Base Price Of The Pizza: " + this.price +"\n";


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheesAdded)
        {
            this.price = this.price + 80;
            this.isExtraCheesAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopingsAdded)
        {
            this.price = this.price + this.toppings;
            isExtraTopingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway)
        {
            this.price += 20;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (isExtraCheesAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraTopingsAdded == true) {
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeaway == true) {
                this.bill += "Paperbag Added: 20"+"\n";
            }
            this.bill += "Total Price: "+this.price;
            isBillCreated = true;
            return this.bill;
        }
        return "";
        
    }
}
