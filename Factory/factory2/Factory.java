package factory2;

public class Factory {

    public static void main(String[] args) throws Exception {
      
        Notificacao n = NotificacaoFactory.enviarNotificacao("SMS");
        
        n.notificarUsuario("Olá, você está aprendendo FACTORY");       
    }    
}