-- CREATE USER 'admin'@'localhost' IDENTIFIED BY 'pcps@123';
-- GRANT ALL PRIVILEGES ON *.* TO 'admin'@'localhost';

create database GroupE;
use GroupE;

create table tbl_users(
	uid int not null,
    user_name varchar(50) not null,
    user_password varchar(50) not null
);

alter table tbl_users
	add constraint pk_uid
		primary key(uid);

alter table tbl_users
	add constraint uk_user_name
		unique key (user_name);

describe tbl_users;

-- Insert record
insert into tbl_users values(1, 'admin','admin');
insert into tbl_users values(2, 'root','root');
insert into tbl_users values(3, 'user1', 'user1');

-- Select records
select * from tbl_users;

-- delete record
delete from tbl_users where uid=3;

-- update record
update tbl_users 
	set user_name='user2', user_password='user2' 
		where uid=3;
        
-- delete record
delete from tbl_users where uid=3;


-- Student
-- tbl_students sid*, full_name, pop, cn, db, total, average, result
use GroupE;
create table tbl_student(
	sid int not null,
    full_name varchar(50) not null, 
    pop decimal(5, 2) not null, 
    cn decimal(5, 2) not null, 
    db decimal(5, 2) not null, 
    total decimal(5, 2), 
    average decimal(5,2), 
    result varchar(50)
);

alter table tbl_student
	add constraint pk_sid
		primary key (sid);

desc tbl_student;
select * from tbl_student;
select * from tbl_student where sid=1;

-- insert
insert into tbl_student values(1, 'Dipesh Oli',67, 89, 97,0 ,0, 'NA');

-- Update
update tbl_student 
	set full_name='new name', 
		pop=1.1, 
        cn=1.1, 
        db=1.1, 
        total=1.1, 
        average=1.1, 
        result='new result' 
	where sid=1;

-- Stored Procedure
DELIMITER //
CREATE PROCEDURE InsertStudent(IN sid int, IN full_name varchar(50), IN pop double(5,2), IN cn double(5,2), IN db double(5,2), IN total double(5,2), IN average double(5,2), IN result varchar(50))
BEGIN
    INSERT INTO tbl_student VALUES(sid, full_name, pop, cn, db, total, average, result);
END //
DELIMITER ;

call InsertStudent(6, 'Karisma', 78, 78, 78, 0.0, 0.0, 'NA');
call SearchStudent(2);

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






