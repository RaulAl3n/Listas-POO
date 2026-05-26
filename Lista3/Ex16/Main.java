package Lista3.Ex16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alice", 5000.0, "Vendas");
        Vendedor vendedor = new Vendedor("Bob", 3000.0, 0.1);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(vendedor);

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            if (f instanceof Gerente) {
                Gerente g = (Gerente) f;
                System.out.println("Cargo: Gerente");
                System.out.println("Departamento: " + g.getDepartamento());
            }
            if (f instanceof Vendedor) {
                Vendedor v = (Vendedor) f;
                System.out.println("Cargo: Vendedor");
                System.out.println("Comissão: " + v.getComissao());
            }
            System.out.println("Salário: " + f.getSalario());
            System.out.println();
        }
    }
}
