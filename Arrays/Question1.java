public class Question1{
    public static boolean method(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,1};
        System.out.println(method(array));

        int[] array2 = {1,2,3,4};
        System.out.println(method(array2));

        int[] array3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(method(array3));
    }
}