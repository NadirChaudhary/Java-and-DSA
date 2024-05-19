public class OptimizedPower{
    public static int method(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower = method(a,n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n%2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        System.out.println(method(2,10));
    }
}