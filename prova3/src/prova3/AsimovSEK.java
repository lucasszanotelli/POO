/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3;

/**
 *
 * @author lucas
 */
public class AsimovSEK extends SEK{
    
    public AsimovSEK(int qtd_robos, int qtd_max_membros, int qtd_atual_membros) {
        super(qtd_robos, qtd_max_membros, qtd_atual_membros);
    }
    
    @Override
    public String jogar(Equipe equipe2){
        super.jogar(equipe2);
        if(this.qtd_robos == 3){
            this.desempenho_padrao +=3;
               
        }
        return Equipe.definirVencedor(this, equipe2);
    }
    
}
