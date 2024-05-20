package com.trainingapps.jobs;
import com.trainingapps.companyms.Company;

public class Jobs {
    private long id;
    private String type;
    private  Company company;

    public Jobs(long id, String type, Company company) {
        this.id = id;
        this.type = type;
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type= type;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
