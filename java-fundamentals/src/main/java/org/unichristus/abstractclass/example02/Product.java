package org.unichristus.abstractclass.example02;

public abstract class Product {
    public String nameProduct;
    public double price;
    public int idProduct;

    public Product(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.idProduct = 0;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public abstract void update(String nameProduct, double price);
    public abstract void showInfo();

}
