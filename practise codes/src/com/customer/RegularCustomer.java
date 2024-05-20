package com.customer;

 class RegularCustomer extends Customer {
    private String offer;
    public RegularCustomer(int id,String name,int age,String offer){
        super(id,name,age);
        this.offer=offer;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
}
