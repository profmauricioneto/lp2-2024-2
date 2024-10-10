package org.unichristus.abstractclass.example02;

public class Ball extends Product {
    public Ball(String nameProduct, double price) {
        super(nameProduct, price);
    }

    @Override
    public void update(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("Product Ball: " + nameProduct);
        System.out.println("price: " + price);
    }
}
