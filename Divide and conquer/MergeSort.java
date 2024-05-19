import java.util.Arrays;
public class MergeSort{
    public static void mergeSortMethod(int arr[],int si,int ei){
        // Base case
        if(si >= ei){
            return;
        }

        // Work
        int mid = si+(ei-si)/2;
        mergeSortMethod(arr,si,mid);
        mergeSortMethod(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        // left(0,3)=4 right(4,6)=3  -> (ei-si+1)
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // Right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // Copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args){
        int arr[] = {6,3,5,4,6,2,-1,0};
        mergeSortMethod(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}