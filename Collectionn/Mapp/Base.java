package Collectionn.Mapp;

import java.util.HashMap;
import java.util.Map;

public class Base {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("akshay", 23);
        students.put("rohit", 21);
        students.put("nikhil", 22);
        students.put("atharva", 24);
        students.put("pd", 30);

        // System.out.println(students);

        // System.out.println(students.get("nikhil"));

        // System.out.println(students.keySet());
        // System.out.println(students.values());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}
