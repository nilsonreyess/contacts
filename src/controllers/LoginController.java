
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.FrmLogin;

public class LoginController implements ActionListener  {
    // Attribute
    FrmLogin frmLogin = new FrmLogin();
    
    // Construct
    public LoginController (FrmLogin frm) {
        this.frmLogin = frm;
        this.frmLogin.BtnStart.addActionListener(this);
    }
    
    // Method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.frmLogin.BtnStart) {
            validate();
        }
    }
    
    public boolean validate() {
        if (this.frmLogin.TxtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(frmLogin, "El usuario no cumple las políticas establecidas.");
            this.frmLogin.TxtUsername.requestFocus();
            return false;
        }
        if (this.frmLogin.TxtPassword.getPassword().length < 1) {
            JOptionPane.showMessageDialog(frmLogin, "El password no cumple las políticas establecidas.");
            this.frmLogin.TxtPassword.requestFocus();
            return false;
        }
        
        return true;
    }
}
