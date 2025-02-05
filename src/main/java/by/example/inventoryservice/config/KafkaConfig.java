//package by.example.inventoryservice.config;
//
//import by.example.inventoryservice.model.event.BookResponceEvent;
//import com.fasterxml.jackson.databind.JsonSerializer;
//import com.fasterxml.jackson.databind.ser.std.StringSerializer;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class KafkaConfig {
//    @Bean
//    public ProducerFactory<String, BookResponceEvent> producerFactory() {
//        Map<String, Object> config = new HashMap<>();
//        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//        return new DefaultKafkaProducerFactory<>(config);
//    }
//
//    @Bean
//    public KafkaTemplate<String, BookResponceEvent> kafkaTemplate() {
//        return new KafkaTemplate<>(producerFactory());
//    }
//
//}
