package Lessons3.BearEx;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("miha", true);
        bear.getInfo();
        bear.setAge(19);
        bear.getInfo();
        Bear bear2 = new Bear("angelina " , false);
        Bear bear3 = new Bear("miha2", true);
        Bear miniBear1 = bear.makebabyBear(bear2, "max", true);
        Bear miniBear2 = bear.makebabyBear(bear3, "alona" , false);
        miniBear1.getInfo();
        System.out.println("_______");
        miniBear2.getInfo();
    }
}


























