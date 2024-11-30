package com.education.ztu;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    // Конструктор
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }


    // Гетери та сетери
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Перевизначення методу equals для порівняння об'єктів
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(category, product.category);
    }

    // Перевизначення hashCode для коректної роботи у колекціях
    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, category);
    }

    // Перевизначення toString для зручного виводу
    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', price=%.2f, category='%s'}", id, name, price, category);
    }
}
