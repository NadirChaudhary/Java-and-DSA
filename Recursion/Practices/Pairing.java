public class Pairing{
    public static int pairMethod(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = pairMethod(n-1);
        int pair = single * pairMethod(n-2);
        int totalPair = single + pair;
        return totalPair;
    }
    public static void main(String[] args){
        System.out.println(pairMethod(3));
    }
}