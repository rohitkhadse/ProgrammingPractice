-- Last updated: 8/24/2025, 12:32:18 PM
# Write your MySQL query statement below
select unique_id, name from Employees
Left Join EmployeeUNI on Employees.id = EmployeeUNI.id;

#select unique_id, name from EmployeeUNI
#right Join Employees on Employees.id = EmployeeUNI.id;
