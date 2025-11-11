/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public abstract class D extends Carro{
    private static int qtD = 0;

    public D(double aceleracao, int velocidade_maxima, double dirigibilidade, int propulsao) {
        super(aceleracao, velocidade_maxima, dirigibilidade,  propulsao);
        
        D.qtD++;
        
    }

    public static int getQtD() {
        return qtD;
    }
    
    
}
