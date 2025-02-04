package by.example.inventoryservice.repository;

import by.example.inventoryservice.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
    Optional<Book> findById(UUID bookId);
    Optional<Book> findByTitle(String title);
    Optional<Book> findByTitleAndAuthorName(String title, String authorName);
}
//дав потм бд конекншн глянемй уже все будет работать после этого