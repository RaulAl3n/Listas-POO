package Ex9;

public class Celular {
    private String modelo;
    private String marca;
    private int nivelBateria;

    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getNivelBateria() {
        return nivelBateria;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void carregarBateria(int valor){
        System.out.println("Carregando bateria...");
        this.nivelBateria += valor;
        if(this.nivelBateria > 100){
            this.nivelBateria = 100;
        }
        System.out.println("Bateria carregada. Nível atual: " + this.nivelBateria + "%");
    }

    public void usarBateria(int valor){
        System.out.println("Usando bateria...");
        this.nivelBateria -= valor;
        if(this.nivelBateria < 0){
            this.nivelBateria = 0;
        }
        System.out.println("Bateria usada. Nível atual: " + this.nivelBateria + "%");
    }
}   
