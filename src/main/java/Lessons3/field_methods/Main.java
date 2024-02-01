package Lessons3.field_methods;

public class Main {
    public static void main(String[] args) {
        ExampleStatic exampleStatic = new ExampleStatic();
        exampleStatic.nonstaticmethod();
        System.out.println(exampleStatic.nonstaticString);

        ExampleStatic.staticmethod();
        System.out.println(ExampleStatic.staticString);
        ExampleStatic.staticmethod();


    }
}






















