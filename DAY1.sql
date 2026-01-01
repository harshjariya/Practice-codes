create database Pre_place

-- Create the EMP table
CREATE TABLE EMP (
    EID INT PRIMARY KEY,
    EName VARCHAR(50),
    Department VARCHAR(50),
    Salary INT,
    JoiningDate DATE,
    City VARCHAR(50),
    Gender VARCHAR(10)
);

-- Insert data into the EMP table
INSERT INTO EMP (EID, EName, Department, Salary, JoiningDate, City, Gender)
VALUES
(101, 'Rahul', 'Admin', 56000, '1990-01-01', 'Rajkot', 'Male'),
(102, 'Hardik', 'IT', 18000, '1990-09-25', 'Ahmedabad', 'Male'),
(103, 'Bhavin', 'HR', 25000, '1991-05-14', 'Baroda', 'Male'),
(104, 'Bhoomi', 'Admin', 39000, '1991-02-08', 'Rajkot', 'Female'),
(105, 'Rohit', 'IT', 17000, '1990-07-23', 'Jamnagar', 'Male'),
(106, 'Priya', 'IT', 9000, '1990-10-18', 'Ahmedabad', 'Female'),
(107, 'Bhoomi', 'HR', 34000, '1991-12-25', 'Rajkot', 'Female'),
(108, 'Manish', 'IT', 22000, '1990-04-20', 'Baroda', 'Male'),
(109, 'Kavita', 'Admin', 35000, '1992-03-12', 'Ahmedabad', 'Female'),
(110, 'Suresh', 'HR', 28000, '1991-11-05', 'Jamnagar', 'Male'),
(111, 'Pooja', 'IT', 19000, '1991-01-30', 'Rajkot', 'Female'),
(112, 'Amit', 'Admin', 42000, '1990-08-19', 'Baroda', 'Male'),
(113, 'Rekha', 'HR', 31000, '1992-07-02', 'Ahmedabad', 'Female'),
(114, 'Vijay', 'IT', 20000, '1990-06-11', 'Rajkot', 'Male'),
(115, 'Meera', 'Admin', 38000, '1991-10-09', 'Jamnagar', 'Female');

-- Create the SALES_DATA table
CREATE TABLE SALES_DATA (
    Region VARCHAR(50),
    Product VARCHAR(50),
    Sales_Amount INT,
    Year INT
);

-- Insert data into the SALES_DATA table
INSERT INTO SALES_DATA (Region, Product, Sales_Amount, Year)
VALUES
('North America', 'Watch', 1500, 2023),
('Europe', 'Mobile', 1200, 2023),
('Asia', 'Watch', 1800, 2023),
('North America', 'TV', 900, 2024),
('Europe', 'Watch', 2000, 2024),
('Asia', 'Mobile', 1000, 2024),
('North America', 'Mobile', 1600, 2023),
('Europe', 'TV', 1500, 2023),
('Asia', 'TV', 1100, 2024),
('North America', 'Watch', 1700, 2024),
('Asia', 'Watch', 2200, 2024),
('Europe', 'Mobile', 1400, 2024),
('North America', 'TV', 1300, 2023),
('Asia', 'TV', 1000, 2023),
('Europe', 'Watch', 1800, 2023),
('North America', 'Mobile', 1100, 2024),
('Asia', 'Laptop', 3000, 2023),
('Europe', 'Laptop', 3500, 2024),
('North America', 'Laptop', 2800, 2024),
('Asia', 'Mobile', 1300, 2023);

--1
select max(Salary) as Maximum , min(Salary) as Minimum from EMP

--2
select sum(Salary) as Total_Sal , avg(Salary) as Avg_Sal from EMP

--3
select count(*) as Total_Employees from EMP

--4
select max(Salary) as Max_Salary_Rajkot from EMP
where City = 'Rajkot'

--5
select max(Salary) as Max_Salary_IT from EMP
where Department='IT'

--6
select COUNT(EID) Employee_Count from EMP
where JoiningDate >= '1991-2-08'

--7
select avg(Salary) as Avg_Salary_Admin from EMP
where Department = 'Admin'

--8
select sum(Salary) as Total_Salary_HR from EMP
where Department = 'HR'

--9
select COUNT(distinct City) as Unique_Cities
from EMP

--10
select COUNT(distinct Department) as Unique_Departments 
from EMP

--11
select min(Salary) as  Min_Salary_Ahmedabad
from EMP
where City='Ahmedabad'

--12
select City , max(Salary) as Max_Salary from EMP
group by City

--13
select Department , min(Salary) as Min_Salary from EMP
group by Department

--14
select City , COUNT(EID) as Employee_Count from EMP
group by City 
order by COUNT(EID) desc

--15
select Department  , sum(Salary) as Total_Salary from EMP
group by Department 
order by sum(Salary) desc

--16
select avg(Salary) as Average_Salary from EMP
group by Department

--17
select Department , City , COUNT(EID) as Employee_Count 
from EMP
group by Department,City 
order by COUNT(EID) desc

--18
select Gender , sum(Salary) as Total_Salary from EMP
group by Gender

