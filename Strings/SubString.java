public class SubString{
    public static String method(String str,int si,int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String today = "Work hard today and forget tomorrow";
        //System.out.println(method(today,0,10));

        System.out.println(today.substring(0,10));
    }
}