/*
 * main method to call action
 */
package ebhor.start;

import ebhor.action.EmployeeAction;
import ebhor.model.Employee;
import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Manish Sahu
 */
public class MainClass {

    public static void main(String[] args) {
        EmployeeAction action = new EmployeeAction();
        /*----------- 1 Create Employee-----------*/
        Employee employee1 = new Employee("Ram", "Kumar", "Street no 5 sector 5", "456456122", "te@gmail.com", "Bhilai", "CEO", Date.valueOf("1988-03-22"), Date.valueOf("2015-05-05"), new BigDecimal(150000));
        Employee employee2 = new Employee("Mohan", "Lal", "Near Super market", "2342424343", "mohallal@gmail.com", "Indore", "Manager", Date.valueOf("1988-05-20"), Date.valueOf("2015-05-15"), new BigDecimal(130000));
        Employee employee3 = new Employee("Shyam", "Bajpayee", "Shanti Nagar", "3452342423", "bajpayee.shyam@gmail.com", "Pune", "Manager", Date.valueOf("1989-06-10"), Date.valueOf("2016-06-22"), new BigDecimal(130000));
        Employee employee4 = new Employee("Rita", "Kapoor", "Near HAL Layout", "6538659801", "ritakapoor@gmail.com", "Bangalore", "Analyst", Date.valueOf("1989-06-12"), Date.valueOf("2016-06-06"), new BigDecimal(120000));
        Employee employee5 = new Employee("Nita", "Rai", "Sundar Nagar", "8345354325", "nitarai@gmail.com", "Raipur", "Analyst", Date.valueOf("1988-03-22"), Date.valueOf("2015-05-05"), new BigDecimal(120000));
        action.insert(employee1);
        action.insert(employee2);
        action.insert(employee3);
        action.insert(employee4);
        action.insert(employee5);

        /*----------- 2 Update Employee-----------*/
 /* Employee employee1 = new Employee(1l, "Ram", "Kumar", "Street no 5 sector 5", "4564563442", "test@gmail.com", "Bhilai","CEO", Date.valueOf("1988-03-22"), Date.valueOf("2015-05-05"), new BigDecimal(150000));
        action.update(employee1);*/
 /*----------- 3 Delete Employee-----------*/
 /*Employee employee6 = new Employee("Ramesh", "Kumar", "Sadar market", "345234234", "rameshkumar1@gmail.com", "Bhopal", "Manager", Date.valueOf("1989-12-20"), Date.valueOf("2015-05-15"), new BigDecimal(100000));
 action.insert(employee6);*/
 /*action.delete(6l);*/
 /*----------- 4 Fetch By Employee Id -----------*/
 /*action.fetchById(2l);*/

 /*----------- 5 Fetch By Employee Email Id -----------*/
 /*action.fetchByEmailId("bajpayee.shyam@gmail.com");*/

 /*----------- 6 Fetch By Employee Mobile No -----------*/
 /*action.fetchByMobileNo("6538659801");*/

 /*----------- 7 Search By Employee Name -----------*/
 /*action.searchByName("Ram");*/

 /*----------- 8 Fetch By Employee City -----------*/
 /*action.fetchByCity("Pune");*/

 /*----------- 9 Fetch By Employee Salary Range -----------*/
 /*action.fetchBySalaryRange(new BigDecimal(100000), new BigDecimal(130000));*/

 /*----------- 10 Fetch By Employee Dob -----------*/
 /*  action.fetchByDob(Date.valueOf("1988-03-22"));*/

 /*----------- 9 Fetch By Employee Range Doj -----------*/
 /*action.fetchByRangeDoj(Date.valueOf("2015-05-05"), Date.valueOf("2016-06-06"));*/

 /*----------- 10FetchAll Employee-----------*/
        action.fetchAll();
    }
}
