package com.universityapp.department;

import com.universityapp.employee.Employee;

public class Department {
    private String id;
    private String name;
   private int index=0;
   private Employee employee[]=new Employee[5];
    public Department(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Department(){

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addemployee(Employee emp){
        employee[index]=emp;
        index++;
    }
    public String findemployeebyid(long id){
        for(int i=0;i< employee.length;i++){
            if(employee[i].getId()==id){
                return employee[i].getName();
            }
        }
        return "not found";
    }
}
