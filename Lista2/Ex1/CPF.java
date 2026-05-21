public class CPF {
    private int numero;
    private String situacao;

    public CPF(int numero, String situacao){
        this.numero = numero;
        this.situacao = situacao;
    }

    public int getNumero() {
        return numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void exibirDados(){
        System.out.println("CPF: " + numero);
        System.out.println("Situação: " + situacao);
    }
}
