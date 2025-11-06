/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Goblins;
import trabalhopoo.Arena;
import trabalhopoo.Guerreiro;

public class Comum extends Guerreiro {
    //não consegue montar!!!! 
    
    public Comum(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(50);// energia = 50. Pensar no parâmetro ataque
        this.setAtaque(10); 
    }

    @Override
    public void morrer() {
        Arena.adicionarGoblinMorto(this);
        super.morrer(); 
    }
    
    
    
}

