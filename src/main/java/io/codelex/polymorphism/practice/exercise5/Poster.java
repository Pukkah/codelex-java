package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int widthCm;
    private int heightCm;
    private int pricePerCopy;
    private int copies;

    public Poster(int fee, int widthCm, int heightCm, int pricePerCopy, int copies) {
        super(fee);
        this.widthCm = widthCm;
        this.heightCm = heightCm;
        this.pricePerCopy = pricePerCopy;
        this.copies = copies;
    }

    @Override
    public int cost() {
        return super.cost() + pricePerCopy * copies;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Poster: WidthCm=" + widthCm
                + " HeightCM=" + heightCm
                + " Copies=" + copies
                + " PricePerCopy=" + pricePerCopy;
    }

}
