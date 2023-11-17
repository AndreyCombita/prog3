
package javaapplication2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class simulador extends javax.swing.JFrame {
    int pedalazos2=0;//estan inicializando estas variables, ya que nos van a ayudar con el control de programa
    int pedalazos1=0;
    int ca=0;
    int opc=0;
    
    

    public simulador() {
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

        pedal1 = new javax.swing.JButton();
        pedal2 = new javax.swing.JButton();
        Ind1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cont = new javax.swing.JTextField();
        Auto = new javax.swing.JButton();
        Manual = new javax.swing.JButton();
        no = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pedal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedal1.PNG"))); // NOI18N
        pedal1.setText("Pedal 1");
        pedal1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pedal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedal1MouseClicked(evt);
            }
        });
        pedal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedal1ActionPerformed(evt);
            }
        });
        pedal1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pedal1PropertyChange(evt);
            }
        });

        pedal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedal2.PNG"))); // NOI18N
        pedal2.setText("Pedal 2");
        pedal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedal2MouseClicked(evt);
            }
        });
        pedal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedal2ActionPerformed(evt);
            }
        });

        Ind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ind1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Click por pedal");

        jLabel2.setText("calorias");

        Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContActionPerformed(evt);
            }
        });

        Auto.setText("Automatico");
        Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoActionPerformed(evt);
            }
        });

        Manual.setText("Manual");
        Manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualActionPerformed(evt);
            }
        });

        no.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Auto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Manual)
                        .addGap(10, 10, 10)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pedal1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(pedal2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(Cont, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(no)
                                .addGap(43, 43, 43)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(Ind1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cont, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ind1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(Auto))
                    .addComponent(no))
                .addGap(18, 18, 18)
                .addComponent(Manual)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedal2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedal1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void pedal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedal1ActionPerformed
       int num=Integer.parseInt(Cont.getText());//funciona para saber en cuantos clicks por pedal se necesita para cada uno
       if (num<1){
           no.setText("no se puede colocar numeros menores a 1");
       }else{
       if (pedal1.isVisible()) { // Verificar visibilidad
            pedalazos1 += 1; // Incrementar contador de pedalazos para pedal1
            if (pedalazos1 == num) {
                ca += 1;
                Ind1.setText(Integer.toString(ca));
                pedal1.setVisible(false);
                pedal2.setVisible(true);
                pedalazos1 = 0;
            }
        }} 
    }//GEN-LAST:event_pedal1ActionPerformed

    private void Ind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ind1ActionPerformed

    }//GEN-LAST:event_Ind1ActionPerformed

    private void pedal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedal2ActionPerformed
        int num=Integer.parseInt(Cont.getText());// ocurre algo similar a al anterior metodo señalado
        if (num<1){
            no.setText("no se puede colocar numeros menores a 1");
        }else{
        if (pedal2.isVisible()) { // Verificar visibilidad
            pedalazos2 += 1; // Incrementar contador de pedalazos para pedal2
            if (pedalazos2 == num) {
                pedal2.setVisible(false);
                pedal1.setVisible(true);
                pedalazos2 = 0;
            }
        }}    
    }//GEN-LAST:event_pedal2ActionPerformed
        
    private void pedal1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pedal1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_pedal1PropertyChange

    private void pedal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedal1MouseClicked
    
    }//GEN-LAST:event_pedal1MouseClicked

    private void pedal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedal2MouseClicked
     
    }//GEN-LAST:event_pedal2MouseClicked

    private void ContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContActionPerformed

    private void AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoActionPerformed
        opc = 1;
        if (opc == 1) {
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (opc == 1) {
                        // Alternar entre pedal1 y pedal2
                        if (pedal1.isVisible()) {
                            pedal1ActionPerformed(e);
                        } else {
                            pedal2ActionPerformed(e);
                        }
                    }
                }
            });
            timer.start();
        }
    }//GEN-LAST:event_AutoActionPerformed

    private void ManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualActionPerformed
       opc=0;
    }//GEN-LAST:event_ManualActionPerformed

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
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulador().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Auto;
    private javax.swing.JTextField Cont;
    private javax.swing.JTextField Ind1;
    private javax.swing.JButton Manual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel no;
    private javax.swing.JButton pedal1;
    private javax.swing.JButton pedal2;
    // End of variables declaration//GEN-END:variables
}
