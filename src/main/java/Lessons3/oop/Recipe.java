package Lessons3.oop;

import java.util.Arrays;

public class Recipe {
    public Recipe(String title, int price , String[] listofingredients){
        System.out.println("i am consturctor from line 8");
        this.title = title;
        this.price = price;
        this.listofingredients = listofingredients;
    } // ასე განსხვავდება ერთმანეთისგან კონსტრუქტორები

    public Recipe(String title, int price, boolean isVegan, double timetocook, String[] listofingredients) {
        this.title = title;
        this.price = price;
        this.isVegan = isVegan;
        this.timetocook = timetocook;
        this.listofingredients = listofingredients;

    }
    public  Recipe(String title,int price, boolean isVegan , String[] listofingredients){
        this(title,price,listofingredients);
        this.isVegan = isVegan;
        this.timetocook = 0.3;
      /* this.title = title;
        this.price = price; */

    }


    /* public Recipe( int priceofdish, String nameofdish ){
            title = nameofdish;
            price = priceofdish;

        } */
    public Recipe(){}
    public String title;
    public int price;
    public boolean isVegan;
    public double timetocook;
    public String[] listofingredients;
    public void getinfo(){
        System.out.println("Titile o dish : " + title); // რადგანე ეს ტაითლ მაღლა იყო სხვა კლაში რომ გმოვიძახეთ ეს გეთ მეთოდი მაგიტო დაიბეჭდა
        System.out.println("price:" + price);
        System.out.println("list of ingredients:" + Arrays.toString(listofingredients));






    }
}






















