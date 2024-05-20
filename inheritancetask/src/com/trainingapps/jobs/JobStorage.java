package com.trainingapps.jobs;
import com.trainingapps.companys.Company;

public class JobStorage {
    private int index=0;
    private Jobs jobs[];
    public Jobs[] getJobs() {
        return jobs;
    }

    public void setJobs(Jobs[] jobs) {
        this.jobs = jobs;
    }

    public JobStorage(int size){
        jobs=new Jobs[size];
   }
   public void addITJobs(long id,String type,Company company,int language,int codingexperienceinyrs){
        ITJobs itjobs=new ITJobs(id,type,company,language,codingexperienceinyrs);
        jobs[index]=itjobs;
        index++;
   }
    public void addElectronicJobs(long id,String type,Company company,String deviceused,int experienceinyrswithdevice){
        ElectronicJobs electronicjobs=new ElectronicJobs(id,type,company,deviceused,experienceinyrswithdevice);
        jobs[index]=electronicjobs;
        index++;
    }
    public Jobs findbyid(long value){
        for(int i=0;i< jobs.length;i++){
            if(jobs[i].getId()==value){
                return jobs[i];
            }
        }
        return null;
    }
    public int findbytype(String type){
        int count=0;
        for(int i=0;i< jobs.length;i++){
            if(jobs[i].getType()==type){
                count++;
            }
        }
        return count;

    }


}
