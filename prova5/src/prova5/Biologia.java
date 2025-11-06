/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova5;

/**
 *
 * @author lucas
 */
public class Biologia extends Biomedicas{

    public Biologia(String ementa, String conteudo_programatico) {
        super(ementa, conteudo_programatico);
    }

    @Override
    public String getLema() {
        return "A vida é uma constante evolução";
    }
    
    @Override
    public String toString(){
        return "Biologia tem ementa = " + this.getEmenta() + " e conteúdo programático = " + this.getConteudo_programatico();
    }
    
}
