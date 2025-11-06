/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author lucas
 */
public class Batata extends Legume{

    public Batata(double peso, String validade) {
        super(peso, validade, "Batata");
    }
    
    public String getNutrientes(){
        return "Cálcio, Ferro, Potássio, Fosforo e Carboidratos";
    
    }
    
}
