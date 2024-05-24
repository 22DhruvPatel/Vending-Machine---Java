/**
 * @author Dhruv Patel.
 */

import java.util.Scanner;


/**
 * The class Vending machine
 */
public class VendingMachine {

    //instance variables
    private double  credit;
    private double price;
    private double revenue;
    private String name;
    private int quantity;


    /**
     *
     * It is a constructor.
     *
     * @param name  the name.
     * @param quantity  the quantity.
     * @param price  the price.
     */
    public VendingMachine(String name , int quantity,double price){

        this.name = name;
        this.quantity =quantity;
        this.price =price;
        this.credit = 0.0;
        this.revenue = 0.0;


    }







    /**
     *
     * Coin insert
     *
     * @param coin  the coin.
     * @return double
     */
    public double coinInsert(String coin){


        double v = 0.0;
        switch (coin.toUpperCase()){
            case "T":
                v  = 2.0;
                break;
            case "L":
                v  = 1.0;
                break;
            case "Q":
                v  = 0.25;
                break;
            case "D":
                v  = 0.10;
                break;
            case "N":
                v  = 0.05;
                break;



        }


        credit += v;

        return credit;

    }



    /**
     *
     * Gets the price
     *
     * @return the price
     */
    public double getPrice() {

        return price;
    }


    /**
     *
     * Vend item
     *
     */
    public void vendItem(){

        if(credit>=price && quantity>0) {
            credit -= price;
            revenue += price;
            quantity -=1;
        }


    }



    /**
     *
     * Gets the credit
     *
     * @return the credit
     */
    public double getCredit() {

        return credit;
    }


    /**
     *
     * Coin return
     *
     */
    public void coinReturn(){

        credit=0.0;

    }









    /**
     *
     * To string
     *
     * @return String
     */
    public String toString(){

        return " Vending Machine: " + quantity + " " + name +"     price: $" + price + " ea     credit " + credit + "    revenue " + revenue;
    }

}
