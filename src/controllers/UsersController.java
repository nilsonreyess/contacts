
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import views.FrmUsers;

public class UsersController implements ActionListener {
    FrmUsers frmUsers = new FrmUsers();
    
    public UsersController(FrmUsers frm) {
        this.frmUsers = frm;
        
        this.frmUsers.MnuLogout.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                frmUsers.dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
