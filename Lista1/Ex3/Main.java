package Ex3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 12345, 80, 90);

        System.out.println("\nMédia: " + aluno1.CalcularMedia());

        if(aluno1.Aprovado()) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
