public class FirstOccurence{
    public static int method(int[] arr,int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return method(arr,i+1,key);
    }
    public static void main(String[] args){
        int[] arr = {8,3,6,9,5,10,2,5,3};
        System.out.println(method(arr,0,5));
    }
}