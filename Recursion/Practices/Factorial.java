public class Factorial{
    public static int calFat(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1 = calFat(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(calFat(n));
    }
}