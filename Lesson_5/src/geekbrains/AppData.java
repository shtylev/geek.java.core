package geekbrains;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demo.csv"), "Windows-1251"))) {
            for (int i = 0; i < header.length; i++) {
                writer.append(header[i] + (i == header.length - 1 ? "\n" : ";"));
            }

            for (int i = 0; i < data.length; i++){
                for (int j = 0; j < data[i].length; j++){
                    writer.append(data[i][j] + (j == data[i].length - 1 ? "\n" : ";"));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("demo.csv"), "Windows-1251"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
