//package by.example.inventoryservice.kafka;
//
//import by.example.inventoryservice.service.InventoryService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class BookRequestListener {
//
//    private final InventoryService inventoryService;
//
//    @KafkaListener(topics = "book-request")
//    public void handleBookRequest (String title) {
//        log.info("Received request for title: {}", title);
//        inventoryService.processBookResponce(title);
//    }
//}
