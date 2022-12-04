FROM openjdk

WORKDIR /tenders-server

ADD target/tenders-server-1.0-SNAPSHOT.jar .

CMD java -jar ./tenders-server-1.0-SNAPSHOT.jar

EXPOSE 8080

