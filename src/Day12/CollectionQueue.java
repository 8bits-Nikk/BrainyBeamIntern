package Day12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionQueue {
    public static void main(String[] args) {
        priorityQueue();
        arrayDeque();
    }

    public static void priorityQueue(){
        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Aditi");
        names.add("Janesh");
        names.add("Alex");
        System.out.println("======================");
        System.out.println("Head: "+names.peek()+" [by peek()]");
        System.out.println("Head: "+names.element()+" [by element()]");
        Iterator<String> iterator;
        iterator = names.iterator();
        System.out.println("======== PriorityQueue ========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        names.poll();
        names.remove();
        System.out.println("======== After Remove 2 Elements ========");
        iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void arrayDeque(){
        Deque<String> names = new ArrayDeque<>();
        names.add("Nikhil");
        names.add("Dhruvi");
        names.add("Aditi");
        names.add("Janesh");
        names.add("Alex");
        // Traversing list
        System.out.println("======== ArrayDeque ========");
        for (String str: names){
            System.out.println(str);
        }
    }
}
