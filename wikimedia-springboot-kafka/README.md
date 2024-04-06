## Kafka Projects-Microservices
Apache Kafka is an open-source distributed event streaming platform used by thousands of companies for high-performance data pipelines, 
streaming analytics,data integration, and mission-critical applications.
#### Local Environment Set-Up
- Download kafka `https://kafka.apache.org/quickstart`.
- Start Zookeeper service `bin/zookeeper-server-start.sh config/zookeeper.properties`.
- Start kafka broker service `bin/kafka-server-start.sh config/server.properties`.
- U can also use brew to install kafka on a MAC `brew install kafka`.
- Start Zookeeper `brew services start zookeeper` and kafka service `brew services start kafka`.
#### Producer Configurations
- Define a topic for the producer plus a key and value serializers in the application.properties. 
- Add dependencies for event source from MVN repository `https://mvnrepository.com/artifact/com.launchdarkly/okhttp-eventsource`.
- Add Jackson JSON Maven dependency `https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core`.
- Add Jackson Databind dependency `https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.17.0`
- And this dependency `https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp/4.12.0`.
#### Consumer Configurations
- Create a consumer database to save wikimedia content
- Add Spring Data JPA and MySQL driver to the consumer using spring initializr.
- Configure SQL and Hibernate properties using application.properties.
- `NOTE:` MysqlDataTruncation Error -> add `?sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false` on the database URL.