package Ex14;

public class Main {
    public static void main(String[] args) {
        AgendaContato contato1 = new AgendaContato("João", 123456789, "joao@email.com");
        contato1.exibirContato();
        contato1.atualizarTelefone(987654321);
        System.out.println("Telefone atualizado:");

        contato1.exibirContato();
    }
}
