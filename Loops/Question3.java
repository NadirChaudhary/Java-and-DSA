import java.util.*;
public class Question3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("The factorial of the number : "+fact);
    }
}