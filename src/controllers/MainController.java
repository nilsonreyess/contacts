
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.FrmLogin;
import views.FrmMain;

public class MainController implements ActionListener {
    // Attribute
    FrmMain frmMain = new FrmMain();
    
    // Construct
    public MainController (FrmMain frm) {
        this.frmMain = frm;
        this.frmMain.BtnLogin.addActionListener(this);
    }
    
    // Method 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmMain.BtnLogin) {
            FrmLogin frmLogin = new FrmLogin();
            LoginController loginController = new LoginController(frmLogin);
            frmLogin.setVisible(true);
            frmLogin.setLocationRelativeTo(frmMain);
            this.frmMain.dispose();
        }
    }
}
