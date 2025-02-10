package by.example.inventoryservice.model.event.dto;

import lombok.Builder;

@Builder
public record InventoryResponseDto(String bookTitle, Long quantity, boolean available) {
}
