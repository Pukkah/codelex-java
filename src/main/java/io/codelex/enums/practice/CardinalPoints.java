package io.codelex.enums.practice;

public enum CardinalPoints {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String direction;

    CardinalPoints(String direction) {
        this.direction = direction;
    }

    public String direction() {
        return direction;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }

}
