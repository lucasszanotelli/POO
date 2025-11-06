/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador2;

/**
 *
 * @author lucas
 */
public class Karateca extends Lutador {
    private String faixa;

    public Karateca(String faixa, String nome, double peso, int idade) {
        super(nome, peso, idade);
        this.faixa = faixa;
    }

    @Override
    public void atacar(Lutador inimigo) {
        if((this.faixa.equals("Branca") )||(this.faixa.equals("Amarela"))){
            inimigo.energia -= 5;
        }else if(this.faixa.equals("Preta")){
            inimigo.energia -= 20;
        }else{
            inimigo.energia -= 10;
        }
    }

    public String getFaixa() {
        return faixa;
    }
    

    @Override
    public String toString() {
        return "O Karateca " + this.getNome() + " está na faixa " + this.getFaixa();
    }
    
}
