package HomeWork5;

public class Main extends Fruit {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        // Первый шаг
        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight());
        // Второй шаг
        System.out.println(" appleBox1 equal appleBox2 ? " + appleBox1.compare(appleBox2));
        System.out.println(" appleBox1 equal orangeBox ? " + appleBox1.compare(orangeBox));
        // ретий шаг
        appleBox1.transferFruitsToAnotherBox(appleBox2);

        System.out.println("Weight of appleBox1 after transfer: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2 after transfer: " + appleBox2.getWeight());
    }
}
