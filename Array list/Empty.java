import java.util.ArrayList;
public class Empty{
    public static void main(String[] args){
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jack"); 
        studentList.add("king"); 
        studentList.add("Queen"); 
        studentList.add("Joker");
        System.out.println(studentList.isEmpty()); 
    }
}