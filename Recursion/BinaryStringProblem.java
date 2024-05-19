public class BinaryStringProblem{
    public static void method(int n,int lastPlace,String str){
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // Work
        // if(lastPlace == 0){
        //     // Sit 0 on chair n
        //     method(n-1,0,str+"0")
        //     method(n-1,1,str+"1");
        // } else{
        //      method(n-1,0,str+"0");
        // }

        method(n-1,0,str+"0");
        if(lastPlace == 0){
            method(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        method(3,0,"");
    }
}