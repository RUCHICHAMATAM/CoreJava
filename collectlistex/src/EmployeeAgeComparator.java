import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int comparision=e1.getAge()- e2.getAge();
        return comparision;
    }
}
