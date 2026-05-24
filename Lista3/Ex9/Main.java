package Lista3.Ex9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");
        Aluno a4 = new Aluno("Ana");
        Aluno a5 = new Aluno("Carlos");

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
