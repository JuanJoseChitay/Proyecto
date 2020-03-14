/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class ventanaPrincipiante extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipiante
     */
    public ventanaPrincipiante() {
        initComponents();
    }
    
    Random ra = new Random();// creando un objeto de la clas Random con el nombre de ra
    
    int n1 = ra.nextInt(20);
    int n2 = ra.nextInt(20);
    int r1 = 0;

    public int sumar(int num1, int num2) {
        
        this.n1 = num1;
        this.n2 = num2;

        r1 = n1 + n2;

        return r1;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelSumaPrincipiante1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelSumaPrincipiante2 = new javax.swing.JLabel();
        txtResultadoSuma1 = new javax.swing.JTextField();
        txtResultadoSuma2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        labelRestaPrincipiante1 = new javax.swing.JLabel();
        labelRestaPrincipiante2 = new javax.swing.JLabel();
        txtResultadoResta1 = new javax.swing.JTextField();
        txtResultadoResta2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        labelMultiplicacionPrincipiante1 = new javax.swing.JLabel();
        labelMultiplicacionPrincipiante2 = new javax.swing.JLabel();
        txtResultadoMultiplicacion1 = new javax.swing.JTextField();
        txtResultadoMultiplicacion2 = new javax.swing.JTextField();
        botonEnviarPrincipiante = new javax.swing.JButton();
        botonMostrarPrincipiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Nivel Principiante");

        jLabel2.setText("*SUMAS");

        labelSumaPrincipiante1.setText("jLabel4");

        jLabel4.setText("Resuelva Operaciones Aritmeticas Aleatorias");

        labelSumaPrincipiante2.setText("jLabel5");

        jLabel6.setText("*RESTAS");

        labelRestaPrincipiante1.setText("jLabel7");

        labelRestaPrincipiante2.setText("jLabel8");

        txtResultadoResta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoResta2ActionPerformed(evt);
            }
        });

        jLabel9.setText("*MULTIPLICACION");

        labelMultiplicacionPrincipiante1.setText("jLabel10");

        labelMultiplicacionPrincipiante2.setText("jLabel11");

        txtResultadoMultiplicacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoMultiplicacion2ActionPerformed(evt);
            }
        });

        botonEnviarPrincipiante.setText("Enviar");
        botonEnviarPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarPrincipianteActionPerformed(evt);
            }
        });

        botonMostrarPrincipiante.setText("Mostrar");
        botonMostrarPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarPrincipianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSumaPrincipiante2)
                                    .addComponent(labelSumaPrincipiante1))
                                .addGap(93, 93, 93))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRestaPrincipiante1)
                                    .addComponent(labelRestaPrincipiante2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtResultadoResta1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultadoResta2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMultiplicacionPrincipiante2)
                                    .addComponent(labelMultiplicacionPrincipiante1))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResultadoMultiplicacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultadoMultiplicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonEnviarPrincipiante)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultadoSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(txtResultadoSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonMostrarPrincipiante)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(botonMostrarPrincipiante))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSumaPrincipiante1)
                    .addComponent(txtResultadoSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSumaPrincipiante2)
                    .addComponent(txtResultadoSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRestaPrincipiante1)
                    .addComponent(txtResultadoResta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRestaPrincipiante2)
                    .addComponent(txtResultadoResta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMultiplicacionPrincipiante1)
                    .addComponent(txtResultadoMultiplicacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMultiplicacionPrincipiante2)
                    .addComponent(txtResultadoMultiplicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(botonEnviarPrincipiante)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadoResta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoResta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoResta2ActionPerformed

    private void txtResultadoMultiplicacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoMultiplicacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoMultiplicacion2ActionPerformed

    private void botonMostrarPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarPrincipianteActionPerformed

        labelSumaPrincipiante1.setText(+n1 + "+" + n2);


    }//GEN-LAST:event_botonMostrarPrincipianteActionPerformed

    private void botonEnviarPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarPrincipianteActionPerformed

        int num = this.sumar(n1, n2);
        System.out.println(num);
        int perro = Integer.parseInt(txtResultadoSuma1.getText());
        if (num == perro) {
            System.out.println("son iguales");
        } else {

            System.out.println("NO SON IGUALES MULAAAAAAAA!!!!");
        }

    }//GEN-LAST:event_botonEnviarPrincipianteActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonEnviarPrincipiante;
    private javax.swing.JButton botonMostrarPrincipiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel labelMultiplicacionPrincipiante1;
    public javax.swing.JLabel labelMultiplicacionPrincipiante2;
    public javax.swing.JLabel labelRestaPrincipiante1;
    public javax.swing.JLabel labelRestaPrincipiante2;
    public javax.swing.JLabel labelSumaPrincipiante1;
    public javax.swing.JLabel labelSumaPrincipiante2;
    public javax.swing.JTextField txtResultadoMultiplicacion1;
    public javax.swing.JTextField txtResultadoMultiplicacion2;
    public javax.swing.JTextField txtResultadoResta1;
    public javax.swing.JTextField txtResultadoResta2;
    public javax.swing.JTextField txtResultadoSuma1;
    public javax.swing.JTextField txtResultadoSuma2;
    // End of variables declaration//GEN-END:variables
}
