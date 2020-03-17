package vista;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class ventanaPrincipiante extends javax.swing.JFrame {

    public ventanaPrincipiante() {
        initComponents();

    }

    ArrayList<Object> respuesta = new ArrayList<>();
  Object[] respuestas = new Object[15];
    Random ra = new Random();// creando un objeto de la clase Random con el nombre de ra

    int numero1Suma1 = ra.nextInt(20);
    int numero2Suma1 = ra.nextInt(20);
    int numero1Suma2 = ra.nextInt(20);
    int numero2Suma2 = ra.nextInt(20);

    int numero1Resta1 = ra.nextInt(20);
    int numero2Resta1 = ra.nextInt(20);
    int numero1Resta2 = ra.nextInt(20);
    int numero2Resta2 = ra.nextInt(20);

    int numero1Multiplicacion1 = ra.nextInt(20);
    int numero2Multiplicacion1 = ra.nextInt(20);
    int numero1Multiplicacion2 = ra.nextInt(20);
    int numero2Multiplicacion2 = ra.nextInt(20);

    int r1 = 0;
    int r2 = 0;
    int r3 = 0;
    int r4 = 0;
    int r5 = 0;
    int r6 = 0;

    public int sumar(int num1, int num2) {

        this.numero1Suma1 = num1;
        this.numero2Suma1 = num2;

        r1 = numero1Suma1 + numero2Suma1;

        return r1;

    }

    public int sumar2(int num1, int num2) {

        this.numero1Suma2 = num1;
        this.numero2Suma2 = num2;

        r2 = numero1Suma2 + numero2Suma2;

        return r2;

    }

    public int restar(int num1, int num2) {
        this.numero1Resta1 = num1;
        this.numero2Resta1 = num2;

        r3 = numero1Resta1 - numero2Resta1;

        return r3;

    }

    public int restar2(int num1, int num2) {
        this.numero1Resta2 = num1;
        this.numero2Resta2 = num2;

        r4 = numero1Resta2 - numero2Resta2;

        return r4;

    }

    public int Multiplicacion(int num1, int num2) {
        this.numero1Multiplicacion1 = num1;
        this.numero2Multiplicacion1 = num2;

        r5 = numero1Multiplicacion1 * numero2Multiplicacion1;

        return r5;

    }

    public int Multiplicacion2(int num1, int num2) {
        this.numero1Multiplicacion2 = num1;
        this.numero2Multiplicacion2 = num2;

        r6 = numero1Multiplicacion2 * numero2Multiplicacion2;

        return r6;

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

        jLabel4.setText("Resuelva Operaciones Aritmeticas Aleatorias");

        jLabel6.setText("*RESTAS");

        txtResultadoResta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoResta2ActionPerformed(evt);
            }
        });

        jLabel9.setText("*MULTIPLICACION");

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

        labelSumaPrincipiante1.setText(+numero1Suma1 + "+" + numero2Suma1);
        labelSumaPrincipiante2.setText(+numero1Suma2 + "+" + numero2Suma2);
        labelRestaPrincipiante1.setText(+numero1Resta1 + "-" + numero2Resta1);
        labelRestaPrincipiante2.setText(+numero1Resta2 + "-" + numero2Resta2);
        labelMultiplicacionPrincipiante1.setText(+numero1Multiplicacion1 + "*" + numero2Multiplicacion1);
        labelMultiplicacionPrincipiante2.setText(+numero1Multiplicacion2 + "*" + numero2Multiplicacion2);


    }//GEN-LAST:event_botonMostrarPrincipianteActionPerformed

    private void botonEnviarPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarPrincipianteActionPerformed

        try {
            int suma1 = this.sumar(numero1Suma1, numero2Suma1);
            int respuesta1 = Integer.parseInt(txtResultadoSuma1.getText());
            System.out.println(suma1);
            int suma2 = this.sumar2(numero1Suma2, numero2Suma2);
            System.out.println(suma2);
            int respuesta2 = Integer.parseInt(txtResultadoSuma2.getText());

            int resta1 = this.restar(numero1Resta1, numero2Resta1);
            int respuesta3 = Integer.parseInt(txtResultadoResta1.getText());
            int resta2 = this.restar2(numero1Resta2, numero2Resta2);
            int respuesta4 = Integer.parseInt(txtResultadoResta2.getText());

            int multiplicacion1 = this.Multiplicacion(numero1Multiplicacion1, numero2Multiplicacion1);
            int respuesta5 = Integer.parseInt(txtResultadoMultiplicacion1.getText());
            int multiplicacion2 = this.Multiplicacion2(numero1Multiplicacion2, numero2Multiplicacion2);
            int respuesta6 = Integer.parseInt(txtResultadoMultiplicacion2.getText());

            for (int i = 1; i < 10; i++) {

                switch (i) {
                    case 1:

                        if (suma1 == respuesta1) {
                            respuestas[1]="correcto";

                        } else {
                           respuestas[2]="incorrecto";
                        }

                        break;
                    case 2:

                        if (suma2 == respuesta2) {
                            respuestas[3]="correcto";

                        } else {
                           respuestas[4]="incorrecto";
                        }

                        break;

                    case 3:

                        if (resta1 == respuesta3) {
                            respuestas[5]="correcto";

                        } else {
                            respuestas[6]="incorrecto";
                        }
                        break;
                    case 4:

                        if (resta2 == respuesta4) {
                           respuestas[7]="correcto";

                        } else {
                            respuestas[8]="incorrecto";
                        }
                        break;
                    case 5:

                        if (multiplicacion1 == respuesta5) {
                           respuestas[9]="correcto";

                        } else {
                            respuestas[10]="incorrecto";
                        }
                        break;
                    case 6:

                        if (multiplicacion2 == respuesta6) {
                            respuestas[11]="correcto";

                        } else {
                          respuestas[12]="incorrecto";
                        }
//
                        break;
                    default:
                        System.out.println("ya valio");
                }

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

//        for (String a : respuesta) {
//            System.out.println(a);
//        }


     


        Object  select = JOptionPane.showInputDialog(null, "respuestas ", "PUNTEO ", JOptionPane.DEFAULT_OPTION,null,respuestas,0);

        respuesta.clear();


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
