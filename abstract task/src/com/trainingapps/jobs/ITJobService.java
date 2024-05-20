package com.trainingapps.jobs;

public class ITJobService extends BaseJobService {

private int jobcount;

    public ITJobService() {
    }

    public ITJobService(int size) {
        super(size);
    }

    public int getJobcount() {
        return jobcount;
    }

    @Override
    public void addjobs(Jobs job) {
        jobcount++;
     super.addjobs(job);
        System.out.println(jobcount);
    }

    @Override
    public Jobs findjobbyid(long id) {
        Jobs job = super.findjobbyid(id);
        return (ITJobs) job;
    }

    @Override
    public Jobs[] findjobbytype(String type) {
        Jobs job[] = super.findjobbytype(type);
        return job;
    }
}
