package models;

public class Appliances {
    private int id;
    private String name;
    private String brand;
    private String type;
    private int size;
    private int qty;
    private float price;

    public Appliances(int id, String name, String brand, String type, int size, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }

    public Appliances() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}