--19
select City , Max(Salary) as Max_Salary , MIN(Salary) as Min_Salary from EMP
where Gender='Female'
group by City

--20
Select Department , City , Gender , avg(Salary) as Average_Salary 
from EMP
group by Department,City,Gender
order by avg(Salary) desc

--21
select count(EID) as Rajkot_Employees from EMP
where City='Rajkot'

--22
select (max(Salary) - min(Salary)) as DIFFERENCE from EMP

--23
select count(EID) as Hired_Before_1991 from EMP
where JoiningDate < '1991-01-01'

--24
select COUNT(EID) as Employee_Count from EMP
where City in('Rajkot' , 'Baroda')

--25
select COUNT(EID) as Employee_Count from EMP
where JoiningDate < '1991-01-01' AND Department = 'IT'

--26
select distinct JoiningDate , sum(Salary) as Total_Salary from EMP
group by JoiningDate

--27
select Department ,City  , max(Salary) as Max_Salary from EMP
where City like 'R%'
group by Department,City

--28
select Region , sum(Sales_Amount) as Total_Sales from SALES_DATA
group by Region

--29
select Product,avg(Sales_Amount) as Average_Sales from SALES_DATA
group by Product

--30
select Year , max(Sales_Amount) as Max_Sales from SALES_DATA
group by Year

--31
select Region , Year , min(Sales_Amount) as Min_Sales from SALES_DATA
group by Region,Year

--32
select Region , count(Product) as Product_Count from SALES_DATA
group by Region   

--33
select Year , Product , sum(Sales_Amount) as Total_Sales from SALES_DATA
group by Year, Product

--34
select Region , sum(Sales_Amount) as Total_Sales from SALES_DATA
group by Region
having sum(Sales_Amount) > 5000

--35
select Product , avg(Sales_Amount) as Average_Sales from SALES_DATA
group by Product
having avg(Sales_Amount) < 10000

--36
select Year , max(Sales_Amount) as Max_Sales from SALES_DATA
group by Year
having max(Sales_Amount) >= 500

--37
select Region , count(distinct Product) as Distinct_Products from SALES_DATA
group by Region
having count(distinct Product) >= 3

--38
select Year , min(Sales_Amount) as Min_Sales from SALES_DATA
group by Year
having min(Sales_Amount) < 1000

--39
select Region, sum(Sales_Amount) as Total_Sales_2023 from SALES_DATA
where Year = '2023'
group by Region
order by sum(Sales_Amount)

--40
select top 1 Region , sum(Sales_Amount) as Total_Mobile_Sales
from SALES_DATA
where Product='Mobile'
group by Region
order by sum(Sales_Amount) 

--41
select top 1 Product , sum(Sales_Amount) as Total_Sales_2023
from SALES_DATA
where year = 2023
group by Product
order by Total_Sales_2023 desc

--42
select Region , sum(Sales_Amount) as TV_Sales_2023
from SALES_DATA
where Product = 'TV' and Year = '2023'
group by Region 
having sum(Sales_Amount) > 1000

--43
select Year , Region , count(Product) as Order_Count
from SALES_DATA
group by Year,Region
order by Year,Region

--44
select Region , max(Sales_Amount) as Max_Sale
from SALES_DATA
group by Region
having max(Sales_Amount) >= 1000
order by Region

--45
Select Year from SALES_DATA
group by Year
having sum(Sales_Amount) < 10000
order by Year desc

--46
select top 3 Region, sum(Sales_Amount) as Total_Sales_2024
from SALES_DATA
where Year = 2024
group by Region 

--47
select top 1 Year , sum(Sales_Amount) as Total_sales
from SALES_DATA
group by Year
order by Total_sales 

--48
select Product , avg(Sales_Amount) as Avg_Sales
from SALES_DATA
group by Product
having avg(Sales_Amount) > 1000 and avg(Sales_Amount) < 2000
order by Product

--49
SELECT Year
FROM SALES_DATA
GROUP BY Year
HAVING COUNT(*) / COUNT(DISTINCT Region) > 1
ORDER BY Year;

--50
select Region , avg(Sales_Amount) as Avg_Sales from SALES_DATA
where Year = 2023
group by Region
having avg(Sales_Amount) > 1500
order by avg(Sales_Amount) desc

--51
select Region , Product , count(Product) as Occurances
from SALES_DATA
group by Region , Product
having count(Product) > 1
order by Product

--52
Select Year , Product , count(Product) as Occurances
from SALES_DATA
group by Year , Product
having count(Product) > 1
order by Year



------
-- Create the DEPT table first, as PERSON depends on it
CREATE TABLE DEPT (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL UNIQUE,
    DepartmentCode VARCHAR(50) NOT NULL UNIQUE,
    Location VARCHAR(50) NOT NULL
);

-- Create the PERSON table with a Foreign Key
CREATE TABLE PERSON (
    PersonID INT PRIMARY KEY,
    PersonName VARCHAR(100) NOT NULL,
    DepartmentID INT,
    Salary DECIMAL(8, 2) NOT NULL,
    JoiningDate DATE NOT NULL,
    City VARCHAR(100) NOT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES DEPT(DepartmentID)
);

