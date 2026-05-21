package Ex3;

public class Motor {
    private String tipo;
    private int potencia;
    private int numeroSerie;

    public Motor(String tipo, int potencia, int numeroSerie){
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }
}
