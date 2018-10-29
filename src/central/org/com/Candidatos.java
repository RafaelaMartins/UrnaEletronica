/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.org.com;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author hera
 */
public class Candidatos {
    private String nome;
    private String nomeP;
    private int numeroP;
    private String cpf;
    public int voto;
    
    
    public Candidatos(String nome,String nomeP, int numeroP, String cpf){
        
        this.nome = nome;
        this.cpf = cpf;
        this.nomeP = nomeP;
        this.numeroP = numeroP;
        
        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public int getPartidoNumero(){
        return this.numeroP;
    }
    public void setPartidoNumero(int numero){
        numeroP = numero;
    }
    public String getPartidoNome(){
        return this.nomeP;
    }
    public void setPartidoNome(String nome){
        this.nomeP = nome;
    }
    public void setCPF(String cPF){
        this.cpf = cPF;
    }
    public String getCPF(){
        return this.cpf;
    }
}
