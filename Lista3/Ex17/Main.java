package Lista3.Ex17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        ContatoProfissional contatoProfissional1 = new ContatoProfissional("Empresa A", "Maria", "987654321");
        ContatoPessoal contatoPessoal1 = new ContatoPessoal("Amigo", "Pedro", "555555555");

        contatos.add(contatoProfissional1);
        contatos.add(contatoPessoal1);

        System.out.println("==Todos os Contatos== ");
        for (Contato c : contatos) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Telefone: " + c.getTelefone());
            if (c instanceof ContatoProfissional) {
                ContatoProfissional cp = (ContatoProfissional) c;
                System.out.println("Empresa: " + cp.getEmpresa());
            }
            if (c instanceof ContatoPessoal) {
                ContatoPessoal cp = (ContatoPessoal) c;
                System.out.println("Tipo de contato: " + cp.getRelacao());
            }
            System.out.println();
        }


        System.out.println("==Contatos Profissionais== ");
        for (Contato c : contatos) {
            if (c instanceof ContatoProfissional) {
                ContatoProfissional cp = (ContatoProfissional) c;
                System.out.println("Nome: " + cp.getNome());
                System.out.println("Telefone: " + cp.getTelefone());
                System.out.println("Empresa: " + cp.getEmpresa());
                System.out.println();
            }
        }
    }
}
