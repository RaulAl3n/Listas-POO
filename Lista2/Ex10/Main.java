package Ex10;

public class Main {
    public static void main(String[] args) {
        Perfil perfil = new Perfil("Administrador", "Acesso total ao sistema",123);
        Usuario usuario1 = new Usuario("joao123", "joao123@example.com", perfil);
        usuario1.exibirInformacoes();
    }
}