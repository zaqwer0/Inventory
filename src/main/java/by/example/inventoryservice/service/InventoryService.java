package by.example.inventoryservice.service;

import by.example.inventoryservice.model.entity.Book;
import by.example.inventoryservice.model.event.dto.InventoryResponseDto;
import by.example.inventoryservice.model.event.dto.OrderEventDto;
import by.example.inventoryservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final BookRepository bookRepository;
    private final KafkaTemplate<String, InventoryResponseDto> kafkaTemplate;

    public void checkResponse(OrderEventDto orderEventDto) {
        Optional<Book> repository = bookRepository.findByTitle(orderEventDto.bookTitle());

        InventoryResponseDto responseDto = InventoryResponseDto.builder()
                .bookTitle(orderEventDto.bookTitle())
                .quantity((long) orderEventDto.quantity())
                .available(repository.isPresent() && repository.get().getQuantity() >= orderEventDto.quantity())
                .build();

        kafkaTemplate.send("inventory", responseDto);
    }

}
