@echo off
start java -jar godmars-eureka/target/godmars-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
start java -jar godmars-eureka/target/godmars-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2