import java.util.*;
import java.util.Arrays;
public class SearchInMatrix{
    public static boolean searchMethod(int[][] matrix, int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at cell("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
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
        searchMethod(matrix,9);
    }
}