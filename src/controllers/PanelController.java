
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.FrmPanel;

public class PanelController {
    // Attribute
    FrmPanel frmPanel = new FrmPanel();
    
    // Construct
   public PanelController(FrmPanel frm) {
        this.frmPanel = frm;
    }
    
}
