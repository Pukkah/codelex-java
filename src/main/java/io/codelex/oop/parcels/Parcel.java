package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean validation = true;
        if (xLength + yLength + zLength > 300) {
            System.out.println("Parcel too large!");
            validation = false;
        }
        if (xLength < 30) {
            System.out.println("xLength too small!");
            validation = false;
        }
        if (yLength < 30) {
            System.out.println("yLength too small!");
            validation = false;
        }
        if (zLength < 30) {
            System.out.println("zLength too small!");
            validation = false;
        }
        if (weight > 30) {
            System.out.println("Parcel too heavy");
            validation = false;
        }
        if (isExpress && weight > 15) {
            System.out.println("Parcel too heavy for express!");
            validation = false;
        }
        return validation;
    }

}
