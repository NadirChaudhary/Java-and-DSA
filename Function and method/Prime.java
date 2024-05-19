public class Prime{
    public static boolean primeMethod(int n){
        
        if(n==2){  // Corner cases 
            return true;
        }

        for(int i=3;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(primeMethod(18));
    }
}