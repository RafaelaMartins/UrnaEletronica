/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna.org.com;

import central.org.com.Candidatos;
import central.org.com.Eleitor;

/**
 *
 * @author hera
 */
public class Urna {
    private int numero;
    public static Candidatos candidato[] = new Candidatos[50];
    public static Eleitor eleitor[] = new Eleitor[50];
    private static int i=0;
    private static int j=0;
    public Urna(){
    }
    
    public Urna(int numero, Candidatos candidato, Eleitor eleitor) {
        
        
        this.numero = numero;
        this.candidato[i] = candidato;
        this.eleitor[j] = eleitor;
        i++;
        j++;
    }
    
    public void adicionaCandidato(Candidatos candidato){
        this.candidato[i] = candidato;
        
        i++;
    }
    public void adicionaEleitor(Eleitor eleitor){
        this.eleitor[j] = eleitor;
        j++;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero ++;
    }

    public Candidatos getCandidato(int numero) {
        int j;
        for(j = 0; this.candidato[j] != null; j++){
            if( Urna.candidato[j].getPartidoNumero()==numero){
                return candidato[j];
            }
        }
        return null;
    }

    public void setCandidato(Candidatos candidato, int numero) {
        int j;
        for(j = 0; this.candidato[j] != null; j++){
            if( Urna.candidato[j].getPartidoNumero()==numero){
                this.candidato[j] = candidato;
                break;
            }
        }
        
    }

    public Eleitor getEleitor(int titulo) {
        int j ;
        for(j = 0; eleitor[j]!=null;j++){
            if(eleitor[j].getTituloEleitor()==titulo){
                return eleitor[j];
            }
        }
        return null;
        
    }

    public void setEleitor(Eleitor eleitor, int titulo) {
        int j ;
        for(j = 0; this.eleitor[j]!=null;j++){
            if(this.eleitor[j].getTituloEleitor()==titulo){
                this.eleitor[j] = eleitor;
            }
        }
        
    }
    
}

/*
combox
Imagem
Json
Data
*/