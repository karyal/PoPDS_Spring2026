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
