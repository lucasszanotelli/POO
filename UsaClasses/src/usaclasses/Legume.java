/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaclasses;

/**
 *
 * @author lucas
 */
public abstract class Legume extends Alimento{
    private Legume combinacao;
      
    public Legume(double peso, String datValidade) {
        super(peso, datValidade);
    }
    
    public void combinar(Legume nome){
        this.combinacao = nome;
    }

    public String getCombinacao(){
        return this.getNome() + " e " +this.combinacao.getNome();
    }
    
   
}
