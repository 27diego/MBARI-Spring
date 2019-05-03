package edu.csumb.sp19.cst438.mbari.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{

    @GetMapping("/message")
    public Message getMessage()
    {
        return new Message("it works??");
    }
}