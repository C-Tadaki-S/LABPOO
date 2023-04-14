public class ClienteEspecial extends Cliente{

    public ClienteEspecial (String nome, String cpf, String endereco, String rg){
        super(nome, cpf, endereco, rg);
    }
    public ContaPreferencial abrirContaPreferencial(int numeroConta, double saldo, int agência, Cliente titular, double limite){
        return new ContaPreferencial(numeroConta, saldo, agência, titular, limite);
    }
    
}
