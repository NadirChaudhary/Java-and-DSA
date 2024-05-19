public class ConstructorOverloading{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("nadir");
        System.out.println(s2.name);
        Student s3 = new Student(29);
        System.out.println(s3.rollNumber);
        
    }
}

class Student{
    String name;
    int rollNumber;

    Student(){
        System.out.println("constructor is called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int rollNumber){
        this.rollNumber = rollNumber;
    }
}