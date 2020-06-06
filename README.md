## springbootSecurityUsingJpaWithH2
- Spring boot with spring security with JPA and H2 Database.

## Steps to test the application
- Start the service as java application which will run on embeded Tomcat with ***port: 8000*** 
- There are two roles inserted into database one with ***ROLE_USER*** and other with ***ROLE_ADMIN***
- The user with ***ROLE_USER can only access the /user*** and with ***ROLE_ADMIN can access both /admin and /user***
- hit the below URL and enter username as ***Stephen*** and password as ***alibaba112***,

    http://localhost:8000/user
    
- hit the below URL and enter username as ***Margreta*** and password as ***aladin110***,

    http://localhost:8000/admin 

