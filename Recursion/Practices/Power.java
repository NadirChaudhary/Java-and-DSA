public class Power{
    public static int printPow(int x,int n){
        if(n == 0){
            return 1;
        }
        return x*printPow(x,n-1);
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(printPow(2,10));
    }
}