public class FibonacciNumber{
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnminus1 = fib(n-1);
        int fibnminus2 = fib(n-2);
        int fibn = fibnminus1 + fibnminus2;
        return fibn;
    }
    public static void main(String[] args){
        int n = 26;
        System.out.println(fib(n));
    }
}