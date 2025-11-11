/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

/**
 *
 * @author lucas
 */
public abstract class Alimento {
    private double peso;
    private String validade;
    private String nome;
    
    private static int qtd = 0;
    
    public Alimento(double peso, String validade, String nome){
        this.peso = peso;
        this.validade = validade;
        this.nome = nome;
        
        Alimento.qtd++;
    }
    public double getPeso(){
        return peso;
    }
    public String getValidade(){
        return validade;
    }
    public String getNome(){
        return nome;
    }
    public static int getQuantidade(){
        return Alimento.qtd;
    }
    public abstract String getNutrientes();
    
    
}
