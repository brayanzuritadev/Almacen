/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import manejoProductos.categoria.CategoriaServicioFabrica;
import manejoProductos.producto.ProductoServicioFabrica;
import javax.swing.table.DefaultTableModel;
import manejoProductos.categoria.Categoria;
import manejoProductos.categoria.ICategoriaServicio;
import manejoProductos.producto.IProductoServicio;
import manejoProductos.producto.Producto;

/**
 *
 * @author Brayan
 */
public class VProducto extends javax.swing.JPanel {

    Producto p = new Producto();
    Categoria c = new Categoria();
    DefaultTableModel modelo;
    protected boolean bandera;

    /**
     * Creates new form Tipo
     */
    public VProducto() {
        initComponents();
        // this.jComboBox1.removeAllItems();

        llenarComboBox();
        modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("categoria");
        modelo.addColumn("PCompra");
        modelo.addColumn("PVenta");
        modelo.addColumn("Tipo de guardado");
        this.jTable2.setModel(modelo);
        limpiarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTGuardado = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Registrar Producto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 98, 157, -1));

        jLabel1.setText("Codigo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 142, 49, -1));

        txtCod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 153, -1));

        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 174, 61, -1));

        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 172, 153, -1));

        txtDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 204, 153, -1));

        jLabel4.setText("Descripcion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 206, 82, -1));

        jLabel5.setText("Categoria");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 239, 61, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 236, 153, -1));

        jLabel6.setText("Precio Compra:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 272, 81, -1));

        txtPCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtPCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 270, 153, -1));

        jLabel8.setText("Precio Venta:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 304, 81, -1));

        txtPVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtPVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 302, 153, -1));

        jLabel10.setText("Tipo Guardado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 336, 88, -1));

        txtTGuardado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtTGuardado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 334, 153, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 204, 102));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 388, 241, 30));

        btnModificar.setBackground(new java.awt.Color(255, 204, 102));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 241, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 800));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField5InputMethodTextChanged(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            var nombre = jComboBox1.getSelectedItem();
            buscarCategoria(0, (String) nombre);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        p.setCodProducto(txtCod.getText().toString().trim());
        p.setNombre(txt_nombre.getText().toString().trim());
        p.setDescripcion(txtDescripcion.getText().toString().trim());
        p.setCategoria(c);
        p.setpCompra(Double.parseDouble(txtPCompra.getText().toString().trim()));
        p.setpVenta(Double.parseDouble(txtPVenta.getText().toString().trim()));
        p.settGuardado(txtTGuardado.getText().toString().trim());
        IProductoServicio p1 = ProductoServicioFabrica.Construir();
        p1.registrar(p);

        limpiarTabla();
        llenarTablaProductos();
        limpiarCampos();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        buscarCategoria(0, jComboBox1.getSelectedItem().toString());
        System.out.println(c.getId());

        p.setCodProducto(txtCod.getText().toString().trim());
        p.setNombre(txt_nombre.getText().toString().trim());
        p.setDescripcion(txtDescripcion.getText().toString().trim());
        buscarCategoria(0, jComboBox1.getSelectedItem().toString());
        System.out.println("ssdsdfsdaf" + jComboBox1.getSelectedItem().toString());
        System.out.println("dfsdfsdfsdfsdfsd" + c.getId());
        p.setCategoria(c);
        p.setpCompra(Double.parseDouble(txtPCompra.getText().toString().trim()));
        p.setpVenta(Double.parseDouble(txtPVenta.getText().toString().trim()));
        p.settGuardado(txtTGuardado.getText().toString().trim());
        IProductoServicio p1 = ProductoServicioFabrica.Construir();
        p1.modificar(p);

        limpiarTabla();
        llenarTablaProductos();
        limpiarCampos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (bandera == true) {
            int fila = this.jTable2.getSelectedRow();
            txtCod.setText(jTable2.getValueAt(fila, 0).toString());
            txt_nombre.setText(jTable2.getValueAt(fila, 1).toString());
            txtDescripcion.setText(jTable2.getValueAt(fila, 2).toString());
            this.jComboBox1.setSelectedItem(jTable2.getValueAt(fila, 3));
            txtPCompra.setText(jTable2.getValueAt(fila, 4).toString());
            txtPVenta.setText(jTable2.getValueAt(fila, 5).toString());
            txtTGuardado.setText(jTable2.getValueAt(fila, 6).toString());
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField5InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5InputMethodTextChanged

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed

    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped

    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        jTextField5.getText().toString();
        IProductoServicio pr = ProductoServicioFabrica.Construir();
        var productos = pr.buscarProductos(jTextField5.getText().toString());
        Object[] datos = new Object[modelo.getColumnCount()];
        limpiarTabla();
        for (Producto item : productos) {
            datos[0] = item.getCodProducto();
            datos[1] = item.getNombre();
            datos[2] = item.getDescripcion();
            datos[3] = item.getCategoria().getNombre();
            datos[4] = item.getpCompra();
            datos[5] = item.getpVenta();
            datos[6] = item.gettGuardado();
            modelo.addRow(datos);
        }
        this.jTable2.setModel(modelo);
        
    }//GEN-LAST:event_jTextField5KeyReleased

    private void buscarCategoria(int id, String nombre) {

        ICategoriaServicio c1 = CategoriaServicioFabrica.Construir();
        var categorias = c1.obtenerCategorias();

        if (nombre != "") {
            for (int i = 0; i < categorias.size(); i++) {
                if (nombre.equals(categorias.get(i).getNombre())) {
                    c.setId(categorias.get(i).getId());
                    System.out.println(categorias.get(i).getId());
                }
            }
        }

        if (id != 0) {
            for (int i = 0; i < categorias.size(); i++) {
                if (id == categorias.get(i).getId()) {
                    c.setNombre(categorias.get(i).getNombre());
                }
            }
        }
    }

    public void llenarComboBox() {
        jComboBox1.removeAllItems();
        this.jComboBox1.addItem("Selecciona");
        ICategoriaServicio c1 = CategoriaServicioFabrica.Construir();
        var categorias = c1.obtenerCategorias();
        for (int i = 0; i < categorias.size(); i++) {
            jComboBox1.addItem(categorias.get(i).getNombre());
        }
    }

    private void limpiarTabla() {
        for (int i = 0; i < this.jTable2.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    public void limpiarCampos() {
        txtCod.setText("");
        txt_nombre.setText("");
        txtDescripcion.setText("");
        llenarComboBox();
        txtPCompra.setText("");
        txtPVenta.setText("");
        txtTGuardado.setText("");

    }

    protected void llenarTablaProductos() {
        limpiarTabla();
        IProductoServicio ptt = ProductoServicioFabrica.Construir();
        var productos = ptt.obtenerProductos();
        Object[] datos = new Object[modelo.getColumnCount()];

        for (Producto item : productos) {

            datos[0] = item.getCodProducto();
            datos[1] = item.getNombre();
            datos[2] = item.getDescripcion();
            datos[3] = item.getCategoria().getNombre();
            datos[4] = item.getpCompra();
            datos[5] = item.getpVenta();
            datos[6] = item.gettGuardado();
            modelo.addRow(datos);
        }
        this.jTable2.setModel(modelo);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    protected javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    public javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPCompra;
    private javax.swing.JTextField txtPVenta;
    private javax.swing.JTextField txtTGuardado;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
