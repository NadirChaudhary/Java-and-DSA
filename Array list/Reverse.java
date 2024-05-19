import java.util.ArrayList;
public class Reverse{
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("ammu");
        name.add("akka");
        name.add("nu G");
        name.add("Nomi");
        name.add("messi");
        for(int i=name.size()-1;i>=0;i--){
            System.out.print(name.get(i)+", ");
        }
    }
}