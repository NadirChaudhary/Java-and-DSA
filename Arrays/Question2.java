public class Question2{
    public static int binarySearch(int[] array,int key){
        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(array[mid] == key){
                return mid;
            }

            // is left half sorted
            if(array[start] <= array[mid]){

                // where target element is left half sorted
                if(array[start] <= key && key <= array[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            } else {
                if(key >= array[mid] && key <= array[end]){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {4,5,6,7,0,1,2};
        int key = 0;
        System.out.println(binarySearch(array,key));
    }
}