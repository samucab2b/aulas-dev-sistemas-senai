public class ContaBancaria {

    private String numeroConta;
    private String titular;

    private Double saldo;

    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public Double saldo(){
        return this.saldo;
    }

    public Double depositar(Double valor){
        this.saldo += valor;
        return this.saldo;
    }

    public boolean sacar(Double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }

        return false;
    }

}
