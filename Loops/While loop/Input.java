import java.util.*;
public class Input{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}