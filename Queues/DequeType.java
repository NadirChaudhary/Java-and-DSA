import java.util.*;
public class DequeType{
    public static void main(String[] args){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq);
        dq.removeFirst();
        dq.addLast(3);
        System.out.println(dq);
        System.out.println("first element = "+dq.getFirst());
        System.out.println("Last element = "+dq.getLast());
    }
}