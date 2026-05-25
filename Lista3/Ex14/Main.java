package Lista3.Ex14;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void mostrarListaDeLivros(Livro[] lista) {
        System.out.println("\n=== ARRAY DE LIVROS ===");

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println("Livro " + (i + 1) + ": " + lista[i].info());
            }
        }
    }

    public static void mostrarArrayList(ArrayList<Livro> livros) {
        System.out.println("\n=== ARRAYLIST DE LIVROS ===");

        for (int i = 0; i < livros.size(); i++) {
            System.out.println("Livro " + (i + 1) + ": " + livros.get(i).info());
        }
    }


    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        LivroDidatico livro2 = new LivroDidatico("Matemática Básica", "Prof. Silva", "Matemática");

        Livro[] listaDeLivros = new Livro[3]; // se atentar pra criar o tipo do vetor com tipo do objeto (classe pai)
        listaDeLivros[0] = livro1;
        listaDeLivros[1] = livro2;

        mostrarListaDeLivros(listaDeLivros);

        System.out.println("Deseja adcionar mais um livro? (s/n)");
        String resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("s")) {
            Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
            listaDeLivros[2] = livro3;
        }

        mostrarListaDeLivros(listaDeLivros);

        System.out.println("Deseja adicionar mais livros? (s/n)");
        String resposta2 = scanner.nextLine();
        if(resposta2.equalsIgnoreCase("s")) {
            for(int i=0; i < listaDeLivros.length; i++) {
                if(listaDeLivros[i] != null) {
                    livros.add(listaDeLivros[i]);
                }
            }

            System.out.println("Quantos livros deseja adicionar? ");
            int quantidade = scanner.nextInt();

            for(int i=0; i < quantidade; i++) {
                scanner.nextLine();
                System.out.println("Digite o título do livro: ");
                String titulo = scanner.nextLine();
                System.out.println("Digite o autor do livro: ");
                String autor = scanner.nextLine();

                Livro novoLivro = new Livro(titulo, autor);
                livros.add(novoLivro);
            }
            mostrarArrayList(livros);
        }


        scanner.close();
    }
}
