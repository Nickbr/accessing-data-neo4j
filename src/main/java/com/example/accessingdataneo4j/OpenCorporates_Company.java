package com.example.accessingdataneo4j;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class OpenCorporates_Company {
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/corporatedata.svg";
    public String name;
    public String company_number;
    public String jurisdiction_code;
    public String incorporation_date;
    public String dissolution_date;
    public String company_type;
    public String registry_url;
    public Object branch;
    public Object branch_status;
    public boolean inactive;
    public String current_status;
    public String created_at;
    public String updated_at;
    public String retrieved_at;
    public String opencorporates_url;
    public OpenCorporates_Source source;
    public Object agent_name;
    public Object agent_address;
    public ArrayList<Object> alternative_names;
    public ArrayList<Object> previous_names;
    public Object number_of_employees;
    public Object native_company_number;
    public ArrayList<Object> alternate_registration_entities;
    public ArrayList<Object> previous_registration_entities;
    public ArrayList<Object> subsequent_registration_entities;
    public String registered_address_in_full;
    public ArrayList<Object> industry_codes;
    public ArrayList<Object> identifiers;
    public ArrayList<Object> trademark_registrations;
    public OpenCorporates_RegisteredAddress registered_address;
    public ArrayList<Object> corporate_groupings;
    public Object data;
    public Object financial_summary;
    public Object home_company;
    public Object controlling_entity;
    public ArrayList<Object> ultimate_beneficial_owners;
    public Object ultimate_controlling_company;
    public ArrayList<OpenCorporates_Filing> filings;
    public ArrayList<OpenCorporates_Officer> officers;
    } 

