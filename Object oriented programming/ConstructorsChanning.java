public class ConstructorsChanning {
    public static void main(String args[]) {
        Student s1 = new Student(); // calling the 1st constructor
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Roll Number: " + s1.getRollNumber());
    }
}

class Student{
    private String name;
    private int rollNumber;

    // 1st constructor
    public Student(){ 
        this("NULL"); // calling the 2nd constructor
    }

    // 2nd constructor
    public Student(String name){
        this(name, 0);  // calling the 3rd constructor
    }

    // 3rd constructor
    public Student(String name, int rollNumber){ // fully parameterized constructor
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return name;
    }

    public int getRollNumber(){
        return rollNumber;
    }
}    
