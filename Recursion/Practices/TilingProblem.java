public class TilingProblem{
    public static int tilingMethod(int n){
        if(n==0 || n==1){
            return 1;
        }
        int verrical = tilingMethod(n-1);
        int horizontal = tilingMethod(n-2);
        int totalWays = verrical+horizontal;
        return totalWays;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(tilingMethod(n));
    }
}