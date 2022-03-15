package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;

public class OpenCorporates_Officer2 {
    @Id public int id;
    public String name;
    public String position;
    public Object uid;
    public String start_date;
    public Object end_date;
    public String opencorporates_url;
    public String occupation;
    public boolean inactive;
    public Object current_status;
}
