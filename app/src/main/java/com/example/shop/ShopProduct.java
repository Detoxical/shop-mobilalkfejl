package com.example.shop;

public class ShopProduct {
    private String id;
    private String name;
    private String info;
    private String price;
    private float ratedInfo;
    private int imageResource;
    private int inCartCount;

    public ShopProduct() {}

    public ShopProduct(String name, String info, String price, float ratedInfo, int imageResource, int inCartCount) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.ratedInfo = ratedInfo;
        this.imageResource = imageResource;
        this.inCartCount = inCartCount;
    }

    public String getName() {
        return name;
    }
    public String getInfo() {
        return info;
    }
    public String getPrice() {
        return price;
    }
    public float getRatedInfo() { return ratedInfo; }
    public int getImageResource() {
        return imageResource;
    }
    public int getInCartCount() {
        return inCartCount;
    }
    public String _getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
