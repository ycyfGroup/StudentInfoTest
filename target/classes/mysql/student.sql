--创建数据库 studentinfo
create database studentInfo;

--创建表student
create table student(
	id int primary key auto_increment,
	sname varchar(20)
)

--删除表student
drop table student

--插入sql语句
insert into student (sname) values('陈杰'),('张三'),('李四'),('王五'),('赵六'),('钱七')

--查询person
select * from student;

--更新数据
update student set sname = '张龙' where id = 6

--分页查询数据
select * from student limit 0,2


--删除用户数据
delete  from student where id = 7;