package by.example.inventoryservice.service;

import by.example.inventoryservice.model.dto.OrderEventDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final KafkaTemplate<String, OrderEventDto> kafkaTemplate;

    public boolean isBookAvailable(UUID bookId, long quantity) {

        return true;
    }

    public void reserveBooks(UUID bookId, long quantity) {

    }

    public void sendOrderStatusToBookstore(UUID orderId, String status) {

        kafkaTemplate.send("bookstore-status", status);
    }
}
