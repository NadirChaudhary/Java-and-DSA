import java.util.ArrayList;
public class ReplaceElement{
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("namra");
        str.add("Azeem");
        str.add("Aqsa");
        str.add("Huda");
        str.set(1,"ali");
        System.out.println(str);
    }
}