# spring-async
## Build
1. <code>mvn clean install</code> will generate <code>.jar</code> file.
2. Run generated jar as java program (</code>java -jar generated.jar</code>) to run spring-async.
## Sonar Cloud
1. Run <code>mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package sonar:sonar -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=prateepgedupudi-github -Dsonar.login=2e27c87505bf61cc22e0aefa1497cdbc946160fb</code> for Sonar Cube analysis on code quality and coverage.
#### Note: Try with new security token if login token is not working(You may get unauthorized). 
2. Check results dashboard @ https://sonarcloud.io/dashboard?id=info.prateep%3Aspring-async 
##Run (Locally)
#### Note: Maven plugin for spring is already included in the POM.xml. 
<code>mvn clean org.springframework.boot:spring-boot-maven-plugin:1.5.8.RELEASE:run </code>

