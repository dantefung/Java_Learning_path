-- �½���ռ�
create tablespace t_user_space 
    datafile 
    'D:\software\oracle_data\oracle_data_file.dbf' size 1G
    autoextend on next 100M;   

-- �½�һ���û�
create user user_37 identified by 123 
      default tablespace t_user_space
      temporary tablespace temp;
-- �޸��û�����
alter user user_37 identified by 456;
-- ɾ���û�
drop user user_37 cascade;

-- ��ѯuser_37�û�
select * from dba_users
      where username='user_37';
      
-- ���û�user_37�û�Ȩ�ޣ�����Ȩ��
grant connect, resource to user_37; -- ����connect��resource������ɫ����ɫ��Ȩ�޵ļ��ϣ�

grant select on scott.emp to user_37;-- �����û��鿴scottģʽ�µ�emp�������


-- revoke connect,resource from user_37;-- ����connect��resource������ɫ 

-- ɾ����ռ�
-- drop tablespace t_user_space;
-- drop tablespace t_user_space including contents and datafiles; -- ɾ����ռ估�����ļ�

-- ɾ���û�
-- drop user user_37 cascade;
