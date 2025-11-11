/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author lucas
 */
public class Morango extends Fruta{

    public Morango(double peso, String validade) {
        super(peso, validade, "Morango");
    }
    
    public String getNutrientes(){
        return "Potássio e Vitamina A";
    
    }
    
}
