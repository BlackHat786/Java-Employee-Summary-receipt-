/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeerecord;

/**
 *
 * @author Dynamoe
 */
public class EmployeeRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        EmployeeDetails emp= new EmployeeDetails();
        
        emp.input();
        emp.display();
        emp.deductions();
        
        
    }
    
}
