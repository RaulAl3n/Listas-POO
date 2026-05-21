public class Prontuario{
    private int numeroRegistro;
    private String tipoSangue;
    private String alergias;

    public Prontuario(int numeroRegistro, String tipoSangue, String alergias) {
        this.numeroRegistro = numeroRegistro;
        this.tipoSangue = tipoSangue;
        this.alergias = alergias;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }
    public String getTipoSangue(){
        return tipoSangue;
    }
    public String getAlergias() {
        return alergias;
    }

    public void exibirProntuario() {
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Tipo Sanguíneo: " + tipoSangue);
        System.out.println("Alergias: " + alergias);
    }
}