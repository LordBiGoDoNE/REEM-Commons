package org.rvsoftworks.commons.model.http.request.agent;

import com.fasterxml.jackson.annotation.JsonProperty;

public record HeatbeatRequest(@JsonProperty("agentId") String agentExternalId,
                              String OS,
                              String name,
                              String localIP) {
}