package fete.bird.entity;

import io.micronaut.serde.annotation.Serdeable;

import java.util.UUID;
@Serdeable
public record Order(UUID id,
                    String name,
                    String description,
                    String productId) {
}
