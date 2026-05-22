package Lista3.Ex2;

public class Professor extends Pessoa{
    private String disciplina;
    private int salario;

    public Professor(String nome, int idade, String disciplina, int salario){
        super(nome,idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getSalario() {
        return salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome :" + getNome());
        System.out.println("Idade :" + getIdade());
        System.out.println("Disciplina:" + getDisciplina());
        System.out.println("Salario :" + getSalario());
    }
}
