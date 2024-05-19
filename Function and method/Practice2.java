public class Practice2{
    public static boolean primeMethod(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void rangeMethod(int n){
        for(int i=1;i<=n;i++){
            if(primeMethod(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        rangeMethod(20);
    }
}