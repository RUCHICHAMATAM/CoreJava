import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        MapEx map = new MapEx();
        map.start();

    }

    public void start() {
            Map<Integer, Employee>map = new HashMap<>();
            Employee emp1 = new Employee(1, 22, "ruchitha");
            Employee emp2 = new Employee(2, 20, "rajitha");
            Employee emp3 = new Employee(3, 24, "rakshitha");
            map.put(emp1.getId(),emp1);
            map.put(emp2.getId(),emp3);
            map.put(emp3.getId(),emp2);
            Set<Integer> keys=map.keySet();
        System.out.println("iterating on keys");
            for(int id:keys){
                Employee value=map.get(id);
                System.out.print("key="+id);
                displayemploye(value);
            }
        System.out.println("iterating on values");
            Collection<Employee>employees=map.values();
            for(Employee employe:employees){
                displayemploye(employe);
            }
    }

    void displayemploye(Employee emp){
        System.out.println(emp.getId()+"- "+emp.getAge()+"- "+emp.getName());

    }
}
