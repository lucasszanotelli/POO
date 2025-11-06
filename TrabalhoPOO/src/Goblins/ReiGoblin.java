/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Goblins;

import trabalhopoo.Arena;
import trabalhopoo.Guerreiro;

import java.util.LinkedList;
import java.util.List;


public class ReiGoblin extends Guerreiro {
    //não consegue montar!!!
    private static boolean criado = false;

    public ReiGoblin(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setAtaque(100);
        this.setEnergia(300);
        if (criado) {
            throw new IllegalStateException("Só pode existir um Rei Goblin!");
        }
        criado = true;
    }


    public void convocarGoblins(List<Guerreiro> Lado1, List<Guerreiro> GoblinsMortos) {
        LinkedList<Guerreiro> mortos = Arena.getGoblinsMortos();
        
        if(mortos.isEmpty()){
            System.out.print("Nenhum goblin a ser ressucitado");
            return;
        }
        System.out.println("Ressucitando goblins....");
        for(Guerreiro guerreiro : mortos){
            guerreiro.setEnergia(50);
            Arena.getLado1().addLast(guerreiro); //adiciona na última posicão do lado 1]
            System.out.println(guerreiro.getNome() + " foi revivido");    

        }
        mortos.clear();
        
    }

    @Override
    public void morrer() {
        System.out.print("O Rei Goblin Morreu");
        super.morrer(); 
        convocarGoblins(Arena.getLado1(), Arena.getGoblinsMortos());
    }
    
}
