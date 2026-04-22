package com.victorgabdev.api_genciamento_clima_cidade.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ErrorResponse {

    private List<String> message;
    private int status;
    private LocalDateTime timestamp;

    public ErrorResponse() {}

    public ErrorResponse(List<String> message, int status, LocalDateTime timestamp) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
