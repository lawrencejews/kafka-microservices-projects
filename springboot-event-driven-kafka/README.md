### Springboot-Event-Driven-Kafka
Software design pattern in which decoupled applications can asynchronously publish and subscribe to events
via an event broker | message broker.
#### Base-Domains
- EventOrders are created within this microservice using a data transfer object which can be converted to the Java Object.
#### Order-Service
- The Producer aka `order-service` is configured to utilize the base-domain through the pom file.
```
<dependency>
	<groupId>com.lawrencejews</groupId>
	<artifactId>base-domains</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```
#### Email-Service

#### Stock-Service