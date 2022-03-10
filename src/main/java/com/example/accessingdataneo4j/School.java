package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class School{
	@Id @GeneratedValue protected Long id;

    public String name;
    public String type;
    public Location location;
    public String linkedin_url;
    public String facebook_url;
    public String twitter_url;
    public String linkedin_id;
    public String website;
    public String domain;
}
