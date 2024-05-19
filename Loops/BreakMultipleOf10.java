import java.util.*;
public class BreakMultipleOf10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        do{
            int n = in.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}