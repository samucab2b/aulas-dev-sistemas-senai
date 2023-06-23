public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int agencia, int numero, String cliente){
        super(agencia, numero, cliente);
    }
    
    public void juros(Double juros){
        super.depositar(super.getSaldo()*juros);
    }
}