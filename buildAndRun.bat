@echo off
call mvn clean package
call docker build -t com.mycompany/Aula4PraticaWeb .
call docker rm -f Aula4PraticaWeb
call docker run -d -p 9080:9080 -p 9443:9443 --name Aula4PraticaWeb com.mycompany/Aula4PraticaWeb