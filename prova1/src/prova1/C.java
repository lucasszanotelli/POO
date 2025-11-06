/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public abstract class C extends Carro{
    private static int qtC;

    public C(double aceleracao, int velocidade_maxima, double dirigibilidade, int propulsao) {
        super(aceleracao, velocidade_maxima, dirigibilidade, propulsao);
        
        C.qtC++;
    }

    public static int getQtC() {
        return qtC;
    }

}
