package by.example.inventoryservice.kafka;


import by.example.inventoryservice.model.event.dto.OrderEventDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "topic-2", groupId = "booksGroup")
    public void consume(OrderEventDto orderEventDto) {
        logger.info("Received order event: {}", orderEventDto);
    }
}
