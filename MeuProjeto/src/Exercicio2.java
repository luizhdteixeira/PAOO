
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz.teixeira
 */
public class Exercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio2
     */
    public Exercicio2() {
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

        LbTitle = new javax.swing.JLabel();
        TFNumber = new javax.swing.JTextField();
        BtnOne = new javax.swing.JButton();
        BtnTwo = new javax.swing.JButton();
        BtnThree = new javax.swing.JButton();
        BtnPlus = new javax.swing.JButton();
        BtnFour = new javax.swing.JButton();
        BtnFive = new javax.swing.JButton();
        BtnSix = new javax.swing.JButton();
        BtnLess = new javax.swing.JButton();
        BtnSeven = new javax.swing.JButton();
        BtnEight = new javax.swing.JButton();
        BtnNine = new javax.swing.JButton();
        BtnMultiply = new javax.swing.JButton();
        BtnZero = new javax.swing.JButton();
        BtnEqual = new javax.swing.JButton();
        BtnDivide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        LbTitle.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        LbTitle.setText("Calculadora");

        BtnOne.setText("1");
        BtnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOneActionPerformed(evt);
            }
        });

        BtnTwo.setText("2");
        BtnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTwoActionPerformed(evt);
            }
        });

        BtnThree.setText("3");
        BtnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThreeActionPerformed(evt);
            }
        });

        BtnPlus.setText("+");
        BtnPlus.setMaximumSize(new java.awt.Dimension(37, 23));
        BtnPlus.setMinimumSize(new java.awt.Dimension(37, 23));
        BtnPlus.setPreferredSize(new java.awt.Dimension(37, 23));
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });

        BtnFour.setText("4");
        BtnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFourActionPerformed(evt);
            }
        });

        BtnFive.setText("5");
        BtnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFiveActionPerformed(evt);
            }
        });

        BtnSix.setText("6");
        BtnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSixActionPerformed(evt);
            }
        });

        BtnLess.setText("-");
        BtnLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLessActionPerformed(evt);
            }
        });

        BtnSeven.setText("7");
        BtnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSevenActionPerformed(evt);
            }
        });

        BtnEight.setText("8");
        BtnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEightActionPerformed(evt);
            }
        });

        BtnNine.setText("9");
        BtnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNineActionPerformed(evt);
            }
        });

        BtnMultiply.setText("*");
        BtnMultiply.setMaximumSize(new java.awt.Dimension(37, 23));
        BtnMultiply.setMinimumSize(new java.awt.Dimension(37, 23));
        BtnMultiply.setPreferredSize(new java.awt.Dimension(37, 23));
        BtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplyActionPerformed(evt);
            }
        });

        BtnZero.setText("0");
        BtnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnZeroActionPerformed(evt);
            }
        });

        BtnEqual.setText("=");
        BtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualActionPerformed(evt);
            }
        });

        BtnDivide.setText("/");
        BtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LbTitle)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TFNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSeven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnEight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnZero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnDivide)
                            .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnFour)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnFive)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSix)
                                .addGap(18, 18, 18)
                                .addComponent(BtnLess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnOne)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnTwo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnThree)
                                .addGap(18, 18, 18)
                                .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOne)
                    .addComponent(BtnTwo)
                    .addComponent(BtnThree)
                    .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFour)
                    .addComponent(BtnFive)
                    .addComponent(BtnSix)
                    .addComponent(BtnLess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSeven)
                    .addComponent(BtnEight)
                    .addComponent(BtnNine)
                    .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnZero)
                    .addComponent(BtnEqual)
                    .addComponent(BtnDivide))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOneActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número um.");
    }//GEN-LAST:event_BtnOneActionPerformed

    private void BtnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTwoActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número dois.");
    }//GEN-LAST:event_BtnTwoActionPerformed

    private void BtnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThreeActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número três.");
    }//GEN-LAST:event_BtnThreeActionPerformed

    private void BtnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFourActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número quatro.");
    }//GEN-LAST:event_BtnFourActionPerformed

    private void BtnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFiveActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número cinco.");
    }//GEN-LAST:event_BtnFiveActionPerformed

    private void BtnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSixActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número seis.");
    }//GEN-LAST:event_BtnSixActionPerformed

    private void BtnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSevenActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número sete.");
    }//GEN-LAST:event_BtnSevenActionPerformed

    private void BtnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEightActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número oito.");
    }//GEN-LAST:event_BtnEightActionPerformed

    private void BtnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNineActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número nove.");
    }//GEN-LAST:event_BtnNineActionPerformed

    private void BtnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnZeroActionPerformed
        JOptionPane.showMessageDialog(null, "Você digitou o número zero.");
    }//GEN-LAST:event_BtnZeroActionPerformed

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
        JOptionPane.showMessageDialog(null, "Você quer somar?");
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLessActionPerformed
        JOptionPane.showMessageDialog(null, "Você quer subtrair?");
    }//GEN-LAST:event_BtnLessActionPerformed

    private void BtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplyActionPerformed
        JOptionPane.showMessageDialog(null, "Você quer multiplicar?");
    }//GEN-LAST:event_BtnMultiplyActionPerformed

    private void BtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivideActionPerformed
        JOptionPane.showMessageDialog(null, "Você quer dividir?");
    }//GEN-LAST:event_BtnDivideActionPerformed

    private void BtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualActionPerformed
        JOptionPane.showMessageDialog(null, "Você quer resultado?");
    }//GEN-LAST:event_BtnEqualActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDivide;
    private javax.swing.JButton BtnEight;
    private javax.swing.JButton BtnEqual;
    private javax.swing.JButton BtnFive;
    private javax.swing.JButton BtnFour;
    private javax.swing.JButton BtnLess;
    private javax.swing.JButton BtnMultiply;
    private javax.swing.JButton BtnNine;
    private javax.swing.JButton BtnOne;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JButton BtnSeven;
    private javax.swing.JButton BtnSix;
    private javax.swing.JButton BtnThree;
    private javax.swing.JButton BtnTwo;
    private javax.swing.JButton BtnZero;
    private javax.swing.JLabel LbTitle;
    private javax.swing.JTextField TFNumber;
    // End of variables declaration//GEN-END:variables
}
