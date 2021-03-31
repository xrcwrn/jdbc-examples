package ebhor.start;

import com.sun.jndi.url.dns.dnsURLContext;
import ebhor.action.EmployeeAction;
import ebhor.model.Employee;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author Manish Sahu
 */
public class MainClass {

    EmployeeAction action = new EmployeeAction();

    public static void main(String[] args) {
        String DbOperation = "EXIT(0), ADD(1), UPDATE(2), DELETE(3), FETCHBYID(4), FETCHBYEMAIL(5), FETCHBYMOBNO(6), FETCHBYNAME(7),"
                + "FETCHBYCITY(8), FETCHBYSALRANGE(9), FETCHBYDOB(10), FETCHBYDOJRANGE(11), FETCHALL(12)";

        MainClass mainclass = new MainClass();
        int value = 0;
        do {
            System.out.println("valid operations are");

            System.out.println(DbOperation);
            System.out.println("Enter valid operation number 0-12");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();

            switch (value) {
                case 1:
                    mainclass.addEmployee();
                    break;
                case 2:
                    mainclass.updateEmployee();
                    mainclass.fetchAllEmployee();
                    break;
                case 3:
                    mainclass.deleteEmployee();
                    break;
                case 4:
                    mainclass.fetchEmployeeById();
                    break;
                case 5:
                    mainclass.fetchEmployeeByEmail();
                    break;
                case 6:
                    mainclass.fetchEmployeeByMobileNo();
                    break;
                case 7:
                    mainclass.searchEmployeeByName();
                    break;
                case 8:
                    mainclass.fetchEmployeeByCity();
                    break;
                case 9:
                    mainclass.fetchEmployeeBySalaryRange();
                    break;
                case 10:
                    mainclass.fetchEmployeeByDob();
                    break;
                case 11:
                    mainclass.fetchEmployeeByDOjRange();
                    break;
                case 12:
                    mainclass.fetchAllEmployee();
                    break;
                case 0:
                    System.out.println("Exiting code");
                    break;
                default:
                    System.out.println("Not a valid entry");
            }
        } while (value != 0);

    }

    public void addEmployee() {
        Employee employee = new Employee();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter First Name");
        employee.setFname(insert.next());
        System.out.println("Enter Last Name");
        employee.setLname(insert.next());
        System.out.println("Enter Address");
        employee.setAddress(insert.next());
        System.out.println("Enter Mobile Number");
        employee.setMobileNo(insert.next());
        System.out.println("Enter Mail Id");
        employee.setMailId(insert.next());
        System.out.println("Enter City");
        employee.setCity(insert.next());
        System.out.println("Enter Designation");
        employee.setDesignation(insert.next());
        System.out.println("Enter Dob (yyyy-mm-dd)");
        employee.setDob(Date.valueOf(insert.next()));
        System.out.println("Enter Doj  (yyyy-mm-dd)");
        employee.setDoj(Date.valueOf(insert.next()));
        System.out.println("Enter Salary");
        employee.setSalary(insert.nextBigDecimal());
        action.insert(employee);
    }

    public void updateEmployee() {
        Employee employee = new Employee();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        employee.setId(insert.nextLong());
        System.out.println("Enter First Name");
        employee.setFname(insert.next());
        System.out.println("Enter Last Name");
        employee.setLname(insert.next());
        System.out.println("Enter Address");
        employee.setAddress(insert.next());
        System.out.println("Enter Mobile Number");
        employee.setMobileNo(insert.next());
        System.out.println("Enter Mail Id");
        employee.setMailId(insert.next());
        System.out.println("Enter City");
        employee.setCity(insert.next());
        System.out.println("Enter Designation");
        employee.setDesignation(insert.next());
        System.out.println("Enter Dob (yyyy-mm-dd)");
        employee.setDob(Date.valueOf(insert.next()));
        System.out.println("Enter Doj  (yyyy-mm-dd)");
        employee.setDoj(Date.valueOf(insert.next()));
        System.out.println("Enter Salary");
        employee.setSalary(insert.nextBigDecimal());
        action.update(employee);
    }

    public void deleteEmployee() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        long id = insert.nextLong();
        action.delete(id);
    }

    public void fetchEmployeeById() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        long id = insert.nextLong();
        action.fetchById(id);
    }

    public void fetchEmployeeByEmail() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Employee Mail Id");
        String mailId = insert.next();
        action.fetchByEmailId(mailId);
    }

    public void fetchEmployeeByMobileNo() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Employee Mobile Number");
        String mobileNo = insert.next();
        action.fetchByMobileNo(mobileNo);
    }

    public void searchEmployeeByName() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String name = insert.next();
        action.searchByName(name);
    }

    public void fetchEmployeeByCity() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Employee City");
        String city = insert.next();
        action.fetchByCity(city);
    }

    public void fetchEmployeeBySalaryRange() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Salary Start Range");
        BigDecimal salaryRange1 = insert.nextBigDecimal();
        System.out.println("Enter Salary End Range");
        BigDecimal salaryRange2 = insert.nextBigDecimal();

        action.fetchBySalaryRange(salaryRange1, salaryRange2);
    }

    public void fetchEmployeeByDob() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Date of Birth (yyyy-mm-dd)");
        String dob = insert.next();
        action.fetchByDob(Date.valueOf(dob));
    }

    public void fetchEmployeeByDOjRange() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Start Date of Joining (yyyy-mm-dd)");
        String dob1 = insert.next();
        System.out.println("Enter End Date of Joining (yyyy-mm-dd)");
        String dob2 = insert.next();
        action.fetchByRangeDoj(Date.valueOf(dob1), Date.valueOf(dob2));
    }

    public void fetchAllEmployee() {
        action.fetchAll();
    }

}
