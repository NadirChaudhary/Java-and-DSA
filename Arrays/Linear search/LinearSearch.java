public class LinearSearch{
    public static int search(int[] array,int key){
        for(int i=0;i<array.length;i++){
            if(array[i] == 10){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] array = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = search(array,key);
        if(index == -1){
            System.out.println("Key not found");
        } else{
            System.out.println("key is found at index "+ index);
        }
    }
}