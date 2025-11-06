/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova10;

/**
 *
 * @author lucas
 */
public abstract class Aeronave {
    private String fabricante;
    private int anoFabricacao;
    private int anoModelo;
    protected int capacidadeCarga;
    protected int qtdMisseis;

    public Aeronave(String fabricante, int anoFabricacao, int anoModelo, int capacidadeCarga, int qtdMisseis) {
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.capacidadeCarga = capacidadeCarga;
        this.qtdMisseis = qtdMisseis;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getQuantidadeMisseis() {
        return qtdMisseis;
    }
    
    
    
    
    public abstract double getCapacidadeAtaque();
    
    
}
