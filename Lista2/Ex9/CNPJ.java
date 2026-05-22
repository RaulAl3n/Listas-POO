package Ex9;

public class CNPJ{
    private int numero;
    private String situacaoCadastral;

    public CNPJ(int numero, String situacaoCadastral){
        this.numero = numero;
        this.situacaoCadastral = situacaoCadastral;
    }

    public int getNumero() {
        return numero;
    }

    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void exibirInformacoes(){
        System.out.println("Numero do CNPJ: " + numero);
        System.out.println("Situacao Cadastral: " + situacaoCadastral);
    }
}