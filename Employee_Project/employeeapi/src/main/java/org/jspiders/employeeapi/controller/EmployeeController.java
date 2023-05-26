package org.jspiders.employeeapi.controller;

import org.jspiders.employeeapi.model.Employee;
import org.jspiders.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin("http://localhost:3000/")
@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService service;

     @PostMapping("/employees")
    public void addEmployeeService(@RequestBody Employee e){
         service.addEmployeeService(e);
    }
    @GetMapping("/employees")
    public List<Employee>getAllEmployee(){
         return service.getAllEmployee();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
      return service.getEmployeeById(id);
    }
    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee e){
      service.updateEmployee(e);
    }
    @DeleteMapping("/employees/{id}")
    public void deleteEmpById(@PathVariable int id){
       service.deleteEmpById(id);
    }
    @GetMapping("/findByempName/{empName}")
    public List<Employee> findByempName(@PathVariable String empName){
       return service.findByempName(empName);
    }
    @GetMapping("/findByempDesg/{empDesg}")
    public List<Employee> findByempDesg(@PathVariable String empDesg){
         return service.findByempDesg(empDesg);
    }
    @GetMapping("/findByempSalaryGreaterThan/{empSalary}")
    public List<Employee> findByempSalaryGreaterThan(@PathVariable double empSalary)
    {
        return service.findByempSalaryGreaterThan(empSalary);
    }
    @GetMapping("/findByempAgeLessThan/{empAge}")
    public List<Employee>findByempAgeLessThan(@PathVariable int empAge)
    {
        return service.findByempAgeLessThan(empAge);
    }
    @GetMapping("/findByEmpDesgAndEmpSalaryLessThan")
    public List<Employee>findByEmpDesgAndEmpSalaryLessThan(@RequestParam String empDesg,@RequestParam double empSalary)
    {
        return service.findByEmpDesgAndEmpSalaryLessThan(empDesg,empSalary);
    }
    @GetMapping("findByempSalaryBetween")
      public List<Employee>findByempSalaryBetween(@RequestParam double empSalarystart,@RequestParam double empSalaryend)
      {
          return service.findbyempSalaryBetween(empSalarystart,empSalaryend);
      }
      @GetMapping("findByempDesgContaining")
    public List<Employee> findByempDesgContaining(@RequestParam String empDesg)
      {
          return service.findByempDesgContaining(empDesg);
      }
      @GetMapping("/findByempSalaryLessThanAndGreaterThanEmpAge")
      public List<Employee>findByempSalaryLessThanAndEmpAgeGreaterThan(@RequestParam double empSalary,@RequestParam int empAge)
      {
          return service.findByempSalaryLessThanAndEmpAgeGreaterThan(empSalary,empAge);
      }
      @GetMapping("findByempDesgIn")
      public List<Employee>findByempDesgIn(String empDesg1,String empDesg2,String empDesg3)
      {
          List<String>empDesg=new ArrayList<>();
          empDesg.add(empDesg1);
          empDesg.add(empDesg2);
          empDesg.add(empDesg3);
          return service.findByempDesgIn(empDesg);
      }
      @GetMapping("/displayempDesg/{designation}")
    public List<Employee>displayEmployees(@PathVariable String designation){
         return service.displayEmployees(designation);
    }
    @GetMapping("/displayNames/{Name}")
    public List<Employee>displayNames(@PathVariable String Name)
    {
        return service.displayNames(Name);
    }
    @GetMapping("/displayChar/{eName}")
    public List<Employee>displayChar(@PathVariable String eName)
    {
        return service.displayChar(eName);
    }
    @GetMapping("/displaycharacter/{eName}")
    public List<Employee>displaycharacter(@PathVariable String eName)
    {
        return service.displaycharacter(eName);
    }
    @PutMapping("/updateempName/{prefix}")
    public void updateempName(@PathVariable String prefix)
    {
        service.updateempName(prefix);
    }

}
