public class Question1{
    public static void Method(int n){
        int myNum  = n;
        int pow = 0;
        int dec = 0;
        while(n>0){
            int lastDigit = n%10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));
            n = n/10;
            pow++;
        }
        System.out.println("decimal of "+ myNum + "= "+ dec);
    }
    public static void main(String args[]){
        Method(111);
    }
}