package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

public class OpenCorporates_Source {

	@Id @GeneratedValue protected Long id;
    public String partnerIcon = "/media/partners/opencorporates.svg";
    public String publisher;
    public String url;
    public String terms;
    public String retrieved_at;
}
