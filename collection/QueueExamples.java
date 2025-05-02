package collection;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {
        //queue
        Queue<String> queue=new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        System.out.println(queue.poll());

        //deque
        Deque<String> deque=new ArrayDeque<>();
        deque.addFirst("start");
        deque.addLast("end");
        deque.add("where");
        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());

        //priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
    }
}
