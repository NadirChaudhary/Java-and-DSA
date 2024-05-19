import java.util.*;
public class Factorial{

    // USING INT(RETURN) METHOD

/*
    public static int method(int n){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = in.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
*/    


    // USING VOID METHOD

     public static void method(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();

        //int ans = method(n);
        //System.out.println(ans);
        
        method(n);

    }
}