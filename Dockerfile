From java:8
Expose 8080:8080
Add /target/springdocker-demo.jar springdocker-demo.jar
ENTRYPOINT ["java","-jar","springdocker-demo.jar"]