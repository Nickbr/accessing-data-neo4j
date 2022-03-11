package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class PeopleDataLab_Company{

    
	@Id @GeneratedValue protected Long id;
    public String partnerIcon = "/media/partners/peopledatalabs.svg";
    public String name;
    public String size;
    // public String id;
    public int founded;
    public String industry;
    public PeopleDataLab_Location location;
    public String linkedin_url;
    public String linkedin_id;
    public String facebook_url;
    public String twitter_url;
    public String website;
    public PeopleDataLab_Company(PeopleDataLab_Company company){
        this.name = company.name;
        this.size = company.size;
        this.id = company.id;
        this.founded = company.founded;
        this.industry = company.industry;
        this.location = company.location;
        this.linkedin_url = company.linkedin_url;
        this.linkedin_id = company.linkedin_id;
        this.facebook_url = company.facebook_url;
        this.twitter_url = company.twitter_url;
        this.website = company.website;
    }
    private PeopleDataLab_Company(){}
}
