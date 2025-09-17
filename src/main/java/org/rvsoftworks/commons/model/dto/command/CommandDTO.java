package org.rvsoftworks.commons.model.dto.command;

import org.rvsoftworks.commons.constants.CommandType;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;

public record CommandDTO(UUID externalId,
                         UUID idAgent,
                         String command) {

    public static String idAgentAsString(CommandDTO pCommandDTO){
        return pCommandDTO.idAgent.toString();
    }
}
