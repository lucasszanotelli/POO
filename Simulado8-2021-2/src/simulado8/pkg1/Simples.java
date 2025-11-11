/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado8.pkg1;

/**
 *
 * @author lucas
 */
public class Simples extends Oni{

    public Simples(String nome) {
        super(nome, 10);
    }

    @Override
    public void atacar(Oni guerreiro) {
        if(guerreiro.getClass().getSimpleName().equals("Simples")){
            guerreiro.energia -= this.getPoder();
            
        }
        if(guerreiro.energia < 0) guerreiro.energia = 0;
       
    }
    
}
