package Lista3.Ex12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Aluno aluno1 = new Aluno("Ana", 12345);
        Aluno aluno2 = new Aluno("Bruno", 67890);

        alunos.add(aluno1);
        alunos.add(aluno2);

        for (Aluno aluno : alunos) {
            System.out.println("Aluno: Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        System.out.println("Digite a matrícula do aluno que deseja remover: ");
        int matriculaRemover = scanner.nextInt();

        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matriculaRemover) {
                alunos.remove(aluno);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }

        System.out.println("Alunos após a remoção:");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        scanner.close();
    }
}
