# jdbc-examples
basic mysql jdbc operation examples

          
<table class="table">
<tr>
<th>Sr No</th>
   <th>Operation and code</th>
   <th>Action</th>
</tr>
<tr>
     <td>1</td>
     <td>ADD (1)</td>
     <td>Add Employee records in database should be initialize only once. First time after creating database</td>
     
</tr>
<tr>
     <td>2</td>
     <td>UPDATE (2)</td>
     <td>Update a record in table, based on primary key id</td>
     
</tr>
<tr>
     <td>3</td>
     <td>DELETE (3)</td>
     <td>Insert a new record to table and delete it from database</td>
     
</tr>
<tr>
     <td>4</td>
     <td>FETCH BY ID (4)</td>
     <td>Fetch a record from table based on id</td>
     
</tr>
<tr>
     <td>5</td>
     <td>FETCH BY EMAIL (5)</td>
     <td>Fetch a record from table based on email</td>
     
</tr>
<tr>
     <td>6</td>
     <td>FETCH BY MOBILE NO (6)</td>
     <td>Fetch a record from table based on mobile number</td>
     
</tr>
<tr>
     <td>7</td>
     <td>SEARCH BY NAME (7)</td>
     <td>Fetch records from table based on Name</td>
     
</tr>
<tr>
     <td>8</td>
     <td>FETCH BY CITY (8)</td>
     <td>Fetch records from table based on city name</td>
     
</tr>
<tr>
     <td>9</td>
     <td>FETCH BY SALARY RANGE (9)</td>
     <td>Fetch records from table based on Salary Range</td>
     
</tr>
<tr>
     <td>10</td>
     <td>FETCH BY DOB (10)</td>
     <td>Fetch records from table based on date of birth</td>
     
</tr>
<tr>
     <td>11</td>
     <td>FETCH BY DOJ RANGE (11)</td>
     <td>Fetch records from table based on Date of Joining Range</td>
     
</tr>
<tr>
     <td>12</td>
     <td>FETCH ALL (12)</td>
     <td>Fetch all records from table </td>
     
</tr>
<tr>
     <td>13</td>
     <td>EXIT (0)</td>
     <td>EXIT FROM ALL OPERATION</td>
     
</tr>
</table>


 <h2>How to run</h2> 

1 create database
 copy script database setup.txt in database it will create ebhor database and user to access database

2 Copy Files to your project 
  If your are using netbeans then open project JDBCOperations.
  You can also copy package ebhor to your project 
  
3. Run project
    package ebhor.start contains MainClass.java run it as a java project it will insert 5 employee details in database
    
    To update database comment insert operation and uncomment 2. update employee
     similar for others
     
     JDBC Method contains
     Insert,
     Update, 
     Delete,
     FetchById,
     FetchByEmailId,
     FetchByMobileNo,
     SearchByName,
     FetchByCity,
     FetchBySalaryRange,
     FetchByDob,
     FetchByDojRange,
     FetchAll
     
     find this tutorail on link https://www.ebhor.com/mysql-jdbc/
     Keep learning  http://www.ebhor.com
     
