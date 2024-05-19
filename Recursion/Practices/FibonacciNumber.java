public class FibonacciNumber{
    public static int printFibNum(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = printFibNum(n-1);
        int fibnm2 = printFibNum(n-2);
        int fibNum = fibnm1+fibnm2;
        return fibNum;
    }
    public static void main(String[] args){
        int n = 7;
        System.out.println(printFibNum(n));
    }
}