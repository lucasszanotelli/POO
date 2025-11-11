 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3;

/**
 *
 * @author lucas
 */
public abstract class Equipe {
    private int qtd_max_membros;
    private int qtd_atual_membros;
    protected int desempenho_padrao = 1;
    private int qtd_partidas_disputadas = 0;

    public Equipe(int qtd_max_membros, int qtd_atual_membros) {
        this.qtd_max_membros = qtd_max_membros;
        this.qtd_atual_membros = qtd_atual_membros;
    }

    public int getDesempenho() {
        return desempenho_padrao;
    }
    public String jogar(Equipe equipe2){
        this.qtd_partidas_disputadas++;
        equipe2.qtd_partidas_disputadas++;
        return "";
    }   

    protected static String definirVencedor(Equipe equipe1, Equipe equipe2) {
        double valorEQuipe1 = Math.random();
        double valorEquipe2 = Math.random();
        if ((valorEQuipe1 * equipe1.getDesempenho()) > valorEquipe2 * equipe2.getDesempenho()) {
            return equipe1.getClass().getSimpleName() + " VENCEU " + equipe2.getClass().getSimpleName();
        } else {
            return equipe1.getClass().getSimpleName() + " PERDEU para " + equipe2.getClass().getSimpleName();
        }

    }
}
