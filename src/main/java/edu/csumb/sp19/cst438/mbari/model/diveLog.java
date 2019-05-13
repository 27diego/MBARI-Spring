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
    private String id;

    String userId;

    List<diveSite> sites = new ArrayList<diveSite>();//sites
    List<String> purpose = new ArrayList<String>();
    List<String> mode = new ArrayList<String>();
    List<String> decompression_list = new ArrayList<String>();
    List<String> breathing = new ArrayList<String>();
    List<String> spec_enviroment = new ArrayList<String>();
    List<String> surfaces_condition = new ArrayList<String>();
    List<String> under_condition = new ArrayList<String>();

    diveSite site;
    String diver;
    Date date;
    String dive_site;
    String time_in;
    String time_out;
    String time_at_bottom;
    String durration;
    String task; //w
    String type;
    String reason; //training/proficiency/neither
    String surface_interval;
    Double gps_1;
    Double gps_2;
    String max_depth;
    String diving_mode;
    String decompression;
    String breathing_gas;
    Double starting_psi;
    Double ending_psi;
    String buddy_list; //change to list of strings
    String surface_condition;
    String underwater_condition;
    String standby_diver;
    String tender;
    String dpic;
    String comments;
    String animal;

    public diveLog(String diver, Date date, String dive_site, String time_in, String time_out, String time_at_bottom, String durration, String task, String type, String reason, String surface_interval, Double gps_1, Double gps_2, String max_depth, String diving_mode, String decompression, String breathing_gas, Double starting_psi, Double ending_psi, String buddy_list, String surface_condition, String underwater_condition, String standby_diver, String tender, String dpic, String comments, String animal)
    {
        this.diver = diver;
        this.date = date;
        this.dive_site = dive_site;
        this.time_in = time_in;
        this.time_out = time_out;
        this.time_at_bottom = time_at_bottom;
        this.durration = durration;
        this.task = task;
        this.type = type;
        this.reason = reason;
        this.surface_interval = surface_interval;
        this.gps_1 = gps_1;
        this.gps_2 = gps_2;
        this.max_depth = max_depth;
        this.diving_mode = diving_mode;
        this.decompression = decompression;
        this.breathing_gas = breathing_gas;
        this.starting_psi = starting_psi;
        this.ending_psi = ending_psi;
        this.buddy_list = buddy_list;
        this.surface_condition = surface_condition;
        this.underwater_condition = underwater_condition;
        this.standby_diver = standby_diver;
        this.tender = tender;
        this.dpic = dpic;
        this.comments = comments;
        this.animal = animal;

        purpose.add("Commercial Task");
        purpose.add("Commercial, Scientific Taks");
        purpose.add("Other Task");
        purpose.add("Public Safety Task");
        purpose.add("Recreational Task");
        
        mode.add("Scuba with FFM");
        mode.add("Hookah");
        mode.add("Snorkling");
        
        decompression_list.add("Dive Computer");
        decompression_list.add("Dive Tables");
        decompression_list.add("Software");

        breathing.add("Air");
        breathing.add("Nitrox 28");
        breathing.add("Trimix 30/30");
        breathing.add("tes");

        spec_enviroment.add("Overhead Enviroment");
        spec_enviroment.add("Blue Water");
        spec_enviroment.add("Required Decompression");
        spec_enviroment.add("Aquarium Diving");
        spec_enviroment.add("asd");

        surfaces_condition.add("Calm");
        surfaces_condition.add("Moderate");
        surfaces_condition.add("Rough");

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
        
        decompression_list.add("Dive Computer");
        decompression_list.add("Dive Tables");
        decompression_list.add("Software");

        breathing.add("Air");
        breathing.add("Nitrox 28");
        breathing.add("Trimix 30/30");
        breathing.add("tes");

        spec_enviroment.add("Overhead Enviroment");
        spec_enviroment.add("Blue Water");
        spec_enviroment.add("Required Decompression");
        spec_enviroment.add("Aquarium Diving");
        spec_enviroment.add("asd");

        surfaces_condition.add("Calm");
        surfaces_condition.add("Moderate");
        surfaces_condition.add("Rough");

        under_condition.add("Good");
        under_condition.add("Moderate");
        under_condition.add("Poor");


        sites.add(new diveSite("Field 1",50));
        sites.add(new diveSite("Field 2",35));
    }



    public String getUserId()
    {
        return this.userId;
    }
    public void setUserId(String userId)
    {
        this.userId = userId;
    }
    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
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
        return decompression_list;
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
        return surfaces_condition;
    }
    List<String> getAllUnderCon()
    {
        return under_condition;
    }
   

    public void set_diver(String diver)
    {
        this.diver = diver;
    }
    public String getDiver()
    {
        return this.diver;
    }

    public void set_diver(Date date)
    {
        this.date = date;
    }
    public Date getDate()
    {
        return this.date;
    }
    public void set_divesite(String dive_site)
    {
        this.dive_site = dive_site;
    }
    public String getDive_site()
    {
        return this.dive_site;
    }

    public void set_timeIn(String timeIn)
    {
        this.time_in = timeIn;
    }
    public String get_timeIn()
    {
        return this.time_in;
    }

    public void setTime_out(String time_out)
    {
        this.time_out = time_out;
    }
    public String getTime_out()
    {
        return this.time_out;
    }
    

    public void setTimeAtBottom(String time_at_bottom)
    {
        this.time_at_bottom = time_at_bottom;
    }
    public String getTimeAtBottom()
    {
        return this.time_at_bottom;
    }

    public void getDurration(String durration)
    {
        this.durration = durration;
    }
    public String getDurration()
    {
        return this.durration;
    }

    public void set_task(String task)
    {
        this.task = task;
    }
    public String getTask()
    {
        return this.task;
    }

    public void set_type(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return this.type;
    }

    public void set_reason(String reason)
    {
        this.reason = reason;
    }
    public String getReason()
    {
        return this.reason;
    }

    public void set_surfaceInterval(String surface_interval)
    {
        this.surface_interval = surface_interval;
    }
    public String getSurface_interval()
    {
        return this.surface_interval;
    }

    public void setgps_1(Double gps_1)
    {
        this.gps_1 = gps_1;
    }
    public Double getGPS_1()
    {
        return this.gps_1;
    }

    public void setGPS_2(Double gps_2)
    {
        this.gps_2 = gps_2;
    }
    public Double getGPS_2()
    {
        return this.gps_2;
    }

    public void setmax_depth(String max_depth)
    {
        this.max_depth = max_depth;
    }
    public String getMax_depth()
    {
        return this.max_depth;
    }

    public void set_decompression(String decompression)
    {
        this.decompression = decompression;
    }
    public String get_decompression()
    {
        return this.decompression;
    }

    public void set_breatingGas(String gas)
    {
        this.breathing_gas = gas;
    }
    public String getBreathing_gas()
    {
        return this.breathing_gas;
    }

    public void setStarting_psi(Double starting)
    {
        this.starting_psi = starting;
    }
    public Double getStarting_psi()
    {
        return this.starting_psi;
    }

    public void set_endingPSI(Double psi)
    {
        this.ending_psi = ending_psi;
    }
    public Double getEnding_psi()
    {
        return this.ending_psi;
    }

    public void setBuddy_list(String buddies)
    {
        this.buddy_list = buddies;
    }
    public String getBuddies()
    {
        return this.buddy_list;
    }

    public void setSurface_condition(String surface_condition)
    {
        this.surface_condition = surface_condition;
    }
    public String getSurface_Condition()
    {
        return this.surface_condition;
    }

    public void set_underwaterCondition(String underwater)
    {
        this.underwater_condition = underwater;
    }
    public String get_underWaterCondition()
    {
        return this.underwater_condition;
    }

    public void set_standbyDiver(String standby_diver)
    {
        this.standby_diver = standby_diver;
    }
    public String getStandby_diver()
    {
        return this.standby_diver;
    }

    public void set_tender(String tender)
    {
        this.tender = tender;
    }
    public String getTender()
    {
        return this.tender;
    }

    public void set_dpic(String dpic)
    {
        this.dpic = dpic;
    }
    public String get_dpic()
    {
        return this.dpic;
    }

    public void comments(String comments)
    {
        this.comments = comments;
    }
    public String get_comments()
    {
        return this.comments;
    }

    public void set_animal(String animal)
    {
        this.animal = animal;
    }
    public String get_animal()
    {
        return this.animal;
    }


}