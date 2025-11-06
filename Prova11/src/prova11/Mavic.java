/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova11;

/**
 *
 * @author lucas
 */
public class Mavic extends DroneVoador{
    private double resolucao;
    
    public Mavic(double autonomia, double resolucao, int numSerie, int anoFabricacao) {
        super(autonomia, numSerie, anoFabricacao);
        this.resolucao = resolucao;
    }

    public double getResolucaoVisual() {
        return resolucao;
    }

    public void setResolucaoVisual(double resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public double getValor() {
        return super.getValor() + resolucao/10;
    }    
    
    
}
