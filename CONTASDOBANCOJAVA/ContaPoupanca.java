public class ContaPoupanca extends Conta{
    private double taxaJuros;
    private Cliente titular;

    public ContaPoupanca (int numeroConta, double saldo, int agência, Cliente titular, double taxaJuros){
        super (numeroConta, saldo, agência);
        this.taxaJuros = taxaJuros;
        this.titular = titular;
    }
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
