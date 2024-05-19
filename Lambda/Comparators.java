import java.util.*;
public class Comparators{
    public static void main(String[] args){
        List<Employee> list = new ArrayList<Employee>();

        //Adding employees
        list.add(new Employee(115,"huda",70000));
        list.add(new Employee(115,"Suli",60000));
        list.add(new Employee(115,"nadir",50000));
        System.out.println("Sorting the employee list based on the name");

        // implementing lambda Expression
        Collections.sort(list,(p1,p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for(Employee e : list){
            System.out.println(e.id+" "+e.name+" "+e.salary);
        }
    }
}
class Employee{
    int id;
    String name ;
    double salary;
    public Employee(int id,String name,int salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}