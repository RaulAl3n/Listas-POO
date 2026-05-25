package Lista3.Ex13;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Professor professor = new Professor("Dr. Smith", "Matemática");
        Aluno aluno = new Aluno("João", 12345);

        System.out.println("Professor: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
        System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());

        System.out.println("Digite 's' para usar o sistema de arrays e 'n' para utilizar o de ArrayList: ");
        String escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("s")) {
            Pessoa[] pessoas = new Pessoa[2];
            pessoas[0] = professor;
            pessoas[1] = aluno;

            for (Pessoa pessoa : pessoas) {
                System.out.println("Pessoa: " + pessoa.getNome());
            }
        } else if (escolha.equalsIgnoreCase("n")) {
            ArrayList<Pessoa> pessoasList = new ArrayList<>();
            pessoasList.add(professor);
            pessoasList.add(aluno);

            for (Pessoa pessoa : pessoasList) {
                System.out.println("Pessoa: " + pessoa.getNome());
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
