package Homework4;
public class  Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik");
        Cat catBarsik = new Cat("Barsik");

        // Второе задание
        dogBobik.run(400);
        dogBobik.swim(5);

        catBarsik.run(150);
        catBarsik.swim(5);

        System.out.println("Total animals: " + Animal.animalCount);
        System.out.println("Total dogs: " + Dog.dogCount);
        System.out.println("Total cats: " + Cat.catCount);
    }
}
// Animal class
// 1. Создать классы Собака и Кот с наследованием от класса Животное.
class Animal {
    static int animalCount = 0;
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }


    // 2. Все животные могут бежать и плыть. В качестве параметра каждому
    // методу передается длина препятствия. Результатом выполнения действия
    // будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    // Method for running
    public void run(int distance) {
        System.out.println(name + " ran " + distance + " m.");
    }

    // Method for swimming
    public void swim(int distance) {
        System.out.println(name + " swam " + distance + " m.");
    }
}



//3. У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
// Dog class, inherits from Animal
class Dog extends Animal {
    static int dogCount = 5; // 4. * Добавить подсчет созданных котов, собак и животных.
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    // Constructor
    public Dog(String name) {
        super(name);
        dogCount++;
    }

    // Method for running
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(name + " cannot run that far.");
        }
    }

    // Method for swimming
    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(name + " cannot swim that far.");
        }
    }
}


//3. У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
// Cat class, inherits from Animal
class Cat extends Animal {
    static int catCount = 3; //4. * Добавить подсчет созданных котов, собак и животных.
    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 0; // Cats cannot swim

    // Constructor
    public Cat(String name) {
        super(name);
        catCount++;
    }

    // Method for running
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(name + " cannot run that far.");
        }
    }

    // Method for swimming (overrides Animal's swim method)
    @Override
    public void swim(int distance) {
        System.out.println(name + " cannot swim.");
    }
}



