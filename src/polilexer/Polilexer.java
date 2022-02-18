/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polilexer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iván
 */
public class Polilexer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the CDE/Motif look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If CDE/Motif (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("CDE/Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        new MainInterface().setVisible(true);
    }
    
    public static Values compile(String path){
        Values v = null;
        try {
            String file = (new File(path).getAbsolutePath());
            Lexer lex = new Lexer(new FileReader(file));
            lex.yylex();
            
            if(lex.errlex.equals("")){
                int size = lex.token.size();
                String table[][] = new String[size][2];
                for (int i = 0; i < lex.token.size(); i++) {
                    table[i][1] = lex.token.get(i).content;
                    table[i][0] = lex.token.get(i).name;
                }
                
                v = new Values("Compilación exitosa.\n" + lex.token.toString(), table);
            }else{
                v = new Values(lex.errlex, null);
            }
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }    
}
