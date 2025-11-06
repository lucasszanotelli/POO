/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulado8.pkg1;

/**
 *
 * @author lucas
 */
public abstract class Oni {
    private final String nome;
    private int poder;
    protected int energia;
    private static int qtd;
    
    public Oni(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
        this.energia = 100;
        Oni.qtd++;
    }

    
    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public int getEnergia() {
        return energia;
    }

    public static int getQt() {
        return qtd;
    }
    public abstract void atacar(Oni guerreiro);
    
    
}
