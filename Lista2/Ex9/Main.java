package Ex9;

public class Main {
    public static void main(String[] args) {
        CNPJ cpnj = new CNPJ(3223442, "Regular");
        Empresa emp = new Empresa("devfellowship", "Devfellowship", cpnj);

        emp.exibirInformacoes();

    }
}
