/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova5;

/**
 *
 * @author lucas
 */
public abstract class Disciplina {
    private String ementa, conteudo_programatico;
    private static int qtd;

    public Disciplina(String ementa, String conteudo_programatico) {
        this.ementa = ementa;
        this.conteudo_programatico = conteudo_programatico;
        Disciplina.qtd ++;
    }

    public static int getQtDisciplinas() {
        return qtd;
    }

    public String getConteudo_programatico() {
        return conteudo_programatico;
    }

    public String getEmenta() {
        return ementa;
    }
    
    public abstract String getLema();
    
    
    
}
