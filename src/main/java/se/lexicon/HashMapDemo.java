package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Map doesn't store single value, it stores key-value pairs

        //Map<String, String> contactMap = new java.util.HashMap<>();
        Map<String, String> contactMap = new HashMap<>();
        contactMap.put("Simon", "simon@lexicon.se");
        contactMap.put("Ulf", "ulf@lexicon.se");
        contactMap.put("Mehrdad", "mehrdad@lexicon.se");

       // Retrieve a value by the key
        System.out.println(contactMap.get("Mehrdad")); // mehrdad@lexicon.se
        System.out.println(contactMap.get("Elnaz")); // null

        if (contactMap.containsKey("Mehrdad")) {
            System.out.println(contactMap.get("Mehrdad"));
        }

        // Retrieving all keys
        System.out.println(contactMap.keySet());

        // Retrieving all values
        System.out.println(contactMap.values());
    }
}
