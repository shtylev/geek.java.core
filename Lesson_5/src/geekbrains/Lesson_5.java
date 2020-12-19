package geekbrains;

public class Lesson_5 {

    public static void main(String[] args) {
        String[] header = {"Заголовок 1", "Заголовок 2", "Заголовок 3"};
        int[][] data = {{1, 2, 3}, {4, 5, 6}};
        AppData appData = new AppData(header, data);
        appData.save();
        appData.read();
    }
}
