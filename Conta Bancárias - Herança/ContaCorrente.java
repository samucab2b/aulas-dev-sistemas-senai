public class ContaCorrente extends Conta{
    
    private Double taxa;
    
    public ContaCorrente(int agencia, int numero, String cliente, Double taxa){
        super(agencia, numero, cliente);
        this.taxa = taxa;
    }
    
    public void taxar(){
        super.sacar(this.taxa);
    }
    
}
