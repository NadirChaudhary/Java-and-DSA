import java.util.*;
public class QueueUsingDeque{
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args){
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("Peek = "+s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
    }
}