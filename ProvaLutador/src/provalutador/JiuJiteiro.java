/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador;

/**
 *
 * @author lucas
 */
public class JiuJiteiro extends Lutador {
    private String academia;
    private static int qtd;

    public JiuJiteiro(String academia, String nome, double peso, int idade) {
        super(nome, peso, idade);
        this.academia = academia;
        qtd++;
    }

    public String getAcademia() {
        return academia;
    }
    public static int getQt() {
        return qtd;
    }
    

    @Override
    public String toString() {
        return super.toString() + " e luta na academia " + this.getAcademia();
    }

    @Override
    public void atacar(Lutador adversario) {
        adversario.energia -= this.getPeso()/5;
    }
    
}
