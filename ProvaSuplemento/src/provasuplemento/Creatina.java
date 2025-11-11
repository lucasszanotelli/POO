/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provasuplemento;

/**
 *
 * @author lucas
 */
public class Creatina extends Suplemento{
    private int qtdArginina;
    private int qtdGlicina;
    private int qtdMetionina;

    public Creatina(String codigo, String fabricante, String nome, int qtdArginina, int qtdGlicina, int qtdMetionina) {
        super(codigo, fabricante, nome);
        this.qtdArginina = qtdArginina;
        this.qtdGlicina = qtdGlicina;
        this.qtdMetionina = qtdMetionina;
    }
    
    public int obterPureza(){
        return (this.qtdArginina*10 + this.qtdGlicina*5 + this.qtdMetionina);  
    }

    @Override
    public String obterEfeito() {
       return "Energia para células musculares" ;
    }
    
    
}
