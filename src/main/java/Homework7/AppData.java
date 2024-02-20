package Homework7;

import java.io.*;
import java.util.*;

public class AppData {
//1. Реализовать сохранение данных в csv файл;

//2. Реализовать загрузку данных из csv файла. Файл читается целиком.
public static void main(String[] args) {
    // Example usage
    AppData appData = new AppData(
            new String[]{"Value 1", "Value 2", "Value 3"},
            new int[][]{{100, 200, 123}, {300, 400, 500}}
    );

    // Save data to CSV file
    appData.save("data.scv");

    // Load data from CSV file
    appData.load("data.scv");
}

    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    // Метод сохранения данных в файл csv
    public void save(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            // Write header
            writer.println(String.join(";", header));

            // Write data
            for (int[] row : data) {
                writer.println(Arrays.toString(row).replaceAll("Desktop\\scv", "Desktop\\scv"));
            }
        } catch (IOException e) {
            System.out.println("Error saving data to CSV file: " + e.getMessage());
        }
    }

    // Метод загрузки данных из CSV-файла
    public void load(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading data from CSV file: " + e.getMessage());
        }

        // Обрабатываем загруженные данные
        // Здесь вы должны проанализировать строки и заполнить массивы заголовков и данных
    }


}

