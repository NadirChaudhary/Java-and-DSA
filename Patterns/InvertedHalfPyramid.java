public class InvertedHalfPyramid{
    public static void pyramid(int n){
        // for outer
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pyramid(5);
    }
}