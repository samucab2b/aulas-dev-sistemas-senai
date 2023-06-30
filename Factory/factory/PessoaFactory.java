/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Samuel
 */
public class PessoaFactory {
    
    public static Pessoa getPessoa(String nome, String sexo) throws Exception{
        if(sexo.equals("M"))return new Homem(nome);
        if(sexo.equals("F"))return new Mulher(nome);
        
        throw new Exception("Não suportado");
    }
    
}
