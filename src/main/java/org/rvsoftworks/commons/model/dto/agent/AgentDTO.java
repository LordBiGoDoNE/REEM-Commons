package org.rvsoftworks.commons.model.dto.agent;

import java.util.UUID;

public record AgentDTO(String description,
                       UUID externalId,
                       String secret) {
}