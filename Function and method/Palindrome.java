import java.util.*;
public class Palindrome{
    public static int reverseMethod(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = in.nextInt();
        int ans = reverseMethod(a);
        if(a==ans){
            System.out.println("The number is palindrome");
        } else{
            System.out.println("The number is not palindrome");
        }
    }
}