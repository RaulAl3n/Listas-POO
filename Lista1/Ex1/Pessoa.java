package Ex1;

public class Pessoa {
    public String nome;
    public int idade;

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println(" ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
