package Ex2;

class Carteirinha {
    private int numero;
    private String dataEmissao;

    public Carteirinha(int numero, String dataEmissao){
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void exibirDados(){
        System.out.println("Numero da carteirinha: " + numero);
        System.out.println("Data de emissão: " + dataEmissao);
    }
}