import java.util.*;
public class Question4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();

        for(int i=1;i<=10;i++){
            //System.out.println(n + " X " + i + " = " + n*i);
            System.out.printf("%d X %d = %d",n,i,n*i).println();

        }

    }
}    