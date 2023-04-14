public class ContaIndividual extends Conta{
    private Cliente titular;
    public ContaIndividual(int numeroConta, double saldo, int agência, Cliente titular){
        super(numeroConta, saldo, agência);
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
