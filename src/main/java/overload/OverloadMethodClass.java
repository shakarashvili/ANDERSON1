package overload;

public class OverloadMethodClass {
    public static void main(String[] args) {
        OverloadMethodClass overloadMethodClass = new OverloadMethodClass();
        overloadMethodClass.dosmth();
        overloadMethodClass.dosmth("Text");
        new OverloadMethodClass().dosmth("text" , 2 ,3);
        System.out.println(overloadMethodClass.dosmth("key" , 3 ,5,7));

    }
    public void dosmth() {
        System.out.println("i am empty");

    }
    public void dosmth(String text) {
        System.out.println("i have text : " + text);

    }
    public  void dosmth(String text , int number, int number2 ){
        System.out.println("i have text:" + " i have number" + number);


    }
    public  int  dosmth(String text , int number , int number3 , int number4){
        System.out.println("i have text:" + " i have number" + number);
        return number + number3;


    }
}












