-- Insert data into the DEPT table
INSERT INTO DEPT (DepartmentID, DepartmentName, DepartmentCode, Location)
VALUES
(1, 'Admin', 'Adm', 'A-Block'),
(2, 'Computer', 'CE', 'C-Block'),
(3, 'Civil', 'CI', 'G-Block'),
(4, 'Electrical', 'EE', 'E-Block'),
(5, 'Mechanical', 'ME', 'B-Block'),
(6, 'Marketing', 'Mkt', 'F-Block'),
(7, 'Accounts', 'Acc', 'A-Block');

-- Insert data into the PERSON table
INSERT INTO PERSON (PersonID, PersonName, DepartmentID, Salary, JoiningDate, City)
VALUES
(101, 'Rahul Tripathi', 2, 56000.00, '2000-01-01', 'Rajkot'),
(102, 'Hardik Pandya', 3, 18000.00, '2001-09-25', 'Ahmedabad'),
(103, 'Bhavin Kanani', 4, 25000.00, '2000-05-14', 'Baroda'),
(104, 'Bhoomi Vaishnav', 1, 39000.00, '2005-02-08', 'Rajkot'),
(105, 'Rohit Topiya', 2, 17000.00, '2001-07-23', 'Jamnagar'),
(106, 'Priya Menpara', NULL, 9000.00, '2000-10-18', 'Ahmedabad'),
(107, 'Neha Sharma', 2, 34000.00, '2002-12-25', 'Rajkot'),
(108, 'Nayan Goswami', 3, 25000.00, '2001-07-01', 'Rajkot'),
(109, 'Mehul Bhundiya', 4, 13500.00, '2005-01-09', 'Baroda'),
(110, 'Mohit Maru', 5, 14000.00, '2000-05-25', 'Jamnagar'),
(111, 'Alok Nath', 2, 36000.00, '2003-03-15', 'Ahmedabad'),
(112, 'Seema Jain', 3, 28000.00, '2002-06-18', 'Baroda'),
(113, 'Karan Singh', 1, 41000.00, '2004-11-30', 'Rajkot'),
(114, 'Riya Gupta', 5, 16000.00, '2001-02-12', 'Ahmedabad'),
(115, 'Suresh Patel', 7, 32000.00, '2003-08-20', 'Jamnagar'),
(116, 'Meena Kumari', 7, 30000.00, '2004-01-01', 'Rajkot'),
(117, 'Vikram Batra', NULL, 11000.00, '2005-04-05', 'Baroda');


--53
select PERSON.PersonName, DEPT.DepartmentName 
from PERSON CROSS JOIN DEPT

--54
Select PERSON.PersonName,DEPT.DepartmentName
from PERSON join DEPT
on PERSON.DepartmentID = DEPT.DepartmentID

--55
select PERSON.PersonName , DEPT.DepartmentName,DEPT.DepartmentCode
from PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID

--56
SELECT PERSON.PersonName , DEPT.DepartmentCode , DEPT.Location
FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID

--57
SELECT *
FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DEPT.DepartmentName = 'Mechanical'

--58
SELECT PERSON.PersonName , DEPT.DepartmentCode , PERSON.Salary
FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE PERSON.City = 'Ahmedabad'

--59
SELECT PERSON.PersonName FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DEPT.Location = 'C-Block'

--60
SELECT PERSON.PersonName , PERSON.Salary , DEPT.DepartmentName
FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE PERSON.City = 'Jamnagar'

--61
SELECT PERSON.* FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DEPT.DepartmentName = 'Civil' AND PERSON.JoiningDate > '2001-08-01'

--62
SELECT PERSON.PersonName , DEPT.DepartmentName
FROM PERSON JOIN DEPT 
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DATEDIFF(DAY , PERSON.JoiningDate , GETdATE()) > 365

--63
SELECT DEPT.DepartmentName , COUNT(PERSON.PersonID) AS PERSON_COUNT
FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
GROUP BY DEPT.DepartmentName

--64
SELECT DEPT.DepartmentName , MAX(PERSON.Salary) AS MAX_SALARY , MIN(PERSON.Salary) AS MIN_SALARY 
FROM PERSON INNER JOIN DEPT
ON DEPT.DepartmentID = PERSON.DepartmentID
GROUP BY DEPT.DepartmentName

--65
SELECT PERSON.City , SUM(PERSON.Salary) AS SUM_SALARY , AVG(PERSON.Salary) as AVG_SALARY , MAX(PERSON.Salary) AS MAX_SALARY , MIN(PERSON.Salary) AS MIN_SALARY
FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
GROUP BY PERSON.City

--66
SELECT City , AVG(Salary) AS AVG_SALARY
from PERSON
where City = 'Ahmedabad'
group by City

--67
SELECT CONCAT(PERSON.PersonName , 'lives in' , PERSON.City , 'and workd in ' , DEPT.DepartmentName , 'Department') as Strings 
from PERSON inner join DEPT
on PERSON.DepartmentID = DEPT.DepartmentID

