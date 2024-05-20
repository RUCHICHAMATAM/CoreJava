package PassByDemo;

public class PassByDemo1 {
    public static void main(String[] args){

        Employee employee=new Employee(1,"aditya");
        PassByDemo1 demo=new PassByDemo1();
        demo.display(employee);
        System.out.println("inside main="+employee.getId()+" "+employee.getName());
    }
    void display(Employee employee){
        employee.setId(2);
        employee.setName("ruchi");
        System.out.println("inside display "+employee.getId()+" "+employee.getName());
    }
}
