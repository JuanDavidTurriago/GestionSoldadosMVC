package vista;

import controlador.ControladorModificarSoldado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modificar extends javax.swing.JPanel {

    public Modificar() {
        initComponents();
    }

    private void initComponents() {

        buttonGroupRangos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jRadioButtonRaso = new javax.swing.JRadioButton();
        jRadioButtonCapitan = new javax.swing.JRadioButton();
        jRadioButtonTeniente = new javax.swing.JRadioButton();
        jRadioButtonCoronel = new javax.swing.JRadioButton();
        jButtonModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUnidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEstrategia = new javax.swing.JTextField();
        jTextFieldSoldadosMando = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("MODIFICACION DE UN SOLDADO");

        jLabel2.setText("Nombre:");

        jLabel3.setText("ID:");

        jLabel4.setText("Rango:");

        buttonGroupRangos.add(jRadioButtonRaso);
        jRadioButtonRaso.setText("Soldado raso");

        buttonGroupRangos.add(jRadioButtonCapitan);
        jRadioButtonCapitan.setText("Capitan");

        buttonGroupRangos.add(jRadioButtonTeniente);
        jRadioButtonTeniente.setText("Teniente");

        buttonGroupRangos.add(jRadioButtonCoronel);
        jRadioButtonCoronel.setText("Coronel");

        jTextFieldUnidad.setEditable(false);
        jTextFieldEstrategia.setEditable(false);
        jTextFieldSoldadosMando.setEditable(false);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(jRadioButtonRaso.isSelected()){
                    jTextFieldUnidad.setEditable(false);
                    jTextFieldEstrategia.setEditable(false);
                    jTextFieldSoldadosMando.setEditable(false);
                } else if (jRadioButtonTeniente.isSelected()) {
                    jTextFieldUnidad.setEditable(true);
                    jTextFieldEstrategia.setEditable(false);
                    jTextFieldSoldadosMando.setEditable(false);
                } else if (jRadioButtonCapitan.isSelected()) {
                    jTextFieldUnidad.setEditable(false);
                    jTextFieldEstrategia.setEditable(false);
                    jTextFieldSoldadosMando.setEditable(true);
                }else if (jRadioButtonCoronel.isSelected()) {
                    jTextFieldUnidad.setEditable(false);
                    jTextFieldEstrategia.setEditable(true);
                    jTextFieldSoldadosMando.setEditable(false);
                }
            }
        };

        jRadioButtonRaso.addActionListener(actionListener);
        jRadioButtonCapitan.addActionListener(actionListener);
        jRadioButtonTeniente.addActionListener(actionListener);
        jRadioButtonCoronel.addActionListener(actionListener);

        jButtonModificar.setBackground(new java.awt.Color(0, 204, 0));
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        

        jLabel5.setText("Unidad");

        jLabel6.setText("Soldados bajo su mando:");

        jLabel7.setText("Estrategia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextFieldNombre)
                                                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jRadioButtonCapitan)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jRadioButtonCoronel))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jRadioButtonRaso)
                                                                        .addGap(28, 28, 28)
                                                                        .addComponent(jRadioButtonTeniente))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jTextFieldUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(51, 51, 51))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jTextFieldSoldadosMando, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)))))
                                .addGap(35, 35, 35))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(86, 86, 86)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jRadioButtonTeniente)
                                                                        .addComponent(jRadioButtonRaso))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jRadioButtonCoronel)
                                                                        .addComponent(jRadioButtonCapitan)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(83, 83, 83)
                                                                .addComponent(jLabel4))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldSoldadosMando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldEstrategia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
        );
    }

    public String getNombre() {
        return jTextFieldNombre.getText();
    }

    public String getID() {
        return jTextFieldID.getText();
    }

    public String getjUnidad() {
        return jTextFieldUnidad.getText();
    }

    public String getEstrategia() {
        return jTextFieldEstrategia.getText();
    }

    public String getSoldadosMando() {
        return jTextFieldSoldadosMando.getText();
    }

    public String getRango() {

        String rango = "";
        if (!jRadioButtonCoronel.isSelected() && !jRadioButtonRaso.isSelected() && !jRadioButtonTeniente.isSelected() && !jRadioButtonCapitan.isSelected()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Por favor seleccione un rango.");
        }else {
            if (jRadioButtonCoronel.isSelected()) {
                rango = "Coronel";
            } else if (jRadioButtonRaso.isSelected()) {
                rango = "SoldadoRaso";
            } else if (jRadioButtonTeniente.isSelected()) {
                rango = "Teniente";
            } else if (jRadioButtonCapitan.isSelected()) {
                rango = "Capitan";
            }
        }
        return rango;
    }

    public void setControlador(ControladorModificarSoldado controlador) {

    }

    public void agregarListener(ActionListener listener) {
        jButtonModificar.addActionListener(listener);
    }

    public void limpiar() {
        jTextFieldNombre.setText("");
        jTextFieldID.setText("");
        jTextFieldUnidad.setText("");
        jTextFieldEstrategia.setText("");
        jTextFieldSoldadosMando.setText("");

    }

    private javax.swing.JButton jButtonModificar;
    private javax.swing.JRadioButton jRadioButtonCapitan;
    private javax.swing.JRadioButton jRadioButtonCoronel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButtonRaso;
    private javax.swing.JRadioButton jRadioButtonTeniente;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldUnidad;
    private javax.swing.JTextField jTextFieldEstrategia;
    private javax.swing.JTextField jTextFieldSoldadosMando;
    private javax.swing.ButtonGroup buttonGroupRangos;
}
