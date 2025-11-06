/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provalutador;

/**
 *
 * @author lucas
 */
public class JiuJiteiroGracie extends JiuJiteiro {

    public JiuJiteiroGracie(String academia, String nome, double peso, int idade) {
        super(academia, nome, peso, idade);
    }
    


    @Override
    public void atacar(Lutador adversario) {
        adversario.energia -= this.getPeso()/3; 
    }
    
    
}
