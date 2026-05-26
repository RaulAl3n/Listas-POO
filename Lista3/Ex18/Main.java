package Lista3.Ex18;

import java.util.ArrayList;

public class Main {
    public static void mostrarListaDeAnimais(Animal[] animais) {
        System.out.println("\n=== ARRAY DE ANIMAIS ===");        
        for (int i = 0; i < animais.length; i++) {
            if (animais[i] != null) {
                animais[i].emitirSom();
            }
        }
    }
                
    public static void mostrarArrayList(ArrayList<Animal> animaisArray) {
        System.out.println("\n=== ARRAYLIST DE ANIMAIS ===");
        for (int i = 0; i < animaisArray.size(); i++) {
            animaisArray.get(i).emitirSom();
        }
    }

    public static void main(String[] args) {
        ArrayList <Animal> animais = new ArrayList<>();

        Passaro passaro = new Passaro("Pardal");
        Cachorro cachorro = new Cachorro("Rottweiler");
        Gato gato = new Gato("Persa");
        
        Animal[] listaDeAnimais = new Animal[3];
        listaDeAnimais[0] = passaro;
        listaDeAnimais[1] = cachorro;
        listaDeAnimais[2] = gato;

        mostrarListaDeAnimais(listaDeAnimais);

        animais.add(passaro);
        animais.add(cachorro);
        animais.add(gato);

        mostrarArrayList(animais);
    
    }
}
