# spring-kafka-application

A Spring Boot Restful API that integrates with the Kafka ecosystem. Apache Kafka is an open source distributed event streaming platform used by thousands of companies for high-performance data pipelines.

The application has one topic on which data is transferred from the producer to the consumer. Data that is transferred is string type.

To transfer data to Kafka, you need to send a post request with a json message body to the endpoint. (producer)

In order to receive a message, you need to create a listener with the annotation @KafkaListener, which will accept the string type of the transmitted information. In my case, we output information to the console. (consumer)
