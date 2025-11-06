/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elfos;
import trabalhopoo.Guerreiro;

/**
 *
 * @author lucas
 */
public class Guardiao extends Guerreiro{
    
    public Guardiao(String nome, int idade, double peso) {
        super(nome, idade, peso);
        this.setAtaque(50); // mudei para 50 para testes.... 25
    }
    
}
