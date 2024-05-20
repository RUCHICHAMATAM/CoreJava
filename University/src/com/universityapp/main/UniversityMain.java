package com.universityapp.main;

import com.universityapp.employee.Employee;
import com.universityapp.department.Department;

public class UniversityMain {
    public static void main(String[] args){
       Department[] department=new Department[5];
        Department department1=new Department("1A","ECE");
        Department department2=new Department("1B","CSE");
        Department department3=new Department("1C","EEE");
        Department department4=new Department("1D","IT");
        Department department5=new Department("1E","MECH");

       Employee emp1=new Employee(18910441,"Ruchitha",department1);
       Employee emp2=new Employee(18910442,"Nikki",department2);
       Employee emp3=new Employee(18910445,"Anitha",department3);
       Employee emp4=new Employee(18910447,"Rohini",department4);
       Employee emp5=new Employee(18910457,"Dheeru",department5);

       Department dep=new Department();
       dep.addemployee(emp1);
       dep.addemployee(emp2);
       dep.addemployee(emp3);
       dep.addemployee(emp4);
       dep.addemployee(emp5);

       String name=dep.findemployeebyid(18910441);
        System.out.println("employee name="+name);





    }
}
