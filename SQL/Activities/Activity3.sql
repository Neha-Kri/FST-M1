REM   Script: Activity3
REM   Activity3 includes dome queries 

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5002, 'Nail Knitte', 'Paris', 13);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(30), 
    salesman_city varchar2(30), 
    commission int 
);

INSERT INTO salesman VALUES(5001, 'Nail Knitte', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT INTO salesman VALUES(5001, 'Nail Knite', 'Paris', 13);

SELECT * FROM salesman;

select  
    "SALESMAN_ID", 
    "SALESMAN_NAME", 
    "SALESMAN_CITY", 
    "COMMISSION" 
from "SALESMAN";

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

