#!/bin/bash



#./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar
./mvnw package && \ 
 docker build --no-cache  -t forcecout_erver . && \
 docker run --name  springboot -t -p 8080:8080 forcecout_erver