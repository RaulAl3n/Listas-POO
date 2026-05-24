package Lista3.Ex8;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = new Aluno("João", 20, "Engenharia", 12345);
        pessoas[1] = new Aluno("Maria", 22, "Medicina", 67890);
        pessoas[2] = new Professor("Carlos", 30, "Química");
        pessoas[3] = new Professor("Ana", 35, "Biologia");

        for(int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome: " + pessoas[i].getNome());
            System.out.println("Idade: " + pessoas[i].getIdade());
            if(pessoas[i] instanceof Aluno) {
                Aluno aluno = (Aluno) pessoas[i];
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Matrícula: " + aluno.getMatricula());
            } else if(pessoas[i] instanceof Professor) {
                Professor professor = (Professor) pessoas[i];
                System.out.println("Disciplina: " + professor.getDisciplina());
            }
            System.out.println();
        }
    }
}
