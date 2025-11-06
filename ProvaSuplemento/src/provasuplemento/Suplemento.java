/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provasuplemento;

import java.util.Objects;

/**
 *
 * @author lucas
 */
public abstract class Suplemento {
    private String codigo;
    private String fabricante;
    private String nome;
    private static int qtdSuplemento = 0;

    public Suplemento(String codigo, String fabricante, String nome) {
        this.codigo = codigo;
        this.fabricante = fabricante;
        this.nome = nome;
        qtdSuplemento++;
    }

    public String getNomeProduto() {
        return nome;
    }

    public static int getQt() {
        return qtdSuplemento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Suplemento other = (Suplemento) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    public abstract String obterEfeito();

    public String getCodigo() {
        return codigo;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    
    

    @Override
    public String toString() {
        return "O suplemento de codigo = " + this.getCodigo() + ", possui como fabricante = " + this.getFabricante() + " e nome = " + this.getNomeProduto();
    }
    
    
    
}
