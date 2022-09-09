public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 23.0;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("Novo Saldo: R$ " + saldo);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
}