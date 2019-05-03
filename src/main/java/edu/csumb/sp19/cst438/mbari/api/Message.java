package edu.csumb.sp19.cst438.mbari.api;

public class Message
{
    private String message;

    public Message(String message)
    {
        this.message = message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public String getMessage()
    {
        return this.message;
    }
}