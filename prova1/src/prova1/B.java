/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public abstract class B extends Carro{
    private static int qtB = 0;
    
    public static int getQtB() {
        return qtB;
    }
     
    public B(double aceleracao,  int velocidade_maxima, double dirigibilidade, int propulsao) {
        super(aceleracao, velocidade_maxima, dirigibilidade, propulsao);
        
        B.qtB++;
    }

    
    
    
}
