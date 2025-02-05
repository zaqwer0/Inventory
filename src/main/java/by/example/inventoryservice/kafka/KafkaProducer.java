package by.example.inventoryservice.kafka;

@org.springframework.stereotype.Service
@lombok.RequiredArgsConstructor
public class KafkaProducer {

    private final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(KafkaProducer.class);

    private final org.springframework.kafka.core.KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        LOGGER.info(String.format("Sending message: %s", message));
        kafkaTemplate.send("inventory", message);
    }
}