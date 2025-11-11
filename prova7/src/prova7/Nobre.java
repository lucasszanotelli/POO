/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova7;

/**
 *
 * @author lucas
 */
public class Nobre extends Cruzada{
    private int qtd_nobre, qtd_nao_nobre;

    public Nobre(int qtdSoldados, int qtd_nobre ) {
        super(qtdSoldados);
        this.qtd_nobre = qtd_nobre;
        this.qtd_nao_nobre = qtdSoldados - qtd_nobre;
    }

    @Override
    public String lema() {
        return "Cruzada forte tem de ter nobres";
    }

    @Override
    public int getForca() {
        return this.qtd_nao_nobre*10 + this.qtd_nobre*20;
    }
    
}
