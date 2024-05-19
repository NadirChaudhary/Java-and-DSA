public class IfElse{
    public static void main(String args[]){
        int age = 20;
        if(age>=18){
            System.out.println("Adult : drive & voye");
        }
        if(age>=13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}