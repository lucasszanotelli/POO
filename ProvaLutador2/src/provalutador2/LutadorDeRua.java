/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador2;

/**
 *
 * @author lucas
 */
public class LutadorDeRua extends Lutador{

    public LutadorDeRua( double peso, int idade) {
        super("Anonimo", peso, idade);
    }

    @Override
    public void atacar(Lutador inimigo) {
        inimigo.energia -= 7;
    }
    
}
