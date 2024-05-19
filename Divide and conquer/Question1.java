import java.util.Arrays;
public class Question1{
    public static void main(String[] args){
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(String[] arr){
        // base case
        if(arr.length <= 1){
            return;
        }

        // work
        int mid = arr.length/2;
        String[] leftHalf = Arrays.copyOfRange(arr,0,mid);
        String[] rightHalf = Arrays.copyOfRange(arr,mid,arr.length);

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr,leftHalf,rightHalf);
    }

    public static void merge(String[] arr,String[] leftHalf,String[] rightHalf){
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;

        while(leftIndex < leftHalf.length && rightIndex < rightHalf.length){
            if(leftHalf[leftIndex].compareTo(rightHalf[rightIndex])<= 0){
                arr[arrIndex] = leftHalf[rightIndex];
                leftIndex++;
            } else{
                arr[arrIndex] = rightHalf[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }
        while(leftIndex < leftHalf.length){
            arr[arrIndex] = leftHalf[leftIndex];
            leftIndex++;
            arrIndex++;
        }
        while(rightIndex < rightHalf.length){
            arr[arrIndex] = rightHalf[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}