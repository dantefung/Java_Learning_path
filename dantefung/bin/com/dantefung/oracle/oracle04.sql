-- ��ѯ �洢���� ������
/*************************17.������************************************/
/**##ʾ����ϰһ������ɾ��������##**/
/*����һ��*/
/*ɾ��ѧ����Ϣʱ��ͬʱ��Ҫɾ��ѧ����Ϣ���ݵ���һ�ű��У�
�Է�ֹ�����ʱ���ݶ�ʧ������Ժ�����ݵĲ��һָ�*/

-- ��.׼������������ѧ���������������
--drop table student;
--drop table stu_del_rec;
CREATE TABLE student 
(    
     stu_no number(4,0) PRIMARY KEY NOT NULL,   --ѧ�ţ��������ǿ�
     stu_name VARCHAR2(30) NOT NULL,--����,�ǿ�      
     stu_id VARCHAR2(18), --���֤�ţ�����18λ����
     stu_age NUMBER(3,0)  --����
);
CREATE TABLE stu_del_rec 
(    
     stu_no number(4,0)  NOT NULL,   --ѧ�ţ��ǿ�
     stu_name VARCHAR2(30) NOT NULL,--����,�ǿ�      
     stu_id VARCHAR2(18), --���֤�ţ�����18λ����
     stu_age NUMBER(3,0),  --����
     stu_operator_date date--��������
);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1001,'�Ŵ�','441521199909092111',19);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1002,'�Ŷ�','441521199909092111',18);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1003,'����','441521199909092113',-4);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1004,'����','441521199909092114',17);
commit;

-- 2.��������������ɾ������ǰ�����ݱ��ݵ���������
create or replace trigger tri_del_bak
before 
        delete on student for each row 
declare

begin
     --:old.������������������ɾ��ǰԭ���ֶ����ݣ�û������Ϊ�գ�
     -- :new.������������������ɾ�ĺ��ֶ���ֵ��������Ӧ��¼�����ڣ�������Ϊ��
	insert into stu_del_rec(stu_no,stu_name,stu_id,stu_age,stu_operator_date)values(:old.stu_no,:old.stu_name,:old.stu_id,:old.stu_age,sysdate);
end;

-- 3. ���Դ�����
delete from student where stu_no=1002;
select * from student;
select * from stu_del_rec;

--  ɾ�������ͬ������Ҳɾ������ 

/**##ʾ����ϰ����ʵ�������Զ�����##**/
/*��������ͨ��������+��������Զ�����*/
-- ��.׼������������ѧ���������������
--drop table student;
--drop table stu_del_rec;
CREATE TABLE student 
(    
     stu_no number(4,0) PRIMARY KEY NOT NULL,   --ѧ�ţ��������ǿ�
     stu_name VARCHAR2(30) NOT NULL,--����,�ǿ�      
     stu_id VARCHAR2(18), --���֤�ţ�����18λ����
     stu_age NUMBER(3,0)  --����
);
-- 2.��������
create sequence seq_auto_pk;
-- 3.����������
create or replace trigger tri_auto_pk
before
	insert on student for each row 
declare
	
begin 
	select  seq_auto_pk.nextval  into  :new.stu_no  from dual;
end;

-- 4.���Դ�����
insert into student(stu_name,stu_id,stu_age) values('��7','4444',90);
insert into student(stu_name,stu_id,stu_age) values('��8','4444',19);
insert into student(stu_name,stu_id,stu_age) values('��9','4444',20);
select * from student;

-- ɾ��������
drop trigger tri_auto_pk;

/**##ʾ����ϰ��������������ɾ��ʱ������##**/
-- ע�⣺���������ﲻ������:old��:new��
/*��������ɾ��ʱ��������*/
/*
 ����ѧ���������������
*/
--drop table student;
--drop table stu_del_rec;
CREATE TABLE student 
(    
     stu_no number(4,0) PRIMARY KEY NOT NULL,   --ѧ�ţ��������ǿ�
     stu_name VARCHAR2(30) NOT NULL,--����,�ǿ�      
     stu_id VARCHAR2(18), --���֤�ţ�����18λ����
     stu_age NUMBER(3,0)  --����
);
CREATE TABLE stu_del_rec 
(    
     stu_no number(4,0)  NOT NULL,   --ѧ�ţ��ǿ�
     stu_name VARCHAR2(30) NOT NULL,--����,�ǿ�      
     stu_id VARCHAR2(18), --���֤�ţ�����18λ����
     stu_age NUMBER(3,0),  --����
     stu_operator_date date default sysdate --��������
);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1001,'�Ŵ�','441521199909092111',19);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1002,'�Ŷ�','441521199909092111',18);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1003,'����','441521199909092113',-4);
insert into student(stu_no,stu_name,stu_id,stu_age) values(1004,'����','441521199909092114',17);
commit;

