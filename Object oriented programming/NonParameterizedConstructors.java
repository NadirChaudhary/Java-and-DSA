public class NonParameterizedConstructors{
    public static void main(String[] args){
        Student s1 = new Student();
    }
}

class Student{
    String name;
    int rollNumber;

    Student(){
        System.out.println("constructor is called...");
    }
}