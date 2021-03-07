## User management system project
 This project is intended to manage users in database.
including reading, deleting and adding them. it is based on Spring framework architecture.
 
good luck.

## Run the Application
 To run this application, you need the PostgreSQL service as a database,
a JDK to build a java application , and Configuration file to connect them.

### Step 1 -- Install PostgreSQL
#### Install on Ubuntu
 Ubuntu’s default repositories contain Postgres packages, so you can install these using the apt packaging system.
  
 Since this is your first time using apt in this session, refresh your local package index. Then, install the Postgres
 package along with a -contrib package that adds some additional utilities and functionality:
 
```
sudo apt update
sudo apt install postgresql postgresql-contrib
```
 
To download and install on other operating systems  [click here](https://www.postgresql.org/download/)
 
### Step 2 -- Using PostgreSQL Roles and Databases
To run the server:

`sudo sevice postgresql start`

There are a few ways to utilize this account to access Postgres. One way is to switch over to the postgres account on 
your server by typing:

> $ `sudo -i -u postgres`

To create a user named **_spring_user_** and grants the CREATE , CONNECT , and TEMPORARY privileges on a database to a 
role (users are properly referred to as roles), you can run the following commands:

> $ `createuser --interactive`

You can create the appropriate database with the _**createdb**_ command.

> $ `creatdb user-management-system`

_**user-management-system**_ database will be created.

To connect to _**user-management-system**_ Database use PostgreSQL database command:

> $ ` \c user-management-system`

Then you can access the Postgres prompt by typing:

> $ `psql`

To show databases, run the following commands.

> postgres=# `\l`

## Curl endpoints
 to get all users : 
 
 `curl -X GET http://localhost:8081/users`
 
 to add a user :
 
 `curl -X POST -d 'id'='1' -d 'name'='ali' -d 'emailAddress'='hello@gmail.com' http://localhost:8081/users`
 
 To get a user by id :
 `curl -X GET -G http://localhost:8081/user -d 'id'='1'`
 
 To delete a user by id:
 
 `curl -X DELETE -G http://localhost:8081/users -d 'id'='1'`