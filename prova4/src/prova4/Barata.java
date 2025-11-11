/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova4;

/**
 *
 * @author lucas
 */
public class Barata extends Zerg{

    public Barata(String colonia) {
        super(colonia);
    }
         
    public void entocar(){
        this.energia += 5;
    }
    
    @Override
    public void atacar(Raca guerreiroAtacado, int distancia) {
        if(distancia == Raca.PERTO){
            guerreiroAtacado.energia -= 25 ;
        }else if(distancia == Raca.MEDIO){
            guerreiroAtacado.energia -= 20;
        }
    
    }
}
