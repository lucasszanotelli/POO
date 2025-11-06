/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova7;

/**
 *
 * @author lucas
 */
public class Popular extends Cruzada{
    private int qtd_mulheres, qtd_velhos, qtd_criancas;

    public Popular(int qtdSoldados, int qtd_mulheres, int qtd_velhos, int qtd_criancas) {
        super(qtdSoldados);
        this.qtd_mulheres = qtd_mulheres;
        this.qtd_velhos = qtd_velhos;
        this.qtd_criancas = qtd_criancas;
    }

    @Override
    public String lema() {
        return "Viver é preciso, mas faltam recursos";
    }

    @Override
    public int getForca() {
        return super.getForca() + this.qtd_mulheres *3 +this.qtd_velhos*2 + this.qtd_criancas;
    }
    
    
    
}
