package com.trainingapps.jobs;

import com.trainingapps.companyms.Company;

public class ElectronicJobs extends Jobs{
    private String device;
    private int deviceexperienceinyrs;

    public ElectronicJobs(long id, String type, Company company, String device, int deviceexperienceinyrs) {
        super(id, type, company);
        this.device = device;
        this.deviceexperienceinyrs = deviceexperienceinyrs;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public int getDeviceexperienceinyrs() {
        return deviceexperienceinyrs;
    }

    public void setDeviceexperienceinyrs(int deviceexperienceinyrs) {
        this.deviceexperienceinyrs = deviceexperienceinyrs;
    }
}
