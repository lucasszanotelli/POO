/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3;

/**
 *
 * @author lucas
 */
public abstract class SEK extends Equipe{
    protected int qtd_robos;
    
    public SEK(int qtd_robos, int qtd_max_membros, int qtd_atual_membros) {
        super(qtd_max_membros, qtd_atual_membros);
        this.qtd_robos = qtd_robos;
    }
    
}
