package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Declaração e inicialização do array
        int[] numeros = {10, 20, 30, 40, 50};

        // Percorrendo o array com um loop for
        System.out.println("Percorrendo o array com for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        // Percorrendo o array com um loop for-each
        System.out.println("\nPercorrendo o array com for-each:");
        for (int numero : numeros) {
            System.out.println("Elemento: " + numero);
        }

    }
}