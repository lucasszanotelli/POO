/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador2;

/**
 *
 * @author lucas
 */
public abstract class Lutador {
    private final String nome;
    private double peso;
    private int idade;
    protected double energia;

    public Lutador(String nome, double peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.energia = 100;
    }

    public double getEnergia() {
        return energia;
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

    @Override
    public String toString() {
        return "O Lutador "+ this.getNome() + ", pesa " + this.getPeso() + ", tem " + this.getIdade() + " anos";
    }
    
    public abstract void atacar(Lutador inimigo);
    
    
}
