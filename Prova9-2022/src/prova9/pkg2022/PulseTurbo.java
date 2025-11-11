/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova9.pkg2022;

/**
 *
 * @author lucas
 */
public class PulseTurbo extends Carro {
    
    public PulseTurbo(int qtPortas, String fabricante, int anoFabricacao, int anoModelo, int cilindradas) {
        super(qtPortas, fabricante, anoFabricacao, anoModelo, cilindradas, "Vermelho", "Branco");
    }

    @Override
    public int getPotencia() {
        return super.getPotencia() + 500; 
    
    }
    
}
