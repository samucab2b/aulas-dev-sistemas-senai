package strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.InputStreamReader;

public class PayByPayPal implements PaymentStrategy{
   
    private String email;
    private String password;
    private boolean autenticado;
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    static {
        DATA_BASE.put("123456789", "samuel@email.com");
    }
    
    @Override
    public boolean pay(int paymentAmount) {
       if (autenticado) {
            System.out.println("Pagando " + paymentAmount + " usando PayPal.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void paymentDetails() {
         try {
            while (!this.autenticado) {
                System.out.print("Informe um email email: ");
                email = reader.readLine();
                System.out.print("Insira a senha: ");
                password = reader.readLine();
                if (verify()) {
                    System.out.println("Autenticação feita com sucesso.");
                } else {
                    System.out.println("Senha ou usuário incorreto!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
     private boolean verify() {
        this.autenticado = email.equals(DATA_BASE.get(password));
        return this.autenticado;
    }
}
