package Ex6;

public class Carro {
    public String marca;
    public String modelo;
    public int velocidade;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(int incremento) {
        this.velocidade += incremento;
    }

    public void frear(int decremento) {
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }
}
