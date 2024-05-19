import java.util.ArrayList;
public class ArrayListToArray{
    public static void main(String[] args){
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        String[] arr = new String[languages.size()];
        languages.toArray(arr);
        for(String item:arr){
            System.out.print(item+",");
        }
    }
}