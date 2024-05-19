public class FriendsPairing{
    public static int method(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // // Choice
        //    // Single
        //    int fnm1 = method(n-1);

        //    // Pair
        //    int fnm2 = method(n-2);
        //    int pairWays = (n-1) * fnm2;

        //    // Total Ways
        //    int totalways = fnm1 + pairWays;
        //    return totalways;

        return method(n-1) + (n-1) * method(n-2);
    }
    public static void main(String[] args){
        System.out.println(method(3));
    }
}