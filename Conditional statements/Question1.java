import java.util.*;
public class Question1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = in.nextInt();
        if(a>=0){
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }
    }
}