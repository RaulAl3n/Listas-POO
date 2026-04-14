package Ex3;

public class Aluno {
    public String nome;
    public int matricula;
    public int nota1;
    public int nota2;

    public Aluno(String nome, int matricula, int nota1, int nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getNota1() {
        return nota1;
    }
    public int getNota2() {
        return nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public float CalcularMedia() {
        return (this.nota1 + this.nota2) / 2.0f;
    }

    public boolean Aprovado() {
        return CalcularMedia() >= 70.0f;
    }
}
