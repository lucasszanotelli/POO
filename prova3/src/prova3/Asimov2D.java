/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3;

/**
 *
 * @author lucas
 */
public class Asimov2D extends Soccer2D{
    
    public Asimov2D(String caminho_logo, int qtd_max_membros, int qtd_atual_membros) {
        super(caminho_logo, qtd_max_membros, qtd_atual_membros);
        
    }
    
    @Override
    public String jogar(Equipe equipe2){
        super.jogar(equipe2);
        this.desempenho_padrao ++;
        return Equipe.definirVencedor(this, equipe2);
    }
    
}
