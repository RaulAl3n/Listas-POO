package Ex14;

public class AgendaContato {
    public String nome;
    public int telefone;
    public String email;

    public AgendaContato(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }

    public void atualizarTelefone(int novoTelefone) {
        this.telefone = novoTelefone;
    }
}
