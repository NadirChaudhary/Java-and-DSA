import java.util.LinkedList;
public class Remove{
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addFirst(2);
        ll.removeFirst();
        ll.remove();
        System.out.println(ll);
    }
}