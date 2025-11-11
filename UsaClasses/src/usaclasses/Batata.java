/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaclasses;

/**
 *
 * @author lucas
 */
public class Batata extends Legume{
    
    public Batata(double peso, String datValidade) {
        super(peso, datValidade);
    }

    @Override
    public String getNutrientes() {
        return "Cálcio, Ferro, Potássio, Fosforo e Carboidratos";
    }

    @Override
    public String getNome() {
        return "Batata";
    }
    
}
