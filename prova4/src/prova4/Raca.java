/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova4;

/**
 *
 * @author lucas
 */
public abstract class Raca {
    protected int energia;
    
    public static final int PERTO = 0;
    public static final int MEDIO = 0;
    public static final int LONGE = 0;


    public abstract void atacar(Raca gerreiro, int distancia);
    
    public int getEnergia() {
        return energia = 100;
    }
    
}
