package io.codelex.notes.day12;

public enum Days {
    MONDAY("Pirmdiena"),
    TUESDAY("Otrdiena"),
    WEDNESDAY("Trešdiena"),
    THURSDAY("Ceturtdiena"),
    FRIDAY("Piektdiena"),
    SATURDAY("Sestdiena"),
    SUNDAY("Svētdiena");

    private final String inLatvian;

    Days(String inLatvian) {
        this.inLatvian = inLatvian;
    }

    public String getInLatvian() {
        return inLatvian;
    }

}
