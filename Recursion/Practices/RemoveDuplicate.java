public class RemoveDuplicate{
    public static void removeMethod(String str, int idx,StringBuilder newStr, boolean[] map){
        // Base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // Work
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // Duplicate
            removeMethod(str, idx+1, newStr, map);
        } else{
            map[currChar-'a'] = true;
            removeMethod(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args){
        String str = "nadirchaudhary";
        removeMethod(str,0,new StringBuilder(""),new boolean[26]);
    }
}