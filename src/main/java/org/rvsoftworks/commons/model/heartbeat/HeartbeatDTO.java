package org.rvsoftworks.commons.model.heartbeat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeartbeatDTO {

    @JsonProperty("agentId")
    private String agentExternalId;
    @JsonProperty("OS")
    private String OS;
    @JsonProperty("name")
    private String name;
    @JsonProperty("localIP")
    private String localIP;

    public HeartbeatDTO(String agentExternalId, String OS, String name, String localIP) {
        this.agentExternalId = agentExternalId;
        this.OS = OS;
        this.name = name;
        this.localIP = localIP;
    }

    public HeartbeatDTO() {
    }

    public String agentExternalId() {
        return agentExternalId;
    }

    public void setAgentExternalId(String agentExternalId) {
        this.agentExternalId = agentExternalId;
    }

    public String OS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String localIP() {
        return localIP;
    }

    public void setLocalIP(String localIP) {
        this.localIP = localIP;
    }
}