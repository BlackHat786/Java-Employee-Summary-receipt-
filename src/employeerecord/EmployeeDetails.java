/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecord;
import java.util.*;
/**
 *
 * @author Dynamoe
 */
public class EmployeeDetails {
    
    String Name;
    String Surname;
    String EmpNum;
    double Salary;
    double Increase;
    
    
    Scanner kb = new Scanner(System.in);
    
    EmployeeDetails()
    {
        this.Salary=10000;
    }
    
    EmployeeDetails(String Name, String Surname, String empnum, double increase)
    {
        this.Name=Name;
        this.Surname= Surname;
        this.EmpNum= empnum;
        this.Increase= increase;
    }
    
    public void input()
    {
        System.out.print("Enter Employee Name: ");
        Name= kb.nextLine();      
        
        System.out.print("Enter Employee Surname: ");
        Surname= kb.next();
        
        System.out.print("Enter Employee Number: ");
        EmpNum= kb.next();
        
        System.out.print("Enter Employee Salary Increase: ");
        Increase= kb.nextDouble();
    }
    
    public double salary()
    {
        double total=0.0;
        total=Salary+ Increase;
        return total;
    }
    //Tax18 medical aid 12.5 car allowance 8 ufi 2
    public double Tax()
    {
        double tax=0.0;
        tax= salary()*0.18;
        return tax;
    }
     public double MedicalAid()
    {
        double medicalAid=0.0;
        medicalAid= salary()*0.125;
        return medicalAid;
    }
      public double allowance()
    {
        double Allowance=0.0;
        Allowance= salary()*0.08;
        return Allowance;
    }
       public double UFI()
    {
        double ufi=0.0;
        ufi= salary()*0.02;
        return ufi;
    }
       public double NewSalary()
       {
           double newT=0.0;
           newT= salary()-Tax()-MedicalAid()-allowance()-UFI();
           return newT;
       }
       public void display()
       {
           
           System.out.println("Employee Report");
           System.out.println("*************************");
           System.out.println("Employee Number: "+EmpNum+"\n"
                              +"Employee First Name: "+Name+"\n"+
                               "Employee Surname: "+Surname+"\n"+
                                "Original Salary: R"+Salary+"\n"+
                                "Salary Increase: R"+Increase+"\n"+""+
                                "New Salary: R"+salary()+"\n");
          
          
           

       }
       
       public void deductions()
       {
                      String choice;
           System.out.println("Enter 1 to View Deductions or any other key to exit: ");
           choice= kb.next();
           if("1".equals(choice))
           {
                              System.out.println("Employee Deductions");
               System.out.println("**********************");
               System.out.println("TAX: "+Tax()+"\n"
                              +"Allowance: "+allowance()+"\n"+
                               "Medical Aid: "+MedicalAid()+"\n"+
                                "UFI: R"+UFI()+"\n"+
                                "Salary Increase: R"+Increase+"\n"+""+
                                "New Salary: R"+NewSalary()+"\n");
           }
           
               else
               {
                                  System.out.print("Programme End");
               }
       }
}
