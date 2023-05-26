package org.jspider.demoapi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController
{
    @RequestMapping("/message")
    public String getmessage(){
        return "WELCOME TO SPRING BOOT APP";
    }
    @RequestMapping("/courses")
    public List<String> getdata(){
        List<String>data=new ArrayList<>();
        data.add("J2EE");
        data.add("JAVA");
        data.add("SPRING");
        return data;
    }
}
