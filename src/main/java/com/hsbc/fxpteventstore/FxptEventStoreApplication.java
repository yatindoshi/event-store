package com.hsbc.fxpteventstore;

import com.hsbc.fxpteventstore.domain.Message;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class FxptEventStoreApplication {

    @Bean
    public Consumer<KStream<String, Message>> process() {
        return input -> input.map((key, value) -> new KeyValue<>(value.getId(), value))
                .toTable(Materialized.as("event-store"));
    }

    public static void main(String[] args) {
        SpringApplication.run(FxptEventStoreApplication.class, args);
    }

}
