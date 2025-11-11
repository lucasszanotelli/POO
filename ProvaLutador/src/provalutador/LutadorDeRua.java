/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador;

/**
 *
 * @author lucas
 */
public class LutadorDeRua extends Lutador{

    public LutadorDeRua(double peso, int idade) {
        super("Anônimo", peso, idade);
    }

    @Override
    public void atacar(Lutador adversario) {
        adversario.energia -= 7;
    }
    
}
