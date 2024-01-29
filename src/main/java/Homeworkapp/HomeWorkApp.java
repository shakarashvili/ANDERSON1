package Homeworkapp;

public class HomeWorkApp {

    public static void  checkSumSign(){ // Exercise 3

        int a = 5;
        int b = 10;
        int c = a + b;
        boolean result = (c > 0);
            System.out.println(result);


    }
    public static void printclor(){    //Exercise 4


        int val = 120;
        if (val <= 0 ) {
            System.out.println("red");
        } else if (val <=100) {
            System.out.println("yellow");
        } else if (val > 100 ) {
            System.out.println("green");

        }

    }

    public static void compareNumbers(){ //Exercise 5


        int a = 20;
        int b = 30;

        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }


    }
    public static void main(String[] args) { // Exercise 1- I created main method and my porject already on the github

        // Exercise 2
        System.out.println("Orange, Banana, Apple.");

        // Exercise 3
        checkSumSign();

        // Exercise 4
        printclor();

        //Exercise 5
        compareNumbers();

        /* Exercise 6 - if I correctly understood ,in exercise 6 ,I need to call
        methods in main method what already I did */
    }
    }



