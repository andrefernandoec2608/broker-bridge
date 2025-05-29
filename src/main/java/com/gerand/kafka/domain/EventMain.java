package com.gerand.kafka.domain;

public record EventMain(
        Integer eventId,
        EventType eventType,
        MessageMain message
) {
}
