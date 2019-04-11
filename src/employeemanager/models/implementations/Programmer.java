package employeemanager.models.implementations;

import employeemanager.models.Employee;

public class Programmer extends Employee{

    String type = "programmer";
    
    public Programmer(String name, String surname){
        super(name, surname);
    }
    
    public void work(){
        System.out.println("I am a programmer. I write code.");
    }
}
