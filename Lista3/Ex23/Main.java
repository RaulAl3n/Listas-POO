package Lista3.Ex23;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("Digite os numeros: ");
        for(int i = 0; i < 5; i++) {
            valor = scanner.nextInt();
            numeros.add(valor);
            if(valor < 0) {
                System.out.println("Valor negativo digitado. Encerrando o programa.");
                return;
            }
        }

        int  soma = 0;
        System.out.println("Valores digitados:");
        for(int i = 0; i < 5; i++) {
            System.out.println(numeros.get(i));
            soma += numeros.get(i);
        }
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
