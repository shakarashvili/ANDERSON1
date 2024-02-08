package HomeWork5;

import java.util.ArrayList;

class Fruit { // Класс Fruit


    public float getWeight() {
        return 0;
    }

}

class Apple extends Fruit {  // Класс для яблок, наследующий Fruit
    private static final float WEIGHT = 3.5f;

    public float getWeight() {
        return WEIGHT;
    }
}

class Orange extends Fruit {
    // Класс для апельсинов, наследующий Fruit
    private static final float WEIGHT = 5.5f;

    public float getWeight() {
        return WEIGHT;
    }
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0.5f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0100f;
    }

    public void transferFruitsToAnotherBox(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }
        if (this.fruits.isEmpty()) {
            return;
        }
        if (!this.fruits.get(0).getClass().equals(otherBox.fruits.get(0).getClass())) {

            return;
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}




