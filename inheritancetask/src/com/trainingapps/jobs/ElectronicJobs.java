package com.trainingapps.jobs;

import com.trainingapps.companys.Company;

public class ElectronicJobs extends Jobs{
    private String deviceused;
    private int experineceinyrswithdevice;

public ElectronicJobs(){

}
    public ElectronicJobs(long id, String type,Company company, String deviceused, int experineceinyrswithdevice) {
        super(id, type, company);
        this.deviceused = deviceused;
        this.experineceinyrswithdevice = experineceinyrswithdevice;
    }



    public String getDeviceused() {
        return deviceused;
    }

    public void setDeviceused(String deviceused) {
        this.deviceused = deviceused;
    }

    public int getExperineceinyrswithdevice() {
        return experineceinyrswithdevice;
    }

    public void setExperinecewithdevice(int experineceinyrswithdevice) {
        this.experineceinyrswithdevice = experineceinyrswithdevice;
    }
}
