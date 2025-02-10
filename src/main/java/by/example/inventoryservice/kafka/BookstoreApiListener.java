package by.example.inventoryservice.kafka;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BookstoreApiListener {
    private static final Logger log = LoggerFactory.getLogger(BookstoreApiListener.class);

    @KafkaListener(topics = "bookstore", groupId = "booksGroup")
    public void listen(String book) {
        log.info("Received Book: {}", book);
    }
}
