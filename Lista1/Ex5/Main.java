package Ex5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("Deseja criar uma conta bancária? (s/n): ");
        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("s"))  {
            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Digite o saldo inicial: ");
            float saldo = scanner.nextFloat();

            conta1.setNumeroConta(numeroConta);
            conta1.setTitular(titular);
            conta1.setSaldo(saldo);
            System.out.println("\nConta criada com sucesso!");
            conta1.consultarSaldo();
        } else {
            System.out.println("Operação cancelada.");
        }

        System.out.println("\nDeseja realizar um depósito? (s/n): ");
        resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor do depósito: ");
            float valorDeposito = scanner.nextFloat();
            conta1.depositar(valorDeposito);
            System.out.println("Depósito realizado com sucesso!");
            conta1.consultarSaldo();
        } else {
            System.out.println("Operação cancelada.");
        }

        System.out.println("\nDeseja realizar um saque? (s/n): ");
        resposta = scanner.nextLine();
        if(resposta == "s" || resposta == "S") {
            System.out.print("Digite o valor do saque: ");
            float valorSaque = scanner.nextFloat();
            conta1.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso!");
            conta1.consultarSaldo();
        } else {
            System.out.println("Operação cancelada.");
        }

        System.out.println("\nDeseja consultar o saldo? (s/n): ");
        resposta = scanner.nextLine();
        if(resposta == "s" || resposta == "S") {
            conta1.consultarSaldo();
        } else {
            System.out.println("Operação cancelada.");
        }
        
        scanner.close();
    }
}
