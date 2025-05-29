package com.gerand.kafka.domain;

public record MessageMain(
        Integer messageId,
        String messageCode,
        String messageDescription
) {
}
