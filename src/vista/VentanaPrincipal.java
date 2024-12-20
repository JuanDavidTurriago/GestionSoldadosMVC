package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxRango = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonResetAll = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAsignarMision = new javax.swing.JButton();
        jButtonAsignarEstado = new javax.swing.JButton();
        jButtonAcciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SOLDADOS REGISTRADOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RANGO:");

        jComboBoxRango.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Soldado raso", "Teniente", "Capitan", "Coronel" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jComboBoxRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
        );

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
        JTextArea areaSoldado = new javax.swing.JTextArea();
        areaSoldado.setEditable(false);

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        jLabel3.setBackground(new java.awt.Color(153, 0, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTIÓN DE SOLDADOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setText("¡Bienvenido!");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15));
        jLabel5.setText("En este programa podras Crear, modificar, y muchas cosas mas con los soldados.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15));
        jLabel6.setText("Para empezar oprime alguno de los botones que se encuentran arriba ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15));
        jLabel7.setText("de este texto.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel8.setText("¡Buena suerte!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);

        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(207, 207, 207))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(220, 220, 220))))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
                PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
                PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButtonResetAll.setBackground(new java.awt.Color(169, 0, 0));
        jButtonResetAll.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResetAll.setText("RESET ALL");
        jButtonCrear.setText("Crear");
        jButtonModificar.setText("Modificar");
        jButtonAsignarMision.setText("Asignar misión");
        jButtonAsignarEstado.setText("Asignar Estado");
        jButtonAcciones.setText("Acciones");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButtonCrear)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonModificar)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButtonAsignarMision)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButtonAsignarEstado)
                                                                .addGap(18,18,18)
                                                                .addComponent(jButtonAcciones)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonResetAll, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonCrear)
                                                        .addComponent(jButtonModificar)
                                                        .addComponent(jButtonAsignarMision)
                                                        .addComponent(jButtonAsignarEstado)
                                                        .addComponent(jButtonAcciones))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonResetAll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pack();
    }


    public void mostrarCrear(Crear crear){

        crear.setSize(567,271);
        crear.setLocation(0,0);

        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(crear,BorderLayout.CENTER);
        jPanelPrincipal.revalidate();
        jPanelPrincipal.repaint();
    }

    public void mostrarModificar(Modificar modificar){
        modificar.setSize(567,271);
        modificar.setLocation(0,0);

        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(modificar,BorderLayout.CENTER);
        jPanelPrincipal.revalidate();
        jPanelPrincipal.repaint();
    }

    public void mostrarAsignarMision(AsignarM asignarMision){
        asignarMision.setSize(567,271);
        asignarMision.setLocation(0,0);

        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(asignarMision,BorderLayout.CENTER);
        jPanelPrincipal.revalidate();
        jPanelPrincipal.repaint();

    }

    public void mostrarAsignarEstado(ModificarEstado asignarEstado){
        asignarEstado.setSize(567,271);
        asignarEstado.setLocation(0,0);

        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(asignarEstado,BorderLayout.CENTER);
        jPanelPrincipal.revalidate();
        jPanelPrincipal.repaint();

    }

    public void mostrarAcciones(Acciones acciones) {
        acciones.setSize(567, 271);
        acciones.setLocation(0, 0);

        jPanelPrincipal.removeAll();
        jPanelPrincipal.add(acciones, BorderLayout.CENTER);
        jPanelPrincipal.revalidate();
        jPanelPrincipal.repaint();
    }


    public void resetAll(){


    }
    public String getComboBoxRango(){
        String categoriaSeleccionada = (String) jComboBoxRango.getSelectedItem();
        return categoriaSeleccionada;
    }

    public void rango(ArrayList<String[]> listaSoldadosRasos,
                      ArrayList<String[]> listaTenientes,
                      ArrayList<String[]> listaCapitanes,
                      ArrayList<String[]> listaCoroneles,
                      String rango){

        jPanel2.removeAll();

        switch(rango){
            case "Soldado raso":

                for (String[] datos : listaSoldadosRasos) {

                    JLabel label = new JLabel("ID: " + datos[0] + "      Nombre: " + datos[1]);
                    JLabel lab = new JLabel("Misión: " + datos[2] + "      Estado: " + datos[3]);
                    JLabel sep = new JLabel("___________________________________");
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(sep);

                }

                break;
            case "Teniente":

                for (String[] datos : listaTenientes) {

                    JLabel label = new JLabel("ID: "+datos[0]+"      Nombre: "+datos[1]);
                    JLabel lab = new JLabel("Misión: "+datos[2]+"      Estado: "+datos[3]);
                    JLabel uni = new JLabel("Unidad: "+datos[4]);
                    JLabel sep = new JLabel("___________________________________");
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(uni);
                    jPanel2.add(sep);

                }
                break;
            case "Capitan":

                for (String[] datos : listaCapitanes) {

                    JLabel label = new JLabel("ID: " + datos[0] + "      Nombre: " + datos[1]);
                    JLabel lab = new JLabel("Misión: " + datos[2] + "      Estado: " + datos[3]);
                    JLabel bajo = new JLabel("Soldados a cargo: " + datos[4]);
                    JLabel sep = new JLabel("___________________________________");
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(bajo);
                    jPanel2.add(sep);

                }
                break;
            case "Coronel":

                for (String[] datos : listaCoroneles) {

                    JLabel label = new JLabel("ID: " + datos[0] + "      Nombre: " + datos[1]);
                    JLabel lab = new JLabel("Misión: " + datos[2] + "      Estado: " + datos[3]);
                    JLabel est = new JLabel("Estrategia: " + datos[4]);
                    JLabel sep = new JLabel("___________________________________");
                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
                    jPanel2.add(label);
                    jPanel2.add(lab);
                    jPanel2.add(est);
                    jPanel2.add(sep);

                }
                break;
        }

        jPanel2.revalidate();
        jPanel2.repaint();

    }

    public void setControlador(ActionListener controlador) {
        jButtonCrear.setActionCommand("Crear");
        jButtonCrear.addActionListener(controlador);

        jButtonModificar.setActionCommand("Modificar");
        jButtonModificar.addActionListener(controlador);

        jButtonAsignarMision.setActionCommand("AsignarMision");
        jButtonAsignarMision.addActionListener(controlador);

        jButtonAsignarEstado.setActionCommand("AsignarEstado");
        jButtonAsignarEstado.addActionListener(controlador);

        jButtonAcciones.setActionCommand("Acciones");
        jButtonAcciones.addActionListener(controlador);

        jButtonResetAll.setActionCommand("RESET ALL");
        jButtonResetAll.addActionListener(controlador);

        jComboBoxRango.setActionCommand("Rango");
        jComboBoxRango.addActionListener(controlador);

    }

    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonAsignarMision;
    private javax.swing.JButton jButtonAsignarEstado;
    private javax.swing.JButton jButtonAcciones;
    private javax.swing.JComboBox<String> jComboBoxRango;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
}
