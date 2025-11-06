/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author lucas
 */
public abstract class Legume extends Alimento{
    private Legume combinado;
    
    public Legume(double peso, String validade, String nome) {
        super(peso, validade, nome);
    }
    
    public void combinar(Legume nome){
        this.combinado = nome;
    }
    public String getCombinacao(){
        return this.getNome() + " e " +this.combinado.getNome();
    }
    
}
