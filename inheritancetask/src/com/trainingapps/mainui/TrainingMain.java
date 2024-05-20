package com.trainingapps.mainui;
import com.trainingapps.companys.Company;
import com.trainingapps.jobs.*;


public class TrainingMain {
    public static void main(String[] args){
        //Company[] company=new Company[2];
        Company company1=new Company("WIPRO","Wipro Private Limited");
        Company company2=new Company("BOSCH","Bosch private limited");
        JobStorage jobStorage=new JobStorage(2);
        jobStorage.addITJobs(12345,"coding",company1,2,1);
        jobStorage.addElectronicJobs(12356,"electronic",company2,"oscillator",2);
       Jobs jobs= jobStorage.findbyid(12345);
        System.out.println("jobs="+jobs.getType());
       int obj= jobStorage.findbytype("coding");
        System.out.println("jobs of type="+obj);



    }
}
