package edu.csumb.sp19.cst438.mbari.model;

import javax.persistence.Id;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

//import net.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Simple;

public class diveLog
{

    @Id
    private String Id;

    
    List<diveSite> sites = new ArrayList<diveSite>();//sites
    List<String> purpose = new ArrayList<String>();
    List<String> mode = new ArrayList<String>();
    List<String> decompression = new ArrayList<String>();
    List<String> breathing = new ArrayList<String>();
    List<String> spec_enviroment = new ArrayList<String>();
    List<String> surface_condition = new ArrayList<String>();
    List<String> under_condition = new ArrayList<String>();

    diveSite site;
    String site_name;
    Date dive_date;
    SimpleDateFormat start_time = new SimpleDateFormat("hh:mm");
    SimpleDateFormat end_time = new SimpleDateFormat("hh:mm");
    String final_purpose;
    String training;//-1,0,1
    SimpleDateFormat surface_interval = new SimpleDateFormat("hh:mm");
    int max_depth;
    String final_mode;
    String final_decompression;
    String final_breathing;
    String enviroment;
    String up_condition;
    String down_condition;
    String comments;
    String observations;


    public diveLog(diveSite site, String site_name, Date dive_date, SimpleDateFormat start_time, SimpleDateFormat end_time, String final_purpose, String training, SimpleDateFormat surface_interval, int max_depth, String final_mode,String final_decompression, String final_breathing, String enviroment, String up_condition, String down_condition, String comments, String observations)
    {
        this.site = site;
        this.site_name = site_name;
        this.dive_date = dive_date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.final_purpose = final_purpose;
        this.training = training;//-1,0,1
        this.surface_interval = surface_interval;
        this.max_depth = max_depth;
        this.final_mode = final_mode;
        this.final_decompression = final_decompression;
        this.final_breathing = final_breathing;
        this.enviroment = enviroment;
        this.up_condition = up_condition;
        this.down_condition = down_condition;
        this.comments = comments;
        this.observations = observations;

        purpose.add("Commercial Task");
        purpose.add("Commercial, Scientific Taks");
        purpose.add("Other Task");
        purpose.add("Public Safety Task");
        purpose.add("Recreational Task");
        
        mode.add("Scuba with FFM");
        mode.add("Hookah");
        mode.add("Snorkling");
        
        decompression.add("Dive Computer");
        decompression.add("Dive Tables");
        decompression.add("Software");

        breathing.add("Air");
        breathing.add("Nitrox 28");
        breathing.add("Trimix 30/30");
        breathing.add("tes");

        spec_enviroment.add("Overhead Enviroment");
        spec_enviroment.add("Blue Water");
        spec_enviroment.add("Required Decompression");
        spec_enviroment.add("Aquarium Diving");
        spec_enviroment.add("asd");

        surface_condition.add("Calm");
        surface_condition.add("Moderate");
        surface_condition.add("Rough");

        under_condition.add("Good");
        under_condition.add("Moderate");
        under_condition.add("Poor");


        sites.add(new diveSite("Field 1",50));
        sites.add(new diveSite("Field 2",35));
       
    }

    public diveLog()//populate lists
    {
        purpose.add("Commercial Task");
        purpose.add("Commercial, Scientific Taks");
        purpose.add("Other Task");
        purpose.add("Public Safety Task");
        purpose.add("Recreational Task");
        
        mode.add("Scuba with FFM");
        mode.add("Hookah");
        mode.add("Snorkling");
        
        decompression.add("Dive Computer");
        decompression.add("Dive Tables");
        decompression.add("Software");

        breathing.add("Air");
        breathing.add("Nitrox 28");
        breathing.add("Trimix 30/30");
        breathing.add("tes");

        spec_enviroment.add("Overhead Enviroment");
        spec_enviroment.add("Blue Water");
        spec_enviroment.add("Required Decompression");
        spec_enviroment.add("Aquarium Diving");
        spec_enviroment.add("asd");

        surface_condition.add("Calm");
        surface_condition.add("Moderate");
        surface_condition.add("Rough");

        under_condition.add("Good");
        under_condition.add("Moderate");
        under_condition.add("Poor");


        sites.add(new diveSite("Field 1",50));
        sites.add(new diveSite("Field 2",35));
    }

