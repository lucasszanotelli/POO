/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova9.pkg2022;

/**
 *
 * @author lucas
 */
public class Moto extends Veiculo{
    private String cor;

    public Moto( String cor, String fabricante, int anoFabricacao, int anoModelo, int cilindradas, int qtRodas) {
        super(fabricante, anoFabricacao, anoModelo, cilindradas, qtRodas);
        this.cor = cor;
    }
    public Moto(String fabricante, int anoFabricacao, int anoModelo, int cilindradas, int qtRodas) {
        super(fabricante, anoFabricacao, anoModelo, cilindradas, qtRodas);
        this.cor = "Incolor";
    }

    @Override
    public int getPotencia() {
        return this.cilindradas / this.qtRodas;
    }

    public String getCor() {
        return cor;
    }
    
}
