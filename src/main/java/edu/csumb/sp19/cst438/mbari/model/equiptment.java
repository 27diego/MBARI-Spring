package edu.csumb.sp19.cst438.mbari.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

public class equiptment
{
    List <String> categories = new ArrayList<String>();
    //List<Users> users = new ArrayList<Users>();//users list

    @Id
    private String Id;

    String label;
    String notes;
    Date serviceDate;
    String description;
    String category;
    Date nextService;
    boolean recurring;

    public equiptment(String label, String notes, Date serviceDate, String description, String category, Date nextService, boolean recurring)
    {
        this.label = label;
        this.notes = notes;
        this.serviceDate = serviceDate;
        this.description = description;
        this.category = category;
        this.nextService = nextService;
        this.recurring = recurring;

        categories.add("Air Filtration Systems");
        categories.add("Analytical Instruments");
        categories.add("Buoyancy Control Devices");
        categories.add("Compressors");
        categories.add("Cylinder Values");
        categories.add("Cylinders");
        categories.add("Depth Gauges");
    }

    public equiptment()
    {
        categories.add("Air Filtration Systems");
        categories.add("Analytical Instruments");
        categories.add("Buoyancy Control Devices");
        categories.add("Compressors");
        categories.add("Cylinder Values");
        categories.add("Cylinders");
        categories.add("Depth Gauges");
    }


    public String getId()
    {
        return Id;
    }
    public void setId(String id)
    {
        this.Id = id;
    }

    public List<String> getALlCategories()
    {
        return this.categories;
    }

    public void setLabel(String text)
    {
        this.label = text;
    }
    public String getLabel()
    {
        return this.label;
    }
    public void setNotes(String text)
    {
        this.notes = text;
    }
    public String getNotes()
    {
        return this.notes;
    }
    public void setServiceDate(Date date)
    {
        this.serviceDate = date;
    }
    public Date getServiceDate()
    {
        return this.serviceDate;
    }
    public void setDescription(String text)
    {
        this.description = text;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setCategory(String cat)
    {
        for(String str : categories)
        {
            if(cat.equals(str))
            {
                this.category = str;
                break;
            }
        }
    }
    public String getCategory()
    {
        return this.category;
    }
    public void setNextService(Date date)
    {
        this.nextService = date;
    }
    public Date getNextService()
    {
        return this.nextService;
    }
    public void setRecurring(boolean x)
    {
        this.recurring = x;
    }
    public boolean getRecurring()
    {
        return this.recurring;
    }

}