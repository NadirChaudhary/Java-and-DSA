import java.util.*;
import java.util.Arrays;
public class MaxEliment{
    public static int maxMethod(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[][] matrix = new int[3][3];
        int r = matrix.length, c = matrix[0].length;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the matrix : ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = in.nextInt();
            }
        }

        //Output
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(matrix[i][j] +" ");
        //     }
        //     System.out.println();
        // }

        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
        System.out.println(maxMethod(matrix));
    }
}