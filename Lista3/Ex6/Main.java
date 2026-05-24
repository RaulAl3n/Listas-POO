package Lista3.Ex6;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 20);
        Aluno a2 = new Aluno("Maria", 22);
        Aluno a3 = new Aluno("Pedro", 19);

        Aluno[] alunos = new Aluno[3];

        alunos[0] = a1;
        alunos[1] = a2;
        alunos[2] = a3;

        for(int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i].getNome() + ", Idade: " + alunos[i].getIdade());
        }
    }
}
