public class Agencia {
    private static int NUMERO_INCREMENTAL = 15;

    private String cidade;
    private String nome;
    private int numero;


    public Agencia(String cidade, String nome) {
        this.cidade = cidade;
        this.nome = nome;
        this.numero = NUMERO_INCREMENTAL++;

    }

    public void imprimirInformacoesAgencia(){
        Utils.imprimirLinhaDivisao();
        System.out.println(" ---- Dados da Agencia ----");
        System.out.println("Agência localizada em " + this.cidade);
        System.out.println("Nomeada de " + nome);
        System.out.println("Com o seguinte número " + numero);
        Utils.imprimirLinhaDivisao();
    }

    public static int getNUMERO_INCREMENTAL() {
        return NUMERO_INCREMENTAL;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    
}
