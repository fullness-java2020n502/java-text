create table department(
	dept_no numeric(10)
	,dept_name varchar(255)
	,primary key(dept_no)
);

create table employee(
	emp_no numeric(10)
	,emp_name varchar(255)
	,birthday date
	,dept_no numeric(10)
	,primary key(emp_no)
);

create table employee_address(
	address_no numeric(10)
	,address varchar(255)
	,emp_no numeric(10)
	,primary key(address_no)
);

