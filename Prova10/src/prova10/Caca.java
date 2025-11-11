/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova10;

/**
 *
 * @author lucas
 */
public class Caca extends Aeronave {
    private double avionica;

    public Caca(String fabricante, int anoFabricacao, int anoModelo, int capacidadeCarga, int qtdMisseis, int avionica) {
        super(fabricante, anoFabricacao, anoModelo, capacidadeCarga, qtdMisseis);
        this.avionica = avionica;
    }
    public Caca(String fabricante, int anoFabricacao, int anoModelo, int capacidadeCarga) {
        super(fabricante, anoFabricacao, anoModelo, capacidadeCarga, 4);
        this.avionica = 3;
    }

    public double getAvionica() {
        return avionica;
    }

    @Override
    public double getCapacidadeAtaque() {
        return (this.capacidadeCarga * avionica)/this.qtdMisseis;

    }
    
    
    
}
