public class StringDuplicate{
    public static void removeDuplicates(char str[],int n){
        String newStr = "";
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(str[i] == str[j]){
                    break;
                }
            }
            if(j == i){
                newStr = newStr + str[i];
            }
        }
        System.out.println(newStr);
    }
    public static void main(String[] args){
        char str[] = "aabaabaabccbccd".toCharArray();
        int n = str.length;
        removeDuplicates(str,n);
    }
}