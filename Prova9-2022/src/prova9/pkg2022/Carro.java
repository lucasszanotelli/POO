/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova9.pkg2022;

/**
 *
 * @author lucas
 */
public class Carro extends Veiculo{
    private int qtPortas;
    private String corCarroceria;
    private String corTeto;

    public Carro(int qtPortas, String fabricante, int anoFabricacao, int anoModelo, int cilindradas, String corCarroceria, String corTeto) {
        super(fabricante, anoFabricacao, anoModelo, cilindradas, 4); // 4 = qtRodas
        this.qtPortas = qtPortas;
        this.corCarroceria = corCarroceria;
        this.corTeto = corTeto;
    }

    @Override
    public int getPotencia() {
        return this.cilindradas * qtPortas/4;
        
    }
    
}
