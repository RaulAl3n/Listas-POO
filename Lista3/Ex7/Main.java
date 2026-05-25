package Lista3.Ex7;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        Carro c2 = new Carro("Honda", "Civic", 2019);
        Carro c3 = new Carro("Ford", "Focus", 2018);
        Carro c4 = new Carro("Chevrolet", "Cruze", 2021);

        Carro[] carros = new Carro[4];
        carros[0] = c1;
        carros[1] = c2;
        carros[2] = c3;
        carros[3] = c4;

        for(int i = 0; i < carros.length; i++) {
            carros[i].exibirInformacoes();
        }
    }
}