--68
SELECT PERSON.City , DEPT.DepartmentName , SUM(PERSON.Salary) AS TOTAL_sALARY , AVG(PERSON.Salary) AS AVG_SALARY , MAX(PERSON.Salary) AS MAX_SALARY
FROM PERSON INNER JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
GROUP BY PERSON.City , DEPT.DepartmentName

--70
SELECT DEPT.DepartmentName , SUM(PERSON.Salary) AS TOTAL_SALARY 
FROM DEPT JOIN PERSON
ON PERSON.DepartmentID = DEPT.DepartmentID
GROUP BY DEPT.DepartmentName
HAVING SUM(PERSON.Salary) > 100000

--69
SELECT PERSON.* FROM PERSON LEFT JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE PERSON.DepartmentID IS NULL


--71
SELECT DEPT.DepartmentName, PERSON.PersonName,PERSON.PersonID FROM DEPT LEFT JOIN PERSON
ON DEPT.DepartmentID = PERSON.DepartmentID
WHERE PERSON.PersonID IS NULL

--72
SELECT DEPT.DepartmentName , COUNT(PERSON.PersonID) AS COUNT_PERSON
FROM DEPT JOIN PERSON
ON DEPT.DepartmentID = PERSON.DepartmentID
GROUP BY DEPT.DepartmentName
HAVING COUNT(PERSON.PersonID) > 2

--73
UPDATE PERSON
SET PERSON.Salary = PERSON.Salary * 0.1 + PERSON.Salary

FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID

SELECT * FROM PERSON

--------

-- Create Author table
CREATE TABLE Author (
    AuthorID INT PRIMARY KEY,
    AuthorName VARCHAR(100) NOT NULL,
    Country VARCHAR(50) NULL
);

-- Create Publisher table
CREATE TABLE Publisher (
    PublisherID INT PRIMARY KEY,
    PublisherName VARCHAR(100) NOT NULL UNIQUE,
    City VARCHAR(50) NOT NULL
);

-- Create Book table with Foreign Keys
CREATE TABLE Book (
    BookID INT PRIMARY KEY,
    Title VARCHAR(200) NOT NULL,
    AuthorID INT NOT NULL,
    PublisherID INT NOT NULL,
    Price DECIMAL(8, 2) NOT NULL,
    PublicationYear INT NOT NULL,
    FOREIGN KEY (AuthorID) REFERENCES Author(AuthorID),
    FOREIGN KEY (PublisherID) REFERENCES Publisher(PublisherID)
);

-- Insert into Author
INSERT INTO Author (AuthorID, AuthorName, Country)
VALUES
(1, 'Chetan Bhagat', 'India'),
(2, 'Arundhati Roy', 'India'),
(3, 'Amish Tripathi', 'India'),
(4, 'Ruskin Bond', 'India'),
(5, 'Jhumpa Lahiri', 'India'),
(6, 'Paulo Coelho', 'Brazil'),
(7, 'Sudha Murty', 'India'),
(8, 'Vikram Seth', 'India'),
(9, 'Kiran Desai', 'India'); -- Author with no books

-- Insert into Publisher
INSERT INTO Publisher (PublisherID, PublisherName, City)
VALUES
(1, 'Rupa Publications', 'New Delhi'),
(2, 'Penguin India', 'Gurugram'),
(3, 'HarperCollins India', 'Noida'),
(4, 'Aleph Book Company', 'New Delhi'),
(5, 'Westland', 'Chennai');

-- Insert into Book
INSERT INTO Book (BookID, Title, AuthorID, PublisherID, Price, PublicationYear)
VALUES
(101, 'Five Point Someone', 1, 1, 250.00, 2004),
(102, 'The God of Small Things', 2, 2, 350.00, 1997),
(103, 'Immortals of Meluha', 3, 3, 300.00, 2010),
(104, 'The Blue Umbrella', 4, 1, 180.00, 1980),
(105, 'The Lowland', 5, 2, 400.00, 2013),
(106, 'Revolution 2020', 1, 1, 275.00, 2011),
(107, 'Sita: Warrior of Mithila', 3, 3, 320.00, 2017),
(108, 'The Room on the Roof', 4, 4, 200.00, 1956),
(109, 'A Suitable Boy', 8, 2, 600.00, 1993),
(110, 'Scion of Ikshvaku', 3, 5, 350.00, 2015),
(111, 'Wise and Otherwise', 7, 2, 210.00, 2002),
(112, '2 States', 1, 1, 260.00, 2009);


--74
SELECT Book.Title , Author.AuthorName from Book join Author
on Book.AuthorID = Author.AuthorID

--75
select Book.Title , Publisher.PublisherName from Book join Publisher
on Book.PublisherID = Publisher.PublisherID 

--76
select Book.Title , Publisher.PublisherName , Author.AuthorName
from Publisher join Book
on Publisher.PublisherID = Book.PublisherID
join Author 
on Author.AuthorID = Book.AuthorID

