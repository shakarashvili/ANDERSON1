package Homework2;

import java.util.Arrays;
import java.util.Random;

public class Lesson_2 {
    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();

    }

    public static void exercise1(){   // exercise 1
        int a = 7;
        int b = 10;
        int c = a + b;
        boolean result = c >= 10 && c <= 20;

        System.out.println(result);

    }
    public static void exercise2(){ // exercise 2
        int d = 23;
        if (d >= 0 ){
            System.out.println("number is positive");
        }  else if (d < 0){
            System.out.println("negative");
        }

    }

    public static void exercise3(){ // exercise 3

        Random random = new Random();
        int randomint = random.nextInt(-100,100);
        System.out.println(randomint);
        boolean result = randomint >= 0;
        System.out.println(result);
    }

    public static void exercise4(){  // exercise 4
        String a = "hello world again";
        int num1 = 1;
        while (num1 <= 5){
            System.out.println(a);
            num1++;
        }

        Random random = new Random();
        int random2 = random.nextInt(365,366);
        System.out.println(random2);
        boolean result2 = random2 <= 365;
        System.out.println(result2);


    }

    public static void exercise5(){ //exercise 5

       int[] masive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
       for (int i = 0; i < masive.length; i++){
           if (masive[i] == 1) {
               masive[i] = 0;
           } else if (masive[i] == 0) {
               masive[i] = 1;
           }
           System.out.println(masive[i]);
       }

    }

public static void exercise6(){ // exercise 6

        int[] array = new int[101];

    for(int i = 1; i < array.length; i++){
        array[i] = (i);

    }
    System.out.println(Arrays.toString(array));
}

public static void exercise7(){ // exercise 7

    int a[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < a.length; i++){
        if (a[i] < 6){
            System.out.println(a[i]+" * 2 = ");
            int i1 = a[i] * 2;
            System.out.println(i1);

        }
    }

    }

    public static void exercise8(){ //exercise 8

      int[] array3 = new int[5];

        array3[0]= 23;
        array3[1] = 32;
        array3[2] = 48;
        array3[3] = 64;
        array3[4] = 100;
        System.out.println(Arrays.toString(array3));

        int[] array4 = new int[4];
        array4[0] = 1;
        array4[1] = 2;
        array4[2] = 3;
        array4[3] = 4;
        System.out.println(Arrays.toString(array4));
    }


}
