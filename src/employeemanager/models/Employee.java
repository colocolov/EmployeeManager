
package employeemanager.models;

import java.time.LocalDate;

/**
 * @author Стас
 */
public class Employee {

    private Integer id;
    private String name;
    private String surname;
    private String street;
    private Integer zip; 
    protected Country country;
    protected City city;
    protected Position position;
    protected LocalDate birthday;

    public Employee(String name, String surname, LocalDate birthday, Country country, 
    City city, String street, Integer zip, Position position) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.position = position;
        this.birthday = birthday;
    }
    
    public Employee(Integer id, String name, String surname, LocalDate birthday, Country country, 
    City city, String street, Integer zip, Position position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.position = position;
    }
    
    public Employee(Integer id, String name, String surname, Country country, 
    City city, String street, Position position) {
        this.name = name;
        this.surname = surname;
        //this.birthday = birthday;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.position = position;
    }
    
    // для edita
    public Employee(Integer id, String name, String surname, LocalDate birthday, String street, Position position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        //this.country = country;
        //this.city = city;
        this.street = street;
        //this.zip = zip;
        this.position = position;
    }
    
    // для примера на уроке с полиморфизмом
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public Country getCountry() {
        return country;
    }
    
    public City getCity() {
        return city;
    }
    
    public String getStreet() {
        return street;
    }
    
    public Integer getZip() {
        return zip;
    }
    
    public Position getPosition() {
        return position;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isValid() {
        return !this.name.isEmpty();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
    
    public void setSteet(String street) {
        this.street = street;
    }
    
    public void setZip(Integer zip) {
        this.zip = zip;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }
    
    public void work(){
        System.out.println("I'm an employee. I do ");
    }

    
    @Override
//    public String toString() {
//        return "Employee{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", country=" + country + 
//                ", city=" + city + ", street=" + street + 
//                ", zip=" + zip + ", position=" + position + '}';
//    }
    public String toString() {
        return id + "," + name + "," + surname + "," + birthday + "," + country + "," + 
                city + "," + street + "," + zip + "," + position;
    }
}
