
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.FrmPanel;
import views.FrmStart;

public class PanelController implements ActionListener   {
    // Attribute
    FrmPanel frmPanel = new FrmPanel();
    
    // Construct
   public PanelController(FrmPanel frm) {
        this.frmPanel = frm;
        this.frmPanel.MnuListContacts.addActionListener(this);
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
