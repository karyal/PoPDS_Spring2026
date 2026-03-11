Personal Information
pid* int
fullName varchar(50)
address varchar(50)
email varchar(50)
phone varchar(50)
gender varcahr(50)
dateOfBirth varcahr(50)
qualification varcahr(50)


Create figma UI design.

use GroupE;
create table tbl_persons(
	pid int not null,
	full_name varchar(50) not null,
	address varchar(50) not null,
	email varchar(50) not null,
	phone varchar(50) not null,
	gender varchar(50) not null,
	dateof_birth varchar(50) not null,
	qualification varchar(50)
);

alter table tbl_persons
	add constraint pk_pid
		primary key(pid);


describe tbl_persons;