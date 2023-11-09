/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tragamoneda;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Tragamoneda extends javax.swing.JFrame {

    Persona1 p1;
    Persona2 p2;
    Persona3 p3;

    boolean respuesta1 = false;
    boolean respuesta2 = false;
    boolean respuesta3 = false;

    /**
     * Creates new form frmPersonas
     */
    public Tragamoneda() {
        initComponents();
        this.setTitle("FRANCISCO TAPUY HILOS");
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPersona2 = new javax.swing.JLabel();
        lblPersona3 = new javax.swing.JLabel();
        lblPersona1 = new javax.swing.JLabel();
        btnDetenerPersona1 = new javax.swing.JButton();
        btnDetenerPersona2 = new javax.swing.JButton();
        btnDetenerPersona3 = new javax.swing.JButton();
        cbDificultad = new javax.swing.JComboBox<String>();
        btnIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 3), new java.awt.Dimension(0, 3), new java.awt.Dimension(32767, 3));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego de frutas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPersona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/1.png"))); // NOI18N
        jPanel1.add(lblPersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 140, -1));

        lblPersona3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/1.png"))); // NOI18N
        jPanel1.add(lblPersona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 140, -1));

        lblPersona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/1.png"))); // NOI18N
        jPanel1.add(lblPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 145, 150));

        btnDetenerPersona1.setBackground(new java.awt.Color(0, 255, 153));
        btnDetenerPersona1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetenerPersona1.setText("Detener");
        btnDetenerPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetenerPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 50));

        btnDetenerPersona2.setBackground(new java.awt.Color(0, 255, 153));
        btnDetenerPersona2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetenerPersona2.setText("Detener");
        btnDetenerPersona2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetenerPersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 50));

        btnDetenerPersona3.setBackground(new java.awt.Color(0, 255, 153));
        btnDetenerPersona3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetenerPersona3.setText("Detener");
        btnDetenerPersona3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerPersona3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetenerPersona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, 50));

        cbDificultad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDificultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Difícil", "Normal", "Fácil" }));
        cbDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDificultadActionPerformed(evt);
            }
        });
        jPanel1.add(cbDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 100, 40));

        btnIniciar.setBackground(new java.awt.Color(204, 0, 204));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 120, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/Francisco.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 110, 130));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/DS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesFrutas/bgt.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 20, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int tiempoMilisegundos = 0;
        switch (cbDificultad.getSelectedIndex()) {
            case 0:
                tiempoMilisegundos = 0;
                break;
            case 1:
                tiempoMilisegundos = 100;
                break;
            case 2:
                tiempoMilisegundos = 500;
                break;
            default:
                tiempoMilisegundos = 0;
        }
        Persona p1 = new Persona(tiempoMilisegundos);
        Persona p2 = new Persona(tiempoMilisegundos);
        Persona p3 = new Persona(tiempoMilisegundos);
        respuesta1 = false;
        respuesta2 = false;
        respuesta3 = false;
        btnIniciar.setEnabled(false);
        p1.start();
        p2.start();
        p3.start();
    }                                          

    private void btnDetenerPersona1ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        p1.stop();
        respuesta1 = true;
        comprobarResultado();
    }                                                  

    private void btnDetenerPersona2ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        p2.stop();
        respuesta2 = true;
        comprobarResultado();
    }                                                  

    private void btnDetenerPersona3ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        p3.stop();
        respuesta3 = true;
        comprobarResultado();
    }                                                  

    private void cbDificultadActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(frmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDetenerPersona1;
    private javax.swing.JButton btnDetenerPersona2;
    private javax.swing.JButton btnDetenerPersona3;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cbDificultad;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblPersona1;
    public static javax.swing.JLabel lblPersona2;
    public static javax.swing.JLabel lblPersona3;
    // End of variables declaration                   

    private void comprobarResultado() {
        if (respuesta1 && respuesta2 && respuesta3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(frmPersonas.class.getName()).log(Level.SEVERE, null, ex);
            }
            btnIniciar.setEnabled(true);
            if (lblPersona1.getIcon().toString().equals(lblPersona2.getIcon().toString()) && lblPersona1.getIcon().toString().equals(lblPersona3.getIcon().toString())) {
                JOptionPane.showMessageDialog(null, "Felicitaciones, has ganado!");
            } else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
            }
        }
    }
}
