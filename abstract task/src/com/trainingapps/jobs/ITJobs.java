package com.trainingapps.jobs;

import com.trainingapps.companyms.Company;

public class ITJobs extends Jobs {
    private String language;
    private int codingexperienceinyrs;

    public ITJobs(long id, String type, Company company, String language, int codingexperienceinyrs) {
        super(id, type, company);
        this.language = language;
        this.codingexperienceinyrs = codingexperienceinyrs;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCodingexperienceinyrs() {
        return codingexperienceinyrs;
    }

    public void setCodingexperienceinyrs(int codingexperienceinyrs) {
        this.codingexperienceinyrs = codingexperienceinyrs;
    }
}
