/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo;

/**
 *
 * @author lucas
 */
public abstract class Guerreiro {
    private String nome;
    private int idade;
    private double peso;
    private int energia;
    private boolean estaEnvenenado;
    private int ataque;

    public Guerreiro(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.energia = 100;
        this.estaEnvenenado = false;

    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public int getEnergia(){
        return energia;
    }
    
    public int getAtaque() {
        return ataque;
    }

    
    public boolean estaVivo(){
        return energia > 0;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setEstaEnvenenado(boolean estaEnvenenado) {
        this.estaEnvenenado = estaEnvenenado;
    }

    public boolean isEstaEnvenenado() {
        return estaEnvenenado;
    }

    public void receberDano(Guerreiro inimigo){
        this.energia -= inimigo.ataque;

        if(this.energia <= 0){
            this.morrer();
            this.energia = 0;
        }
    }
    
    public void atacar(Guerreiro inimigo){
        inimigo.receberDano(this);
    }

        

    public void morrer(){
        //retirado da fila
        System.out.println(this.getNome() + ", um " + this.getClass().getSimpleName() + " morreu");
        Arena.removeGuerreiro(this);
        
    }
}
