public class ContaConjunta extends Conta{
    Cliente[] titulares;
    public ContaConjunta(int numeroConta, double saldo, int agência, Cliente[]titulares){
        super (numeroConta, saldo, agência);
        this.titulares = titulares;
    }
    public Cliente[] getTitulares(){
        return titulares;
    }
    public void setTitulares(Cliente[] titulares) {
        this.titulares = titulares;
    }
}
