create database mybatis_spring;

create table user(
id int(11) not null auto_increment primary key comment '主键',
username varchar(24) comment '用户名',
password varchar (24) comment '密码'
)ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;