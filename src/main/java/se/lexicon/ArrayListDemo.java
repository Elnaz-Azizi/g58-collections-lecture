package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ex4();

    }

    public static void ex1() {
        ArrayList<String> books = new ArrayList<>();//Integer, Double

        //Add elements to the list
        books.add("Java");
        books.add("Java");
        books.add("Spring");
        books.add("React");
        books.add("Clean Code");
        books.add("OCP");
        books.add("OCP");// accepted duplicate

        System.out.println(books); // [Java, Java, Spring, React, Clean Code, OCP, OCP]
        System.out.println(books.size()); // 7

        System.out.println(books.get(0)); // Java
        System.out.println(books.get(1)); // Java
        System.out.println(books.get(2)); // Spring
        //System.out.println(books.get(10)); // IndexOutOFBoundException

        //Using iterator for traversal
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            if (book.equals("OCP")) {
                iterator.remove();
            }
        }
        System.out.println(books);
        System.out.println(books.size());


    }

    public static void ex2() {
        ArrayList<Integer> numbers = new ArrayList<>(); //collections store objects not primitive types
        numbers.add(100);
        numbers.add(100);
        numbers.add(400);
        numbers.add(300);
        numbers.add(200);

        boolean isRemoved = numbers.remove(Integer.valueOf(100));
        System.out.println(isRemoved);

        Integer removedByIndex = numbers.remove(2);

        System.out.println(numbers);
        System.out.println(numbers.size());
    }

    public static void ex3() {
        List<String> euCars = new ArrayList<>();
        euCars.add("Volvo");
        euCars.add("BMW");
        euCars.add("Volvo");

        List<String> usCars = new ArrayList<>();
        usCars.add("Tesla");

        euCars.addAll(usCars);

        for (String car : euCars) {
            System.out.println(car);
        }

        System.out.println("First index of Volvo:" + euCars.indexOf("Volvo"));
        System.out.println("Last index of Volvo:" + euCars.lastIndexOf("Volvo"));

    }

    //Convert List to Array
    public static void ex4() {
        List<String> names = new ArrayList<>();
        names.add("Mehrdad");
        names.add("Simon");
        names.add("Marcus");

        String[] nameArray = names.toArray(new String[0]);

        System.out.println("First name:" + nameArray[0]);


    }
}
