package com.example.accessingdataneo4j;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class CorporateData_Officer {
    
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/corporatedata.svg";
    public Object uid;
    public String name;
    public String jurisdiction_code;
    public String position;
    public Object retrieved_at;
    public String opencorporates_url;
    public String start_date;
    public Object end_date;
    public String occupation;
    public Object current_status;
    public boolean inactive;
    public String address;
    public String nationality;
    public Object date_of_birth;
    public CorporateData_Company company;
    
}
