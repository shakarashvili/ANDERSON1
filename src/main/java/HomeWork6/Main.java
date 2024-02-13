package HomeWork6;

public class Main {

    public static void main(String[] args) {
        /*1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
        При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
         */
        String[][] array = {
                {"21", "2", "3", "4"},
                {"55", "60", "14", "8"},
                {"9", "19", "11", "12"},
                {"13", "41", "25", "16"}
        };

        try {
            int sum = sumArrayElements(array);
            System.out.println("Sum of array elements: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Array size is not 4x4");
        } catch (MyArrayDataException e) {
            System.out.println("Invalid data at row " + e.getRow() + ", column " + e.getColumn());
        }
    }

    /*2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
     текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
     в какой именно ячейке лежат неверные данные. */
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
 /*3. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета. */
class MyArraySizeException extends Exception {
}

class MyArrayDataException extends Exception {
    private int row;
    private int column;

    public MyArrayDataException(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}

