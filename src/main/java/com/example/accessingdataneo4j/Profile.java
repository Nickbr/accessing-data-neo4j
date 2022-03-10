package com.example.accessingdataneo4j;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Profile{
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/peopledatalabs.svg";
    public String network;
    public String url;
    public String username;
}
