/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provazoologico;

/**
 *
 * @author lucas
 */
public class Mamifero extends Animal {
    private double qtLeite;

    public Mamifero(String nome, double peso, int idade, double qtLeite) {
        super(nome, peso, idade);
        this.qtLeite = qtLeite;
    }

    public double getQtLeite() {
        return qtLeite;
    }
        

    @Override
    public String comer() {
        return "Roarrrrrr";
    }

    @Override
    public String toString() {
        return super.toString() + ", além de consumir quantidade de leite igual a " + this.getQtLeite();
    }
    
}
