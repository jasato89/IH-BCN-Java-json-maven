package classes;

import java.math.BigDecimal;

public class Apartment extends House{

    private int floor;
    private boolean hasViews;

    public Apartment(long id, String address, String owner, BigDecimal price, int floor, boolean hasViews) {
        super(id, address, owner, price);
        this.floor = floor;
        this.hasViews = hasViews;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isHasViews() {
        return hasViews;
    }

    public void setHasViews(boolean hasViews) {
        this.hasViews = hasViews;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floor=" + floor +
                ", hasViews=" + hasViews +
                '}';
    }
}
