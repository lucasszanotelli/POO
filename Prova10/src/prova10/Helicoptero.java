/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova10;

/**
 *
 * @author lucas
 */
public abstract class Helicoptero extends Aeronave{
    private int qtdHelice;
    private int potenciaMotor;

    public Helicoptero(String fabricante, int anoFabricacao, int anoModelo, int capacidadeCarga, int qtdMisseis, int qtdHelice, int potenciaMotor) {
        super(fabricante, anoFabricacao, anoModelo, capacidadeCarga, qtdMisseis);
        this.qtdHelice = qtdHelice;
        this.potenciaMotor = potenciaMotor;
    }

    public int getQuantidadeHelices() {
        return qtdHelice;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }
    
    

    @Override
    public double getCapacidadeAtaque(){
        return (qtdHelice * potenciaMotor *2)/this.qtdMisseis;
    }
    
    
    
}
