import java.util.Arrays;
public class ShallowCopyConstructor{
    public static void main(String[] args){
        Student s1 = new Student("nadir",29,"abcd");
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.password);
        // for(int i=0;i<3;i++){
        //     System.out.println(s1.marks[i]);
        // }
        System.out.println(Arrays.toString(s1.marks));

        Student s2 = new Student(s1);
        s2.password = "xyz";
        System.out.println(s2.name);
        System.out.println(s2.rollNumber);
        System.out.println(s2.password);
        s1.marks[2] = 100;
        

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

    Student(String name,int rollNumber,String password){
        System.out.println("Orignal constructor is called...");
        marks = new int[3];
        this.name = name;
        this.rollNumber = rollNumber;
        this.password = password;
    }

    //Shallow copy constructor
    Student(Student s1){
        System.out.println("Shallow copy constructor is called...");
        marks = new int[3];
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;
        this.marks = s1.marks;
    }
}