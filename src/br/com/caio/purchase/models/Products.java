package br.com.caio.purchase.models;

import br.com.caio.purchase.main.Main;

public class Products extends Item {

    public Products(String nameProduct, double priceProduct) {
        super(nameProduct, priceProduct);
    }

    @Override
    public String toString() {
        return  this.getNameProduct() + " - " + this.getPriceProduct() ;
    }

}
