/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory2;

/**
 *
 * @author Samuel
 */
public class NotificacaoSMS implements Notificacao{
    
    @Override
    public void notificarUsuario(String mensagem){
        System.out.println("Enviar a mensagem: "+ mensagem + " por SMS!");
    }
    
    
}
