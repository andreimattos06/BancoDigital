public class App {
    public static void main(String[] args) throws Exception {
        Agencia agencia1 = new Agencia("Caarapó", "Pilares");
        Agencia agencia2 = new Agencia("Dourados", "Carvalho");

        Conta cc1 = new ContaCorrente(agencia1);
        Conta pp1 = new ContaPoupanca(agencia2);

        cc1.efetuarEmprestimo(15000);

        cc1.depositar(150);
        cc1.sacar(5);

        cc1.transferir(130, pp1);

        pp1.imprimirSaldo();    
        cc1.imprimirSaldo();

        cc1.getAgencia().imprimirInformacoesAgencia();
        pp1.getAgencia().imprimirInformacoesAgencia();

        pp1.efetuarEmprestimo(20000);
    }
}
