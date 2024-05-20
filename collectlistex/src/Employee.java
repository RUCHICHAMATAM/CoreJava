import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private int age,id;
    private String name;
    public Employee(){

    }
    public Employee(int id, int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(age, id, name);
    }

    @Override
    public int compareTo(Employee employee) {

        return employee.age-this.age;
    }

}
