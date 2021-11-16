
CREATE TABLE customer
	(customer_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    customer_NAME VARCHAR(255),age INT, sex CHAR,
    contact_NAME VARCHAR(255),
    address VARCHAR(255),
    city VARCHAR(255),
    postal_code VARCHAR(255),
    country VARCHAR(255));

INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Alfreds Futterkiste",23,"F","Maria Anders","Obere Str. 57","Berlin","12209","Germany");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Ana Trujillo Emparedados y helados",81,"F","Ana Trujillo","Avda. de la Constitución 2222","México D.F.","05021","Mexico");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Antonio Moreno Taquería",40,"M","Antonio Moreno","Mataderos 2312","México D.F.","05023","Mexico");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Around the Horn",22,"M","Thomas Hardy","120 Hanover Sq.","London","WA1 1DP","UK");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Berglunds snabbköp",18,"F","Christina Berglund","Berguvsvägen 8","Luleå","S-958 22","Sweden");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Noel Vega Inc.",53,"M","Noel Vega","3088 Pockrus Page Rd1","Stockholm","S-958 22","Sweden");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Kara & Co",47,"F","Kara W Griffin","512 Center Street","Stuttgart","97448","Germany");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Cheney",22,"F","Erica W Cheney","4922 Pick Street","Denver","80216","USA");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Jerry Bee",19,"M","Jerry B Davis","993 Lowndes Hill Park Road","London","91350","UK");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Zal",33,"M","Chris E Aguirre","3563 Black Stallion Road","Berlin","45242","Germany");
INSERT INTO customer (customer_name,age,sex,contact_name,address,city,postal_code,country) VALUES ("Avto-moto OOD",50,"F","Victoria Mihova","Plovdiv","33 Shipchenska","1892","Bulgaria");

commit;
