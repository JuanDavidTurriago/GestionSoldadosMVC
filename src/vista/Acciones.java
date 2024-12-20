package vista;

import controlador.ControladorAcciones;
import java.awt.event.ActionListener;

public class Acciones extends javax.swing.JPanel {
    private ControladorAcciones controlador;

    public Acciones() {

        initComponents();
    }

                    
    private void initComponents() {



        jLabel1 = new javax.swing.JLabel();
        jButtonPatrullar = new javax.swing.JButton();
        jButtonSaludar = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ACCIONES SOBRE SOLDADOS");

        jButtonPatrullar.setBackground(new java.awt.Color(255, 204, 255));
        jButtonPatrullar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPatrullar.setText("Patrullar");
        jButtonPatrullar.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonPatrullar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonSaludar.setBackground(new java.awt.Color(255, 204, 255));
        jButtonSaludar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSaludar.setText("Saludar");
        jButtonSaludar.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonSaludar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID del soldado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButtonSaludar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jButtonPatrullar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaludar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPatrullar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
    }

    public String getjTextFieldID() {
        return jTextFieldID.getText();
    }

    public void setControlador(ActionListener controlador) {
        jButtonSaludar.setActionCommand("Saludar");
        jButtonSaludar.addActionListener(controlador);

        jButtonPatrullar.setActionCommand("Patrullar");
        jButtonPatrullar.addActionListener(controlador);
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButtonPatrullar;
    private javax.swing.JButton jButtonSaludar;
    private javax.swing.JTextField jTextFieldID;
}
