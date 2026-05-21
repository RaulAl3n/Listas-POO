package Ex5;

public class ISBN {
    private int codigo;
    private String editora;

    public ISBN(int codigo, String editora){
        this.codigo = codigo;
        this.editora = editora;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void exibirDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Editora: " + editora);
    }
}
