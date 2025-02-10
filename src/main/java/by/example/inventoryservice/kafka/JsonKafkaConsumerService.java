package by.example.inventoryservice.kafka;


import by.example.inventoryservice.model.event.dto.OrderEventDto;
import by.example.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonKafkaConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(JsonKafkaConsumerService.class);
    private final InventoryService inventoryService;

    @KafkaListener(topics = "topic-2", groupId = "booksGroup")
    public void consume(OrderEventDto orderEventDto) {
        logger.info("Received order event: {}", orderEventDto);
        inventoryService.checkResponse(orderEventDto);
    }
}
