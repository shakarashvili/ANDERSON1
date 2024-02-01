package Lessons3.oop;

public class Main {
    public static void main(String[] args) {
        Recipe saltedwater = new Recipe();// პირველი ობიექტი
        saltedwater.getinfo();
        System.out.println(saltedwater.timetocook);
        saltedwater.title = "water with salt";
        saltedwater.price = 10;
        saltedwater.listofingredients = new String[]{"salt and water"};
        saltedwater.getinfo();

        Recipe saltwater2 = saltedwater;   // ამით შევცვალეთ პირველი ობიექტის  მნიშვნელობა მეორეთი
        saltwater2.price = 12;
        System.out.println(">>>>>>>>>>>>>>");
        saltedwater.getinfo();
        System.out.println(">>>>>>>>>>>>>");
        saltwater2.getinfo();
    }
}









