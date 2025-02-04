package by.example.inventoryservice.repository;

import by.example.inventoryservice.model.entity.Book;
import by.example.inventoryservice.model.entity.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BookRepository extends JpaRepository<InventoryItem, UUID> {
    Optional<Book> findByBookId(UUID bookId);
    Optional<Book> findByTitle(String title);
}
