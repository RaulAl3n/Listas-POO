package Ex9;

public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular();

        celular1.setModelo("Galaxy S21");
        celular1.setMarca("Samsung");
        celular1.setNivelBateria(50);

        System.out.println("\nModelo: " + celular1.getModelo());
        System.out.println("Marca: " + celular1.getMarca());
        System.out.println("Nível da Bateria: " + celular1.getNivelBateria() + "%");

        celular1.carregarBateria(30);
        celular1.usarBateria(20);
    }
}
