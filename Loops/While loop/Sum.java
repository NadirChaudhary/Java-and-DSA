import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int i,n,sum;
        n = in.nextInt();
        sum = 0;
        i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers are : "+ sum);
    }
} 