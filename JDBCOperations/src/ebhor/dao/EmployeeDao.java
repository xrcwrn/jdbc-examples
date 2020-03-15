/*
 * All database operation create update delete and select 
 * of employee should be done here
 */
package ebhor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ebhor.model.Employee;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.math.BigDecimal;
import java.sql.Date;

public class EmployeeDao {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int st;//status

    public int insert(Employee employee) {
        con = ConnectionFactory.getConnection();
        try {
            String query = "insert into employee(fname,lname,address,mobile_no,email_id,city,designation,dob,doj,salary) "
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, employee.getFname());
            ps.setString(2, employee.getLname());
            ps.setString(3, employee.getAddress());
            ps.setString(4, employee.getMobileNo());
            ps.setString(5, employee.getMailId());
            ps.setString(6, employee.getCity());
            ps.setString(7, employee.getDesignation());
            ps.setDate(8, employee.getDob());
            ps.setDate(9, employee.getDoj());
            ps.setBigDecimal(10, employee.getSalary());
            st = ps.executeUpdate();
            System.out.println("inserted employee " + st);
        } catch (MySQLIntegrityConstraintViolationException e) {
            st = -1;
            e.printStackTrace();
        } catch (Exception e) {
            st = -2;
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return st;
    }
    
    public int update(Employee employee) {
        con = ConnectionFactory.getConnection();
        try {
            String query = "update employee set fname=?,lname=?,address=?,mobile_no=?,email_id=?,city=?, "
                    + "designation=?,dob=?,doj=?,salary=? "
                    + "where id=? ";
            ps = con.prepareStatement(query);
            ps.setString(1, employee.getFname());
            ps.setString(2, employee.getLname());
            ps.setString(3, employee.getAddress());
            ps.setString(4, employee.getMobileNo());
            ps.setString(5, employee.getMailId());
            ps.setString(6, employee.getCity());
            ps.setString(7, employee.getDesignation());
            ps.setDate(8, employee.getDob());
            ps.setDate(9, employee.getDoj());
            ps.setBigDecimal(10, employee.getSalary());
            ps.setLong(11, employee.getId());
            st = ps.executeUpdate();
            System.out.println("updated employee " + st);
        } catch (Exception e) {
            st = -2;
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return st;
    }
    
    public int delete(long id) {
        con = ConnectionFactory.getConnection();
        try {
            String query = "delete from employee where id=? ";
            ps = con.prepareStatement(query);
            ps.setLong(1, id);
            st = ps.executeUpdate();
            System.out.println("deleted employee " + st);
        } catch (Exception e) {
            st = -2;
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return st;
    }
    
    public Employee fetchById(long id) {
        Employee employee = new Employee();
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where id=?";
            ps = con.prepareStatement(query);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employee;
    }
    
    public Employee fetchByEmailId(String emailId) {
        Employee employee = new Employee();
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where email_id=?";
            ps = con.prepareStatement(query);
            ps.setString(1, emailId);
            rs = ps.executeQuery();
            while (rs.next()) {
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employee;
    }
    
    public Employee fetchByMobileNo(String mobileNo) {
        Employee employee = new Employee();
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where mobile_no=?";
            ps = con.prepareStatement(query);
            ps.setString(1, mobileNo);
            rs = ps.executeQuery();
            while (rs.next()) {
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employee;
    }
    
    public List<Employee> searchByName(String name) {
        List<Employee> employeeList = new ArrayList<Employee>();
        
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where fname like ? or lname like ?";
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            ps.setString(2, "%" + name + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employeeList;
    }
    
    public List<Employee> fetchByCity(String city) {
        List<Employee> employeeList = new ArrayList<Employee>();
        
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where  city=?";
            ps = con.prepareStatement(query);
            ps.setString(1, city);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employeeList;
    }
    
    public List<Employee> fetchBySalaryRange(BigDecimal lowerSalary, BigDecimal higherSalary) {
        List<Employee> employeeList = new ArrayList<Employee>();
        
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where salary between ? and ?";
            ps = con.prepareStatement(query);
            ps.setBigDecimal(1, lowerSalary);
            ps.setBigDecimal(2, higherSalary);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employeeList;
    }
    
    public List<Employee> fetchByDob(Date dob) {
        List<Employee> employeeList = new ArrayList<Employee>();
        
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where dob=?";
            ps = con.prepareStatement(query);
            ps.setDate(1, dob);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employeeList;
    }
    
    public List<Employee> fetchByRangeDoj(Date startDate, Date endDate) {
        List<Employee> employeeList = new ArrayList<Employee>();
        
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee where doj between ? and ?";
            ps = con.prepareStatement(query);
            ps.setDate(1, startDate);
            ps.setDate(2, endDate);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employeeList;
    }
    
    public List<Employee> fetchAll() {
        List<Employee> employeeList = new ArrayList<Employee>();
        
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from employee";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFname(rs.getString("fname"));
                employee.setLname(rs.getString("lname"));
                employee.setAddress(rs.getString("address"));
                employee.setMobileNo(rs.getString("mobile_no"));
                employee.setMailId(rs.getString("email_id"));
                employee.setCity(rs.getString("city"));
                employee.setDesignation(rs.getString("designation"));
                employee.setDob(rs.getDate("dob"));
                employee.setDoj(rs.getDate("doj"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setAddDate(rs.getTimestamp("add_date"));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return employeeList;
    }
}
