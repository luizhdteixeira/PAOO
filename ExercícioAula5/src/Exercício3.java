
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 3) Crie um programa que permita ao usuário cadastrar diversos alunos.
 * Os dados que deverão ser armazenados dos alunos são: matrícula, nome,
 * cpf, média final e situação. O campo situação é calculado a partir da
 * média final e exibe se o aluno esta aprovado ou não.
 * @author Aluno
 */
public class Exercício3 extends javax.swing.JFrame {

    /**
     * Creates new form Exercício3
     */
    public Exercício3() {
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

        lbMatrícula = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbMédiaFinal = new javax.swing.JLabel();
        txtMatrícula = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtMédiaFinal = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jspAlunos = new javax.swing.JScrollPane();
        jtAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMatrícula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbMatrícula.setText("Matrícula");

        lbNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNome.setText("Nome");

        lbCPF.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbCPF.setText("CPF");

        lbMédiaFinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbMédiaFinal.setText("Média Final");

        txtMatrícula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtCPF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtMédiaFinal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jtAlunos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtAlunos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "CPF", "Média Final", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspAlunos.setViewportView(jtAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatrícula)
                            .addComponent(txtMatrícula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMédiaFinal)
                            .addComponent(txtMédiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jspAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatrícula)
                    .addComponent(lbNome)
                    .addComponent(lbCPF)
                    .addComponent(lbMédiaFinal))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrícula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMédiaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jspAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //Declarações das variavéis
        int matrícula = Integer.parseInt(txtMatrícula.getText());
        String nome = txtNome.getText();
        String numCPF = txtCPF.getText();
        float médiaFinal = Float.parseFloat(txtMédiaFinal.getText());
        String situação;
        
        if(médiaFinal >= 6){
            situação = "Aprovado!";
        }
        else{
            situação = "Reprovado!";
        }
        
        DefaultTableModel alunos = (DefaultTableModel) jtAlunos.getModel();
        
        Object[] linha = new Object[5];
        
        linha[0] = matrícula;
        linha[1] = nome;
        linha[2] = numCPF;
        linha[3] = médiaFinal;
        linha[4] = situação;
        
        alunos.addRow(linha);
        
        txtMatrícula.setText(null);
        txtNome.setText(null);
        txtCPF.setText(null);
        txtMédiaFinal.setText(null);
        
        txtMatrícula.requestFocus();
        
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Exercício3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercício3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercício3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercício3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercício3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JScrollPane jspAlunos;
    private javax.swing.JTable jtAlunos;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbMatrícula;
    private javax.swing.JLabel lbMédiaFinal;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtMatrícula;
    private javax.swing.JTextField txtMédiaFinal;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
