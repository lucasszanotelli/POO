/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

/**
 *
 * @author lucas
 */
public class Survolt extends B{
    
    public Survolt(double aceleracao,  int velocidade_maxima, double dirigibilidade, int propulsao) {
        super(aceleracao, velocidade_maxima, dirigibilidade, propulsao);
    }
    
    @Override
    public double getPreco(){
        return 150000;
    }
    
}
