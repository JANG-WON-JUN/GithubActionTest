FROM openjdk:17-alpine

COPY ./build/libs/GithubActionTest-0.0.1-SNAPSHOT.jar /usr/src/myapp/
CMD java -jar /usr/src/myapp/GithubActionTest-0.0.1-SNAPSHOT.jar
