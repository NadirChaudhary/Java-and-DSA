public class SubSet{
    public static void findSubSet(String str,int i,String ans){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null"+" ");
            } else{
                System.out.print(ans+" ");
            }
            return;
        }

        // recursion
           // yes choice
           findSubSet(str,i+1,ans+str.charAt(i));
           // no choice
           findSubSet(str,i+1,ans);
    }
    public static void main(String[] args){
        String str = "abc";
        findSubSet(str,0,"");
    }
}