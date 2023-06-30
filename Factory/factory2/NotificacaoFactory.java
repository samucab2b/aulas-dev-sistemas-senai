/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory2;

/**
 *
 * @author Samuel
 */
public class NotificacaoFactory {
    
    public static Notificacao enviarNotificacao(String canal){
        if(canal.equalsIgnoreCase("SMS")) return new NotificacaoSMS();
        if(canal.equalsIgnoreCase("EMAIL")) return new NotificacaoEmail();
        if(canal.equalsIgnoreCase("PUSH")) return new NotificacaoPush();
        
        
        throw new IllegalArgumentException("Canal desconhecido");
    }
    
}
