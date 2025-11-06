/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo;

import java.util.Random;
import java.util.LinkedList;

public class Arena {
    private int round;
    private Guerreiro ultimoGuerreiroMorto;
    private Guerreiro matouUltimo;
    private Random random = new Random();
    
    private static LinkedList<Guerreiro> Lado1 = new LinkedList<>();
    private static LinkedList<Guerreiro> Lado2 = new LinkedList<>();
    
    // armazenar uma lista de goblins mortos
    private static LinkedList<Guerreiro> GoblinsMortos = new LinkedList<>(); 
    
    public static void adicionarGoblinMorto(Guerreiro goblins) {
        GoblinsMortos.add(goblins);
    }

    public static LinkedList<Guerreiro> getGoblinsMortos() {
        return GoblinsMortos;
    }

    public static LinkedList<Guerreiro> getLado1() {
        return Lado1;
    }

    public static LinkedList<Guerreiro> getLado2() {
        return Lado2;
    }

    static {
        Lado1 = LerArquivo.lerArquivo("src/Arquivos/orcs_goblins.txt", 1);
        Lado2 = LerArquivo.lerArquivo("src/Arquivos/elfos_anoes.txt", 2);
    }

    private void mostrarGuerreiroVelho() {
        //Printar o guerreiro mais velho
        Guerreiro guerreiroVelho = Lado1.getFirst();
        for (Guerreiro guerreiro : Lado1) {
            if (guerreiro.getIdade() > guerreiroVelho.getIdade()) {
                guerreiroVelho = guerreiro;
            }
        }
        
        for (Guerreiro guerreiro : Lado2) {
            if (guerreiro.getIdade() > guerreiroVelho.getIdade()) {
                guerreiroVelho = guerreiro;
            }
        }
        System.out.println("\n+++ IMPRESSÃO DO GUERREIRO MAIS VELHO +++");
        System.out.println("c)");
        
        //getSimpleName() retorna o nome da classe
        System.out.println("O "+guerreiroVelho.getClass().getSimpleName()+" "+guerreiroVelho.getNome()+" é o mais velho e tem "+guerreiroVelho.getIdade()+" anos");
    }
    
    private void somarPesos() {
        //Somar o peso dos lados
        double pesoLado1 = 0;
        double pesoLado2 = 0;
        for (Guerreiro guerreiro: Lado1){
            pesoLado1 += guerreiro.getPeso();  
        }
        for (Guerreiro guerreiro: Lado2){
            pesoLado2 += guerreiro.getPeso();
            
        }
        System.out.println("\n+++ IMPRESSÃO DOS PESOS DAS FILAS +++");
        System.out.println("b)");
        System.out.println("    Elfos e Anoes pesam: " + pesoLado1);
        System.out.println("    Orcs e Goblins pesam: " + pesoLado2);
    }
    
        private void printarLados() {
       // Printar os lados
       System.out.println("\n+++ IMPRESSÃO DAS FILAS +++");
       System.out.println("a)");
        System.out.println("LADO 1:");
        
        for (Guerreiro guerreiro : Lado1) {
            System.out.println("        " + guerreiro.getNome() + ", "+ guerreiro.getIdade() + "anos " + ", " + guerreiro.getPeso() + " kilos.");
        }
        
        System.out.println("LADO 2:");
        for (Guerreiro guerreiro : Lado2) {
            System.out.println("        " + guerreiro.getNome() + ", "+ guerreiro.getIdade() + "anos " + ", " + guerreiro.getPeso() + " kilos.");
        }
    }
        
        
    public void exibirFila(LinkedList<Guerreiro> fila, String nomeLado) {
        System.out.println("\nEstado atual da fila de " + nomeLado + ":");

        if (fila.isEmpty()) {
            System.out.println(" Nenhum guerreiro restante.");
            return;
        }

        for (Guerreiro g : fila) {
            String status = g.estaVivo() ? " VIVO" : " MORTO";
            System.out.printf("   %-20s | Energia: %-3d | %s\n", g.getNome(), g.getEnergia(), status);
        }
    }    
 
    
    public void batalhar(LinkedList<Guerreiro> Lado1, LinkedList<Guerreiro> Lado2){
        int round = 1;
        
        while((!Lado1.isEmpty())&&(!Lado2.isEmpty())){
            System.out.println("\n===== ROUND " + round + " =====");
            
            exibirFila(Lado1, "Lado 1");
            exibirFila(Lado2, "Lado 2");
            
            boolean primeiroLado1 = random.nextBoolean();
            if(primeiroLado1){
                System.out.println("Lado 1 (Orcs e Goblins) ataca primeiro!");
                processarAtaque(Lado1, Lado2);
                processarAtaque(Lado2, Lado1);
                
            }else{
                System.out.println("Lado 2 (Elfos e Anões) ataca primeiro!");
                processarAtaque(Lado2, Lado1);
                processarAtaque(Lado1, Lado2);                
            }
            round +=1;
            rotacionarFilas(Lado1);
            rotacionarFilas(Lado2);
        }
    }
    
    private void processarAtaque(LinkedList<Guerreiro> atacantes, LinkedList<Guerreiro> atacados){
        
        if(atacados.isEmpty()){
            System.out.println("A fila de ATACADOS está vazia");
            return;
        }
        if(atacantes.isEmpty()){
            System.out.println("A fila de ATACANTES está vazia");
            return;
        }

        Guerreiro atacante = atacantes.getFirst();
        Guerreiro alvo = atacados.getFirst();

        if(alvo.estaVivo()){
            System.out.println(atacante.getNome() + " ataca " + alvo.getNome());
            atacante.atacar(alvo);
        }
        if(!alvo.estaVivo()){
            System.out.println(alvo.getNome() + " morreu");
            ultimoGuerreiroMorto = alvo;  
            matouUltimo = atacante;

        }
           
        
    }
    
    private void rotacionarFilas(LinkedList<Guerreiro> lado) {
        if (lado.size() > 1) {
            Guerreiro primeiro = lado.removeFirst();
            lado.addLast(primeiro);
        }
    }
    
    public static void removeGuerreiro(Guerreiro guerreiro){
        if(Lado1.contains(guerreiro)){
            Lado1.remove(guerreiro);
        }else{
            Lado2.remove(guerreiro);
        }
        System.out.println(guerreiro.getNome() + " foi removido da fila");
        
    }
    
    public void ultimoGuerreuroMorto(Guerreiro ultimoGuerreiro, Guerreiro matouUltimo){
        System.out.println("\n\n+++ ULTIMO GUERREIRO MORTO +++");
        System.out.println("O último Guerreiro Morto foi o " + ultimoGuerreiro.getNome());
        System.out.println("O Guerreiro " + matouUltimo.getNome() + " transferiu o ultimo ataque");
        
        
    }

    
    public void Jogo() {
        printarLados();
        somarPesos();
        mostrarGuerreiroVelho();
        
        batalhar(Lado1, Lado2);
        ultimoGuerreuroMorto(ultimoGuerreiroMorto, matouUltimo);

        terminarJogo();
        
        
        //System.out.println(" ");
        //System.out.println("d)");
        //LadoVencedor();
        //infoUltimoGuerreiroMorto();
        //System.out.println(" ");
        //System.out.println("f)");
        //System.out.println("        "+ultimoGolpe);
    }

    
    private void terminarJogo(){
        
    }
}
