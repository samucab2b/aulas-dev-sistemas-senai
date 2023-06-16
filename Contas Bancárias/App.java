public class App {
    public static void main(String[] args) throws Exception {

        
        ContaBancaria cb = new ContaBancaria("123456", "Samuel");
        cb.depositar(100.00);
        cb.sacar(50.00);
        System.out.println(cb.saldo());
    }
}
