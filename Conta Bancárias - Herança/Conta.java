public abstract class Conta {
    
    private Double saldo;
    //protected Double saldo;
    private int agencia;
    private String cliente;
    private int conta;
    
    public Conta(int agencia, int conta, String cliente){
        this.saldo = 0.0;
        this.agencia = agencia;
        this.conta = conta;
        this.cliente = cliente;        
    }
    
    public boolean depositar(Double valor){
        this.saldo =+ valor;
        return true;
    }
    
    public boolean sacar(Double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            
            return true;
        }
        
        return false;
    }
    
    public Double getSaldo(){
        return this.saldo;
    }
}
