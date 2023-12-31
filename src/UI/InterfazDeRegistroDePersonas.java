package UI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class InterfazDeRegistroDePersonas extends javax.swing.JFrame {

    /**
     * Creates new form InterfazDeRegistroDePersonas
     */
    List<Persona> personas = new ArrayList<>();

    public InterfazDeRegistroDePersonas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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
        jlNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfOcupacion = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jftApellido = new javax.swing.JTextField();
        jtfEdad = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ocupacion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, 30));
        jLabel1.getAccessibleContext().setAccessibleName("jLOcupacion");

        jlNombre.setText("Nombre");
        jPanel1.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 60, 30));

        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 60, 30));

        jLabel4.setText("Edad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 60, 30));
        jLabel4.getAccessibleContext().setAccessibleName("jlEdad");

        jtfOcupacion.setToolTipText("");
        jPanel1.add(jtfOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 200, 30));

        jtfNombre.setToolTipText("");
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 200, 30));

        jftApellido.setToolTipText("");
        jPanel1.add(jftApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, 30));

        jtfEdad.setToolTipText("");
        jtfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEdadActionPerformed(evt);
            }
        });
        jPanel1.add(jtfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 80, 30));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        jtPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "EDAD", "OCUPACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtPersonas);
        if (jtPersonas.getColumnModel().getColumnCount() > 0) {
            jtPersonas.getColumnModel().getColumn(1).setResizable(false);
            jtPersonas.getColumnModel().getColumn(2).setResizable(false);
            jtPersonas.getColumnModel().getColumn(3).setResizable(false);
            jtPersonas.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 790, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEdadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = jtfNombre.getText();
        String edad = jtfEdad.getText();
        String apellido = jftApellido.getText();
        String ocupacion = jtfOcupacion.getText();
        
        // agregar lo necesarioa para que el id (primer atributo) se inserte de forma secuencial
        Persona persona = new Persona(1, nombre, apellido, Integer.parseInt(edad), ocupacion);
        agregarPersona(persona);
        imprimeLista(this.personas);
        
        // crear una funcion que dado un indice, y una lista, elimine el elemento con dicho indice
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       llenarTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        this.personas.remove(1);
        imprimeLista(personas);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void agregarPersona(Persona persona) {

        if(persona.getNombre().length() > 0 && persona.getApellido().length() > 0 && persona.getOcupacion().length() > 0 && persona.getEdad() > 0){
            this.personas.add(persona);
            llenarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "Debe llenar los campos nombre, apellido, edad y ocupacion");
        }   
    }

    // retorna la edad si es valida, sino retorna -1
    public int esEntero(String edadCadena) { // division por cero, numberFormatException, Exception, -1
        Integer edadRetorno = -1;
        try {
            Integer edad = Integer.parseInt(edadCadena);
            if ((edad instanceof Integer) && edad != null) {
                edadRetorno = edad;
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }finally{
            return edadRetorno;
        }
    }
    
    
    public void imprimeLista(List<Persona> personas){
        System.out.println("---------------------");
        if(personas.size() > 0){
           for(Persona persona : personas){
               System.out.println(persona.getId() + " - " + persona.getNombre() + " - " + persona.getApellido() + " - " + persona.getEdad() + " - " + persona.getOcupacion());
           }
        }
        System.out.println("----------------------");
    }
    
    public void llenarTabla(){
        DefaultTableModel tablaPersonas = (DefaultTableModel) jtPersonas.getModel();
        this.personas.forEach(  persona -> {
            Object[] fila = new Object[5];
            fila[0] = persona.getId();
            fila[1] = persona.getNombre();
            fila[2] = persona.getApellido();
            fila[3] = persona.getEdad();
            fila[4] = persona.getOcupacion();
            
            tablaPersonas.addRow(fila);
            
        } );
    }

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
            java.util.logging.Logger.getLogger(InterfazDeRegistroDePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazDeRegistroDePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazDeRegistroDePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazDeRegistroDePersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDeRegistroDePersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jftApellido;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTable jtPersonas;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfOcupacion;
    // End of variables declaration//GEN-END:variables
}
