package by.example.inventoryservice.model.event.dto;

import lombok.Builder;
@Builder
public record OrderEventDto(String bookTitle, int quantity) {
    private static final long serialVersionUID = 1L;
}