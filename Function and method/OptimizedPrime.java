public class OptimizedPrime{
    public static boolean primeMethod(int n){
        
        if(n==2){  // Corner cases 
            return true;
        }

        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(primeMethod(19));
    }
}