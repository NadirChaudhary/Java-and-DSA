import java.util.Arrays;
public class CopyConstructors{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "nadir";
        s1.rollNumber = 29;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }
        System.out.println(Arrays.toString(s2.marks));
    }
}

class Student{
    String name;
    int rollNumber;
    String password;
    int[] marks;

    // Copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called..");
    }

    // Student(String name){
    //     marks = new int[3];
    //     this.name = name;
    // }

    // Student(int rollNumber){
    //     marks = new int[3];
    //     this.rollNumber = rollNumber;
    // }
}