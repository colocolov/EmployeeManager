
package employeemanager.service;

import employeemanager.models.City;
import employeemanager.models.Country;
import employeemanager.models.Employee;
import employeemanager.models.Position;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class EmployeeService {
    
        private static final ArrayList<Employee> EMPLOYEE_LIST = new ArrayList<>();
        
        public static ArrayList<Employee> getEmployeesList(){ // метод сделан для того чтобы мы могли обраться 
            return EMPLOYEE_LIST;                              //   к privat атрибуту нащему ArrayList
        }
        
        public static Employee getById(Integer id){
            for(Employee emp: EMPLOYEE_LIST){
                if(emp.getId().equals(id)){
                    return emp;
                }
            }
            return null;
        }
       
        ///метод РЕДАКТИРОВАНИЯ
        public static void edit (Integer employeeId, String newName, String newSurname, String newBirthday, 
                String newCountry, String newCity, String newStreet, Integer newZip, String newPosition){
            int index=0;
            for (; index < EMPLOYEE_LIST.size(); index ++){
                if(employeeId.equals(EMPLOYEE_LIST.get(index).getId())){
                    break;
                }
            }
            EMPLOYEE_LIST.get(index).setName(newName);
            EMPLOYEE_LIST.get(index).setSurname(newSurname);
            EMPLOYEE_LIST.get(index).setBirthday(LocalDate.parse(newBirthday));
            EMPLOYEE_LIST.get(index).setCountry(Country.getByCountryName(newCountry));
            EMPLOYEE_LIST.get(index).setCity(City.getByCityOnName(newCity));
            EMPLOYEE_LIST.get(index).setSteet(newStreet);
            EMPLOYEE_LIST.get(index).setZip(newZip);
            EMPLOYEE_LIST.get(index).setPosition(Position.getByPositiOnName(newPosition));
        }
        
        ///метод УДАЛЕНИЕ
        public static void delete (Integer employeeId){
            int index=0;
            for (; index < EMPLOYEE_LIST.size(); index ++){
                if(employeeId.equals(EMPLOYEE_LIST.get(index).getId())){
                    break;
                }
            }
            EMPLOYEE_LIST.remove(index);
        }
        
        ///метод ПЕЧАТИ в консоли
        public static void getEmployeesListToPrint(){ 
            for(Employee emp: EMPLOYEE_LIST){
                System.out.println(emp);
            }                      
        }
        
        //экспорт в файл CSV
        public static void ExportFileCSV(){
            try {
                EmployeeSerialization.serializeToFileCSV(EMPLOYEE_LIST, "D:\\EmployeesCSV.txt");
             } catch(IOException ex){
                Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);        
             }
        }
        
        //импорт из файла CSV
        public static void ImportFileCSV(){
            try {
                EmployeeSerialization.deserializeFromFileCSV("D:\\EmployeesCSV.txt");
            } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //экспорт в файл XML
        public static void ExportFileXML() throws ParserConfigurationException, TransformerException{
            XMLIOService.writeToFile(EMPLOYEE_LIST);
        }
        
        //экспорт в файл HEX
        public static void ExportFileHEX(){
            try {
                EmployeeSerialization.serializeToFileHEX(EMPLOYEE_LIST, "D:\\EmployeesHEX.txt");
            } catch (IOException ex) {
            System.err.println("Error dude");
        }
        }
        

}
