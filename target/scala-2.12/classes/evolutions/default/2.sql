# --- !Ups



insert into department(id, name) values (1, 'Graphics');
insert into department(id, name) values (2, 'Audio');
insert into department(id, name) values (3, 'Gameplay');
insert into department(id, name) values (4, 'Testing');

insert into project(project_id , project_name) values (1, 'A Kings Tale');
insert into project(project_id, project_name) values (2, 'Maniac');
insert into project(project_id, project_name) values (3, 'Game Of Thrones: The VideoGame');
insert into project(project_id, project_name) values (4, 'The Score'); 


insert into user (type,email,date_of_birth,role,name,password) values ( 'm','graham@codedogs.com','2001-01-01','manager','Graham Carney', 'password');

insert into user (type,email,date_of_birth,role,name,password) values ( 'm','manager@codedogs.com','2001-01-01','manager','Manager Account', 'password');

insert into user (type,email,department_id,date_of_birth,role,name,password,job_title) values ( 'e','shane@codedogs.com',3,'2001-01-01','employee','Shane Byrne', 'password','Level Designer');

insert into user (type,email,department_id,date_of_birth,role,name,password,job_title) values ( 'e','james@codedogs.com',3,'2001-01-02','employee','James Byrne', 'password','AI');

insert into user (type,email,department_id,date_of_birth,role,name,password,job_title) values ( 'e','dennis@codedogs.com',4,'2001-01-02','employee','Dennis Reynolds', 'password','QA Tester');

insert into user (type,email,department_id,date_of_birth,role,name,password,job_title) values ( 'e','mick@codedogs.com',1,'2001-01-02','employee','Michael Hynes', 'password','3D Models');

insert into user (type,email,department_id,date_of_birth,role,name,password,job_title) values ( 'e','joe@codedogs.com',2,'2001-01-02','employee','Joe Rogan', 'password','Sound Design');


insert into project_user(project_project_id , user_email) values (1, 'shane@codedogs.com');
insert into project_user(project_project_id , user_email) values (2, 'shane@codedogs.com');
insert into project_user(project_project_id , user_email) values (4, 'shane@codedogs.com');
insert into project_user(project_project_id , user_email) values (2, 'james@codedogs.com');
insert into project_user(project_project_id , user_email) values (1, 'dennis@codedogs.com');
insert into project_user(project_project_id , user_email) values (4, 'dennis@codedogs.com');
insert into project_user(project_project_id , user_email) values (3, 'mick@codedogs.com');
insert into project_user(project_project_id , user_email) values (3, 'joe@codedogs.com');
insert into project_user(project_project_id , user_email) values (1, 'joe@codedogs.com');


insert into address (street,town,county,employee_email) values ( '14 Willow Drive','Oak Grove','Kildare','shane@codedogs.com');

insert into address (street,town,county,employee_email) values ( '16 Cloonmore Drive','Tallaght','Dublin','james@codedogs.com');

insert into address (street,town,county,employee_email) values ( '1 Cherry Street','Ballinteer','Dublin','dennis@codedogs.com');

insert into address (street,town,county,employee_email) values ( '65 High Street','Village Central','Wexford','mick@codedogs.com');

insert into address (street,town,county,employee_email) values ( '62 Sherman Road','The Oaks','Wicklow','joe@codedogs.com');