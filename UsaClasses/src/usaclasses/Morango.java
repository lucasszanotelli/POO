/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaclasses;

/**
 *
 * @author lucas
 */
public class Morango extends Fruta {
    
    public Morango(double peso, String datValidade) {
        super(peso, datValidade);
    }

    @Override
    public String getNutrientes() {
        return "Potássio e Vitamina A";
    }

    @Override
    public String getNome() {
        return "Morango";
    }
    
}
