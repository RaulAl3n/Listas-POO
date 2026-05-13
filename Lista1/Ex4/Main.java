package Ex4;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a largura do retangulo: ");
            float largura = scanner.nextFloat();

            System.out.print("Digite a altura do retangulo: ");
            float altura = scanner.nextFloat();

            Retangulo retangulo = new Retangulo(largura, altura);

            System.out.println("\nÁrea: " + retangulo.calcularArea());
            System.out.println("Perímetro: " + retangulo.calcularPerimetro());

            scanner.close();
        }   
}
