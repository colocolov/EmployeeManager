
package employeemanager.service;

import employeemanager.models.City;
import employeemanager.models.Country;
import employeemanager.models.Employee;
import employeemanager.models.Position;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeDao {
    
    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/employee";
    private static final String DB_USER = "postgres";
    private static final String DB_PASS = "0";

    public EmployeeDao() {
    }

    private Connection connect() throws SQLException {
        System.out.println("Connected to postgresql server successfully.");
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public ArrayList<Employee> getAll() throws SQLException {
        String sql = "SELECT id,name,surname,birthday,position,country,city,street,zip FROM app.Employee";
        try (Connection conn = connect();
                Statement dbStatement = conn.createStatement();
                ResultSet rs = dbStatement.executeQuery(sql)) {
            ArrayList empList = new ArrayList<Employee>();
            while (rs.next()) {
                Employee emp = new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        LocalDate.parse(rs.getString("birthday")),
                        Country.getByCountryName(rs.getString("country")),
                        City.getByCityOnName(rs.getString("city")),
                        rs.getString("street"),
                        rs.getInt("zip"),
                        Position.getByPositiOnName(rs.getString("position")));
                empList.add(emp);
            }
            return empList;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to get all the employees");
            throw ex;
        }
    }

    // добавление в БД через ADD
    public int add(Employee emp) throws SQLException {
        String insertSql = "INSERT INTO app.employee(name,surname,birthday,position,country,city,street,zip) VALUES (?,?,?,?,?,?,?,?)";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(insertSql)) {

            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setString(3, emp.getBirthday().toString());
            dbStatement.setString(4, emp.getPosition().getName());
            dbStatement.setString(5, emp.getCountry().getName());
            dbStatement.setString(6, emp.getCity().getName());
            dbStatement.setString(7, emp.getStreet());
            dbStatement.setString(8, emp.getZip().toString());

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employee");
            throw ex;
        }
    }

    // ввод в БД из файла XML
    public int add(ArrayList<Employee> empList) throws SQLException {
        String insertSql = "INSERT INTO app.employee(name,surname,birthday,position) VALUES (?,?,?,?)";
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(insertSql)) {
            for (Employee emp : empList) {
                dbStatement.setString(1, emp.getName());
                dbStatement.setString(2, emp.getSurname());
                dbStatement.setString(3, emp.getBirthday().toString());
                dbStatement.setString(4, emp.getPosition().getName());
                dbStatement.addBatch();
            }
            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }

    // редактирование Employee в БД
    public int edit(Employee emp) throws SQLException {
        String updateSql = "UPDATE app.employee SET name=?, surname=?, birthday=?,country=?,city=?,street=?,zip=?,position=? WHERE id=?";
//        String updateSql = "UPDATE app.employee SET name=?, surname=?, birthday=?, position=? WHERE name like '%znacenie%' OR surname like '%znacenie%' ";
        System.out.println(emp + "sql edit");
        try (Connection conn = connect();
                PreparedStatement dbStatement = conn.prepareStatement(updateSql)) {

            dbStatement.setString(1, emp.getName());
            dbStatement.setString(2, emp.getSurname());
            dbStatement.setString(3, emp.getBirthday().toString());
            dbStatement.setString(4, emp.getCountry().toString());
            dbStatement.setString(5, emp.getCity().toString());
            dbStatement.setString(6, emp.getStreet());
            dbStatement.setString(7, emp.getZip().toString());
            dbStatement.setString(8, emp.getPosition().toString());
            dbStatement.setInt(9, emp.getId());

            int affectedRows = dbStatement.executeUpdate();
            System.out.println(String.format("Executed insert statement. Affected %d rows", affectedRows));
            return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to insert the employees");
            throw ex;
        }
    }

    // запрос на получение Employee по имени, фамилии и професии
    public Employee getEmployee(String name, String surname, String position){
        String sql = "SELECT id, name, surname, birthday, position, country, city, street, zip "
                + "FROM app.employee WHERE name=? AND surname=? AND position=?";
        try(Connection conn = connect(); PreparedStatement prepStmt = conn.prepareStatement(sql)){
            prepStmt.setString(1, name);
            prepStmt.setString(2, surname);
            prepStmt.setString(3, position);
            ResultSet rs = prepStmt.executeQuery();
            Employee emp = null;
            while(rs.next()){
                emp = new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        LocalDate.parse(rs.getString("birthday")),
                        Country.getByCountryName(rs.getString("country")),
                        City.getByCityOnName(rs.getString("city")),
                        rs.getString("street"),
                        rs.getInt("zip"),
                        Position.getByPositiOnName(rs.getString("position")));
            }
            return emp;
        } catch (SQLException ex){
            System.err.println("Error trying to get one employee");
        }
        return null;
    }
    
    // удаление Employee из БД
    public int remove(Employee emp) throws SQLException {
        String updateSql = "DELETE FROM app.employee WHERE id=?";
        try (Connection conn = connect();
            PreparedStatement dbStatement = conn.prepareStatement(updateSql)) {
                dbStatement.setInt(1, emp.getId());
                int affectedRows = dbStatement.executeUpdate();
                System.out.println(String.format("Executed delete statement. Affected %d rows", affectedRows));
                return affectedRows;
        } catch (SQLException ex) {
            System.err.println("Caught an error trying to delete the employee");
            throw ex;
        }
    }

}
