package io.tjmisko.github.ralph.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String username;
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("username") String username) {
        this.id = id;
        this.username = username;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
