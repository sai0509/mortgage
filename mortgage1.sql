create database hackathon1;

use hackathon1;

create table login(
	id int auto_increment not null primary key,
    username varchar(20) unique,
    password varchar(20)) ;
    
    insert into login values(1,"sai","kumar");
    
        insert into login values(2,"aditya","kohli");
        
        select * from login;
        drop table loan;
        
create table personaldetails(
	personaldetailsid int(13) primary key not null auto_increment,
	firstname varchar(30),
	lastname  varchar(30),
	dob date,
	address varchar(30),
	city varchar(30),
	state varchar(30),
	pincode varchar(30),
	mobileno varchar(30),
    id int
 );
 
drop table loan;
create table loan(
	loanid int auto_increment not null primary key,
    loanamount int,
    areacode int,
    propertyname varchar(20),
    propertyid int,
    propertysq int,
    creditscore int,
    residence varchar(30),
    status varchar(15) default "pending",
    id int
);

insert into loan values('Gold Loan',40000,'Gold',5,800,'123456',50000);



select * from loan;

select * from personaldetails;

select * from login;