/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador;

/**
 *
 * @author lucas
 */
public abstract class Lutador {
    private final String nome;
    private int idade;
    private double peso;
    protected double energia;



    public Lutador(String nome, double peso, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.energia = 100;

    }

    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }

    public double getEnergia() {
        return energia;
    }



    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "O Lutador " + this.getNome() + " atualmente pesa " + this.getPeso() + ", tem " + this.getIdade() + " anos";
    }
    
    
    
    public abstract void atacar(Lutador adversario);
        
    
}
