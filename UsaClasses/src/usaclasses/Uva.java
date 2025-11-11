/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaclasses;

/**
 *
 * @author lucas
 */
public class Uva extends Fruta{
    
    public Uva(double peso, String datValidade) {
        super(peso, datValidade);
    }

    @Override
    public String getNutrientes() {
        return "Cobre e Vitamina K";
    }

    @Override
    public String getNome() {
        return "Uva";
    }
    
}
