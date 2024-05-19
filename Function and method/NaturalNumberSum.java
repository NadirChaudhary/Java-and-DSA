import java.util.*;
class NaturalNumberSum {
    public static void sum(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = in.nextInt();
        sum(a);
    }
}