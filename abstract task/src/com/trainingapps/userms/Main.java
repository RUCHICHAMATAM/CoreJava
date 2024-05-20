package com.trainingapps.userms;

import com.trainingapps.companyms.Company;
import com.trainingapps.jobs.*;

public class Main {
    public static void main(String[] args) {


        Company company1=new Company("wipro","wipro pvt limited");
ITJobService itJobService=new ITJobService(2);

        ITJobs job1=new ITJobs(1234,"coding",company1,"java",4);
        itJobService.addjobs(job1);
        System.out.println(itJobService.getJobcount());
        BaseJobService baseJobService1=new ElectronicJobService(3);
        ElectronicJobs job2=new ElectronicJobs(12341,"electronic",company1,"oscillator",3);
        baseJobService1.addjobs(job2);

        



    }
}
