public class Inversion{
    public static void main(String[] args){
        int arr[] = {1,20,6,4,5};
        System.out.println("inversion count = "+ getInversions(arr));
    }
    public static int merge(int arr[],int left,int mid,int right){
        int i=left,j=mid,k=0;
        int count=0;
        int temp[] = new int[(right - left +1)];
        while((i<mid)&&(j<=right)){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                //k++;
                i++;
            } else {
                temp[k] = arr[j];
                count += (mid-1);
                //k++;
                j++;
            }
            k++;
        }
        while(i<mid){
            temp[k] = arr[i];
            k++;
            j++;
        }
        while(j<=right){
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j<=right){
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(i=left,k=0;i<=right;i++,k++){
            arr[i] = temp[k];
        }
        return count;
}
    private static int mergeSort(int arr[],int left,int right){
        int count = 0;
        if(right > left){
            int mid = (right + left)/2;
            count = mergeSort(arr,left,mid);
            count += mergeSort(arr,mid+1,right);
            count += merge(arr,left,mid+1,right);
        }
        return count;
    }
    public static int getInversions(int arr[]){
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }
}