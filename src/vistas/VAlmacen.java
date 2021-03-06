/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import javax.swing.table.DefaultTableModel;
import manejoProductos.almacen.Almacen;
import manejoProductos.almacen.AlmacenServicioFabrica;
import manejoProductos.almacen.IAlmacenServicio;
import manejoProductos.categoria.Categoria;
import manejoProductos.categoria.CategoriaServicioFabrica;
import manejoProductos.categoria.ICategoriaServicio;
import manejoProductos.existencia.Existencia;
import manejoProductos.existencia.IServicioExistencia;
import manejoProductos.existencia.ServicioExistenciaFabrica;
import manejoProductos.producto.IProductoServicio;
import manejoProductos.producto.Producto;
import manejoProductos.producto.ProductoServicioFabrica;

/**
 *
 * @author Brayan
 */
public class VAlmacen extends javax.swing.JPanel {

    DefaultTableModel modelo;
    Almacen a = new Almacen();
    protected boolean bandera;

    /**
     * Creates new form Clientes
     */
    public VAlmacen() {
        initComponents();
        this.add(jptabla).setBounds(300, 0, 900, 800);
        modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ubicacion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Tipo de almacen");

        this.jTable1.setModel(modelo);
        llenarTablaAlmacen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnModificarAlmacen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrarAlmacen = new javax.swing.JButton();
        jptabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nombre:");

        btnModificarAlmacen.setBackground(new java.awt.Color(255, 204, 102));
        btnModificarAlmacen.setText("Modificar");
        btnModificarAlmacen.setBorder(null);
        btnModificarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlmacenActionPerformed(evt);
            }
        });

        jLabel2.setText("Ubicacion:");

        txtUbicacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Telefono:");

        txtTelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRegistrarAlmacen.setBackground(new java.awt.Color(255, 204, 102));
        btnRegistrarAlmacen.setText("Registrar");
        btnRegistrarAlmacen.setBorder(null);
        btnRegistrarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlmacenActionPerformed(evt);
            }
        });

        jptabla.setBackground(new java.awt.Color(255, 255, 255));
        jptabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jptablaLayout = new javax.swing.GroupLayout(jptabla);
        jptabla.setLayout(jptablaLayout);
        jptablaLayout.setHorizontalGroup(
            jptablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jptablaLayout.setVerticalGroup(
            jptablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jptablaLayout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jptabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jptabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlmacenActionPerformed
        var almacenf = AlmacenServicioFabrica.construir();
        var almacen = new Almacen();

        almacen.setNombre(txtNombre.getText().toString().trim());
        almacen.setUbicacion(txtUbicacion.getText().toString().trim());
        almacen.setTelefono(txtTelefono.getText().toString().trim());

        almacenf.modificar(almacen);
        llenarTablaAlmacen();
        limpiarCampos();
    }//GEN-LAST:event_btnModificarAlmacenActionPerformed

    private void btnRegistrarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlmacenActionPerformed
        var almacenf = AlmacenServicioFabrica.construir();
        var almacen = new Almacen();

        almacen.setNombre(txtNombre.getText().toString().trim());
        almacen.setUbicacion(txtUbicacion.getText().toString().trim());
        almacen.setTelefono(txtTelefono.getText().toString().trim());
        
        almacenf.registrar(almacen);
        registrarExistencia(almacen,txtNombre.getText().toString().trim());
        llenarTablaAlmacen();
        limpiarCampos();
    }//GEN-LAST:event_btnRegistrarAlmacenActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (bandera == true) {
            obtenerDatosTabla();
        }

    }//GEN-LAST:event_jTable1MouseClicked

    public void llenarTablaAlmacen() {
        limpiarTablaAlmacen();
        Object[] datos = new Object[modelo.getColumnCount()];

        IAlmacenServicio a1 = AlmacenServicioFabrica.construir();

        var almacen = a1.obtenerAlmacenes();

        for (Almacen item : almacen) {
            datos[0] = item.getIdAlmacen();
            datos[1] = item.getNombre();
            datos[2] = item.getUbicacion();
            datos[3] = item.getTelefono();
            datos[4] = item.gettAlmacen();
            modelo.addRow(datos);
        }
        this.jTable1.setModel(modelo);
    }

    private void limpiarTablaAlmacen() {
        for (int i = 0; i < this.jTable1.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    private void obtenerDatosTabla() {
        int fila = this.jTable1.getSelectedRow();
        a.setIdAlmacen(Integer.parseInt(this.jTable1.getValueAt(fila, 0).toString()));
        txtNombre.setText(jTable1.getValueAt(fila, 1).toString());
        txtUbicacion.setText(jTable1.getValueAt(fila, 2).toString());
        txtTelefono.setText(jTable1.getValueAt(fila, 3).toString());
        //txtNombre.setText(jTable1.getValueAt(fila,1).toString());
    }
    
    public void limpiarCampos(){
        txtNombre.setText("");
        txtUbicacion.setText("");
        txtTelefono.setText("");
    }
    
    public void registrarExistencia(Almacen a,String nombre){
        IServicioExistencia ise = ServicioExistenciaFabrica.construir();
        IProductoServicio as = ProductoServicioFabrica.Construir();
        IAlmacenServicio ass= AlmacenServicioFabrica.construir();
        Existencia e = new Existencia();
        e.setAlmacen(a);
        e.setAlmacen(ass.buscarAlmacen(nombre).get(0));
        e.setCantidad(0);
        ise.registrarExistenciaAlmacen(e,as.obtenerProductos());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnModificarAlmacen;
    public javax.swing.JButton btnRegistrarAlmacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    private javax.swing.JPanel jptabla;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
