package com.jspiders.courseapi.service;

import com.jspiders.courseapi.model.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService
{
    private List<Courses> courseslist=new ArrayList<>();

    {
        courseslist.add(new Courses(1,"java","ishamam",60));
        courseslist.add(new Courses(2,"sql","AkshaySir",28));
        courseslist.add(new Courses(3,"webtech","sudeshsir",24));
        courseslist.add(new Courses(4,"mongodb","AkshaySir",20));
    }
    public List<Courses>displayCourses(){
        return courseslist;
    }
    //display courses by batch code
    public Courses getCourses(int batchCode){
       Courses ref=null;
       for(Courses c:courseslist)
       {
           if(c.getBatchCode()==batchCode)
           {
               ref=c;
           }
       }
       return ref;
    }
    //display coursesby faculty
    public Courses getCourse(String faculty){
        Courses ref=null;
        for(Courses c:courseslist)
        {
            if(c.getFaculty().equals(faculty))
            {
                ref=c;
            }
        }
        return ref;
    }
    public void addCourses(Courses c){
      courseslist.add(c);
    }
    public void deleteCourses(int batchCode)
    {
        courseslist.removeIf(c->c.getBatchCode()==batchCode);
    }
    public void updateCourses(int batchCode,Courses c)
    {
          for(int i=0;i<courseslist.size();i++)
          {
              Courses co=courseslist.get(i);
              if(co.getBatchCode()==batchCode){
                   courseslist.set(i,co);
              }
          }
    }
}
