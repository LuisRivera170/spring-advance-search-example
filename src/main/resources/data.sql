-- DEPARMENTS
INSERT INTO departments(DEPT_ID,DEPT_NAME) VALUES (1001,'FINANCE');
INSERT INTO departments(DEPT_ID,DEPT_NAME) VALUES (2001,'AUDIT');
INSERT INTO departments(DEPT_ID,DEPT_NAME) VALUES (3001,'MARKETING');
INSERT INTO departments(DEPT_ID,DEPT_NAME) VALUES (4001,'PRODUCTION');

-- EMPLOYEES

INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (68319,'Kayling','Blake','PresEMP_IDent',NULL,'1991-11-18',6000,0,1001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (66928,'Blaze','Jason','Manager',68319,'1991-05-01',2750,0,3001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (67832,'Dane','Claire','Manager',68319,'1991-06-09',2550,0,1001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (65646,'Cortez','Jonas','MANAGER',68319,'1991-04-02',2957,0,2001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (67858,'Johannsen','Scarlet','Analyst',65646,'1997-04-19',3100,0,2001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (69062,'Cortez','Frank','Analyst',65646,'1991-12-03',3100,0,2001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (63679,'Tom','Sandrine','Clerk',69062,'1990-12-18',900,0,2001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (64989,'James','Adelyn','Salesman',66928,'1991-02-20',1700,400,3001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (65271,'Wade','Bryan','Salesman',66928,'1991-02-22',1350,600,3001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (66564,'Stella','Madden','Salesman',66928,'1991-09-28',1350,1500,3001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (68454,'Lian','Tucker','Salesman',66928,'1991-09-08',1600,0,3001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (68736,'Cruz','Andres','Clerk',67858,'1997-05-23',1200,0,2001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (69000,'Dean','Julius','Clerk',66928,'1991-12-03',1050,0,3001);
INSERT INTO employees(EMP_ID,EMP_LASTNM,EMP_FIRSTNM,JOB_NM,MGR_ID,HIREDT,SALARY,COMMISSION,DEPT_ID) VALUES (69324,'Line','Mark','Clerk',67832,'1992-01-23',1400,0,1001);