/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador;

/**
 *
 * @author lucas
 */
public class Karateca extends Lutador{
    private String faixa;

    public Karateca(String faixa, String nome, double peso, int idade) {
        super(nome, peso, idade);
        this.faixa = faixa;
    }

  
    public String getFaixa() {
        return faixa;
    }

    
    
    @Override
    public void atacar(Lutador adversario) {
        if(this.getFaixa().equals("Branca") || this.getFaixa().equals("Amarela")){
            adversario.energia -= 5;
        }else if(this.getFaixa().equals("Preta")){
            adversario.energia -= 20;
        }else{
            adversario.energia -= 10;
        }
    }

    @Override
    public String toString() {
        return "O Karateca " + this.getNome() + " está na faixa " + this.getFaixa(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    } 
    
    
}
