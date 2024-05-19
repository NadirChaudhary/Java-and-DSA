public class LastOccurrence{
    public static int printLastOccurrence(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = printLastOccurrence(arr,i+1,key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,5,4,5,6,7,5,9};
        System.out.println(printLastOccurrence(arr,0,5));
    }
}