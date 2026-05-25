package Lista3.Ex11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Professor> professores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        professores.add(new Professor("João", "Matemática"));
        professores.add(new Professor("Maria", "Física"));
        professores.add(new Professor("Carlos", "Química"));

        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
        }

        System.out.println("Deseja buscar um professor pelo nome (s/n)? ");
        String escolha = scanner.nextLine();

        if(escolha.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do professor: ");
            String nomeBusca = scanner.nextLine();
            boolean encontrado = false;

            for (Professor professor : professores) {
                if (professor.getNome().equalsIgnoreCase(nomeBusca)) {
                    System.out.println("Professor encontrado: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Professor não encontrado.");
            }
        }

        scanner.close();

    }
}
