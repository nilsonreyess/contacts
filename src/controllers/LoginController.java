
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.User;
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
            if (validate()) {
                // Crear el objeto usuario para enviar al modelo
                User u = new User(this.frmLogin.TxtUsername.getText(), String.valueOf(this.frmLogin.TxtPassword.getPassword()));
                // Verificar datos de acceso en la base de datos
                
            }

        }
    }
    
    // Method for validate data
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
