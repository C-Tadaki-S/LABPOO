public class ContaPreferencial extends Conta{
    private double limite;
    private ClienteEspecial titular;
    
    public ContaPreferencial (int numeroConta, double saldo, int agência, ClienteEspecial titular, double limite){
        super(numeroConta, saldo, agência);
        this.limite = limite;
        this.titular = titular;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public ClienteEspecial getTitular() {
        return titular;
    }
    public void setTitular(ClienteEspecial titular) {
        this.titular = titular;
    }
}

