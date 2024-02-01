package Lessons3.field_methods;

public class ExampleStatic {
    public static String staticString = "StaticString";
    public  String nonstaticString = "nonStaticString";
    public static void staticmethod() {
        System.out.println("static method");

    }
    public  void nonstaticmethod() {
        System.out.println("nonstatic method");

    }
    public void printnonstatic(){
        nonstaticmethod();
        System.out.println(nonstaticString);
        staticmethod();
        System.out.println(nonstaticString);

    }
    public static void printstatic2(){

    }
}





















