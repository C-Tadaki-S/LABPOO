public class Conta{
    private int numeroConta;
    private int agência;
    private double saldo;
    //aqui o dono da conta;
   


    //Construtor da conta;
    public Conta(int numeroConta, double saldo, int agência){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agência = agência;
        
    }

    //getters and setters;
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getAgência() {
        return agência;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setAgência(int agência) {
        this.agência = agência;
    }

    //métodos específicos.
}
