# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  street                        varchar(255),
  town                          varchar(255),
  county                        varchar(255),
  employee_email                varchar(255),
  constraint uq_address_employee_email unique (employee_email)
);

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);

create table project (
  project_id                    bigint auto_increment not null,
  project_name                  varchar(255),
  constraint pk_project primary key (project_id)
);

create table project_user (
  project_project_id            bigint not null,
  user_email                    varchar(255) not null,
  constraint pk_project_user primary key (project_project_id,user_email)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  date_of_birth                 date,
  name                          varchar(255),
  password                      varchar(255),
  role                          varchar(255),
  job_title                     varchar(255),
  department_id                 bigint,
  constraint pk_user primary key (email)
);

alter table address add constraint fk_address_employee_email foreign key (employee_email) references user (email) on delete restrict on update restrict;

alter table project_user add constraint fk_project_user_project foreign key (project_project_id) references project (project_id) on delete restrict on update restrict;
create index ix_project_user_project on project_user (project_project_id);

alter table project_user add constraint fk_project_user_user foreign key (user_email) references user (email) on delete restrict on update restrict;
create index ix_project_user_user on project_user (user_email);

alter table user add constraint fk_user_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_user_department_id on user (department_id);


# --- !Downs

alter table address drop constraint if exists fk_address_employee_email;

alter table project_user drop constraint if exists fk_project_user_project;
drop index if exists ix_project_user_project;

alter table project_user drop constraint if exists fk_project_user_user;
drop index if exists ix_project_user_user;

alter table user drop constraint if exists fk_user_department_id;
drop index if exists ix_user_department_id;

drop table if exists address;

drop table if exists department;

drop table if exists project;

drop table if exists project_user;

drop table if exists user;

