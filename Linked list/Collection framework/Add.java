import java.util.LinkedList;
public class Add{
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addFirst(-1);
        System.out.println(ll);
    }
}