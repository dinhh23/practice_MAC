USE sys;

DROP database if exists prs;

CREATE database prs;

USE prs;

create table user (
	ID int primary key auto_increment,
	UserName varchar(20) not null unique,
	Password varchar(10) not null,
    FirstName varchar(20) not null,
    LastName varchar(20) not null,
    PhoneNumber varchar(12) not null,
    Email varchar(75) not null,
    IsReviewer bit not null default 0,
    IsAdmin bit not null default 0
);

insert user (ID, UserName, Password, FirstName, LastName, PhoneNumber, Email) values 
	(2, 'Hey', 'PWD', 'Joe', 'Smith', 124-5872589,'joe.smith@gmail.com');
    
select * from user;
	
create table vendor ( 
	ID int primary key auto_increment,
    Code varchar(10) not null unique, 
    Name varchar(255) not null, 
    Address varchar(255) not null,
    City varchar(255) not null, 
    State varchar(2) not null, 
    Zip varchar(5) not null, 
    PhoneNumber varchar(12) not null,
    Email varchar(100) not null
);

insert Vendor (ID, Code, Name, address, City, State, Zip, PhoneNumber, Email) values 
	(1, 1, 'ABC Company', '123 Main Street', 'Cincinnati', 'OH', '45251', 1452584758, 'ABC@email.com');
    
select * from Vendor;

create table Product (
	ID int primary key auto_increment,
    VendorID int not null, 
    foreign key (VendorID) 
		references Vendor(ID),
    PartNumber varchar(50),
    Name varchar(150) not null, 
    Price decimal(10,2) not null, 
    Unit varchar(255), 
    PhotoPath varchar(255),
    constraint Vendor_part unique (VendorID, PartNumber)
);

insert Product (ID, VendorID, PartNumber, Name, Price) values 
	(1, 1, 123, 'Computer', 10);
    
select * from Product;
    
create table Request (
	ID int primary key auto_increment,
    UserID int not null,
	foreign key (UserID)
		references User(ID),
	Desciption varchar(100) not null, 
    Justification varchar(255) not null, 
    DateNeeded date not null,
    DeliveryMode varchar(25) not null,
    Status varchar(20) default 'New',
    Total decimal(12,2) not null,
    SubmittedDate datetime not null,
    ReseasonForRejection varchar(100)         
);

insert Request (ID, UserID, Desciption, Justification, DateNeeded, DeliveryMode, Total, SubmittedDate) values 
	(1, 2, 'Request from ABC Company', 'Previous order damaged', '2017-06-15', 'FedEx', 100, '2017-06-15');

select * from request;
    
create table LineItem (
	ID int primary key auto_increment,
    RequestID int not null,
	foreign key (RequestID)
		references Request(ID),
	ProductID int not null, 
	foreign key (ProductID)
		references Product(ID),
	Quantity int default 0
);



insert LineItem (ID, RequestID, ProductID, Quantity) values 
	(1, 1, 1, 10);
    
select * from LineItem;
    
    
    
    
    