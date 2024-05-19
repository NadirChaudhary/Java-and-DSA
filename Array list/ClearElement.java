import java.util.ArrayList;
public class ClearElement{
    public static void main(String[] args){
        ArrayList<Integer> digit = new ArrayList<>();
        digit.add(1);
        digit.add(2);
        digit.add(3);
        digit.add(4);
        digit.clear();
        System.out.println(digit);
    }
}