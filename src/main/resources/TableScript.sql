drop database if exists customer_db;
create database customer_db;
use  customer_db;


create table customer(
   customer_id int auto_increment,
   email_id varchar(50),
   name varchar(20),
   date_of_birth date,
   constraint ps_customer_id_pk primary key (customer_id)
);