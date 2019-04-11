package employeemanager.service;

import employeemanager.gui.Main;
import employeemanager.models.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class EmployeeSerialization {
   
    // CSV
    public static void serializeToFileCSV(ArrayList<Employee> empList, String filePath) throws FileNotFoundException, IOException {
        File outputFile = new File(filePath);
        FileOutputStream fileOutStream = new FileOutputStream(outputFile);
        //ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStream);
        PrintWriter printWriter = new PrintWriter(fileOutStream);
        for (Employee emp : empList) {
            printWriter.println(emp);
        }
        printWriter.flush();
//        objOutStream.writeObject(empList);
//        objOutStream.close();
        fileOutStream.close();
        printWriter.close();
    }
    
    public static void deserializeFromFileCSV(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileReader fileReader = new FileReader(new File(filePath));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileLine;
        while ((fileLine = bufferedReader.readLine()) != null) {
           
        }
    }
    
    // HEX
    public static void serializeToFileHEX(ArrayList<Employee> empList, String filePath) throws FileNotFoundException, IOException{
        File outputFile = new File(filePath);
        FileOutputStream fileOutStream = new FileOutputStream(outputFile);
        ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStream);
        objOutStream.writeObject(empList);
        objOutStream.close();
        fileOutStream.close();
    }
    
    
    
    
    
}
