public class PrimesInRange{
    public static boolean primeMethod(int n){
        if(n==2){
            return true;
        }
        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRangeMethod(int n){
        for(int i=2;i<=n;i++){
            if(primeMethod(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        primesInRangeMethod(27);
    }

}