package com.trainingapps.jobs;

import com.trainingapps.companys.Company;

public class ITJobs extends Jobs {
    private int language;
    private int experineceinyrs;
    public ITJobs(){

    }

    public ITJobs(long id, String type, Company company, int language, int experineceinyrs) {
        super(id, type, company);
        this.language = language;
        this.experineceinyrs = experineceinyrs;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getExperineceinyrs() {
        return experineceinyrs;
    }

    public void setExperineceinyrs(int experineceinyrs) {
        this.experineceinyrs = experineceinyrs;
    }
}
