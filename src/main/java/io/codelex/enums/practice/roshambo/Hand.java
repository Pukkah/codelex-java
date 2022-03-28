package io.codelex.enums.practice.roshambo;

import java.util.Random;

public enum Hand {
    ROCK('r', "Rock crushes Scissors"),
    PAPER('p', "Paper wraps Rock"),
    SCISSORS('s', "Scissors cut Paper");

    private final char abbr;
    private final String description;
    private Hand beats;

    static {
        ROCK.beats = SCISSORS;
        PAPER.beats = ROCK;
        SCISSORS.beats = PAPER;
    }

    Hand(char abbr, String description) {
        this.abbr = abbr;
        this.description = description;
    }

    public static Hand getByAbbr(char abbr) {
        for (Hand hand : values()) {
            if (hand.abbr == abbr) {
                return hand;
            }
        }
        return null;
    }

    public static Hand random() {
        Random rand = new Random();
        int randi = rand.nextInt(values().length);
        return values()[randi];
    }

    public char getAbbr() {
        return abbr;
    }

    public String getDescription() {
        return description;
    }

    public Result vs(Hand anotherHand) {
        if (beats == anotherHand) {
            return Result.WINNER;
        }
        if (anotherHand.beats == this) {
            return Result.LOSER;
        }
        return Result.DRAW;
    }

}
