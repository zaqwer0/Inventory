//package by.example.inventoryservice.service;
//
//
//
//import by.example.inventoryservice.model.entity.Book;
//import by.example.inventoryservice.repository.BookRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class InventoryService {
//
//    private final BookRepository bookRepository;
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public void handleBookRequest(String title, String authorName) {
//        Optional<Book> bookOpt = bookRepository.findByTitleAndAuthorName(title, authorName);
//
//        if (bookOpt.isPresent()) {
//            Book book = bookOpt.get();
//            if (book.getQuantity() > 0) {
//                book.decrementQuantity();
//                bookRepository.save(book);
//                kafkaTemplate.send("book-supply", String.format("%s by %s", title, authorName));
//            } else {
//
//                kafkaTemplate.send("book-pending", String.format("%s by %s", title, authorName));
//            }
//        } else {
//            kafkaTemplate.send("book-not-found", String.format("%s by %s", title, authorName));
//        }
//    }
//
//    public void addBook(String title, String authorName, int quantity) {
//        Book book = Book.builder()
//                .title(title)
//                .authorName(authorName)
//                .quantity(quantity)
//                .build();
//        bookRepository.save(book);
//    }
//}
