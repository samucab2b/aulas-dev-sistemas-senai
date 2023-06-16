public class App {
    public static void main(String[] args) throws Exception {        
        Produto p1 = new Produto("Mouse",157.85);
        Produto p2 = new Produto("Teclado",91.99);


        p1.add(50);
        p1.remove(3);

        p2.add(71);
        p2.remove(5);

        System.out.println(p1.getNome() + ": R$" + p1.valorTotal());
        System.out.println(p2.getNome() + ": R$" + p2.valorTotal());
    }
}
