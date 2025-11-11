/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3;

/**
 *
 * @author lucas
 */
public class Mexico extends SEK{
    
    public Mexico(int qtd_robos, int qtd_max_membros, int qtd_atual_membros) {
        super(qtd_robos, qtd_max_membros, qtd_atual_membros);
        this.desempenho_padrao = 5;
    }
    
    @Override
    public String jogar(Equipe equipe2){
        super.jogar(equipe2);
        this.desempenho_padrao--;
        return Equipe.definirVencedor(this, equipe2);
    }
    
}
