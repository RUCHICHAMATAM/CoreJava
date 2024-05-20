package com.trainingapps.jobs;

public abstract class BaseJobService {
    private int index;
    private Jobs jobs[];

    public Jobs[] getJobs() {
        return jobs;
    }

    public void setJobs(Jobs[] jobs) {
        this.jobs = jobs;
    }


   public BaseJobService(int size){
        jobs=new Jobs[size];
       System.out.println(size);

   }

    public BaseJobService() {
    }

    public  void addjobs(Jobs job){
       jobs[index]=job;
       index++;
    };

  // public abstract void addjobs(long id, String name, Company company, String language, int codingexperienceinyrs);

    public  Jobs findjobbyid(long id){
        for(int i=0;i< jobs.length;i++){
            if(jobs[i].getId()==id){
                return jobs[i];
            }
        }
        return null;
    };
    public Jobs[] findjobbytype(String type){
        Jobs desired[]=new Jobs[jobs.length];
        int k=0;
        for(int i=0;i< jobs.length;i++){
            if(jobs[i].getType()==type)
            {
                desired[k]=jobs[i];
                k++;
            }
        }
        return new Jobs[]{desired[k]};
    }


}