    public String getId()
    {
        return Id;
    }
    public void setId(String id)
    {
        this.Id = id;
    }

    List<diveSite> getSites()
    {
        return sites;
    }
    List<String> getAllPurpose()
    {
        return purpose;
    }
    List<String> getAllModes()
    {
        return mode;
    }
    List<String> getAllDecompression()
    {
        return decompression;
    }
    List<String> getAllBreathing()
    {
        return breathing;
    }
    List<String> getAllEnviroment()
    {
        return spec_enviroment;
    }
    List<String> getAllSurfaceCon()
    {
        return surface_condition;
    }
    List<String> getAllUnderCon()
    {
        return under_condition;
    }
   

    public void setDiveSite(String name)
    {
        for(int x=0;x<sites.size();x++)
        {
            if(name.equals(sites.get(x).getName()))
            {
                site = sites.get(x);
                break;
            }
        }
        site_name = site.getName();
    }

    public String getSiteName()
    {
        return site_name;
    }
    public void setTimeIn()//finish
    {

    }
    public SimpleDateFormat getTimeIn()
    {
        return start_time;
    }
    public void setTimeOut()
    {

    }
    public SimpleDateFormat getTimeOut()
    {
        return end_time;
    } 
    public void setPurpose(String purp)
    {
        for(String s : purpose)
        {
            if(purp.equals(s))
            {
                final_purpose = s;
                break;
            }
        }
    }
    public String getPurpose()
    {
        return final_purpose;
    }
    public void setTraining(int x)
    {
        switch(x){
            case -1:training = "No";
            break;
            case 0 : training = "Training";
            break;
            case 1: training = "Proficiency";
            break;
        }
    }
    public String getTraining()
    {
        return training;
    }
    
    public void setSurvaceInterval(SimpleDateFormat interval)
    {
        this.surface_interval = interval;
    }
    public SimpleDateFormat getSurfaceInterval()
    {
        return this.surface_interval;
    }

    public void setMaxDepth()
    {
        this.max_depth = site.getDepth();
    }
    public int getMaxDepth()
    {
        return this.max_depth;
    }
    public void setFinalMode(String mod)
    {
        for(String str : mode)
        {
            if(mod.equals(str))
            {
                this.final_mode = mod;
                break;
            }
        }
    }
    public String getFinalMode()
    {
        return this.final_mode;
    }
    public void setFinalCompression(String comp)
    {
        for(String s : decompression)
        {
            if(s.equals(comp))
            {
                this.final_decompression = s;
                break;
            }
        }
    }
    public String getFinalDecomp()
    {
        return this.final_decompression;
    }
    public void setFinalBreathing(String breath)
    {
        for(String str : breathing)
        {
            if(breath.equals(str))
            {
                this.final_breathing = str;
                break;
            }
        }
    }
    public String getFinalBreathing()
    {
        return this.final_breathing;
    }
    public void setFinalEnviroment(String env)
    {
        for(String str : spec_enviroment)
        {
            if(env.equals(str))
            {
                this.enviroment = env;
                break;
            }
        }
    }
    public String getEnviroment()
    {
        return this.enviroment;
    }
    public void setSurfaceCondition(String condition)
    {
        for(String str : surface_condition)
        {
            if(str.equals(condition))
            {
                this.up_condition = condition;
                break;
            }
        }
    }
    public String getSurfaceCond()
    {
        return this.up_condition;
    }
    public void setUnderCondition(String condition)
    {
        for(String str : under_condition)
        {
            if(condition.equals(str))
            {
                this.down_condition = condition;
                break;
            }
        }
    }
    public String getUnderCondt()
    {
        return this.down_condition;
    }
    public void setComments(String comments)
    {
        this.comments = comments;
    }
    public String getComments()
    {
        return this.comments;
    }
    public void setObservations(String observations)
    {
        this.observations = observations;
    }
    public String getObservations()
    {
        return this.observations;
    }


}