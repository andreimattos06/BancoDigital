
public abstract class Conta {

    protected Agencia agencia;
    protected int conta;
    protected double saldo;

    private static int CONTA_INCREMENTAL = 1;

    public Conta(Agencia agencia){
        this.agencia = agencia;
        this.conta = CONTA_INCREMENTAL++;
        this.saldo = 0;
    }

    
    abstract void imprimirSaldo();
    abstract void efetuarEmprestimo(double valor);


    public void depositar(int valor){
        this.saldo += valor;
        System.out.println("Você depositou o valor de R$" + valor + " com sucesso!");
        System.out.println("Saldo atual de R$" + valor);
        Utils.imprimirLinhaDivisao();
        
    }

    public void sacar(int valor){
        this.saldo -= valor;
        System.out.println("Você sacou o valor de R$" + valor + " com sucesso!");
        System.out.println("Saldo atual de R$" + valor);
        Utils.imprimirLinhaDivisao();
    
    }

    public void transferir (int valor, Conta contaDestino){
        this.saldo -= valor;
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        System.out.println("Transferido R$" + valor + " da conta " + this.conta + " para a conta " + contaDestino.getConta());
        Utils.imprimirLinhaDivisao();
    }


    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}