--77
select Book.Title , Author.AuthorName, Publisher.PublisherName , Book.Price
from Author join Book
on Author.AuthorID = Book.AuthorID
join Publisher
on Publisher.PublisherID = Book.PublisherID
where Book.PublicationYear > 2010

--78
select Author.AuthorName , COUNT(Book.BookID) as Numberofbooks
from Author join book
on Author.AuthorID = Book.AuthorID
group by Author.AuthorName

--79
select Publisher.PublisherName , sum(Book.Price) as TotalPrice
from Publisher join Book
on Publisher.PublisherID = Book.PublisherID
group by Publisher.PublisherName

--80
select Author.AuthorName from Author left join Book
on Author.AuthorID = Book.AuthorID
where Book.BookID is null

--81
select Author.AuthorName , count(Book.BookID) as TotalBooks , AVG(Book.Price) as AvgPrice 
from Book join Author
on Book.AuthorID = Author.AuthorID
group by Author.AuthorName

--82
select Publisher.PublisherName , count(Book.BookID) as totalBooks
from Publisher join Book
on Publisher.PublisherID = Book.PublisherID
group by Publisher.PublisherName
order by count(Book.BookID) desc

--83
select Book.PublicationYear , count(Book.BookID) as NumberOfBooks
from Book 
group by Book.PublicationYear

--84
select Publisher.PublisherName , SUM(Book.Price) as totalPrice
from Publisher join Book
on Publisher.PublisherID = Book.PublisherID
group by Publisher.PublisherName
having SUM(Book.Price) > 500
order by SUM(Book.Price)

--85
--select Author.AuthorName , Book.Title , max(Book.Price) as Expensive
--from Author join Book
--on Author.AuthorID = Book.BookID
--group by Author.AuthorName , Book.Title
 
--with result as (
--	select  Author.AuthorName , max(Book.Price) as Price
--	from Book join Author 
--	on Book.AuthorID = Author.AuthorID
--	group by Author.AuthorName
--	order by Max(Book.Price)
--)

---------- PAPER --- 1

-- Create Department Table
CREATE TABLE Department (
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(50) NOT NULL
);

-- Create Employee Table
CREATE TABLE Employee (
    EmpID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    City VARCHAR(50),
    Mobile VARCHAR(20),
    JoiningDate DATE,
    Salary DECIMAL(10, 2),
    DeptID INT FOREIGN KEY REFERENCES Department(DeptID)
);


-- Insert Sample Departments
INSERT INTO Department (DeptID, DeptName) VALUES
(1, 'Computer'),
(2, 'Civil'),
(3, 'Mechanical'),
(4, 'HR'),
(5, 'Finance');

-- Insert Sample Employees
INSERT INTO Employee (EmpID, Name, Email, City, Mobile, JoiningDate, Salary, DeptID) VALUES
-- Q1: Changa
(101, 'Sandeep', 'sandeep@test.com', 'Mumbai', '1112223334', '2021-05-15', 50000.00, 1),
(102, 'Rajesh Kumar', 'rajesh@test.com', 'Changa', '2223334445', '2022-03-10', 55000.00, 1),

-- Q2: Joined after 01 Jun 2022, Computer or Civil
(103, 'Priya Sharma', 'priya@test.com', 'Pune', '3334445556', '2022-06-05', 60000.00, 1),
(104, 'Amit Singh', 'amit@test.com', 'Delhi', '4445556667', '2022-07-20', 62000.00, 2),

-- Q3: No mobile or email
(105, 'Sneha Patel', 'sneha@test.com', 'Pune', NULL, '2021-08-01', 58000.00, 1),
(106, 'Vikram Rathod', NULL, 'Mumbai', '6667778889', '2022-01-12', 53000.00, 2),

-- Q4/Q5: Top salaries
(107, 'Anjali Mehta', 'anjali@test.com', 'Delhi', '7778889990', '2020-02-18', 90000.00, 1),
(108, 'Manish Jain', 'manish@test.com', 'Changa', '8889990001', '2021-11-05', 85000.00, 2),
(109, 'Kavita Iyer', 'kavita@test.com', 'Pune', '9990001112', '2022-04-30', 88000.00, 1),

-- Q5: Top 3 dept wise
(110, 'Rahul Dave', 'rahul@test.com', 'Mumbai', '1231231234', '2021-09-22', 82000.00, 2),
(111, 'Meera Krishnan', 'meera@test.com', 'Delhi', '2342342345', '2022-08-14', 86000.00, 1),

-- Q9: Dept with > 9 (Computer will have 10)
(112, 'Varun Gill', 'varun@test.com', 'Pune', '3453453456', '2023-01-01', 50000.00, 1),
(113, 'Deepak Shah', 'deepak@test.com', 'Changa', '4564564567', '2023-02-11', 48000.00, 1),
(114, 'Nisha Verma', 'nisha@test.com', 'Mumbai', '5675675678', '2023-03-15', 47000.00, 1),
(115, 'Suresh Reddy', 'suresh@test.com', 'Delhi', '6786786789', '2023-04-20', 46000.00, 1),

