package org.jspiders.employeeapi.repositary;

import org.jspiders.employeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Integer> {
      //get employee by names
      public List<Employee> findByempName(String empName);
      //get employee by desg
      public List<Employee> findByempDesg(String empDesg);
      //get employee earning salary greater than 250000
     public List<Employee> findByempSalaryGreaterThan(double empSalary);
      //get employee having age less than 30
     public List<Employee> findByempAgeLessThan(int empAge);
      //get employee having specific desg and salary less than 30000
     public List<Employee>findByEmpDesgAndEmpSalaryLessThan(String empDesg,double empSalary);
    //find employees having salary between spcified range
     public List<Employee> findByempSalaryBetween(double empSalarystart,double endempSalaryend);
    //find employee whose designation contain specified string
     public List<Employee> findByempDesgContaining(String empDesg);
    //display employee having salary less than specified amt and age greater than specified value
    public List<Employee> findByempSalaryLessThanAndEmpAgeGreaterThan(double empSalary,int empAge);
     //display all employee matching the list
     public List<Employee> findByempDesgIn(List <String>empDesg);
     //fetch all employee based on their designation
    @Query("select e from Employee e where e.empDesg=:designation")
    public List<Employee>displayEmployees(@Param("designation") String designation);

    //fetch all the employee whose name contain specified character
    @Query("select e from Employee e where e.empName like %:Name%")
    public List<Employee>displayNames(@Param("Name") String Name);
  //fetch all the employee whose name start wirh specific character
    @Query("select e from Employee e where e.empName like :eName%")
    public List<Employee>displayChar(@Param("eName")String eName);

    //fetch all the employee designation ends with specific char
    //pure sql query
    @Query(value = "select * from emp_info where emp_desg like %:eName" ,nativeQuery = true)
    public List<Employee>displaycharacter(@Param("eName")String eName);

   //update empNames with specified character
    @Query("update Employee e set e.empName=:prefix||e.empName")
    @Modifying
    @Transactional
    public void updateempName(@Param("prefix") String  prefix);

}
