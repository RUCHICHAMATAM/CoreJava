package com.customer;

class BusinessCustomer extends Customer{
    private double discount;
    public BusinessCustomer(int id,String name,int age,double discount){
        super(id,name,age);
        this.discount=discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