-- Q10: Mechanical
(116, 'Rina Desai', 'rina@test.com', 'Pune', '7897897890', '2022-05-10', 60000.00, 3),
(117, 'Gaurav Kumar', 'gaurav@test.com', 'Mumbai', '8908908901', '2022-06-12', 65000.00, 3),

-- Q12: HR > 45k
(118, 'Pooja Singh', 'pooja@test.com', 'Delhi', '9019019012', '2021-07-07', 48000.00, 4),
(119, 'Alok Nath', 'alok@test.com', 'Pune', '0120120123', '2022-09-30', 40000.00, 4),

-- Q13: Same name
(120, 'Amit Singh', 'amit2@test.com', 'Pune', '1122112211', '2023-05-01', 51000.00, 5),
(121, 'Priya Sharma', 'priya2@test.com', 'Mumbai', '2233223322', '2023-06-10', 70000.00, 5);


--1
SELECT EmpID,Name,City from Employee
where City='Changa'

--2
select Employee.Name , Employee.JoiningDate , Department.DeptName
from Employee join Department
on Employee.DeptID = Department.DeptID
where Employee.JoiningDate > '2022-06-01' and Department.DeptName in('Computer','Civil')

--3
select Employee.Name,Employee.Email ,Employee.Mobile, Department.DeptName
from Employee join Department
on Employee.DeptID = Department.DeptID
where Employee.Mobile is null or Employee.Email is null

--4
select top 5 Name , Salary from Employee
group by Salary,Name
order by Salary desc

--5


--6
select City , count(EmpID) from Employee
group by City

--7
select City , max(Salary) as MaxSal , min(Salary) as MinSal , AVG(Salary) as AvgSal
from Employee
group by City

--8


--9
select Department.DeptName , count(Employee.EmpID) as TotalEmp
from Department join Employee
on Department.DeptID = Employee.DeptID
group by Department.DeptName
having count(Employee.EmpID) > 9

--10
update Employee
set Employee.Salary = Employee.Salary * 0.1 + Employee.Salary
from Employee join Department
on Employee.DeptID = Department.DeptID
where Employee.City = 'Mechanical'

select * from Employee

--11


--12
Delete from Employee
where Employee.Salary > 50000

--13




------------

--PAPER --- 3

-- Create Customers Table
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY IDENTITY(1,1),
    Name VARCHAR(50) NOT NULL,
    JoinDate DATE NOT NULL
);

-- Create Products Table
CREATE TABLE Products (
    ProductID INT PRIMARY KEY IDENTITY(1,1),
    ProductName VARCHAR(100) NOT NULL,
    Category VARCHAR(50),
    Price DECIMAL(10,2) NOT NULL,
    StockQuantity INT NOT NULL
);

-- Create Orders Table
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY IDENTITY(1,1),
    CustomerID INT FOREIGN KEY REFERENCES Customers(CustomerID),
    ProductID INT FOREIGN KEY REFERENCES Products(ProductID),
    OrderDate DATE NOT NULL,
    Quantity INT NOT NULL,
    Price DECIMAL(10,2) NOT NULL, -- Price at time of order
    TotalOrderAmount DECIMAL(10,2) NOT NULL,
    OrderStatus VARCHAR(20) CHECK (OrderStatus IN ('Pending', 'Shipped', 'Delivered', 'Cancelled'))
);

-- Insert Sample Customers
INSERT INTO Customers (Name, JoinDate) VALUES
('Arun Kumar', '2023-01-10'),
('Bhavna Gupta', '2023-01-10'), -- Q9: Same JoinDate
('Chetan Shah', '2023-02-15'),
('Divya Iyer', '2023-03-20'),
('Elina Dsouza', '2023-04-05'),
('Farhan Malik', '2023-05-12'),
('Gita Verma', '2024-01-20'),   -- Q3: First order in 2024
('Harish Reddy', '2024-06-01'); -- Q1: No orders

-- Insert Sample Products
INSERT INTO Products (ProductName, Category, Price, StockQuantity) VALUES
('Laptop', 'Electronics', 1200.00, 10), -- 2nd Highest Price
('Smartphone', 'Electronics', 1000.00, 20),
('Wireless Mouse', 'Electronics', 25.00, 50), -- Q2: Ordered by 6 customers
('Coffee Maker', 'Appliances', 80.00, 30),
('Gaming PC', 'Electronics', 1500.00, 5),  -- Highest Price
('Desk Chair', 'Furniture', 150.00, 15),
('Old Model TV', 'Electronics', 300.00, 0),  -- Q6: Out of stock
('Blender', 'Appliances', 45.00, 0); -- Never ordered, out of stock

-- Insert Sample Orders
-- Assume current date is 2025-11-17
INSERT INTO Orders (CustomerID, ProductID, OrderDate, Quantity, Price, TotalOrderAmount, OrderStatus) VALUES
-- Q2: Wireless Mouse (ProductID 3) ordered by 6 customers
(1, 3, '2024-02-10', 1, 25.00, 25.00, 'Delivered'),
(2, 3, '2024-03-15', 2, 25.00, 50.00, 'Delivered'),
(3, 3, '2024-04-01', 1, 25.00, 25.00, 'Delivered'),
(4, 3, '2024-05-10', 1, 25.00, 25.00, 'Shipped'),
(5, 3, '2024-06-15', 1, 25.00, 25.00, 'Pending'),
(6, 3, '2024-07-01', 1, 25.00, 25.00, 'Delivered'),

