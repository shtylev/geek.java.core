package geekbrains;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class PhoneDirectory {
    private HashMap<String, String> directory = new HashMap<>();

    public void add(String phone, String surname) {
        if (directory.size() != 0){
            if (directory.get(phone) == null)
                directory.put(phone, surname);
            else
                System.out.printf("Телефон %s уже есть в справочнике\n", phone);
        } else directory.put(phone, surname);
    }

    public void get(String surname) {
        HashMap<String, String> result = new HashMap<>();
        Iterator iter = directory.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry sur = (Map.Entry)iter.next();
            if (sur.getValue() == surname) {
                result.put((String) sur.getKey(), (String) sur.getValue());
            }
        }

        System.out.println(result);
    }
}
