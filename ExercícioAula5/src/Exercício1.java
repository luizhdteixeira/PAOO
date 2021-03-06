
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * 1) Crie um programa que permita ao usuário cadastrar diversos carros.
 * Os dados que deverão ser armazenados dos carros são: marca, modelo,
 * ano de fabricação, ano do modelo e valor.
 * @author Luiz Teixeira
 * @since JFrame criado em 13/04/2018.
 */
public class Exercício1 extends javax.swing.JFrame {

    /**
     * Creates new form Exercício1
     */
    public Exercício1() {
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

        lbMarca = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        lbAnodeFabricação = new javax.swing.JLabel();
        lbAnodoModelo = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtAnodeFabricação = new javax.swing.JTextField();
        txtAnodoModelo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnAdiciona = new javax.swing.JButton();
        jspCarro = new javax.swing.JScrollPane();
        jtCarro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Carros");

        lbMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMarca.setText("Marca:");

        lbModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbModelo.setText("Modelo:");

        lbAnodeFabricação.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbAnodeFabricação.setText("Ano de Fabricação:");

        lbAnodoModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbAnodoModelo.setText("Ano do Modelo:");

        lbValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValor.setText("Valor:");

        txtMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAnodeFabricação.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtAnodoModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnAdiciona.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnAdiciona.setText("Adicionar");
        btnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaActionPerformed(evt);
            }
        });

        jtCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Ano de Fabricação", "Ano do Modelo", "Valor"
            }
        ));
        jspCarro.setViewportView(jtCarro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lbMarca)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAnodeFabricação)
                            .addComponent(lbModelo)
                            .addComponent(lbAnodoModelo)
                            .addComponent(lbValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMarca)
                    .addComponent(txtAnodeFabricação)
                    .addComponent(txtAnodoModelo)
                    .addComponent(txtValor)
                    .addComponent(txtModelo)
                    .addComponent(btnAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jspCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jspCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAnodeFabricação)
                            .addComponent(txtAnodeFabricação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAnodoModelo)
                            .addComponent(txtAnodoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaActionPerformed
        //Declaração das variavéis        
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        int anodeFabricação = Integer.parseInt(txtAnodeFabricação.getText());
        int anodoModelo = Integer.parseInt(txtAnodoModelo.getText());
        double valor = Double.parseDouble(txtValor.getText());
        
        //Construção da coleta de dados
        DefaultTableModel carro = (DefaultTableModel) jtCarro.getModel();
        
        //Criação do vetor da linha da tabela
        Object[] linha = new Object[5];  
                    
        //Descrição dos dados que serão introduzido na respectivas colunas da
        //tabela
        linha[0] = marca;
        linha[1] = modelo;
        linha[2] = anodeFabricação;
        linha[3] = anodoModelo;
        linha[4] = valor;
        
        //Método de aplicação dos dados na tabela
        carro.addRow(linha);
        
        //Limpeza nos campos de preenchimento para próxima adição de dados
        txtMarca.setText(null);
        txtModelo.setText(null);
        txtAnodeFabricação.setText(null);
        txtAnodoModelo.setText(null);
        txtValor.setText(null);
        
        //Incialização da aplicação com o ponto no campo determinado
        txtMarca.requestFocus();
        
        //Exibição de mensagem de sucesso, após cadastro.
        JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso!");
        
        
        
        
        
        
        
        
        
        
                
    }//GEN-LAST:event_btnAdicionaActionPerformed

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
            java.util.logging.Logger.getLogger(Exercício1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercício1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercício1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercício1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Exercício1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiciona;
    private javax.swing.JScrollPane jspCarro;
    private javax.swing.JTable jtCarro;
    private javax.swing.JLabel lbAnodeFabricação;
    private javax.swing.JLabel lbAnodoModelo;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField txtAnodeFabricação;
    private javax.swing.JTextField txtAnodoModelo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
