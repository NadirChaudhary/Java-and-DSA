public class SumOfNaturalNumber{
    public static void main(String[] args){
        int n = 5;
        System.out.println(calSum(n));
    }
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int Sminus1 = calSum(n-1);
        int Sn = n + Sminus1;
        return Sn;
    }
}