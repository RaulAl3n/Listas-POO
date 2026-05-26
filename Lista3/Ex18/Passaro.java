package Lista3.Ex18;

public class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Piu piu!");
    }
}
