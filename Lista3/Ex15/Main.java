package Lista3.Ex15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Funcionario> funcionariosArray = new ArrayList<>();

        Gerente gerente = new Gerente("João", "Vendas");
        Gerente gerente2 = new Gerente("Ana", "Marketing");
        Gerente gerente3 = new Gerente("Maria", "Recursos Humanos");
        Estagiario estagiario = new Estagiario("Carlos", "Engenharia");
        Estagiario estagiario2 = new Estagiario("Luisa", "Design");
        Estagiario estagiario3 = new Estagiario("Pedro", "Financeiro");

        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = gerente;
        funcionarios[1] = estagiario;
        funcionarios[2] = estagiario3;

        funcionariosArray.add(gerente2);
        funcionariosArray.add(gerente3);
        funcionariosArray.add(estagiario2);

        for(int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome do funcionario: " + funcionarios[i].getNome());
            if (funcionarios[i] instanceof Gerente) {
                Gerente g = (Gerente) funcionarios[i];
                System.out.println("Departamento do gerente: " + g.getDepartamento());
            }
            if (funcionarios[i] instanceof Estagiario) {
                Estagiario e = (Estagiario) funcionarios[i];
                System.out.println("Curso do estagiário: " + e.getCurso());
            }
        }

        for (Funcionario f : funcionariosArray) {
            System.out.println("Nome do funcionario: " + f.getNome());
            if (f instanceof Gerente) {
                Gerente g = (Gerente) f;
                System.out.println("Departamento do gerente: " + g.getDepartamento());
            }
            if (f instanceof Estagiario) {
                Estagiario e = (Estagiario) f;
                System.out.println("Curso do estagiário: " + e.getCurso());
            }
        }

        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Departamento do gerente: " + gerente.getDepartamento());
    }
}
