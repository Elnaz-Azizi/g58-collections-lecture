package se.lexicon;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        // Map doesn't store single value, it stores key-value pairs
     Map<String, String> contactMap = new java.util.HashMap<>();
        contactMap.put("Simon", "simon@lexicon.se");
        contactMap.put("Ulf", "ulf@lexicon.se");
        contactMap.put("Mehrdad", "mehrdad@lexicon.se");

       // Retrieve a value by the key
        System.out.println(contactMap.get("Mehrdad")); // mehrdad@lexicon.se
        System.out.println(contactMap.get("Elnaz")); // null

        if (contactMap.containsKey("Mehrdad")) {
            System.out.println(contactMap.get("Mehrdad"));
        }

        System.out.println(contactMap.keySet());

        System.out.println(contactMap.values());
    }
}
