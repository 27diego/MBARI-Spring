package edu.csumb.sp19.cst438.mbari.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sites")
public class diveSite
{
    @Id
    private String Id;

    String name;
    int depth;

    public diveSite()
    {}

    public diveSite(String name, int depth)
    {
        this.name = name;
        this.depth = depth;
    }

    public String getId()
    {
        return Id;
    }
    public void setId(String id)
    {
        this.Id = id;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getDepth()
    {
        return this.depth;
    }
    public void setDepth(int depth)
    {
        this.depth = depth;
    }
    
}