import java.util.*;
public class Print{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Tukka");
        list.add("hei");
        list.add("to");
        list.add("lagana");
        list.add("hei");

        list.forEach(
            (element) -> System.out.print(element+" ")
        );
    }
}