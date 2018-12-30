package by.pvt.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 *
 */
public enum ActionType {

    ADD("add"),

    MODIFY("modify"),

    NOCHANGE("noChange"),

    DELETE("delete");

    private String value;

    ActionType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ActionType fromValue(String text) {
        for (ActionType b : ActionType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}

