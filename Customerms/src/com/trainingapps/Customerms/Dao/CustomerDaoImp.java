package com.trainingapps.Customerms.Dao;
import com.trainingapps.Customerms.entity.Customer;
public class CustomerDaoImp implements CustomerDao{
private Customer cust[]=new Customer[10];
private int index=0;
  public int getIndex() {
        return index;
    }
    private int generateId;
    public long generateId(){
    ++generateId;
    return generateId;
}
@Override
    public void add(Customer customer) {
    long id=generateId();
    customer.setId(id);
    cust[index]=customer;
    index++;
   }
   @Override
    public Customer FindById(long id) {
    for(Customer customer:cust)
    {if(customer.getId()==id)
        {
            return customer;
        }
    }
        return null;
    }
    @Override
    public void update(Customer customerarg) {
     for(int i=0;i<cust.length;i++) {
            if ( cust[i].getId()== customerarg.getId()) {
                cust[i]=customerarg;
            }
       }
    }
}
