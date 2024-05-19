public class Question2{
    public static void Method(int n){
        int myNum = n;
        int dec = 0;
        int pow = 0;
        while(n>0){
            int lastDigit = n%10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal of "+myNum+"= "+dec);
    }
    public static void main(String args[]){
        Method(10110001);
    }
}