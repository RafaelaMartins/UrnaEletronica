
package central.org.com;

import javax.swing.JOptionPane;

/**
 *
 * @author hera
 */
public class Eleitor {
    private int tituloEleitor;
    private String cpf;
    private int image;
    private int seçao;
    private String nomeCompleto;
    
    public Eleitor(int tituloEleitor, String cpf, int image, int seçao, String nomeCompleto){
        if(ValidaCPF.isCPF(cpf)==true){
            this.cpf =  cpf;
            this.image = image;
            this.nomeCompleto = nomeCompleto;
            this.seçao = seçao;
            this.tituloEleitor = tituloEleitor;
            
        }
        else{
            JOptionPane.showInputDialog("Erro!CPF inválido!!");
            return;
        }
        
    }
    
    public int getTituloEleitor(){
        return this.tituloEleitor;
    }
    public void setTituloEleitor(int titulo){
        this.tituloEleitor = titulo;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String Cpf){
        this.cpf = Cpf;
    }
    public int getSeçao(){
        return this.seçao;
    }
    public void setSeçao(int Seçao){
        this.seçao =  Seçao;
    }
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    
}
