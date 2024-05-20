import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
       TreeSetDemo treeset=new TreeSetDemo();
        treeset.start();
    }
    public void start(){
        //Comparator<Employee> comparator=new EmployeeAgeComparator();
        Comparator<Employee> comparator=new EmployeeNameComparator();
        Set<Employee> employees=  new TreeSet<>();
        Employee emp1=new Employee(1,22,"ruchitha");
        Employee emp2=new Employee(2,20,"rajitha");

        employees.add(emp1);
        employees.add(emp2);

        int size=employees.size();
        System.out.println("size of tree="+size);
        displayemployees(employees);

    }
   void displayemployees(Collection<Employee> employees){
        for(Employee emp:employees){
            displayemploye(emp);
        }


    }
    void displayemploye(Employee emp){
        System.out.println(emp.getId()+"- "+emp.getAge()+"- "+emp.getName());

    }
}
