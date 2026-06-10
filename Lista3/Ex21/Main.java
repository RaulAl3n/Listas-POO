package Lista3.Ex21;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Deseja adcionar um produto? (S/N)");
            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("S")) {
                while(true) {
                    System.out.println("===LISTA DE PRODUTOS===");
                    System.out.println("Opções: ");
                    System.out.println("1. Produto Digital");
                    System.out.println("2. Produto Físico");
                    System.out.println("3. Calculo do valor total do carrinho");
                    System.out.println("4. Listar um tipo específico de produto");

                    String tipoMidia = scanner.nextLine();

                    switch(tipoMidia){
                        case "1":
                            System.out.println("Digite o nome:");
                            String nome = scanner.nextLine();

                            System.out.println("Digite o formato:");
                            String formato = scanner.nextLine();
                            System.out.println("Digite o valor:");
                            double valor = Double.parseDouble(scanner.nextLine());
                            produtos.add(new ProdutoDigital(nome, valor, formato));
                            break;
                        case "2":
                            System.out.println("Digite o nome:");
                            nome = scanner.nextLine();

                            System.out.println("Digite o peso:");
                            double peso = Double.parseDouble(scanner.nextLine());
                            System.out.println("Digite o valor:");
                            valor = Double.parseDouble(scanner.nextLine());
                            produtos.add(new ProdutoFisico(nome, valor, peso));
                            break;
                        case "3":
                            double valorTotal = 0;
                            for(Produto p : produtos) {
                                if(p instanceof ProdutoDigital) {
                                    valorTotal += ((ProdutoDigital) p).getValor();
                                } else if(p instanceof ProdutoFisico) {
                                    valorTotal += ((ProdutoFisico) p).getValor();
                                }
                            }
                            System.out.println("Valor total do carrinho: " + valorTotal);
                            break;
                        case "4":
                            System.out.println("Qual o tipo que voce deseja listar? (Digital/Fisico)");
                            String tipo = scanner.nextLine();
                            for(Produto p : produtos) {
                                if(p instanceof ProdutoDigital && tipo.equalsIgnoreCase("ProdutoDigital")) {
                                    System.out.println(p);
                                } else if(p instanceof ProdutoFisico && tipo.equalsIgnoreCase("ProdutoFisico")) {
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
