package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;

public class OpenCorporates_Filing2 {
    

    public String partnerIcon = "/media/partners/opencorporates.svg";    
    @Id public int id;
    public String title;
    public String description;
    public String uid;
    public String filing_type_code;
    public String filing_type_name;
    public Object url;
    public String opencorporates_url;
    public String date;
    
}
