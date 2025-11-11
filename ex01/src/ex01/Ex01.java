/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01;

import java.io.DataInputStream;
import java.io.IOException;
/**
 *
 * @author 2024122760121
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */

    /*
    1. Uma P.A. (progressão aritmética) fica determinada pela sua razão (r) e pelo primeiro
    termo (a1). Faça um programa em Java, que seja capaz de determinar qualquer termo de
    uma P.A., dada a razão, o primeiro termo e a quantidade de termos.
                        an = a1 + (n-1) x r

    */
    public static void main(String[] args) {
        int r, a1, n, an;
        String s;
        DataInputStream dado;
        System.out.println("==== Cálculo de uma PA =====");
        try{
            System.out.print("Digite a razão da PA: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            r = Integer.parseInt(s);
            
            System.out.print("Digite o 1 termo da PA: ");
            s = dado.readLine();
            a1 = Integer.parseInt(s);
            
            System.out.print("Digite o termo que deseja da PA (n): ");
            s = dado.readLine();
            n = Integer.parseInt(s);   
            
            an = a1 + (n-1)* r;
            
            System.out.println("O "+n+" termo da PA é " + an);
        }
        catch (IOException erro){
            System.out.println("Dado inválido!");  
        }catch (NumberFormatException erro){
            System.out.println("Dado inválido!");            
        }
    }

}
