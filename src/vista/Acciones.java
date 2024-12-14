package vista;


import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 *
 * @author Edna Ordoñez
 */
public class Acciones extends javax.swing.JPanel {


    public Acciones() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
                    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPatrullar = new javax.swing.JButton();
        jSaludar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ACCIONES SOBRE SOLDADOS");

        jPatrullar.setBackground(new java.awt.Color(255, 204, 255));
        jPatrullar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPatrullar.setText("Patrullar");
        jPatrullar.setBorder(new javax.swing.border.MatteBorder(null));
        jPatrullar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPatrullar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatrullarActionPerformed(evt);
            }
        });

        jSaludar.setBackground(new java.awt.Color(255, 204, 255));
        jSaludar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSaludar.setText("Saludar");
        jSaludar.setBorder(new javax.swing.border.MatteBorder(null));
        jSaludar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSaludar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaludarActionPerformed(evt);
            }
        });

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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jSaludar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jPatrullar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaludar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPatrullar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
    }// </editor-fold>                        

    private void jPatrullarActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void jSaludarActionPerformed(java.awt.event.ActionEvent evt) {                                         


    }


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jPatrullar;
    private javax.swing.JButton jSaludar;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}