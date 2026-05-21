package Ex6;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;

    public Funcionario(String nome, String cargo, Cracha cracha){
        this.nome = nome;
        this.cargo =cargo;
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Cracha getCracha() {
        return cracha;
    }

    public void exibirFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        cracha.exibirDados();
    }
}