-- Q3: Gita (Cust 7) first order in 2024
(7, 4, '2024-02-20', 1, 80.00, 80.00, 'Delivered'),
(7, 2, '2024-05-25', 1, 1000.00, 1000.00, 'Shipped'), -- Q7: Multiple categories

-- Q3: Arun (Cust 1) first order in 2024, but also has 2025 order
(1, 1, '2024-01-15', 1, 1200.00, 1200.00, 'Delivered'), -- Q3: First order
(1, 5, '2025-01-20', 1, 1500.00, 1500.00, 'Delivered'), -- Q5: Latest order
(1, 4, '2024-11-30', 1, 80.00, 80.00, 'Delivered'), -- Q7: Multiple categories

-- Q6: Old Model TV (ProductID 7) ordered but stock is 0
(2, 7, '2024-03-18', 1, 300.00, 300.00, 'Delivered'),

-- Q8: No orders in last 6 months (i.e., after 2025-05-17)
(3, 6, '2025-01-10', 1, 150.00, 150.00, 'Delivered'), -- This order is old

-- Q4: Top revenue products (Laptop, Smartphone, Gaming PC)
(4, 2, '2025-02-01', 2, 1000.00, 2000.00, 'Delivered'),
(5, 5, '2025-02-15', 1, 1500.00, 1500.00, 'Shipped'),
(6, 1, '2025-03-01', 1, 1200.00, 1200.00, 'Delivered');



--1
select Customers.CustomerID , Customers.Name , Customers.JoinDate
from Customers 
left join Orders 
on Customers.CustomerID = Orders.CustomerID
where Orders.OrderID is null

--2
select Products.ProductName,COUNT(distinct Orders.CustomerID) as DiffrentCustomerCount
from Products join Orders
on Products.ProductID = Orders.ProductID
group by Products.ProductName
having COUNT(distinct Orders.CustomerID) > 5

--3

select Customers.Name , Min(Orders.OrderDate) as FirstOrder
from Customers join Orders
on Customers.CustomerID = Orders.CustomerID
group by Customers.Name
having Min(Orders.OrderDate) >= '2024-01-01'
AND MIN(Orders.OrderDate) < '2025-01-01'

--4
select top 3 Products.ProductName , sum(Products.Price * Orders.Quantity)
from Products join Orders
on Products.ProductID = Orders.ProductID
group by Products.ProductName 
order by max(Products.Price * Orders.Quantity) desc

--select Products.ProductName , sum(Orders.Price) as amount
--from Products join Orders
--on Products.ProductID = Orders.OrderID
--group by Products.ProductName

--5
select Customers.Name,max(Orders.OrderDate)
from Customers join Orders
on Customers.CustomerID = Orders.CustomerID
group by Customers.Name

--6
select Products.ProductName , Products.StockQuantity
from Products join Orders
on Products.ProductID = Orders.ProductID
where Products.StockQuantity = 0
group by Products.ProductName , Products.StockQuantity

--7
select Customers.Name , count(distinct Products.Category) as PC
from Customers join Orders
on Customers.CustomerID = Orders.CustomerID
join Products 
on Orders.ProductID = Products.ProductID
group by Customers.Name
having count(distinct Products.Category) > 1

--8
select Products.ProductName 
from Products left join Orders
on Products.ProductID = Orders.ProductID
group by Products.ProductName
Having max(Orders.OrderDate) is null 
or max(Orders.OrderDate) < DATEADD(MONTH, -2, GETDATE())

--9
select Customers.JoinDate , Customers.Name 
from Customers
where Customers.JoinDate in(
select JoinDate from Customers
group by JoinDate
having COUNT(*) > 1
)
order by Customers.JoinDate , Customers.Name

--10
select top 1 Products.ProductName , Products.Price
from Products
where Price < (
select max(Price) from Products
)
order by Price desc

---------

---- PAPER - 2

-- Create color Table
CREATE TABLE color (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(50) NOT NULL,
    extra_fee DECIMAL(5,2) DEFAULT 0
);

-- Create customer Table
CREATE TABLE customer (
    id INT PRIMARY KEY IDENTITY(1,1),
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    favorite_color_id INT FOREIGN KEY REFERENCES color(id)
);

-- Create category Table
CREATE TABLE category (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(50) NOT NULL,
    parent_id INT FOREIGN KEY REFERENCES category(id) NULL
);

-- Create clothing Table
CREATE TABLE clothing (
    id INT PRIMARY KEY IDENTITY(1,1),
    name VARCHAR(100) NOT NULL,
    size VARCHAR(5) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    color_id INT FOREIGN KEY REFERENCES color(id),
    category_id INT FOREIGN KEY REFERENCES category(id)
);

