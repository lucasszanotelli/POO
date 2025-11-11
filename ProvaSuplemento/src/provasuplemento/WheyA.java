/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provasuplemento;

/**
 *
 * @author lucas
 */
public class WheyA extends Whey{

    public WheyA(String codigo, String fabricante, String nome) {
        super(45.0, 5.0, codigo, fabricante, nome);
    }

    @Override
    public String obterEfeito() {
        return "Força e musculatura";
                
    }
    
}
