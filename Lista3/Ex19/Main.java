package Lista3.Ex19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Midia> midias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja adcionar uma mídia? (S/N)");
        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("S")) {
            while(true) {
                System.out.println("===LISTA DE MÍDIAS===");
                System.out.println("Opções: ");
                System.out.println("1. Filme");
                System.out.println("2. Musica");
                System.out.println("3. PodCast");
                System.out.println("4. Listar todas as midias");
                System.out.println("5. Listar apenas filmes");
                System.out.println("6. Contar quantas midias tem de cada");

                String tipoMidia = scanner.nextLine();

                switch(tipoMidia){
                    case "1":
                        System.out.println("Digite o título:");
                        String titulo = scanner.nextLine();

                        System.out.println("Digite o ano:");
                        int ano = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o diretor:");
                        String diretor = scanner.nextLine();
                        midias.add(new Filme(titulo, ano, diretor));
                        break;
                    case "2":
                        System.out.println("Digite o título:");
                        titulo = scanner.nextLine();

                        System.out.println("Digite o ano:");
                        ano = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o artista:");
                        String artista = scanner.nextLine();
                        midias.add(new Musica(titulo, ano, artista));
                        break;
                    case "3":
                        System.out.println("Digite o título:");
                        titulo = scanner.nextLine();

                        System.out.println("Digite o ano:");
                        ano = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o apresentador:");
                        String apresentador = scanner.nextLine();
                        midias.add(new PodCast(titulo, ano, apresentador));
                        break;
                    case "4":
                        System.out.println("===TODAS AS MÍDIAS===");
                        for(Midia m : midias) {
                            System.out.println(m);
                        }
                        break;
                    case "5":
                        System.out.println("===FILMES===");
                        for(Midia m : midias) {
                            if(m instanceof Filme) {
                                System.out.println(m);
                            }
                        }
                        break;
                    case "6":
                        int contFilmes = 0;
                        int contMusicas = 0;
                        int contPodCasts = 0;
                        for(Midia m : midias) {
                            if(m instanceof Filme) {
                                contFilmes++;
                            } else if(m instanceof Musica) {
                                contMusicas++;
                            } else if(m instanceof PodCast) {
                                contPodCasts++;
                            }
                        }
                        System.out.println("Quantidade de filmes: " + contFilmes);
                        System.out.println("Quantidade de músicas: " + contMusicas);
                        System.out.println("Quantidade de podcasts: " + contPodCasts);
                        break;
                    default:
                        System.out.println("Tipo de mídia inválido.");
                }
            }
        }
        scanner.close();
    }
}
