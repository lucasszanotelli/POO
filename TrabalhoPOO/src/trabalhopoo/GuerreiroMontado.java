/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo;


public abstract class GuerreiroMontado extends Guerreiro{
    
    private Guerreiro montaria;
    
    public GuerreiroMontado(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }
    
    public Guerreiro getMontaria() {
        return montaria;
    }

    public void setMontaria(Guerreiro montaria) {
        this.montaria = montaria;
    }
    
}
