package HomeWork5;
/*Задача:

Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

Для хранения фруктов внутри коробки можно использовать ArrayList;

Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;

Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

Не забываем про метод добавления фрукта в коробку. */
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




