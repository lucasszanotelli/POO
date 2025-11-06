/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provazoologico;

/**
 *
 * @author lucas
 */
public abstract class Animal {
    private final String nome;
    private double peso;
    private int idade;

    public Animal(String nome, double peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }
    
       
    public abstract String comer(); 

    @Override
    public String toString() {
        return "O(a) " + this.getClass().getSimpleName() + " de nome " + this.getNome() + " possui peso igual a " + this.getPeso() +
                " e idade igual a " + this.getIdade();
    }
    
    
    
}


