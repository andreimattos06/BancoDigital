public class ContaCorrente extends Conta{

    private double saldoEmprestimo;
    

    public ContaCorrente(Agencia agencia) {
        super(agencia);
        this.saldoEmprestimo = 0;        
    }

    public void efetuarEmprestimo(double valor){
        super.saldo += valor;
        this.saldoEmprestimo += valor;
        System.out.println("Emprestimo realizado no valor de R$" + this.saldoEmprestimo);
        Utils.imprimirLinhaDivisao();
    }

    public void imprimirSaldo(){
        System.out.println("------- Saldo da Conta Corrente -------");
        System.out.println("R$" + super.saldo);
        Utils.imprimirLinhaDivisao();
    }

}
