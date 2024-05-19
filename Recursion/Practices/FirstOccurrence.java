public class FirstOccurrence{
    public static int printFirstOccurrence(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return printFirstOccurrence(arr,i+1,key);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,5,4,5,6,7,5,9};
        System.out.println(printFirstOccurrence(arr,0,5));
    }
}