public class OptimizedPower{
    public static int powerMethod(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = powerMethod(2,n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        int a = 2;
        int n = 3;
        System.out.println(powerMethod(a,n));
    }
}