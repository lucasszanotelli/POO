/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado8.pkg1;

/**
 *
 * @author lucas
 */
public class LuaInferior extends Oni{

    public LuaInferior(String nome, int poder) {
        super(nome, poder);
        this.energia = 200;
    }

    @Override
    public void atacar(Oni guerreiro) {
        switch (guerreiro.getClass().getSimpleName()) {
            case "Simples" -> guerreiro.energia -= this.getPoder();
            case "LuaInferior" -> guerreiro.energia -= this.getPoder()/2;
            default -> guerreiro.energia -= this.getPoder()* 0.1;
        }
        if(guerreiro.energia < 0) guerreiro.energia = 0;
    }
    
}
