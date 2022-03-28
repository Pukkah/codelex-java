package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(30, 45),
    INTERMEDIATE(15, 30),
    ADVANCED(10, 15);

    private final int minMarathonInMinutes;
    private final int maxMarathonInMinutes;

    Runner(int minMarathonInMinutes, int maxMarathonInMinutes) {
        this.minMarathonInMinutes = minMarathonInMinutes;
        this.maxMarathonInMinutes = maxMarathonInMinutes;
    }

    public static Runner getFitnessLevel(int minutesToRunMarathon) {
        if (minutesToRunMarathon > INTERMEDIATE.maxMarathonInMinutes) {
            return BEGINNER;
        }
        if (minutesToRunMarathon > ADVANCED.maxMarathonInMinutes) {
            return INTERMEDIATE;
        }
        return ADVANCED;
    }

}
