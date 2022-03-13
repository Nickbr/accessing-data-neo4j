package com.example.accessingdataneo4j;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Property;

public class PeopleDataLab_Findings{
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/peopledatalabs.svg";
    @Property("name")
    public String full_name;
    public String first_name;
    public Object middle_initial;
    public Object middle_name;
    public String last_initial;
    public String last_name;
    public String gender;
    public Object birth_year;
    public Object birth_date;
    public String linkedin_url;
    public String linkedin_username;
    public String linkedin_id;
    public String facebook_url;
    public String facebook_username;
    public String facebook_id;
    public Object twitter_url;
    public Object twitter_username;
    public Object github_url;
    public Object github_username;
    public Object work_email;
    public ArrayList<String> personal_emails;
    public Object mobile_phone;
    public String industry;
    public String job_title;
    public String job_title_role;
    public Object job_title_sub_role;
    public ArrayList<String> job_title_levels;
    public Object job_company_id;
    public String job_company_name;
    public Object job_company_website;
    public Object job_company_size;
    public Object job_company_founded;
    public Object job_company_industry;
    public Object job_company_linkedin_url;
    public Object job_company_linkedin_id;
    public Object job_company_facebook_url;
    public Object job_company_twitter_url;
    public Object job_company_location_name;
    public Object job_company_location_locality;
    public Object job_company_location_metro;
    public Object job_company_location_region;
    public Object job_company_location_geo;
    public Object job_company_location_street_address;
    public Object job_company_location_address_line_2;
    public Object job_company_location_postal_code;
    public Object job_company_location_country;
    public Object job_company_location_continent;
    public String job_last_updated;
    public String job_start_date;
    public String location_name;
    public String location_locality;
    public Object location_metro;
    public String location_region;
    public String location_country;
    public String location_continent;
    public Object location_street_address;
    public Object location_address_line_2;
    public Object location_postal_code;
    public String location_geo;
    public String location_last_updated;
    public ArrayList<Object> phone_numbers;
    public ArrayList<PeopleDataLab_Email> emails;
    public ArrayList<Object> interests;
    public ArrayList<String> skills;
    public ArrayList<String> location_names;
    public ArrayList<String> regions;
    public ArrayList<String> countries;
    public ArrayList<Object> street_addresses;
    public ArrayList<PeopleDataLab_Experience> experience;
    public ArrayList<PeopleDataLab_Education> education;
    public ArrayList<PeopleDataLab_Profile> profiles;

}
