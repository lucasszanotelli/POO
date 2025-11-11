/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova7;

/**
 *
 * @author lucas
 */
public abstract class Cruzada {
    private int qtdSoldados;
    private static int qtd_cruzadas = 0;
    
    public abstract String lema();
    
    public int getForca(){
        return this.qtdSoldados *10;
        
    }

    public static int getQt_Cruzada() {
        return qtd_cruzadas;
    }
    

    public Cruzada(int qtdSoldados) {
        this.qtdSoldados = qtdSoldados;
        Cruzada.qtd_cruzadas ++;
    }
    
        
    
}
