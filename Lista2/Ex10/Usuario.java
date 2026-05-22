package Ex10;

public class Usuario{
    private String login;
    private String email;
    private Perfil perfil;

    public Usuario(String login, String email, Perfil perfil){
        this.login = login;
        this.email = email;
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
    public Perfil getPerfil() {
        return perfil;
    }

    public void exibirInformacoes(){
        System.out.println("Login: " + login);
        System.out.println("Email: " + email);
        System.out.println("Perfil: " + perfil);
    }
}