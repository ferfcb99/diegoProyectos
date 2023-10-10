/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class MesajePantalla extends javax.swing.JFrame {

    /**
     * Creates new form MesajePantalla
     */
    public MesajePantalla() {
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
        jtfNombre = new javax.swing.JTextField();
        btnMostrarMensaje = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        numeroUno = new javax.swing.JTextField();
        numeroDos = new javax.swing.JTextField();
        jbSuma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfNombre.setBackground(new java.awt.Color(51, 223, 255));
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, 35));
        jtfNombre.getAccessibleContext().setAccessibleName("");

        btnMostrarMensaje.setText("Mostrar ");
        btnMostrarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMensajeMouseClicked(evt);
            }
        });
        jPanel1.add(btnMostrarMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jlNombre.setText("Tu nombre:");
        jPanel1.add(jlNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        numeroUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroUnoActionPerformed(evt);
            }
        });
        jPanel1.add(numeroUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 120, 35));
        jPanel1.add(numeroDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 120, 35));

        jbSuma.setText("Suma");
        jbSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSumaMouseClicked(evt);
            }
        });
        jPanel1.add(jbSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, -1, -1));

        jLabel1.setText("+");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMensajeMouseClicked
        String contenidoDeCampoDeTexto = jtfNombre.getText();
        // System.out.println("El nombre permitido es: " + contenidoDeCampoDeTexto);
        JOptionPane.showMessageDialog(null, "El nombre permitido es: " + contenidoDeCampoDeTexto);
    }//GEN-LAST:event_btnMostrarMensajeMouseClicked

    private void numeroUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroUnoActionPerformed

    private void jbSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSumaMouseClicked
        // TODO add your handling code here:
        // validar que solo se sumen numeros
       try {
            double numeroUno = Double.parseDouble(this.numeroUno.getText());
            double numeroDos = Double.parseDouble(this.numeroDos.getText());
            double suma = numeroUno + numeroDos;
            JOptionPane.showMessageDialog(null,"La suma de " + numeroUno + " + " + numeroDos + " es : " + suma);
       } catch (NumberFormatException exception) {
           JOptionPane.showMessageDialog(this, "Favor de ingresar unicamente valores numericos");
        }

    }//GEN-LAST:event_jbSumaMouseClicked

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
            java.util.logging.Logger.getLogger(MesajePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesajePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesajePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesajePantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesajePantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSuma;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField numeroDos;
    private javax.swing.JTextField numeroUno;
    // End of variables declaration//GEN-END:variables
}
