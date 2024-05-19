public class Factorial{
    public static void main(String[] args){
        int n = 5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fminus1 = fact(n-1);
        int fn = n * fminus1;
        return fn;
    }
}