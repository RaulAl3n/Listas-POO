package Lista3.Ex20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Deseja adcionar um funcionario? (S/N)");
            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("S")) {
                while(true) {
                    System.out.println("===LISTA DE FUNCIONÁRIOS===");
                    System.out.println("Opções: ");
                    System.out.println("1. Aluno");
                    System.out.println("2. Professor");
                    System.out.println("3. Coordenador");
                    System.out.println("4. Listar todos os funcionários");
                    System.out.println("5. Listar um tipo específico de funcionário");
                    System.out.println("6. Busca por nome");

                    String tipoMidia = scanner.nextLine();

                    switch(tipoMidia){
                        case "1":
                            System.out.println("Digite o nome:");
                            String nome = scanner.nextLine();

                            System.out.println("Digite a matrícula:");
                            int matricula = Integer.parseInt(scanner.nextLine());
                            pessoas.add(new Aluno(nome, matricula));
                            break;
                        case "2":
                            System.out.println("Digite o nome:");
                            nome = scanner.nextLine();

                            System.out.println("Digite a disciplina:");
                            String disciplina = scanner.nextLine();
                            pessoas.add(new Professor(nome, disciplina));
                            break;
                        case "3":
                            System.out.println("Digite o nome:");
                            nome = scanner.nextLine();

                            System.out.println("Digite a matéria:");
                            String matéria = scanner.nextLine();
                            pessoas.add(new Coordenador(nome, matéria));
                            break;
                        case "4":
                            System.out.println("===TODOS OS FUNCIONÁRIOS===");
                            for(Pessoa p : pessoas) {
                                System.out.println(p);
                            }
                            break;
                        case "5":
                            System.out.println("Qual o tipo que voce deseja listar? (Aluno/Professor/Coordenador)");
                            String tipo = scanner.nextLine();
                            for(Pessoa p : pessoas) {
                                if(p instanceof Aluno && tipo.equalsIgnoreCase("Aluno")) {
                                    System.out.println(p);
                                } else if(p instanceof Professor && tipo.equalsIgnoreCase("Professor")) {
                                    System.out.println(p);
                                } else if(p instanceof Coordenador && tipo.equalsIgnoreCase("Coordenador")) {
                                    System.out.println(p);
                                }
                            }
                            break;
                        case "6":
                            System.out.println("Digite o nome para busca:");
                            String nomeBusca = scanner.nextLine();
                            for(Pessoa p : pessoas) {
                                if(p.getNome().equalsIgnoreCase(nomeBusca)) {
                                    System.out.println(p);
                                }
                            }
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }
                }
            }
            scanner.close();
    }
}
