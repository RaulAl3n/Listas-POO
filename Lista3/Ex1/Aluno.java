package Lista3.Ex1;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    // Se atentar ao parametros do cosntrutor na herança!!
    public Aluno(String nome, int idade, int matricula, String curso){
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void exibirInformacoes(){
        System.out.println("Nome :" + getNome());
        System.out.println("Idade :" + getIdade());
        System.out.println("Matricula:" + getMatricula());
        System.out.println("Curso :" + getCurso());
    }
}
