public class IncreasingOrder{
    public static void main(String[] args){
        int n = 10;
        method(n);
    }
    public static void method(int n){
        if( n == 1 ){
            System.out.print(n+" ");
            return;
        }
        method(n-1);
        System.out.print(n + " ");
    }
}