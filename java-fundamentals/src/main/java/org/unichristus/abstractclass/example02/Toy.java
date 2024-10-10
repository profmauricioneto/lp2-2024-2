package org.unichristus.abstractclass.example02;

public class Toy extends Product {
    public Toy(String nameProduct, double price) {
        super(nameProduct, price);
    }

    @Override
    public void update(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("Product Toy: " + nameProduct);
        System.out.println("price: " + price);
    }
}
