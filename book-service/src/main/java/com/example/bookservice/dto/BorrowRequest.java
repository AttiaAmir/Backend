package com.example.bookservice.dto;

import lombok.Data;

@Data
public class BorrowRequest {
    private Long userId;
    private Long bookId;
}
