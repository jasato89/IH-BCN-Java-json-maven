package classes;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class House {

    private long id;
    private String address;
    private String owner;
    private BigDecimal price;

    public House(long id, String address, String owner, BigDecimal price) {
        this.id = id;
        this.address = address;
        this.owner = owner;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Casa{" + "\n" +
                "id=" + id + "\n" +
                ", dirección='" + address + '\'' + "\n" +
                ", owner='" + owner + '\'' + "\n" +
                ", price=" + price + "\n" +
                '}';
    }

}
