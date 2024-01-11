package br.com.caio.purchase.models;

public class Item implements Comparable<Item> {
    private String nameProduct;
    private double priceProduct;

    public Item(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }


    public double getPriceProduct() {
        return priceProduct;
    }

    @Override
    public int compareTo(Item otherItem) {
        return this.getNameProduct().compareTo(otherItem.getNameProduct());
    }
}
