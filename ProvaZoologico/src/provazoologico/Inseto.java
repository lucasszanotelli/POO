/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provazoologico;

/**
 *
 * @author lucas
 */
public abstract class Inseto extends Animal {    
    private static int sequencial = 1;
   
    public Inseto(double peso, int idade) {
        super( String.valueOf(sequencial),peso, idade);
        Inseto.sequencial++;
    }

    public static int getSequencial() {
        return sequencial;
    }
    
    

    


    
}
