public class RomoveDuplicate{
    public static void method(String str, int idx,StringBuilder newStr, boolean[] map){
        // Base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // Work
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // Duplicate
            method(str, idx+1, newStr, map);
        } else{
            map[currChar-'a'] = true;
            method(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args){
        String str = "appnnacollege";
        method(str,0,new StringBuilder(""),new boolean[26]);
    }
}