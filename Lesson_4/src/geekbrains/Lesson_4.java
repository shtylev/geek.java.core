package geekbrains;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Lesson_4 {

    public static void main(String[] args) {
        String[] arrStr = {"Вася", "Дима", "Александр", "Игорь", "Дима", "Игорь", "Андрей", "Илья", "Илья", "Алексей", "Максим", "Алексей", "Дима"};
        HashSet<String> hashStr = new HashSet<String>(Arrays.asList(arrStr));
        System.out.println(hashStr);

        HashMap<String, Integer> wordCount = new HashMap<>();
        Integer count;
        for (String str : arrStr) {
            count = wordCount.get(str);
            wordCount.put(str, count == null ? 1 : count + 1);
        }
        System.out.println(wordCount);
        //в принципе можно обойтись и без hashStr, т.к. в wordCount и так содержаться уникальные имена

        //2 задание
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("79999999999", "Фамилия 1");
        phoneDirectory.add("78889999999", "Фамилия 2");
        phoneDirectory.add("79999999999", "Фамилия 1");
        phoneDirectory.add("76669999999", "Фамилия 1");
        phoneDirectory.get("Фамилия 1");
    }
}
