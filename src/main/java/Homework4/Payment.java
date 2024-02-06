package Homework4;

import java.util.ArrayList;
import java.util.List;

//6. Создать класс Payment с внутренним
// классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
public class Payment {// Внутренний класс для представления продукта
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct("Milk", 2.5);
        payment.addProduct("Bread", 1.5);
        payment.addProduct("Eggs", 3.0);

        payment.printReceipt();
    }
    private class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    private List<Product> products; // Список продуктов

    // Конструктор класса Payment
    public Payment() {
        products = new ArrayList<>();
    }

    // Метод для добавления продукта в покупку
    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
    }

    // Метод для получения общей суммы покупки
    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Метод для вывода информации о покупке
    public void printReceipt() {
        System.out.println("Receipt:");
        for (Product product : products) {
            System.out.println(product.name + " - $" + product.price);
        }
        System.out.println("Total: $" + getTotalAmount());
    }

}
