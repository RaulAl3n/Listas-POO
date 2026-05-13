package Ex11;

public class Paciente {
    public String nome;
    public int idade;
    public double peso;
    public double altura;

    public Paciente(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void classificarIMC() {
        double imc = calcularIMC();
        System.out.printf("\nO IMC de %s é: %.2f, portanto ele é: ", nome, imc);
        if (imc < 18.5 && imc > 0) {
            System.out.println("\nAbaixo do peso");
        } else if (imc < 25 && imc >= 18.5) {
            System.out.println("\nPeso normal");
        } else if (imc < 30 && imc >= 25) {
            System.out.println("\nSobrepeso");
        } else {
            System.out.println("\nObesidade");
        }
    }
}