select * from student;
-- 2.����������
create or replace trigger tri_tb_bak
--  ������������ɾ������ʱ���԰�ɾ�������ݱ��ݵ���������,Ҫʹ��before,������after
before
	delete on student
declare
	
begin 
	insert into stu_del_rec(stu_no,stu_name,stu_id,stu_age) select stu_no,stu_name,stu_id,stu_age from student;
end;

--3. ���Դ�����
delete from student;
select * from student;
select * from stu_del_rec;

-- 4.ɾ��������
drop trigger tri_tb_bak;

/*********************************18.��ͼ****************************************/
/**##18.1 ��ͼ���##**/
-- WHAT?
  /* Ҳ�����, ��ռ������ռ䣬���Ҳ����Ը����Ϊ��ͼ����Ķ������
       ����Ҫ�洢�������ֵ���ġ���ͼֻ���߼����塣ÿ��ʹ�õ�ʱ��ֻ������ִ��SQL.
	  ��ͼ�Ǵ�һ������ʵ�ʱ��л�õģ���Щ������ݴ�������ݿ��С�
       ��Щ���ڲ�����ͼ�ı��������ͼ�Ļ���һ����ͼҲ���Դ���һ����ͼ�в�����
      
     �﷨��
              ������ͼ��     create view ��ͼ�� as ��ѯ���;
              ɾ����ͼ��     drop view ��ͼ��;
 
       ����о��������в�ѯ�����Կ��ǽ�����ͼ��*/
 
 -- WHY?
/*��ͼ����sql    
	1.����ԭ������ֱ�ӷ�����ʵ���� ��ͬ��ʣ�����߰�ȫ��  
	2.һ����û�������ʹ�ã������ӵ�sql���з�װ

����
           +-------------------------------------------+--------------------------------------+
           |    ��ͼ            |          �洢����                |                   �洢����                       |
           +---------------+---------------------------+--------------------------------------+
           |    ��sql         |          ��pl/sql�����      |                    ��pl/sql�����            | 
           +---------------+---------------------------+--------------------------------------+
           |  �����ӵ�sql |            ����ҵ��              |    ͨ�ô��룬�����ŵ�function�|
           |  ���з�װ      |                                     |       ����java�ķ�װ�Ĺ�����           |
           +---------------+---------------------------+--------------------------------------+
                                 
 �洢������洢������             
         �洢������洢��������һ��������������������һ����
          ���в����ĵĹ涨��1.�洢����һ����������ҵ�� 2.�洢����
         һ��������װһЩͨ�õĴ��� 
��ͼ��
       �������в�ѯ���ܣ�Ҳ����ɾ�Ĺ��ܡ���Ϊ��ͼ��������װsql�ġ�                             
*/
--drop table student;
--drop table my_class;
CREATE TABLE student
(    
     stu_no CHAR(4) PRIMARY KEY NOT NULL,   --ѧ�ţ��������ǿ�
     stu_name VARCHAR2(30) NOT NULL,--����,�ǿ�      
     stu_id VARCHAR2(18), --���֤�ţ�����18λ����
     mc_no CHAR(4)  --����
);
CREATE TABLE my_class
(    
     mc_no CHAR(4) PRIMARY KEY NOT NULL,   --��ţ��������ǿ�
     mc_name VARCHAR2(30) NOT NULL--����,�ǿ�      
);
insert into my_class(mc_no,mc_name) values('c001','����һ��');
insert into my_class(mc_no,mc_name) values('c002','���Ƕ���');
insert into student(stu_no,stu_name,mc_no) values('a001','��һ','c001');
insert into student(stu_no,stu_name,mc_no) values('a002','�Ŷ�','c001');
insert into student(stu_no,stu_name,mc_no) values('a003','����','c002');
commit;
--��½system�û������û�user_37�ڴ�����ͼ��Ȩ��
grant create view to user_37;

-- ������ͼ(��װ��sql)
-- /*##��װ��ѯ������ͼ##*/
create view  v_stu_r as select stu_no,stu_name,stu_id from student;

create or replace view view_student
as 
select stu_no,stu_name from student ;

-- ������ͼ
select * from v_stu_r;

-- ͨ����ͼ��ѯ
select * from view_student;

-- ͨ����ͼ�޸�����
update view_student set stu_name='��˼' where stu_no='a001';

-- ͨ����ͼɾ��
delete from view_student where stu_no='a002';

-- ͨ����ͼ��������
insert into view_student values('a004','�ž�');

