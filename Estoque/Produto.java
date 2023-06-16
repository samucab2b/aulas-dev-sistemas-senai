public class Produto {

    private String nome;
    private Double valorUnitario;
    private int quantidade;

    public Produto(String nome, Double valor){
        this.nome = nome;
        this.valorUnitario = valor;
    }

    public void add(int quantidade){
        this.quantidade += quantidade;
    }

    public boolean remove(int quantidade){
        if(this.quantidade >= quantidade){
            this.quantidade -= quantidade;
            return true;
        }

        return false;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public Double valorTotal(){
        return this.quantidade * this.valorUnitario;
    }

    public String getNome(){
        return this.nome;
    }

}
