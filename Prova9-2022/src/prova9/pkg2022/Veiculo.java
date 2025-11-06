/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova9.pkg2022;

/**
 *
 * @author lucas
 */
public abstract class Veiculo {
    private String fabricante;
    private int anoFabricacao;
    private int anoModelo;
    protected int cilindradas;
    protected int qtRodas;

    public Veiculo(String fabricante, int anoFabricacao, int anoModelo, int cilindradas, int qtRodas) {
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cilindradas = cilindradas;
        this.qtRodas = qtRodas;
    }

    public int getAno_fabricacao() {
        return anoFabricacao;
    }
  
    public int getAno_modelo() {
        return anoModelo;
    }
    
    public abstract int getPotencia();
    
    
}
