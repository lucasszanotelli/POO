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
public class SrFeras extends Guerreiro{
    //não monta warg, mas cria um para cada inimigo que mata e se insere atrás delas
    
    public SrFeras(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setAtaque(50);
        this.setAtaque(400);
    }
    
}
