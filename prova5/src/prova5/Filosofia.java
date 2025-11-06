/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova5;

/**
 *
 * @author lucas
 */
public class Filosofia extends Humanas{

    public Filosofia(String ementa, String conteudo_programatico) {
        super(ementa, conteudo_programatico);
    }

   
    @Override
    public String getLema() {
      return "Penso logo existo";

    }
    @Override
    public String toString(){
        return "Filosofia tem ementa = " + this.getEmenta() + " e conteúdo programático = " + this.getConteudo_programatico();
    }
    
}
