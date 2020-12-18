package geekbrains;

import model.MyArrayDataException;
import model.MyArraySizeException;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "1";
            }
        }

        try {
            System.out.println(SummArrayValues(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static int SummArrayValues(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4)
            throw new MyArraySizeException("Размер массива не равен 4!");

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length != 4 || array[i] == null)
                    throw new MyArraySizeException("Размер массива не равен 4!");

                if (isInt(array[i][j]))
                    result += Integer.parseInt(array[i][j]);
                else
                    throw new MyArrayDataException(String.format("В строке %d столбце %d содержится не целое число!", i + 1, j + 1));
            }
        }
        return result;
    }

    static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
