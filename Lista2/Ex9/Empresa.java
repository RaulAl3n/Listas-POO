package Ex9;

public class Empresa{
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cpnj;

    public Empresa(String razaoSocial, String nomeFantasia, CNPJ cpnj){
        this.cpnj = cpnj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

    public CNPJ getCpnj() {
        return cpnj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void exibirInformacoes(){
        System.out.println("Razao Social: " + razaoSocial);
        System.out.println("Nome fantaasia: " + nomeFantasia);
        
        cpnj.exibirInformacoes();
    }
}