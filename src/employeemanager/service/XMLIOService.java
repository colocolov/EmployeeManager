
package employeemanager.service;

import employeemanager.gui.Main;
import employeemanager.models.Employee;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLIOService {
    
    private static final String EMPLOYEELIST_NODE = "Employees";
    private static final String EMPLOYEE_NODE = "employee";
    private static final String NAME_NODE = "name";
    private static final String SURNAME_NODE = "surname";
    private static final String BIRTHDAY_NODE = "birthday";
    private static final String COUNTRY_NODE = "country";
    private static final String CITY_NODE = "city";
    private static final String STREET_NODE = "street";
    private static final String ZIP_NODE = "zip";
    private static final String POSITION_NODE = "position";
    
    
    public static void main(String[] args) {
        
    }
    
    public static void writeToFile(ArrayList<Employee> empList) throws ParserConfigurationException, TransformerException  {
        DocumentBuilderFactory domBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder domBuilder = domBuilderFactory.newDocumentBuilder();
        Document doc = domBuilder.newDocument();
        Element root = doc.createElement("Employees");
        doc.appendChild(root);
        for (Employee emp : empList) {
            Element employee = doc.createElement(EMPLOYEE_NODE);
            root.appendChild(employee);
            
            Element name = doc.createElement(NAME_NODE);
            name.appendChild(doc.createTextNode(emp.getName()));
            employee.appendChild(name);
            
            Element surname = doc.createElement(SURNAME_NODE);
            surname.setNodeValue(emp.getSurname());
            surname.appendChild(doc.createTextNode(emp.getSurname()));
            employee.appendChild(surname);
            
            Element employedDate = doc.createElement(BIRTHDAY_NODE);
            employedDate.appendChild(doc.createTextNode(emp.getBirthday().toString()));
            employee.appendChild(employedDate);
            
            Element country = doc.createElement(COUNTRY_NODE);
            country.appendChild(doc.createTextNode(emp.getCountry().toString()));
            employee.appendChild(country);
            
            Element city = doc.createElement(CITY_NODE);
            city.appendChild(doc.createTextNode(emp.getCity().toString()));
            employee.appendChild(city);
            Element street = doc.createElement(STREET_NODE);
            street.appendChild(doc.createTextNode(emp.getStreet()));
            employee.appendChild(street);
            Element zip = doc.createElement(ZIP_NODE);
            zip.appendChild(doc.createTextNode(emp.getZip().toString()));
            employee.appendChild(zip);
            
            Element position = doc.createElement(POSITION_NODE);
            position.appendChild(doc.createTextNode(emp.getPosition().toString()));
            employee.appendChild(position);
        }
        doc.getDocumentElement().normalize();
        
        // Writing to a file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult destination = new StreamResult(new File("D:\\employee.xml"));
        transformer.transform(source, destination);
    }
    
    
    public static void ImportFromXML() throws IOException, ParserConfigurationException, SAXException {

        File inputFile = new File("D:\\employee.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document xmlDoc = dBuilder.parse(inputFile);
        xmlDoc.getDocumentElement().normalize();

        System.out.println("Root element :" + xmlDoc.getDocumentElement().getNodeName());
        NodeList nList = xmlDoc.getElementsByTagName(EMPLOYEE_NODE);

        for (int index = 0; index < nList.getLength(); index++) {
            Node nNode = nList.item(index);
            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String newName = eElement.getElementsByTagName(NAME_NODE).item(0).getTextContent();
                String newSurname = eElement.getElementsByTagName(SURNAME_NODE).item(0).getTextContent();
                String newBirthday = eElement.getElementsByTagName(BIRTHDAY_NODE).item(0).getTextContent();
                String newCountry = eElement.getElementsByTagName(COUNTRY_NODE).item(0).getTextContent();
                String newCity = eElement.getElementsByTagName(CITY_NODE).item(0).getTextContent();
                String newStreet = eElement.getElementsByTagName(STREET_NODE).item(0).getTextContent();
                String newZip = eElement.getElementsByTagName(ZIP_NODE).item(0).getTextContent();
                
                String newPosition = eElement.getElementsByTagName(POSITION_NODE).item(0).getTextContent();

                DefaultTableModel employeeListModel = (DefaultTableModel) Main.employeesListTable.getModel(); //так ссылаемся на наши данные которые мы указываем в таблице
                int employeeID = employeeListModel.getRowCount() + 1;
                employeeListModel.addRow(new Object[]{employeeID, newName, newSurname, newBirthday, newCountry + " / " +  newCity + " / " +  newStreet + " / " +  newZip, newPosition});
            }

        }
    }

}
