package se.lexicon;

import se.lexicon.model.Person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Cherry"); // not accepted duplicate
        System.out.println(set);
        System.out.println(set.contains("Apple"));

        set.remove("Banana");
        System.out.println(set);
        System.out.println(set.size());
    }

    // Adding multiple elements to the set
    public static void ex2() {
        HashSet<String> newFruits = new HashSet<>();
        newFruits.add("Date");
        newFruits.add("Elderberry");

        HashSet<String> oldFruits = new HashSet<>();
        oldFruits.add("Apple");
        oldFruits.add("Banana");
        oldFruits.add("Cherry");


        oldFruits.addAll(newFruits);
        System.out.println(oldFruits);

        //Convert set to array
        String[] array = oldFruits.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        oldFruits.clear();
        System.out.println(oldFruits);

    }

    public static void ex3() {
        HashSet<Person> peopleHashSet = new HashSet<>();
        peopleHashSet.add(new Person(3,"John", "john@test.se"));
        peopleHashSet.add(new Person(1,"Alice", "alice@test.se"));
        peopleHashSet.add(new Person(2,"Bob", "bob23@test.se"));
        peopleHashSet.add(new Person(2,"Bob", "bob23@test.se"));

        System.out.println("Contents of the HashSet: ");
        Iterator<Person> iterator = peopleHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
