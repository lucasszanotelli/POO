/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado8.pkg1;

/**
 *
 * @author lucas
 */
public class LuaSuperior extends Oni{

    public LuaSuperior(String nome, int poder) {
        super(nome, poder);
        this.energia = 300;
    }

    @Override
    public void atacar(Oni guerreiro) {
        if(guerreiro.getClass().getSimpleName().equals("LuaSuperior")){
            guerreiro.energia = this.getPoder();
        }else{
            guerreiro.energia = 0;
        }
        if(guerreiro.energia < 0) guerreiro.energia = 0;
        
    }
    
}
