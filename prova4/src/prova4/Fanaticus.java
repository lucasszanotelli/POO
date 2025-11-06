/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova4;

/**
 *
 * @author lucas
 */
public class Fanaticus extends Proton{

    public Fanaticus(int numeroSerie) {
        super(numeroSerie);
    }

    @Override
    public void atacar(Raca guerreiroAtacado, int distancia) {
        if(distancia == Raca.PERTO){
            guerreiroAtacado.energia -= 40;
        }
    }
    
}
