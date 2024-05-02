create database Payments_Web_App;


use Payments_Web_App;

create table User_Details(
PhoneNumber   varchar(15),
email       varchar(25),
FirstName   varchar(10),
LastName    varchar(10),
DOB         date,
Password    varchar(10)
);
ALTER TABLE User_Info MODIFY UserID INT NOT NULL AUTO_INCREMENT;
select* from user_Details;
desc User_Info;
Select wallet from user_info;
