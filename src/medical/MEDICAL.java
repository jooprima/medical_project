/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.frmLogin;


/**
 *
 * @author jooprima
 */
public class MEDICAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
            new frmLogin().setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Sistem aplikasi anda tidak mendukung tampilan aplikasi ini, tampilan akan berubah menjadi default..",
                    "Perhatian",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
