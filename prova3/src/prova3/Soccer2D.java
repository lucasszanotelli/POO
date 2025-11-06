/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3;

/**
 *
 * @author lucas
 */
public abstract class Soccer2D extends Equipe{
    private String caminho_logo;
    
    public Soccer2D(String caminho_logo, int qtd_max_membros, int qtd_atual_membros) {
        super(qtd_max_membros, qtd_atual_membros);
        this.caminho_logo = caminho_logo;
    }
    
    
}
