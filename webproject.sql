create table Product(
idProduct varchar(255) primary key,
name nvarchar(255),
priceIN float,
priceOUT float,
quantity int,
type int,
image varchar(255)
)

create table registerNotification(
emailNoti varchar(255) primary key
)

create table DetailOrder(
idOrder varchar(255),
idProduct varchar(255),
quantityOrder int,
price float,
sale float,
money float
foreign key (idProduct) references Product(idProduct),
foreign key (idOrder) references [Order](idOrder),
primary key(idOrder,idProduct)
)

create table [Order](
	idOrder varchar(255) primary key,
	username varchar(255),
	totalMoney float,
	date date,
	foreign key(username) references Account(username)
)

create table Account(
username varchar(255) primary key,
password varchar(255),
email varchar(255),
cash float,
type int
)

