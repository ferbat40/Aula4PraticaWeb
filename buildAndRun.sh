#!/bin/sh
mvn clean package && docker build -t com.mycompany/Aula4PraticaWeb .
docker rm -f Aula4PraticaWeb || true && docker run -d -p 9080:9080 -p 9443:9443 --name Aula4PraticaWeb com.mycompany/Aula4PraticaWeb