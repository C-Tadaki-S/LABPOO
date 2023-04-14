public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String rg;

    public Cliente(String nome, String cpf, String endereco, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getRg() {
        return rg;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public Conta criarConta(String tipoConta, double saldoInicial, int numeroConta, int agência) {
        Conta conta = null;

    switch (tipoConta) {
        case "individual":
            conta = new ContaIndividual(numeroConta, saldoInicial, agência, this);
            break;
        case "conjunta": // Não estou conseguindo montar essa parte direito
            Cliente[] titulares = new Cliente[1];
            titulares[0] = this;
            ((Object) System.out).ln("forneça o outro cliente da conta");
            titulares[1] = new Cliente();
            conta = new ContaConjunta(numeroConta, saldoInicial, agência, this, titulares);
            break;
        case "poupanca":
            conta = new ContaPoupanca(numeroConta, saldoInicial, args[0], this);
            break;
        default:
            System.out.println("Erro: tipo de conta inválido.");
            break;
    }
}
