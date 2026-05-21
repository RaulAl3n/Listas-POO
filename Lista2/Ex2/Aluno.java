package Ex2;

public class Aluno {
    private String nome;
    private int idade;
    private Carteirinha carteirinha;

    public Aluno(String nome, int idade, Carteirinha carteirinha){
        this.nome = nome;
        this.idade = idade;
        this.carteirinha = carteirinha;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        carteirinha.exibirDados();
    }

}
