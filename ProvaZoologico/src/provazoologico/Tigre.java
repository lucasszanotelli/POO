/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provazoologico;

/**
 *
 * @author lucas
 */
public class Tigre extends Mamifero{
    
    public Tigre(String nome, double peso, int idade, double qtLeite) {
        super(nome, peso, idade, qtLeite);
    }
    
    public Tigre acasalar(Tigre tigre){
        String nome = this.getNome() + tigre.getNome();
        return new Tigre (nome, 10, 0, 10);  
    }
    
    
    
}
