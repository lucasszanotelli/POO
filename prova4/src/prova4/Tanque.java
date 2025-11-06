/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova4;

/**
 *
 * @author lucas
 */
public class Tanque extends Humano{
    private static int qtd = 0;

    public Tanque(String nome, String unidade) {
        super(nome, unidade);
        Tanque.qtd ++;
    }

    @Override
    public void atacar(Raca guerreiroAtacado, int distancia) {
        guerreiroAtacado.energia -= 30;
    
    }

    public static int getQt() {
        return qtd;
    }

   
    
    
}
