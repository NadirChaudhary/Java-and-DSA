import java.util.*;
import java.util.Arrays;
public class Matrix{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element of the matrix : ");
        int[][] matrix = new int[3][3];
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = in.nextInt();
            }
        }
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int[] mat:matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}