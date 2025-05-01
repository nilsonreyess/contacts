
package views;

public class FrmPanel extends javax.swing.JFrame {

    public FrmPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblLogo = new javax.swing.JLabel();
        LblTitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LblConnected = new javax.swing.JLabel();
        LblUsername = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuFile = new javax.swing.JMenu();
        MnuUsers = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnuLogout = new javax.swing.JMenuItem();
        MnuContacts = new javax.swing.JMenu();
        MnuListContacts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N

        LblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitle.setText("Escritorio de mi agenda de contactos");

        LblConnected.setText("Conected: OK");

        LblUsername.setText("Usuario: pepito");

        MnuFile.setText("Archivo");

        MnuUsers.setText("Usuarios");
        MnuFile.add(MnuUsers);
        MnuFile.add(jSeparator1);

        MnuLogout.setText("Cerrar sesión");
        MnuFile.add(MnuLogout);

        jMenuBar1.add(MnuFile);

        MnuContacts.setText("Contactos");

        MnuListContacts.setText("Listado");
        MnuContacts.add(MnuListContacts);

        jMenuBar1.add(MnuContacts);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(LblLogo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE))
                            .addComponent(LblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblConnected)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblUsername)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(LblLogo)
                .addGap(18, 18, 18)
                .addComponent(LblTitle)
                .addGap(38, 38, 38)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblConnected)
                    .addComponent(LblUsername))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LblConnected;
    private javax.swing.JLabel LblLogo;
    private javax.swing.JLabel LblTitle;
    public javax.swing.JLabel LblUsername;
    private javax.swing.JMenu MnuContacts;
    public javax.swing.JMenu MnuFile;
    public javax.swing.JMenuItem MnuListContacts;
    public javax.swing.JMenuItem MnuLogout;
    public javax.swing.JMenuItem MnuUsers;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
