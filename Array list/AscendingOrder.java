import java.util.ArrayList;
import java.util.Collections;
public class AscendingOrder{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(6);
        System.out.println("Original list = "+list);
        Collections.sort(list);
        System.out.println("List after sort in ascending order = "+list);
    }
}