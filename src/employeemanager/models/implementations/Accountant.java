
package employeemanager.models.implementations;

import employeemanager.models.Employee;


public class Accountant extends Employee{
    
    String type = "accountant";
    
    public Accountant(String name, String surname){
        super(name, surname);
    }
    
    public void work(){
        System.out.println("Hello! It is my code");
    }

}
