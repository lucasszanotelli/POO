/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provasuplemento;

/**
 *
 * @author lucas
 */
public class WheyB extends Whey{

    public WheyB(double qtdCarbo, String codigo, String fabricante, String nome) {
        super(30.0, qtdCarbo, codigo, fabricante, nome);
    }

    @Override
    public String obterEfeito() {
        if((this.qtdProteina/this.qtdCarbo)>5){
            return "Força e musculatura quase tão boa quanto WheyA";
        }
        return "Um pouco de força e musculatura, mas nem tanto assim";
    }
    
}
