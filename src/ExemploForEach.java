public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        System.out.println();

        for (String aluno : alunos) {
            System.out.println("Nome do Aluno é " + aluno);
        }
        System.out.println();
    }
}