-- Create clothing_order Table
CREATE TABLE clothing_order (
    id INT PRIMARY KEY IDENTITY(1,1),
    customer_id INT FOREIGN KEY REFERENCES customer(id),
    clothing_id INT FOREIGN KEY REFERENCES clothing(id),
    items INT NOT NULL,
    order_date DATE NOT NULL
);

-- Insert Sample Colors
INSERT INTO color (name, extra_fee) VALUES
('Red', 5.00),    -- has extra fee
('Green', 0.00),
('Blue', 0.00),
('Black', 5.00),  -- has extra fee
('White', 0.00);

-- Insert Sample Customers
INSERT INTO customer (first_name, last_name, favorite_color_id) VALUES
('Jay', 'Patel', 1),     -- Favorite is Red
('Dhruv', 'Shah', 2),    -- Favorite is Green
('Amit', 'Verma', 1),    -- Favorite is Red
('Priya', 'Mehta', 3),   -- Favorite is Blue
('Ravi', 'Singh', NULL), -- No favorite color
('Meera', 'Das', 5);     -- Customer with no purchases

-- Insert Sample Categories
INSERT INTO category (name, parent_id) VALUES
('Mens', NULL),          -- Main category
('Womens', NULL),        -- Main category
('T-Shirt', 1),          -- Subcategory of Mens
('Joggers', 1),          -- Subcategory of Mens
('Hoodie', 1),           -- Subcategory of Mens
('T-Shirt', 2),          -- Subcategory of Womens
('Joggers', 2);          -- Subcategory of Womens

-- Insert Sample Clothing
INSERT INTO clothing (name, size, price, color_id, category_id) VALUES
('Basic Tee', 'M', 20.00, 5, 3),        -- White, Mens T-Shirt
('V-Neck Tee', 'L', 25.00, 3, 3),        -- Blue, Mens T-Shirt (for Jay's order)
('Performance Jogger', 'L', 45.00, 4, 4), -- Black, Mens Joggers
('Cuffed Jogger', 'M', 40.00, 2, 4),      -- Green, Mens Joggers
('Graphic Hoodie', 'XL', 60.00, 1, 5),    -- Red, Mens Hoodie
('Womens Basic Tee', 'S', 20.00, 5, 6),   -- White, Womens T-Shirt
('Womens Lounge Jogger', 'M', 50.00, 4, 7); -- Black, Womens Joggers

-- Insert Sample Orders
INSERT INTO clothing_order (customer_id, clothing_id, items, order_date) VALUES
-- Jay's order for T-Shirt after 1st April 2024
(1, 2, 2, '2024-05-15'), -- Jay, V-Neck Tee, Qty 2

-- Order for financial year 2024-25
(2, 4, 1, '2024-06-10'), -- Dhruv, Cuffed Jogger, Qty 1

-- Order of favorite color
(1, 5, 1, '2024-07-01'), -- Jay, Graphic Hoodie (Red), Qty 1. Jay's fav color is Red.

-- Customer who wears XL
(4, 5, 1, '2024-08-01'), -- Priya, Graphic Hoodie (XL), Qty 1

-- Multiple orders for customer totals
(1, 3, 1, '2024-09-05'), -- Jay, Performance Jogger, Qty 1
(2, 7, 1, '2023-11-20'), -- Dhruv, Womens Lounge Jogger, Qty 1
(3, 1, 3, '2024-10-10'); -- Amit, Basic Tee, Qty 3


--1
SELECT customer.first_name , customer.last_name,color.name as favorite_color
from customer join color
on customer.favorite_color_id = color.id
where customer.first_name = 'Dhruv' or customer.first_name = 'Jay'
group by customer.first_name , customer.last_name,color.name

--2
select clothing.name,clothing.size from category join clothing
on category.id = clothing.category_id
where category.name = 'Joggers'
group by category.name , clothing.size

--3
select clothing_order.id as order_id,customer.first_name ,clothing.name,clothing_order.items, clothing_order.order_date
from customer join clothing_order
on customer.favorite_color_id = clothing_order.customer_id
join clothing
on clothing.id = clothing_order.clothing_id
join category
on clothing.category_id = category.id
where category.name = 'T-Shirt' and clothing_order.order_date > '2024-04-01' and customer.first_name='Jay'
group by clothing_order.id,customer.first_name ,clothing.name,clothing_order.items, clothing_order.order_date

--4
select customer.first_name , customer.last_name , color.name , color.extra_fee
from customer join color
on customer.favorite_color_id = color.id
where color.extra_fee > 0

--5
select category.name , count(clothing.id) , max(clothing.price) , min(clothing.price) , AVG(clothing.price)
from category join clothing
on category.id = clothing.category_id
group by category.name

--6
select customer.first_name,customer.last_name
from customer left join clothing_order
on customer.id = clothing_order.customer_id
where clothing_order.customer_id is null

--7 : : List the orders of favorite color with all the details
select clothing_order.id , customer.first_name ,clothing_order.items, color.name
from clothing_order join customer
on clothing_order.customer_id = customer.id
join color
on customer.favorite_color_id = color.id
