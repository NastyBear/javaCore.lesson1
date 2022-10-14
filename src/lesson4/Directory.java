package lesson4;

import java.util.*;


public class Directory {

    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.add("1234", "T");
        directory.add("2345", "U");
        directory.add("3456", "I");
        directory.add("4567", "T");

        System.out.println(directory.get("T"));
    }

    HashMap<String, String> hm = new HashMap<>();

    public void add(String number, String surname) {

        hm.put(number, surname);
    }

    public String get(String surname) {
        if (hm.containsValue(surname)) {
            String result = " Фамилия " + surname + " номер:  ";
            for (String str : hm.keySet()) {
                if (hm.get(str).equals(surname)) {
                    result += str + "; ";
                }
            }
            return result;
        }

        return surname;
    }
}




