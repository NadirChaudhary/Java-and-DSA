public class Split{
    public static void main(String[] args){
        String s1 = "Welcome to the split world";
        //for(String str : s1.split(" ")){
        for(String str : s1.split("\\s",4)){
            System.out.println(str);
        }
    }
}