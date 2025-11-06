/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaclasses;

/**
 *
 * @author lucas
 */
public abstract class Alimento {
    private double peso;
    private String datValidade;
    private static int qt = 0;

    public Alimento(double peso, String datValidade) {
        this.peso = peso;
        this.datValidade = datValidade;
        qt++;
    }

    public double getPeso() {
        return peso;
    }

    public static int getQuantidade() {
        return qt;
    }
    

    public String getValidade() {
        return datValidade;
    }
    
    public abstract String getNome();    
    public abstract String getNutrientes();
    
    
    
}
