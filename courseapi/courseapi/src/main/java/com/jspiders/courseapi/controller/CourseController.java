package com.jspiders.courseapi.controller;

import com.jspiders.courseapi.model.Courses;
import com.jspiders.courseapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController
{
    @Autowired
   CourseService service;
   @GetMapping("/courses")
    public List<Courses> displayCourses(){
          return service.displayCourses();
    }
    @GetMapping("/courses/{batchCode}")
    public Courses getCourses(@PathVariable int batchCode){
         return service.getCourses(batchCode);
    }
    @GetMapping("/courses/{faculty}")
    public Courses getCourse(@RequestParam String faculty)
    {
        return service.getCourse(faculty);
    }
    @PostMapping("/courses/")
    public void addCourses(@RequestBody Courses c)
    {
         service.addCourses(c);
    }
    @DeleteMapping("/courses/{batchCode}")
    public void deleteCourses(@PathVariable int batchCode)
    {
        service.deleteCourses(batchCode);
    }
    @PutMapping("/courses/{batchCode}")
    public void updateCourses(@PathVariable int batchCode,@RequestBody Courses c){
       service.updateCourses(batchCode,c);

    }
}
