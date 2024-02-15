package Homework8;

import java.util.HashMap;
import java.util.*;
/*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.Написать простой класс Телефонный Справочник,
который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с
помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона
по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода
результатов проверки телефонного справочника.*/

public class Main {

    public static void main(String[] args) {
        String[] words = {"Elephant", "Bear", "Elephant", "Wolf", "Cat", "Bear", "Wolf","Fox",
                "mouse", "Wolf", "Cat"};

        // Находим уникальные слова и подсчитываем их количество
        Map<String, Integer> wordCounter = new HashMap<>();
        for (String word : words) {
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и их количество
        System.out.println("количество:");
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Создаем телефонный справочник
        Phonebook phonebook = new Phonebook();
        phonebook.add("gogoladze", "595732934");
        phonebook.add("beriashvili", "571097509");
        phonebook.add("ivanov", "555428943");

        // Поиск номеров по фамилии
        System.out.println("\nНомера телефонов по фамилии:");
        System.out.println("gogoladze: " + phonebook.get("gogoladze"));
        System.out.println("beriashvili: " + phonebook.get("beriashvili"));
        System.out.println("ivanov: " + phonebook.get("ivanov"));
    }
}

class Phonebook {
    private Map<String, List<String>> phoneNumbers = new HashMap<>();


    //Давайте перейдем к аргументам
    public void add(String lastName, String phoneNumber) {

        List<String> numbers = phoneNumbers.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneNumbers.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        return phoneNumbers.getOrDefault(lastName, Collections.emptyList());
    }
}


