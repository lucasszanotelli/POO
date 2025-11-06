/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public class Tesla extends D{
    
    public Tesla(double aceleracao, int velocidade_maxima, 
            double dirigibilidade, int propulsao) {
        super(aceleracao, velocidade_maxima, dirigibilidade, propulsao);
    }
    
    @Override
    public double getPreco(){
        return 60000;
    }
    
}
