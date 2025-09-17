package org.rvsoftworks.commons.model.dto.agent;

public record CreateAgentDTO(AgentDTO agent,
                             String installCommandWindows,
                             String installCommandLinux) {
}