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
                    mainclass.fetchAllEmployee();
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
        Employee employee1 = new Employee("Ram", "Kumar", "Street no 5 sector 5", "123456789", "te@gmail.com", "Bhilai", "CEO", Date.valueOf("1988-03-22"), Date.valueOf("2015-05-05"), new BigDecimal(150000));
        Employee employee2 = new Employee("Mohan", "Lal", "Near Super market", "234567891", "mohallal@gmail.com", "Indore", "Manager", Date.valueOf("1988-05-20"), Date.valueOf("2015-05-15"), new BigDecimal(130000));
        Employee employee3 = new Employee("Shyam", "Bajpayee", "Shanti Nagar", "345678912", "bajpayee.shyam@gmail.com", "Pune", "Manager", Date.valueOf("1989-06-10"), Date.valueOf("2016-06-22"), new BigDecimal(130000));
        Employee employee4 = new Employee("Rita", "Kapoor", "Near HAL Layout", "456789123", "ritakapoor@gmail.com", "Bangalore", "Analyst", Date.valueOf("1989-06-12"), Date.valueOf("2016-06-06"), new BigDecimal(120000));
        Employee employee5 = new Employee("Nita", "Rai", "Sundar Nagar", "567891234", "nitarai@gmail.com", "Raipur", "Analyst", Date.valueOf("1988-03-22"), Date.valueOf("2015-05-05"), new BigDecimal(120000));
        action.insert(employee1);
        action.insert(employee2);
        action.insert(employee3);
        action.insert(employee4);
        action.insert(employee5);
    }

    public void updateEmployee() {
        Employee employee1 = new Employee(1l, "Rameshwar", "Kumar", "Street no 5 sector 6", "4564563442", "test@gmail.com", "Bhilai", "CEO", Date.valueOf("1988-03-22"), Date.valueOf("2015-05-05"), new BigDecimal(150000));
        action.update(employee1);
    }

    public void deleteEmployee() {
        Employee employee6 = new Employee("Ramesh", "Kumar", "Sadar market", "345234237", "rameshkumar1@gmail.com", "Bhopal", "Manager", Date.valueOf("1989-12-20"), Date.valueOf("2015-05-15"), new BigDecimal(100000));
        action.insert(employee6);
        action.delete(6l);
    }

    public void fetchEmployeeById() {
        action.fetchById(2l);
    }

    public void fetchEmployeeByEmail() {
        action.fetchByEmailId("bajpayee.shyam@gmail.com");
    }

    public void fetchEmployeeByMobileNo() {
        action.fetchByMobileNo("6538659801");
    }

    public void searchEmployeeByName() {
        action.searchByName("Ram");
    }

    public void fetchEmployeeByCity() {
        action.fetchByCity("Pune");
    }

    public void fetchEmployeeBySalaryRange() {
        action.fetchBySalaryRange(new BigDecimal(100000), new BigDecimal(130000));
    }

    public void fetchEmployeeByDob() {
        action.fetchByDob(Date.valueOf("1988-03-22"));
    }

    public void fetchEmployeeByDOjRange() {
        action.fetchByRangeDoj(Date.valueOf("2015-05-05"), Date.valueOf("2016-06-06"));
    }

    public void fetchAllEmployee() {
        action.fetchAll();
    }

}
