package org.jspiders.employeeapi.service;

import org.jspiders.employeeapi.model.Employee;
import org.jspiders.employeeapi.repositary.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepositary repositary;
    public void addEmployeeService(Employee e){
        repositary.save(e);
    }
    public List<Employee> getAllEmployee(){
        List<Employee>employeeList=repositary.findAll();
        return employeeList;
    }
    public Employee getEmployeeById(int id){
     Employee e=repositary.findById(id).orElse(null);
     return e;
    }
    public void updateEmployee(Employee e){
       repositary.save(e);
    }
    public void deleteEmpById(int id){
     repositary.deleteById(id);
    }
    public List<Employee> findByempName(String empName){
        return repositary.findByempName(empName);
    }
    public List<Employee>findByempDesg(String empDesg){
        return repositary.findByempDesg(empDesg);
    }
    public List<Employee>findByempSalaryGreaterThan(double empSalary)
    {
        return repositary.findByempSalaryGreaterThan(empSalary);
    }
    public List<Employee>findByempAgeLessThan(int empAge)
    {
        return repositary.findByempAgeLessThan(empAge);
    }
    public List<Employee>findByEmpDesgAndEmpSalaryLessThan(String empDesg,double empSalary)
    {
        return repositary.findByEmpDesgAndEmpSalaryLessThan(empDesg,empSalary);
    }
    public List<Employee>findbyempSalaryBetween(double empSalarystart,double empSalaryend)
    {
        return repositary.findByempSalaryBetween(empSalarystart,empSalaryend);
    }
    public List<Employee> findByempSalaryLessThanAndEmpAgeGreaterThan(double empSalary,int empAge)
    {
        return repositary.findByempSalaryLessThanAndEmpAgeGreaterThan(empSalary,empAge);
    }
    public List<Employee>  findByempDesgContaining(String empDesg)
    {
        return repositary.findByempDesgContaining(empDesg);
    }
    public List<Employee> findByempDesgIn(List<String>empDesg)
    {
        return repositary.findByempDesgIn(empDesg);
    }
    public List<Employee>displayEmployees(String designation){
        return repositary.displayEmployees(designation);
    }
    public List<Employee>displayNames(String Name){
        return repositary.displayNames(Name);
    }
    public List<Employee>displayChar(String eName){
        return repositary.displayChar(eName);
    }
    public List<Employee>displaycharacter(String eName)
    {
        return repositary.displaycharacter(eName);
    }
    public void updateempName(String prefix)
    {
        repositary.updateempName(prefix);
    }

}
