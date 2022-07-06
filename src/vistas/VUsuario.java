/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import manejoProductos.almacen.Almacen;
import manejoProductos.almacen.AlmacenServicioFabrica;
import manejoProductos.almacen.IAlmacenServicio;
import manejoProductos.categoria.CategoriaServicioFabrica;
import manejoProductos.categoria.ICategoriaServicio;
import manejoProductos.usuario.Usuario;

import javax.swing.table.DefaultTableModel;
import manejoProductos.usuario.IUsuarioServicio;
import manejoProductos.usuario.UsuarioServicioFabrica;
import manejoProductos.validador.Validador;

/**
 *
 * @author Brayan
 */
public class VUsuario extends javax.swing.JPanel {
    DefaultTableModel modelo;
    Almacen a =new Almacen();
    Usuario u = new Usuario();
    protected boolean banderaUsuario;
    /**
     * Creates new form Usuario
     */
    public VUsuario() {
        initComponents();
        llenarComboBox();

        modelo = new DefaultTableModel();
        modelo.addColumn("IdUsuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ci");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Almacen");
        modelo.addColumn("");
        this.tablaUsuario.setModel(modelo);
        limpiarTablaUsuario();
        llenarTablaUsuarios();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        CbUsuario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setText("Nombre:");

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRegistrar.setBackground(new java.awt.Color(255, 204, 102));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Direccion:");

        txtCi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("CI:");

        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Telefono:");

        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Password:");

        btnEliminar.setBackground(new java.awt.Color(255, 204, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 204, 102));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        CbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbUsuarioItemStateChanged(evt);
            }
        });
        CbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbUsuarioActionPerformed(evt);
            }
        });
        CbUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CbUsuarioKeyPressed(evt);
            }
        });

        jLabel6.setText("Almacen:");

        tabla.setBackground(new java.awt.Color(255, 255, 255));

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setText("Buscar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout tablaLayout = new javax.swing.GroupLayout(tabla);
        tabla.setLayout(tablaLayout);
        tablaLayout.setHorizontalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tablaLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablaLayout.setVerticalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablaLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setText("Email:");

        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        u.setNombre(txtNombre.getText().toString().trim());
        u.setDireccion(txtDireccion.getText().toString().trim());
        u.setCi(txtCi.getText().toString().trim());
        u.setTelefono(txtTelefono.getText().toString().trim());
        u.setPassword(txtPassword.getText().toString().trim());
        u.setEmail(txtEmail.getText().toString().trim());
        u.setAlmacen(a);
        
        IUsuarioServicio uf = UsuarioServicioFabrica.construir();
        uf.RegistrarUsuario(u);
        llenarTablaUsuarios();
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        
        u.setNombre(txtNombre.getText().toString().trim());
        u.setDireccion(txtDireccion.getText().toString().trim());
        u.setCi(txtCi.getText().toString().trim());
        u.setTelefono(txtTelefono.getText().toString().trim());
        u.setPassword(txtPassword.getText().toString().trim());
        u.setEmail(txtEmail.getText().toString().trim());
        u.setAlmacen(a);
        
        IUsuarioServicio uf = UsuarioServicioFabrica.construir();
        uf.modificarUsuario(u);
        llenarTablaUsuarios();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void CbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbUsuarioItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            var nombre = CbUsuario.getSelectedItem().toString();
            buscarAlmacen(nombre);
            
        }
    }//GEN-LAST:event_CbUsuarioItemStateChanged

    private void CbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbUsuarioActionPerformed

    }//GEN-LAST:event_CbUsuarioActionPerformed

    private void CbUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbUsuarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbUsuarioKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        if (banderaUsuario == true) {
            int fila = this.tablaUsuario.getSelectedRow();
            u.setIdUsuario(Integer.parseInt(tablaUsuario.getValueAt(fila, 0).toString()));
            txtNombre.setText(tablaUsuario.getValueAt(fila, 1).toString());
            txtDireccion.setText(tablaUsuario.getValueAt(fila, 2).toString());
            txtCi.setText(tablaUsuario.getValueAt(fila, 3).toString());
            txtTelefono.setText(tablaUsuario.getValueAt(fila, 4).toString());
            txtEmail.setText(tablaUsuario.getValueAt(fila, 5).toString());
            this.CbUsuario.setSelectedItem(tablaUsuario.getValueAt(fila, 6));
            
        }
    }//GEN-LAST:event_tablaUsuarioMouseClicked

    public void llenarComboBox() {
        CbUsuario.removeAllItems();
        this.CbUsuario.addItem("Selecciona");
        IAlmacenServicio alm = AlmacenServicioFabrica.construir();
        var categorias = alm.obtenerAlmacenes();
        for (int i = 0; i < categorias.size(); i++) {
            CbUsuario.addItem(categorias.get(i).getNombre());
        }
    }

    //limpiamos la tabla de los datos
    private void limpiarTablaUsuario() {
        for (int i = 0; i < this.tablaUsuario.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    
    protected void llenarTablaUsuarios() {
        limpiarTablaUsuario();
        IUsuarioServicio alm = UsuarioServicioFabrica.construir();
        var usuarios = alm.obtenerUsuarios();
        Object[] datos = new Object[modelo.getColumnCount()];
        System.out.println(Validador.getUsuario().getNombre());
        for (Usuario item : usuarios) {

            datos[0] = item.getIdUsuario();
            datos[1] = item.getNombre();
            datos[2] = item.getDireccion();
            datos[3] = item.getCi();
            datos[4] = item.getTelefono();
            datos[5] = item.getEmail();
            datos[6] = item.getAlmacen().getNombre();
            modelo.addRow(datos);
        }
        this.tablaUsuario.setModel(modelo);
        ocultarColumnaTabla();
    }
    
    private void buscarAlmacen(String nombre){
        IAlmacenServicio al = AlmacenServicioFabrica.construir();
        var almacenes = al.obtenerAlmacenes();
        
        if (nombre != "") {
            for (int i = 0; i < almacenes.size(); i++) {
                if (nombre.equals(almacenes.get(i).getNombre())) {
                    a.setIdAlmacen(almacenes.get(i).getIdAlmacen());
                    System.out.println(almacenes.get(i).getIdAlmacen());
                }
            }
        }

        /*if (id != 0) {
            for (int i = 0; i < categorias.size(); i++) {
                if (id == categorias.get(i).getId()) {
                    c.setNombre(categorias.get(i).getNombre());
                }
            }
        }**/
    }
    
    private void ocultarColumnaTabla(){
        tablaUsuario.getColumnModel().getColumn(7).setMaxWidth(0);
        tablaUsuario.getColumnModel().getColumn(7).setMinWidth(0);
        tablaUsuario.getColumnModel().getColumn(7).setPreferredWidth(0);
        tablaUsuario.getColumnModel().getColumn(7).setResizable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CbUsuario;
    protected javax.swing.JButton btnActualizar;
    protected javax.swing.JButton btnEliminar;
    protected javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel tabla;
    protected javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}