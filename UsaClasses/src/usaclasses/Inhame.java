/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaclasses;

/**
 *
 * @author lucas
 */
public class Inhame extends Legume{
    
    public Inhame(double peso, String datValidade) {
        super(peso, datValidade);
    }

    @Override
    public String getNutrientes() {
        return "Ferro, Proteína e Fibras";
    }

    @Override
    public String getNome() {
       return "Inhame";
    }
    
}
