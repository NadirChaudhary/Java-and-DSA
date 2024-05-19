public class NumberToString{
    static String digits[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int n){
        if(n==0){
            return;
        }
        int lastDigits = n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigits]+" ");
    }
    public static void main(String[] args){
        int n = 987654321;
        printDigits(n);
    }
}