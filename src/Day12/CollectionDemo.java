package Day12;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        arrayList();
        linkedList();
        vector();
        stack();
        hashSet();
        linedHashSet();
        treeSet();
    }

    public static void arrayList(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Alex");
        // Traversing list through Iterator
        Iterator<String> iterator = names.iterator();
        System.out.println("======== ArrayList ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void linkedList(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Alex");
        // Traversing list through Iterator
        Iterator<String> iterator = names.iterator();
        System.out.println("======== LinkedList ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void vector(){
        Vector<String> names = new Vector<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Alex");
        // Traversing list through Iterator
        Iterator<String> iterator = names.iterator();
        System.out.println("======== Vector ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void stack(){
        Stack<String> names = new Stack<>();
        names.push("Nikhil");
        names.push("Dhruvi");
        names.push("Alex");
        // Traversing list through Iterator
        Iterator<String> iterator;
        System.out.println("======== Stack ========");
        iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        names.pop();
        iterator = names.iterator();
        System.out.println("======== Stack After Pop ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void hashSet(){
        HashSet<String> names = new HashSet<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Alex");
        names.add("Nikhil");
        // Traversing list through Iterator
        Iterator<String> iterator = names.iterator();
        System.out.println("======== HashSet ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void linedHashSet(){
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Alex");
        names.add("Nikhil");
        // Traversing list through Iterator
        Iterator<String> iterator = names.iterator();
        System.out.println("======== LinkedHashSet ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void treeSet(){
        TreeSet<String> names = new TreeSet<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Alex");
        // Traversing list through Iterator
        Iterator<String> iterator = names.iterator();
        System.out.println("======== TreeSet ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
