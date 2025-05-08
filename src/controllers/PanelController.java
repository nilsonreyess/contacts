
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import views.FrmMain;
import views.FrmPanel;
import views.FrmStart;
import views.FrmUsers;

public class PanelController implements ActionListener   {
    // Attribute
    FrmPanel frmPanel = new FrmPanel();
    
    // Construct
   public PanelController(FrmPanel frm) {
        this.frmPanel = frm;
        
        this.frmPanel.MnuUsers.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                FrmUsers frmUsers = new FrmUsers();
                UsersController usersController = new UsersController(frmUsers);
                frmUsers.LblConected.setText("Conected: OK");
                frmUsers.LblUsername.setText(frmPanel.LblUsername.getText());
                frmUsers.setVisible(true);
                frmUsers.setLocationRelativeTo(frmPanel);
            }
        });
        this.frmPanel.MnuLogout.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                FrmMain frmMain = new FrmMain();
                MainController mainController = new MainController(frmMain);
                frmMain.setVisible(true);
                frmMain.setLocationRelativeTo(null);
                frmPanel.dispose();
            }
        });
        this.frmPanel.MnuListContacts.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                FrmStart frmStart = new FrmStart();
                frmStart.LblConnect.setText(frmPanel.LblUsername.getText());
                frmStart.setVisible(true);
                frmStart.setLocationRelativeTo(frmPanel);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.frmPanel.MnuListContacts) {
            FrmStart frmStart = new FrmStart();
            //ContactsController contactsController = new ContactsController(frmStart);
            frmStart.setVisible(true);
            frmStart.setLocationRelativeTo(this.frmPanel);
        }
    }
    
   
   
}
