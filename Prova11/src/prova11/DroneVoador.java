/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova11;

/**
 *
 * @author lucas
 */
public class DroneVoador extends Drone {
    private final double autonomia;

    public DroneVoador(double autonomia, int numSerie, int anoFabricacao) {
        super(numSerie, anoFabricacao);
        this.autonomia = autonomia;
    }

    public double getAutonomiaVoo() {
        return autonomia;
    }
     
    

    @Override
    public double getValor() {
        double valor = this.autonomia * this.getNumSerie();
        valor = valor / this.getAnoFabricacao();
        return  valor;
    }
    
}
