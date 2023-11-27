package Vistas;

import Controlador.CrudeCliente;
import Controlador.CrudeVehiculo;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import taller.Cliente;
import taller.Vehiculo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtRut = new javax.swing.JTextField();
        infoCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApe1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApe2 = new javax.swing.JTextField();
        btnIngresoCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaClientes = new javax.swing.JTable();
        btnModificarClienteSQL = new javax.swing.JButton();
        listaClientes = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtClienteVehiculo = new javax.swing.JTextField();
        infoVehiculo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAgnoFab = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        btnIngresoVehiculo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaVehiculo = new javax.swing.JTable();
        listaClientes1 = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        listaVehiculo = new javax.swing.JButton();
        btnModificarVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnModificarVehiculoSQL = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Taller");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        infoCliente.setText("Ingreso de Clientes");

        jLabel3.setText("RUT");

        jLabel4.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido Paterno");

        txtApe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApe1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido Materno");

        txtApe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApe2ActionPerformed(evt);
            }
        });

        btnIngresoCliente.setText("Guardar cliente");
        btnIngresoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoClienteActionPerformed(evt);
            }
        });

        tblListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblListaClientes);

        btnModificarClienteSQL.setVisible(false);
        btnModificarClienteSQL.setText("Modificar Cliente");
        btnModificarClienteSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteSQLActionPerformed(evt);
            }
        });

        listaClientes.setText("Lista de clientes");
        listaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaClientesActionPerformed(evt);
            }
        });

        btnModificarCliente.setText("Modificar cliente");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar cliente");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtApe2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApe1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(infoCliente)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarClienteSQL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIngresoCliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(listaClientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente)))
                .addGap(269, 269, 269))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(infoCliente)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(listaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresoCliente)
                            .addComponent(btnModificarClienteSQL)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel3);

        txtClienteVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteVehiculoActionPerformed(evt);
            }
        });

        infoVehiculo.setText("Ingreso Vehiculo");

        jLabel7.setText("RUT");

        jLabel8.setText("Patente");

        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });

        jLabel9.setText("Año Fabricación");

        txtAgnoFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgnoFabActionPerformed(evt);
            }
        });

        jLabel10.setText("Color");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        btnIngresoVehiculo.setText("Guardar Vehiculo");
        btnIngresoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoVehiculoActionPerformed(evt);
            }
        });

        tblListaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblListaVehiculo);

        listaClientes1.setText("Lista de clientes");
        listaClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaClientes1ActionPerformed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel11.setText("Marca");

        jLabel12.setText("Modelo");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        listaVehiculo.setText("Lista Vehiculo");
        listaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaVehiculoActionPerformed(evt);
            }
        });

        btnModificarVehiculo.setText("Modificar Vehiculo");
        btnModificarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVehiculoActionPerformed(evt);
            }
        });

        btnEliminarVehiculo.setText("Eliminar Vehiculo");
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });

        btnModificarVehiculoSQL.setVisible(false);
        btnModificarVehiculoSQL.setText("Modificar Vehiculo");
        btnModificarVehiculoSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVehiculoSQLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificarVehiculoSQL)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtModelo)
                        .addComponent(txtMarca)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAgnoFab, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPatente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtClienteVehiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                            .addComponent(jLabel7)
                            .addComponent(infoVehiculo)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addComponent(btnIngresoVehiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(listaClientes1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(listaVehiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarVehiculo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarVehiculo))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(listaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(listaClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(infoVehiculo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgnoFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresoVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarVehiculoSQL)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vehiculo", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mantencion", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoClienteActionPerformed

        String rut=txtRut.getText();
        String dv= rut.substring(rut.length()-1);
        rut = rut.substring(0, rut.length()-1);
        String nomb=txtNombre.getText();
        String ape1=txtApe1.getText();
        String ape2=txtApe2.getText();
        Cliente cli = new Cliente();
        cli=new Cliente(rut,dv,nomb,ape1,ape2);   
        CrudeCliente crud=new CrudeCliente();
        crud.Agregar(cli);
        
    }//GEN-LAST:event_btnIngresoClienteActionPerformed

    private void txtApe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApe1ActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApe2ActionPerformed

    private void btnModificarClienteSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteSQLActionPerformed
        // TODO add your handling code here:
        String rut=txtRut.getText();
        String dv= rut.substring(rut.length()-1);
        rut = rut.substring(0, 8);
        String nomb=txtNombre.getText();
        String ape1=txtApe1.getText();
        String ape2=txtApe2.getText();
        Cliente cli=new Cliente(rut,dv,nomb,ape1,ape2);
        CrudeCliente crud=new CrudeCliente();
        crud.Modificar(cli);
        txtRut.setEditable(true);
        infoCliente.setText("Ingreso Cliente:");
        btnModificarClienteSQL.setVisible(false);
    }//GEN-LAST:event_btnModificarClienteSQLActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
        String eliminarCliente = JOptionPane.showInputDialog(rootPane, "Ingrese el RUT del cliente que desea eliminar");
        CrudeCliente crud=new CrudeCliente();
        crud.Eliminar(eliminarCliente);
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        // TODO add your handling code here:
            String modificarCliente = JOptionPane.showInputDialog(rootPane, "Ingrese el rut del usuario que desea modificar");
            modificarCliente= modificarCliente.substring(modificarCliente.length()-1);
            CrudeCliente crud=new CrudeCliente();
            Cliente cli = crud.Buscar(modificarCliente);
            txtRut.setText(cli.getRut()+"-"+cli.getDv());
            txtNombre.setText(cli.getNombre());
            txtApe1.setText(cli.getApe1());
            txtApe2.setText(cli.getApe2());
            infoCliente.setText("Modificar Cliente:"+modificarCliente);
            txtRut.setEditable(false);
            btnModificarClienteSQL.setVisible(true);
            
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void listaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaClientesActionPerformed
        // TODO add your handling code here:
        CrudeCliente crud=new CrudeCliente();
        tblListaClientes.setModel(crud.listaClientes());

    }//GEN-LAST:event_listaClientesActionPerformed

    private void txtClienteVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteVehiculoActionPerformed

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatenteActionPerformed

    private void txtAgnoFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgnoFabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgnoFabActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void btnIngresoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoVehiculoActionPerformed
        // TODO add your handling code here:
        String patente=txtPatente.getText();
        String agno=txtAgnoFab.getText();
        String color=txtColor.getText();
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        String rut_cliente = txtClienteVehiculo.getText();
        int agno_fab = Integer.parseInt(agno);
        CrudeCliente crudCli=new CrudeCliente();
        Cliente cli = crudCli.Buscar(rut_cliente);
        Vehiculo vic=new Vehiculo(patente,agno_fab,color,marca,modelo,cli);   
        CrudeVehiculo crudVic=new CrudeVehiculo();
        try {
            crudVic.Agregar(vic, cli);
        } catch (ParseException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnIngresoVehiculoActionPerformed

    private void listaClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaClientes1ActionPerformed
        // TODO add your handling code here:
        CrudeCliente crud=new CrudeCliente();
        tblListaVehiculo.setModel(crud.listaClientes());
    }//GEN-LAST:event_listaClientes1ActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void listaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaVehiculoActionPerformed
        // TODO add your handling code here:
        CrudeVehiculo crud=new CrudeVehiculo();
        tblListaVehiculo.setModel(crud.listaVehiculo());
    }//GEN-LAST:event_listaVehiculoActionPerformed

    private void btnModificarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVehiculoActionPerformed
        // TODO add your handling code here:
        String modificarvehiculo = JOptionPane.showInputDialog(rootPane, "Ingrese la patente del vehiculo que desea modificar");
        CrudeVehiculo crud=new CrudeVehiculo();
        Vehiculo vic = crud.Buscar(modificarvehiculo);
        txtClienteVehiculo.setText(vic.getRut_cliente().getRut()+"-"+vic.getRut_cliente().getDv());
        txtPatente.setText(vic.getPatente());
        txtAgnoFab.setText(String.valueOf(vic.getAgno_fab()));
        txtColor.setText(vic.getColor());
        txtMarca.setText(vic.getMarca());
        txtModelo.setText(vic.getModelo());
        infoVehiculo.setText("Modificar Vehiculo Patente: "+modificarvehiculo);
        txtPatente.setEditable(false);
        btnModificarVehiculoSQL.setVisible(true);
    }//GEN-LAST:event_btnModificarVehiculoActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed
        // TODO add your handling code here:
        String eliminarVehiculo = JOptionPane.showInputDialog(rootPane, "Ingrese la patente del vehiculo que desea eliminar");
        CrudeVehiculo crud=new CrudeVehiculo();
        crud.Eliminar(eliminarVehiculo);
    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void btnModificarVehiculoSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVehiculoSQLActionPerformed
        // TODO add your handling code here:
        String rut_cliente=txtClienteVehiculo.getText();
        rut_cliente = rut_cliente.substring(0, 8);
        String patente=txtPatente.getText();
        String agno=txtAgnoFab.getText();
        String color=txtColor.getText();
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        CrudeCliente crudeCli=new CrudeCliente();
        int agno_fab = Integer.parseInt(agno);
        Vehiculo vic=new Vehiculo(patente,agno_fab,color,marca,modelo,crudeCli.Buscar(rut_cliente));
        CrudeVehiculo crud=new CrudeVehiculo();
        crud.Modificar(vic);
        txtPatente.setEditable(true);
        infoVehiculo.setText("Ingreso Vehiculo: ");
        btnModificarVehiculoSQL.setVisible(false);
    }//GEN-LAST:event_btnModificarVehiculoSQLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnIngresoCliente;
    private javax.swing.JButton btnIngresoVehiculo;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarClienteSQL;
    private javax.swing.JButton btnModificarVehiculo;
    private javax.swing.JButton btnModificarVehiculoSQL;
    private javax.swing.JLabel infoCliente;
    private javax.swing.JLabel infoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton listaClientes;
    private javax.swing.JButton listaClientes1;
    private javax.swing.JButton listaVehiculo;
    private javax.swing.JTable tblListaClientes;
    private javax.swing.JTable tblListaVehiculo;
    private javax.swing.JTextField txtAgnoFab;
    private javax.swing.JTextField txtApe1;
    private javax.swing.JTextField txtApe2;
    private javax.swing.JTextField txtClienteVehiculo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
