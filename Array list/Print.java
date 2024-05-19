import java.util.ArrayList;
public class Print{
    public static void main(String[] args){
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java Script");
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        for(int i=0;i<languages.size();i++){
            System.out.print(languages.get(i)+", ");
        }
    }
}