package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Declaração e inicialização do array
//        int[] numeros = {10, 20, 30, 40, 50};
//
//        // Percorrendo o array com um loop for
//        System.out.println("Percorrendo o array com for:");
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Elemento " + i + ": " + numeros[i]);
//        }
//
//        // Percorrendo o array com um loop for-each
//        System.out.println("\nPercorrendo o array com for-each:");
//        for (int numero : numeros) {
//            System.out.println("Elemento: " + numero);
//        }

//        // Declaração e inicialização do array de notas
//        double[] notas = {8.5, 7.0, 9.5, 6.0, 10.0};
//
//        // Calculando a soma das notas
//        double soma = 0.0;
//        for (double nota : notas) {
//            soma += nota;
//        }
//
//        // Calculando a média
//        double media = soma / notas.length;
//
//        // Exibindo a média
//        System.out.println("A média das notas é: " + media);

        // Declaração e inicialização do array
        int[] numeros = {1, 2, 3};

        try {
            // Tentando acessar um índice fora dos limites
            System.out.println("Tentando acessar o índice 3: " + numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturando a exceção
            System.out.println("Erro: Índice fora dos limites do array.");
        }

        // Exibindo os elementos do array
        System.out.println("Elementos do array:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}