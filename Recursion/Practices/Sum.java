public class Sum{
    public static int CalSum(int n){
        if(n==1){
            return 1;
        }
        // int Snm1 = CalSum(n-1);
        // int Sn = n+Snm1;
        // return Sn;

        return n+CalSum(n-1);
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(CalSum(n));
    }
}