package Ex6;

public class Cracha {
    private int codigo;
    private String dataValidade;

    public Cracha(int codigo, String dataValidade){
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void exibirDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Data de Validade: " + dataValidade);
    }
}
