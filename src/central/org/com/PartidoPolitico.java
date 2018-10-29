/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.org.com;

/**
 *
 * @author hera
 */
public class PartidoPolitico {
    private String nome;
    private int numero;
    
    public PartidoPolitico(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
