package by.example.inventoryservice.model.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestEvent {
    private UUID bookId;
    private UUID orderId;
}