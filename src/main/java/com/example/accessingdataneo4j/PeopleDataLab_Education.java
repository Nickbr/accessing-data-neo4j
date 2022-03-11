package com.example.accessingdataneo4j;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class PeopleDataLab_Education{
	@Id @GeneratedValue protected Long id;

    public String partnerIcon = "/media/partners/peopledatalabs.svg";
    public PeopleDataLab_School school;
    public ArrayList<Object> degrees;
    public Object start_date;
    public Object end_date;
    public ArrayList<Object> majors;
    public ArrayList<Object> minors;
    public Object gpa;
}
