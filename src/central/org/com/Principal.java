/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.org.com;
import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import org.json.JSONObject;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import org.json.JSONException;


/**
 *
 * @author hera
 */
public class Principal {
    public Candidatos candidatos[];
     public static void main(String[] args) throws JSONException {
         
         VisaoMenu tela = new VisaoMenu();
         tela.setVisible(true);
         JFrame frame = new JFrame();
         frame.add(tela);
         JFrame f = new JFrame();
         f.setLayout(new BorderLayout());
         f.add(tela, BorderLayout.CENTER);
         f.pack();
         f.setVisible(true);
         frame.dispose();
         System.out.println("PAASSOU");
         
         
    
    
     }
}
