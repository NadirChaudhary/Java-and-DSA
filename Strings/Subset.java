public class Subset{
    public static void main(String[] args){
        String str = "fun";
        int n = str.length();
        int temp = 0;
        String arr[] = new String[n*(n+1)/2];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                arr[temp] = str.substring(i,j+1);
                temp++;
            }
        }
        System.out.println("All subsets for the given string are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}