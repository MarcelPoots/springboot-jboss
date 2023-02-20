How to run a springboot on a Jboss server?  
-You will need to have a Wildfly server running local  
-Add a user to with the add user command in bin folder  

mvn clean package this project and
the war can be uploaded via http://127.0.0.1:9990/console

in this case I gave the application a context root of 'hello'
and now it can be accessed at
http://127.0.0.1:8080/hello/