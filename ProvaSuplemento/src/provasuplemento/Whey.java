/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provasuplemento;

/**
 *
 * @author lucas
 */
public abstract class Whey extends Suplemento{
    protected double qtdProteina;
    protected double qtdCarbo;

    public Whey(double qtdProteina, double qtdCarbo, String codigo, String fabricante, String nome) {
        super(codigo, fabricante, nome);
        this.qtdProteina = qtdProteina;
        this.qtdCarbo = qtdCarbo;
    }
    
    
}
