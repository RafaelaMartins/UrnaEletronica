/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.org.com;

import central.org.com.Candidatos;
import central.org.com.Eleitor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hera
 */
public class Voto {
    private String aux;
    private String nomeEleitor;
    private int secao;
    private int tituloE;
    private String nomeCandidato;
    private int numeroCandidato;
    private String nomePartido;
    private Date data = new Date();
    
    public Voto(String nomeEleitor,int secao,int tituloE,String nomeCandidato,int numeroPartido, String nomePartido){
        
        this.nomeEleitor = nomeEleitor;
        this.secao = secao; 
        this.tituloE = tituloE;
        this.nomeCandidato = nomeCandidato;
        this.numeroCandidato = numeroPartido;
        this.nomePartido = nomePartido;
        data.getTime();
    }

    public String getNomeEleitor() {
        return nomeEleitor;
    }

    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public int getTituloE() {
        return tituloE;
    }

    public void setTituloE(int tituloE) {
        this.tituloE = tituloE;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) {
        this.nomePartido = nomePartido;
    }

    public String getData() {
        aux = data.toString();
        return aux;
    }

    public void setData(String df1)  {
        aux = df1;
    }
    
    
}
