Enter password: *********
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.41 MySQL Community Server - GPL

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use anp_d0453;
Database changed
mysql> create table BankAccount(account_id int not null Primary Key, account_holder_name varchar(30) not null, account_balance float not null);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into BankAccount(account_id, account_holder_name, account_balance) values (101,"Archana Pagul", 20000),
    ->  (102,"Archana Sargam", 30500),
    ->  (103,"Lavanya Sargam", 45500),
    ->  (104,"Krushnaveni Mhaisal", 15000),
    ->  (105,"Usha Chakral", 25000),
    ->  (106,"Usha Dornal", 10000);
Query OK, 6 rows affected (0.02 sec)
Records: 6  Duplicates: 0  Warnings: 0

mysql> select account_holder_name, account_balance from bankAccount;
+---------------------+-----------------+
| account_holder_name | account_balance |
+---------------------+-----------------+
| Archana Pagul       |           20000 |
| Archana Sargam      |           30500 |
| Lavanya Sargam      |           45500 |
| Krushnaveni Mhaisal |           15000 |
| Usha Chakral        |           25000 |
| Usha Dornal         |           10000 |
+---------------------+-----------------+
6 rows in set (0.00 sec)

mysql> select account_holder_name, account_balance from bankAccount where account_balance>30000;
+---------------------+-----------------+
| account_holder_name | account_balance |
+---------------------+-----------------+
| Archana Sargam      |           30500 |
| Lavanya Sargam      |           45500 |
+---------------------+-----------------+
2 rows in set (0.01 sec)

mysql> update BankAccount set account_balance=38000 where account_id=101;
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from BankAccount;
+------------+---------------------+-----------------+
| account_id | account_holder_name | account_balance |
+------------+---------------------+-----------------+
|        101 | Archana Pagul       |           38000 |
|        102 | Archana Sargam      |           30500 |
|        103 | Lavanya Sargam      |           45500 |
|        104 | Krushnaveni Mhaisal |           15000 |
|        105 | Usha Chakral        |           25000 |
|        106 | Usha Dornal         |           10000 |
+------------+---------------------+-----------------+
6 rows in set (0.00 sec)
