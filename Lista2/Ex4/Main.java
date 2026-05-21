package Ex4;

public class Main {
    public static void main(String[] args) {
        PlacaMae pM = new PlacaMae("Z390 Gaming", "Chips");
        Computador comp = new Computador("HP", "i9 9900K", pM);

        comp.exibirConfiguracoes();
    }
}
