public class Question3{
    public static int stringLength(String str){
        if(str.equals("")){
            return 0;
        }
        return stringLength(str.substring(1)) + 1;
    }
    public static void main(String[] args){
        String str = "nadirchaudhary";
        System.out.print(stringLength(str));
    }
}