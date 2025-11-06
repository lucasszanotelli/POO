/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo;

//imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import Goblins.Comum;
import Goblins.ReiGoblin;

import Orcs.Soldado;
import Orcs.SrFeras;
import Orcs.Acougueiro;
import Orcs.Warg;

import Anoes.Glutao;
import Anoes.Imperador;
import Anoes.PorcoGuerra;

import Elfos.Arqueiro;
import Elfos.Guardiao;
import Elfos.Superior;


/**
 *
 * @author lucas
 */
public class LerArquivo {
    public static LinkedList<Guerreiro> lerArquivo(String nomeArquivo, int lado) {
        LinkedList<Guerreiro> guerreiros = new LinkedList<>();
        // Lê o arquivo e monta a lista de guerreiros
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] dados = linha.split(" "); //separa a string em partes (limite é o espaco)
                int tipo = Integer.parseInt(dados[0]);
                String nome = dados[1];
                int idade = Integer.parseInt(dados[2]);
                double peso = Double.parseDouble(dados[3]);
                Guerreiro guerreiro = criarGuerreiro(lado, tipo, nome, idade, peso);
                guerreiros.add(guerreiro);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + nomeArquivo);
        }
        return guerreiros;
    }

    private static Guerreiro criarGuerreiro(int lado, int tipo, String nome, int idade, double peso) {
        switch (lado){
            case 1:
                switch (tipo){
                    case 1:
                        return new Comum(nome, idade, peso);
                    case 2:
                        return new ReiGoblin(nome,idade,peso);
                    case 3:
                        return new Soldado(nome,idade,peso);
                    case 4:
                        return new Acougueiro(nome,idade,peso);
                    case 5:
                        return new Warg(nome,idade,peso);
                    case 6:
                        return new SrFeras(nome,idade,peso);
                    default:
                        throw new IllegalArgumentException("Tipo de guerreiro inválido");
                }
            case 2:
                switch (tipo){
                    case 1:
                        return new Guardiao(nome,idade,peso);
                    case 2:
                        return new Arqueiro(nome,idade,peso);
                    case 3:
                        return new Superior(nome,idade,peso);
                    case 4:
                        return new Glutao(nome,idade,peso);
                    case 5:
                        return new PorcoGuerra(nome,idade,peso);
                    case 6:
                        return new Imperador(nome,idade,peso);
                    default:
                        throw new IllegalArgumentException("Tipo de guerreiro inválido");
                }
            default:
                return null;
        }
    }
}