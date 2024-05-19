import java.util.*;
public class Result{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = in.nextInt();
        String status = (marks>=33) ? "Pass" : "Fail";
        System.out.println(status);
    }
}