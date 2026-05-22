package Lista3.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int[] numeros = new int[5];

        System.out.println("Digite os numeros: ");
        for(int i = 0; i < 5; i++) {
            valor = scanner.nextInt();
            numeros[i] = valor;
            if(valor < 0) {
                System.out.println("Valor negativo digitado. Encerrando o programa.");
                return;
            }
        }

        int  soma = 0;
        System.out.println("Valores digitados:");
        for(int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            soma += numeros[i];
        }
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
