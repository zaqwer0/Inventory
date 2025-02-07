package by.example.inventoryservice.model.dto;

import lombok.Builder;

import java.io.Serializable;


@Builder
public record OrderEventDto(String bookTitle, int quantity) implements Serializable {
    private static final long serialVersionUID = 1L;
}