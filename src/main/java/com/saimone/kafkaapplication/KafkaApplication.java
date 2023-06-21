package com.saimone.kafkaapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                kafkaTemplate.send("saimone", "Kafka " + i);
            }
        };
    }
}

// CMD commands to manage KAFKA
//  cd /D D:/kafka
//  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
//  .\bin\windows\kafka-server-start.bat .\config\server.properties
//  .\bin\windows\kafka-console-consumer.bat --topic saimone --from-beginning --bootstrap-server localhost:9092