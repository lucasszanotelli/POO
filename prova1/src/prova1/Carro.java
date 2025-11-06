/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1;

public abstract class Carro {
    private double aceleracao, dirigibilidade;
    private int velocidade_maxima, propulsao;

    @Override
    public String toString() {
        return "Aceleracao = " + aceleracao + " Velocidade Máxima = " + velocidade_maxima + ", Dirigibilidade = " + dirigibilidade + 
                ", Propulsao = " + propulsao + '.';
    }    
    
    public Carro(double aceleracao, int velocidade_maxima, double dirigibilidade,  int propulsao) {
        this.aceleracao = aceleracao;
        this.velocidade_maxima = velocidade_maxima;
        this.dirigibilidade = dirigibilidade;  
        this.propulsao = propulsao;
    }
    
    public abstract double getPreco();
    
    
}
