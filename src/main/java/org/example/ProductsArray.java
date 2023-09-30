package org.example;
import java.util.Arrays;

public class ProductsArray {
    private String[] products = {
            "Laptop", "Tablet", "Smartphone", "Keyboard", "Mouse",
            "Headphones", "Monitor", "Printer", "Camera", "Speakers",
            "Desk", "Chair", "Desk Lamp", "External Hard Drive", "USB Flash Drive",
            "Router", "Modem", "Scanner", "Projector", "Whiteboard"
    };

    public void displayProductsStartingWith(char letter) {
        // Muestra los productos que comienzan con la letra especificada.
        System.out.print("Productos que comienzan con '" + letter + "': ");
        for (String product : products) {
            if (product.length() > 0 && Character.toUpperCase(product.charAt(0)) == Character.toUpperCase(letter)) {
                System.out.print(product + " ");
            }
        }
        System.out.println();
    }

    public void displaySortedProducts() {
        // Ordena e imprime la lista de productos en orden alfabético.
        Arrays.sort(products);
        System.out.print("Productos ordenados alfabéticamente: ");
        for (String product : products) {
            if (product != null) {
                System.out.print(product + " ");
            }
        }
        System.out.println();
    }

}
