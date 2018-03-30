CREATE OR REPLACE TABLE tutorials_tbl ( 
   id INT NOT NULL, 
   title VARCHAR(50) NOT NULL, 
   author VARCHAR(20) NOT NULL, 
   submission_date DATE, 
);

CREATE OR REPLACE TABLE EMPLOYEE
      (
      EMPNO       CHAR(6)         NOT NULL,
      FIRSTNME    VARCHAR(12)     NOT NULL,
      MIDINIT     CHAR(1)         NULL,
      LASTNAME    VARCHAR(15)     NOT NULL,
      PHONENO     CHAR(4)                 ,
      SALARY      DECIMAL(9,2)            ,
      BONUS       DECIMAL(9,2)            ,
      COMM        DECIMAL(9,2),         
      PRIMARY KEY (EMPNO)
  );
  
  create OR REPLACE table student
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);