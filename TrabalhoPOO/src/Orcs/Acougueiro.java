/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orcs;
import trabalhopoo.Guerreiro;

/**
 *
 * @author lucas
 */
public class Acougueiro extends Guerreiro {
    //quando energia < 40, devora o warg (se tiver) e recupera 100 de energia
    
    public Acougueiro(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setEnergia(200);
        this.setAtaque(20);
    }
    
}
