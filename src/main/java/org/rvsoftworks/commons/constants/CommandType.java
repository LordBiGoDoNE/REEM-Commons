package org.rvsoftworks.commons.constants;

public enum CommandType {
    RUN_COMMAND("Executar Comando"),
    FILE_UPDATE("Baixar/Modificar"),
    READ_UPDATE("Ler/Editar");

    private String description;

    CommandType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
