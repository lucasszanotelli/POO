/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova11;

/**
 *
 * @author lucas
 */
public abstract class Drone {
    protected final int numSerie;
    protected final int anoFabricacao;

    public Drone(int numSerie, int anoFabricacao) {
        this.numSerie = numSerie;
        this.anoFabricacao = anoFabricacao;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }



    public abstract double getValor();

    @Override
    public String toString() {
        return numSerie + " (Numero de Serie)" + anoFabricacao + " (Ano fabricacao)";
    }
           

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Drone other = (Drone) obj;
        return this.numSerie == other.numSerie;
    }
    
    
    
}
