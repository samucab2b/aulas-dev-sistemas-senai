package strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PaymentStrategy{
    
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
     private String number;
     private String date;
     private String cvv;
    
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Pagando " + paymentAmount + " usando Cartão de Credito.");
            //faz o desconto
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void paymentDetails() {
        try {
            System.out.print("Informe o número do cartão: ");
            String number = reader.readLine();
            System.out.print("Informe o vencimento do cartão 'mm/yy': ");
            String date = reader.readLine();
            System.out.print("Informe código CVV: ");
            String cvv = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private boolean cardIsPresent(){
        return this.number != null && this.cvv != null && this.date != null;
    }
    
}
