/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova5;

/**
 *
 * @author lucas
 */
public class Matematica extends Exatas{

    public Matematica(String ementa, String conteudo_programatico) {
        super(ementa, conteudo_programatico);
    }
    
    public Matematica(){
        super("Numeros", "123 456");
        
    }

    @Override
    public String getLema() {
      return "No meu universo tudo é exato";

    }
    
}
