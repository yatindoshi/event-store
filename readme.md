* .\bin\windows\zookeeper-server-start*.bat .\config\zookeeper.properties
* .\bin\windows\kafka-server-start.bat .\config\server.properties
* .\bin\windows\kafka-topics.bat --create --topic test --zookeeper localhost:2181 --partitions 50 --replication-factor 1
* .\bin\windows\kafka-console-producer.bat --topic test --broker-list localhost:9092
* .\bin\windows\kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092
* https://docs.spring.io/spring-cloud-stream-binder-kafka/docs/current/reference/html/spring-cloud-stream-binder-kafka.html#_multiple_input_bindings