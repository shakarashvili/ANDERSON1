package Homework4;

import java.util.HashMap;
import java.util.Map;
//7. Создать класс Park с внутренним классом, с помощью
// объектов которого можно хранить информацию об аттракционах,
// времени их работы и стоимости.
public class Park {
    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("train for babies", "10:00 - 20:00", 5.0);
        park.addAttraction("tomy", "12:00 - 22:00", 10.0);
        park.addAttraction("Carousel", "11:00 - 19:00", 3.0);

        // Получение информации об аттракциях и их вывод
        Attraction tomy = park.getAttraction("Ferris Wheel");
        System.out.println("Attraction: " + tomy.getName());
        System.out.println("Opening Hours: " + tomy.getOpeningHours());
        System.out.println("Cost: $" + tomy.getCost());
    }
    // Внутренний класс для представления аттракции
    private class Attraction {
        private String name;
        private String openingHours;
        private double cost;

        public Attraction(String name, String openingHours, double cost) {
            this.name = name;
            this.openingHours = openingHours;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getOpeningHours() {
            return openingHours;
        }

        public double getCost() {
            return cost;
        }
    }

    private Map<String, Attraction> attractions; // Карта аттракций

    // Конструктор класса Park
    public Park() {
        attractions = new HashMap<>();
    }

    // Метод для добавления аттракции в парк
    public void addAttraction(String name, String openingHours, double cost) {
        Attraction attraction = new Attraction(name, openingHours, cost);
        attractions.put(name, attraction);
    }

    // Метод для получения информации об аттракции по её имени
    public Attraction getAttraction(String name) {
        return attractions.get(name);
    }



}
