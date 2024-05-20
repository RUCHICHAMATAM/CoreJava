package com.trainingapps.jobs;
public class ElectronicJobService extends BaseJobService {
    private int ElectronicJobCount;
    public ElectronicJobService(){}

    public ElectronicJobService(int size) {
        super(size);
    }



    public int getElectronicJobCount() {
        return ElectronicJobCount;
    }
    @Override
    public void addjobs(Jobs job) {
        super.addjobs(job);
        ElectronicJobCount++;
    }

    @Override
    public Jobs findjobbyid(long id) {
        Jobs job = super.findjobbyid(id);
        return (ElectronicJobs) job;
    }

    @Override
    public Jobs[] findjobbytype(String type) {
        Jobs job[] = super.findjobbytype(type);
        return job;
    }


}
