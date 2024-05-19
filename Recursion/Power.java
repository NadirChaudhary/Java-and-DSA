public class Power{
    public static int method(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnm1 = method(x,n-1);  //x power n-1
        // int xn = x * xnm1;
        // return xn

        return x * method(x,n-1);
    }
    public static void main(String[] args){
       System.out.println(method(2,10));
    }
}