package Ex10;

public class Perfil {
    private String bio;
    private String foto;
    private int visibilidade;

    public Perfil(String bio, String foto, int visibilidade){
        this.bio = bio;
        this.foto = foto;
        this.visibilidade = visibilidade;
    }

    public String getBio() {
        return bio;
    }
    public String getFoto() {
        return foto;
    }
    public int getVisibilidade() {
        return visibilidade;
    }

    public void exibirInformacoes(){
        System.out.println("Bio: " + bio);
        System.out.println("Foto : " + foto);
        System.out.println("Visibilidade: " + visibilidade);
    }
}
