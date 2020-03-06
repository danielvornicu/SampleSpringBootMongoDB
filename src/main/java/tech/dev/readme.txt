Spring BOOT with Spring MVC and REST(API and test client) and MongoDB database

Using spring-boot-maven-plugin:
mvn package - for create un executable war using spring-boot-maven-plugin


Il faut avoir la version entre le compilateur et le runtime(1.8 par ex)
java -jar target/SampleSpringBootMongoDB-1.0-SNAPSHOT.war - run the .war file

Ex: 5e6227ec915dde0810d395c6 - it's a MongoDB Id for a client

Spring MVC:
http://localhost:8090/client
http://localhost:8090/client/new
http://localhost:8090/client/5e6227ec915dde0810d395c6                - consult
http://localhost:8090/client/5e6227ec915dde0810d395c6/edit
http://localhost:8090/client/5e6227ec915dde0810d395c6/delete

REST Api:
http://localhost:8090/clients                                  HTTP GET - all clients
http://localhost:8090/clients/new                              HTTP GET  - show creation window
http://localhost:8090/clients/new                              HTTP POST - save created client
http://localhost:8090/clients/5e6227ec915dde0810d395c6         HTTP GET - consult single client
http://localhost:8090/clients/5e6227ec915dde0810d395c6/edit    HTTP GET   - show modification window
http://localhost:8090/clients/5e6227ec915dde0810d395c6/edit    HTTP POST  - save modificated client
http://localhost:8090/clients/5e6227ec915dde0810d395c6/delete  HTTP GET  - delete selected client and show the remaining list of clients

A simple client for REST api:
http://localhost:8090/rsclient
http://localhost:8090/rsclient/new
http://localhost:8090/rsclient/5e6227ec915dde0810d395c6  - consult
http://localhost:8090/rsclient/5e6227ec915dde0810d395c6/edit
http://localhost:8090/rsclient/5e6227ec915dde0810d395c6/delete

MongoDB database:
Install mongodb 4.2.3 in d:\java\apps\mongodb\mongodb 4.2.3\ then make a .bat file in \bin directory named: startMongo.bat with this content:
mongod.exe --dbpath="d:\java\apps\mongodb\mongodb 4.2.3\data\db"
Client for MongoDB:
Robo 3T 1.3 (old Robomongo), then make a MongoDB connection at localhist:27017


