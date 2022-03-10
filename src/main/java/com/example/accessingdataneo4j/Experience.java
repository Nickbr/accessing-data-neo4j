package com.example.accessingdataneo4j;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Experience{
	@Id @GeneratedValue protected Long id;

    public Company company;
    public String start_date;
    public String end_date;
    public Title title;
    public ArrayList<String> location_names;
    public boolean is_primary;
}
