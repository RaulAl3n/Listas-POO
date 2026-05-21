package Ex3;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void ligarCarro(){
        System.out.println("Ligando carro...");
        System.out.println("Ligou!");
    }

    public void exibirFichaTecnica(){
        System.out.println("Marca: " + marca + "\n Modelo: " + modelo + "\n Tipo do motor: " + motor.getTipo() 
            + "\n Potencia: " + motor.getPotencia() + " cavalos \n Numero de serei: " + motor.getNumeroSerie());
    }
}
