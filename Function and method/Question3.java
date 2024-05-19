import java.util.*;
public class Question3{
    public static boolean isPalindrome(int number){
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while(palindrome != 0){
            int reminder = palindrome%10;
            reverse = reverse * 10 + reminder;
            palindrome = palindrome/10;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int palindrome = in.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Number : "+palindrome+" is a palindrome");
        } else {
            System.out.println("Number : "+palindrome+" is not a palindrome");
        }
    }
}