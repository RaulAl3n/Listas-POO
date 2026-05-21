public class Main{
    public static void main(String[] args){
        Prontuario prontuario = new Prontuario(12345, "O+", "Nenhuma");
        Paciente paciente = new Paciente("João Silva", 30, prontuario);

        paciente.exibirPaciente();
    }
}