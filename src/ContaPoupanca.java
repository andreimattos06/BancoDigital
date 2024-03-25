public class ContaPoupanca extends Conta{

    

    public ContaPoupanca(Agencia agencia) {
        super(agencia);
    }

    @Override
    public void imprimirSaldo(){
        System.out.println("------- Saldo da Conta Corrente -------");
        System.out.println("R$" + super.saldo);
        Utils.imprimirLinhaDivisao();
    }

    @Override
    void efetuarEmprestimo(double valor) {
        throw new UnsupportedOperationException("Não é possível fazer operações de empréstimo em contas poupança.");
    }
    
}