/*##���ڶ���������ͼ��������ʹ����ͼ������ɾ�Ĳ���##*/
create or replace view view_my_class_student
as 
select mc.mc_name,s.stu_no,s.stu_name 
from student s             -- 
inner join my_class mc  -- 
on s.mc_no=mc.mc_no;  -- ��������
 
 -- ���Ի��ڶ���������ͼ
select * from view_my_class_student;

/*##������ͼ����ͼ##*/
create or replace view view_in_view 
as
select stu_no from view_student;

-- ������ͼ����ͼ
select * from view_in_view;

--ɾ����ͼ
drop view v_stu_r;
drop view view_in_view;
drop view view_my_class_student;
drop view view_student;

/***********************************19.��������*****************************************/
/*##19.1���##*/
/*				oracle������ɾ��֮��������ݺͱ��������أ�
			�κ����ؼ����ͻָ��������ǻ���ϵͳ��ĳһ��ʱ���ģ�
			���oracle�Ļָ������ؼ���Ҳ��һ����

            SCN�� System Change Number  �� ϵͳ��ʱ��ֵһһ��Ӧ,SCN������Ϊ�ָ���ʱ��㡣
*/
-- �鿴��ǰʱ�̵�SCN��?
 select to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'), timestamp_to_scn(sysdate) from dual;

-- ʹ�ù���Աsys,��dba��ɫ�鿴undo��ռ�Ĳ���

/*##19.2 ����ʾ��##*/
/*
����ѧ��������������
*/
--drop table student;
CREATE TABLE student
(    
     stu_no CHAR(4) PRIMARY KEY NOT NULL,   --ѧ�ţ��������ǿ�
     stu_name VARCHAR2(30) NOT NULL,--����,�ǿ�      
     stu_id VARCHAR2(18), --���֤�ţ�����18λ����
     stu_age NUMBER(3,0)  --����
);

insert into student(stu_no,stu_name,stu_id,stu_age) values('a001','�Ŵ�','441521199909092111',19);
insert into student(stu_no,stu_name,stu_id,stu_age) values('a002','�Ŷ�','441521199909092112',19);
insert into student(stu_no,stu_name,stu_id,stu_age) values('a003','����','441521199909092113',18);
insert into student(stu_no,stu_name,stu_id,stu_age) values('a004','����','441521199909092114',18);
commit;
--�鿴����¼��ǰ�ģӣãκ�
select to_char(sysdate,'yyyy-mm-dd hh24:mi:ss'), timestamp_to_scn(sysdate) from dual;--S�����CN��:1499531
--����ɾ������
delete student where stu_no='a003';
commit;
--�鿴���¼��stu_noΪa003�����ѱ�ɾ��
select * from student;

--���ظղ�ɾ�����ݣ���Ҫ���޸ı���п����ƶ��� 
-- ��½sys�û���alter table user_itcast.student enable row movement;
/*
    �û�����sys 
    ���룺root 
    ���ݿ⣺orcl 
               sysdba 
*/
flashback table student to scn 1499531;
--�鿴���ݣ������ѱ��ָ�
 select * from student;
 
 /*********************************20.���ݱ�����ָ�****************************************/
/**##20.1���ݱ���##**/
/*�����У�
����1.��������
    exp user_itcast377/itcast@orcl  file=e:\oracle_bak.dmp full=y 
      2.ָ������
    exp user_37/itcast@orcl  file=e:\oracle_student_bak.dmp tables=(student)
*/
/*##20.2�ָ�##*/
/*
���������ɾ�����ٻָ�
ָ����ָ�
   1. imp user_37/itcast@orcl  ignore=y file=e:\oracle_student_bak.dmp tables=(student)
   2. imp  user_itcast377/itcast@orcl  ignore=y file=e:\oracle_bak.dmp  full=y
    ���������ɾ���û�����ռ�
	drop user user_itcast cascade;
	drop tablespace ts_itcast including contents and datafiles;
*/

-- ϵͳ�û�system  root
-- 2.����һ���Զ������ı�ռ�ts_37,AUTOEXTEND ON����ʱ�����Զ�����
CREATE TABLESPACE ts_37 
DATAFILE 'D:\software\oracle_data\data_37.DBF' 
SIZE 10M AUTOEXTEND ON;
/
-- 3.�����û�user_itcast,�����user���Ը�Ϊָ��Ϊ���潨�ı�ռ�ts_itcast
CREATE USER  user_37
IDENTIFIED BY 123
DEFAULT TABLESPACE ts_37
TEMPORARY TABLESPACE TEMP;
/
--4.����CONNECT��RESOURCE������ɫ
GRANT connect, resource TO user_37;
grant create view to user_37;
grant create synonym to user_37;
grant create public synonym to user_37;
























































