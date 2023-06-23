
use project;
create database;
SELECT * FROM  receptionist;
-- drop table patientandtheirDoctor;
-- CREATE TABLE patientandtheirDoctor (
--   id INT PRIMARY KEY AUTO_INCREMENT,
--   doctorid INT,
--   patientid INT,
--   DoctorResponse VARCHAR(200),
--   labresult VARCHAR(200),
--   FOREIGN KEY (doctorid) REFERENCES doctor(id),
--   FOREIGN KEY (patientid) REFERENCES patient(id)
-- );
-- describe patientandtheirDoctor;
-- UPDATE patientandtheirDoctor SET labResult = "asdfasfdllasdkfj" WHERE patientid = 7;

-- describe patient;
-- alter table patient add  visitNecessity BOOLEAN;

-- SELECT * FROM patient INNER JOIN patientandtheirDoctor ON patient.id = patientandtheirDoctor.patientid WHERE patientandtheirDoctor.doctorid = 8;


-- SELECT * FROM message  ORDER BY timestamp;
-- SELECT * FROM patient INNER JOIN patientandtheirDoctor ON patient.id = patientandtheirDoctor.patientid WHERE patientandtheirDoctor.doctorid = 3;
-- CREATE TABLE message (
--   id INT AUTO_INCREMENT PRIMARY KEY,
--   patientid INT,
--   message VARCHAR(255),
--   timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--   FOREIGN KEY (patientid) REFERENCES patient(id)
-- );


-- ALTER TABLE patient
-- ADD prescription VARCHAR(100);
-- describe patient;

-- SELECT * FROM patient WHERE name = 1 AND password = 1;

-- 
-- -- describe pateintandtheirDoctor;
-- -- drop table doctor;
-- 
-- select * from doctor;  
--     
-- /* 
--  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
--  * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
--  */
-- /**
--  * Author:  melke
--  * Created: May 24, 2023
--  */
-- use project;
-- 
-- ALTER TABLE doctor
-- DROP COLUMN phone;
-- 
-- -- CREATE TABLE doctor (
-- --   id INT PRIMARY KEY AUTO_INCREMENT,
-- --   name VARCHAR(50),
-- --   phoneNumber varchar(20),
-- --   password varchar(20);
-- --   specialization VARCHAR(50),
-- --   phone VARCHAR(20),
-- --   email VARCHAR(50),
-- --   qualification VARCHAR(100),
-- --   experience INT);
-- describe doctor;
-- 
-- -- describe doctor;
-- -- 

-- DROP TABLE IF EXISTS patient;
-- 
-- CREATE TABLE patient (
--   id INT PRIMARY KEY AUTO_INCREMENT,
--   name VARCHAR(20),
--   phoneNumber VARCHAR(20),
--   password VARCHAR(20),
--   age INT,
--   gender CHAR,
--   habit VARCHAR(200),
--   illness VARCHAR(240),
--   appointmentFee DOUBLE,
--   labFee DOUBLE,
--   result VARCHAR(32),prescription VARCHAR(100);
-- );

-- 

-- describe patient;

-- drop table patientandtheirDoctor;
-- CREATE TABLE patientandtheirDoctor (
--   id INT PRIMARY KEY AUTO_INCREMENT,
--   doctorid INT,
--   patientid INT,
--   DoctorResponse int,
--   labresult varchar(200),
--   FOREIGN KEY (doctorid) REFERENCES doctor(id),
--   FOREIGN KEY (patientid) REFERENCES patient(id)
-- );
-- 
-- -- describe pateintandtheirDoctor;
-- -- drop doctor;
-- -- describe doctor;
-- 
-- 
-- -- drop patient;
-- -- select * from admin;
-- -- insert into admin values(1,"0000","0000","0000");
-- -- describe patient;
-- -- drop table patient;
-- -- create TABLE patient(id  int (primary key) auto  ,name varchar(20),phoneNubmer varchar(20),password varchar(20),age int,gender char, habit varchar(200),illness varchar(240),appointmentFee double);
