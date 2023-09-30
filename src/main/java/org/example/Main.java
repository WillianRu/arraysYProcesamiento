package org.example;

public class Main {
    public static void main(String[] args) {
        ProductsArray productsArray = new ProductsArray();

        // Muestra productos que comienzan con la letra 'S'
        productsArray.displayProductsStartingWith('S');

        // Muestra la lista de productos ordenados alfabéticamente
        productsArray.displaySortedProducts();
    }
}