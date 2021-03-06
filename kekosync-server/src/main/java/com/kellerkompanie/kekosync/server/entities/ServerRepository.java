package com.kellerkompanie.kekosync.server.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Schwaggot
 */
@EqualsAndHashCode
@ToString
public class ServerRepository implements Serializable {

    @Getter
    private final String identifier;
    @Getter
    private final String name;
    @Getter
    private final String folder;
    @Getter
    private final String url;
    @Getter
    @Setter
    private UUID uuid;

    public ServerRepository(String identifier, String name, String folder, String url) {
        this.identifier = identifier;
        this.name = name;
        this.folder = folder;
        this.url = url;
    }
}
