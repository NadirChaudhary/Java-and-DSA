
import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = in.nextInt();
        System.out.print("Enter the value of b : ");
        int b = in.nextInt();
        System.out.print("Enter the operator : ");
        char operator = in.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Invalid");
        }
    }
}