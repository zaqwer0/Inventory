package by.example.inventoryservice.service;

import by.example.inventoryservice.model.entity.Book;
import by.example.inventoryservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {
    private final BookRepository bookRepository;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void processBookRequest(String bookTitle) {
        Optional<Book> book = bookRepository.findByTitle(bookTitle)

        if (book.isPresent() && book.get().getQuantity() > 0) {
            log.info("Book '{}' is available. Sending book-available event.", bookTitle);
            kafkaTemplate.send("book-available", bookTitle);

            Book book = bookRe.get();
            book.setQuantity(book.getQuantity() - 1);
            bookRepository.save(book);
        } else {
            log.warn("Book '{}' is not available.", bookTitle);
            kafkaTemplate.send("book-unavailable", bookTitle);
        }
    }
}
