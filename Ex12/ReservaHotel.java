package Ex12;

public class ReservaHotel {
    private String nomeHospede;
    private int numeroDias;
    private double valorDiaria;

    public ReservaHotel(String nomeHospede, int numeroDias, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.numeroDias = numeroDias;
        this.valorDiaria = valorDiaria;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }
    public int getNumeroDias() {
        return numeroDias;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularTotalHospedagem() {
        return numeroDias * valorDiaria;
    }

    public void exibirReserva() {
        System.out.println("\nNome do Hóspede: " + nomeHospede);
        System.out.println("Número de Dias: " + numeroDias);
        System.out.println("Valor da Diária: R$ " + valorDiaria);
        System.out.println("Total da Hospedagem: R$ " + calcularTotalHospedagem());
    }
}
