import java.util.ArrayList;
public class RemoveElement{
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("babu");
        str.add("banarsi");
        str.add("das");
        str.remove(2);
        System.out.println(str);
    }
}