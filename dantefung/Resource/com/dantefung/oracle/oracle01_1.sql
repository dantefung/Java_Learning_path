
/*********************************5.α��************************************/
-- rownum -- ��ҳ
-- ע�⣺rownum���ڣ�����������ʱ������������������2��2���ϵ�������ʱ������������
-- ���Բ�ѯĳҳ�ļ�¼�������2��3����¼���Ͳ���д�ɣ�
select rownum rn ,t.* from  testtime t where rownum<��3and rownum>1;
-- ����д��������䣺
select * from (select rownum rn ,t.* from testtime t where rownum<4) where rn>1;
-- sqlִ��˳��
--1. select t.* from testtime t ͬʱ��ÿ��ѯ��һ����¼��
--2. ����ʱ����rownum��rownum��1��ʼ
--3. �� where rownum<4
--4. ��ʾ��¼
--5. ִ�� where rn>1

-- rownum -- ����
--������
create table testtime(
ttid varchar2(2),
tttime timestamp
);
--�޸�ʱ�䣬����������Լ�¼��
insert into testtime(ttid,tttime) values('1',to_Timestamp('2014-10-11 12:12:25.112233','YYYY-MM-DD HH24:MI:SS.FF'));
insert into testtime(ttid,tttime) values('2',to_Timestamp('2014-10-14 12:12:25.112233','YYYY-MM-DD HH24:MI:SS.FF'));
insert into testtime(ttid,tttime) values('3',to_Timestamp('2014-10-12 12:12:25.112233','YYYY-MM-DD HH24:MI:SS.FF'));
insert into testtime(ttid,tttime) values('4',to_Timestamp('2014-10-13 12:12:25.112233','YYYY-MM-DD HH24:MI:SS.FF'));
commit;

select * from testtime;
-- ��ʱ������rownum��˳�����ҵ�
select rownum,t.* from testtime t order by t.tttime;
-- ԭ��
-- sql��ִ��˳�����̣���
-- ÿ��ѯ��һ����¼�͸�������¼����һ����ʱ��rownum
select rownum,tt.* from ( select t.* from testtime t order by t.tttime) tt;



/******************************6.SQL���Լ��**********************************/

/*####6.1���ݶ�������#####*/

-- ������
create table test(
 id char(4) primary key not null,   -- ѧ�ţ��������ǿ�
 name varchar2(30) not null,        -- �������ǿ�
 idcard varchar2(18),               -- ���֤�ţ�����18λ����
 age number(3,0)                    -- ���䣬3λ��Ч���֣�����С��������0λ
);
-- ��������
insert into test values('1','����','445281199206113518','19');
insert into test values('2','����','445281199206113518','16');
insert into test values('3','����','445281199206113518','30');
insert into test values('4','��Ȩ','445281199206113518','70');
insert into test values('5','����','445281199206113518','18');

-- �������еı�Ĳ�ѯ���������(����Լ��������Ŵ���)
create table test_2 as select t.id,t.name from test t;

select * from test_2;  

-- �޸ı�
-- �����
alter table test_2 add(address varchar2(30),phone varchar2(11));

-- �޸��еĶ���
alter table test_2 modify(id char(10),name varchar2(40));

-- �޸�����
alter table test_2 rename column address to address2;

-- ɾ��
-- ɾ����
alter table test_2 drop(address2);

-- ɾ����
-- ֻɾ�������ݣ�ÿ��ɾ���ļ�¼��д��־��ʡ��Դ��Ч�ʱ�delete��
truncate table test_2;
-- ɾ����ṹ������
drop table test_2;

-- �鿴scottģʽ�µ�emp���ݿ����ǰ����system����Ա�����˷���Ȩ�ޣ�
select * from scott.emp;


-- ȥ�أ�rowid 
-- ��������
create table testdate(
 tid varchar2(10),
 tname date
);
insert into testdate values('1',to_date('2015-10-18 12:12:12','YYYY-MM-DD HH24:MI:SS'));
insert into testdate values('1',to_date('2015-10-18 12:12:12','YYYY-MM-DD HH24:MI:SS'));
insert into testdate values('1',to_date('2015-10-18 12:12:12','YYYY-MM-DD HH24:MI:SS'));
insert into testdate values('2',to_date('2015-10-18 12:12:12','YYYY-MM-DD HH24:MI:SS'));
insert into testdate values('2',to_date('2015-10-18 12:12:12','YYYY-MM-DD HH24:MI:SS'));
insert into testdate values('2',to_date('2015-10-18 12:12:12','YYYY-MM-DD HH24:MI:SS'));
insert into testdate values('3',to_date('2015-10-18 12:12:12','YYYY-MM-DD HH24:MI:SS'));
-- ȥ�أ�ɾ���ظ�����
select rowid,t.* from testdate t;
-- ��һ��
select min(rowid) from testdate t group by t.tid,t.tname;
-- �ڶ���
delete from testdate where rowid not in (select min(rowid) from testdate t group by t.tid,t.tname);

/*####6.2���ݲ�������#####*/
