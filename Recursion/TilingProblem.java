public class TilingProblem{
    public static int method(int n){ // 2 X n(Floor size);
        // Base case
        if(n == 0 || n == 1){
            retrun 1;
        }

        // Work
        // Vertical chice
        int fnm1 = method(n-1);
        
        // Horizontal choice
        int fnm2 = method(n-2);

        int totalways = fnm1 + fnm2;
        retrun totalways;
    }
    public static void main(String[] argbs){
        System.out.println(method(3));
    }
}