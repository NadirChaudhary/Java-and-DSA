public class BinarySearch{
    public static int method(int[] array,int key){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
           int mid = (start + end)/2;
            if(array[mid] == key){
                return mid;
            } if(array[mid]<key){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int key = 15;
        int ans = method(array,key);
        System.out.println("The index of the key : "+ans);
    }
}