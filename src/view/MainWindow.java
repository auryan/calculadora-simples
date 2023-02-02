package view;

import calculadora.Calculadora;

public class MainWindow extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbOperacao;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextField tfResultado;
    private javax.swing.JTextField tfValor1;
    private javax.swing.JTextField tfValor2;
    // End of variables declaration//GEN-END:variables

    public MainWindow() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        lblTitulo = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        tfValor1 = new javax.swing.JTextField();
        lblValor2 = new javax.swing.JLabel();
        tfValor2 = new javax.swing.JTextField();
        lblOperacao = new javax.swing.JLabel();
        cbOperacao = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        tfResultado = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(70, 61, 75));
        setName("mainFrame"); // NOI18N
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 0, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora Simples");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblValor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor1.setLabelFor(tfValor1);
        lblValor1.setText("Informe o primeiro valor");
        lblValor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfValor1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfValor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblValor2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor2.setText("Informe o segundo valor");
        lblValor2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tfValor2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfValor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblOperacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOperacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperacao.setText("Informe o segundo valor");
        lblOperacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbOperacao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Somar", "Subtração", "Multiplicação", "Divisão" }));
        cbOperacao.setAlignmentX(0.0F);
        cbOperacao.setAlignmentY(0.0F);
        cbOperacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbOperacao.setFocusable(false);

        btnLimpar.setBackground(new java.awt.Color(211, 131, 110));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(121, 207, 121));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado");

        tfResultado.setEditable(false);
        tfResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfResultado.setForeground(new java.awt.Color(255, 0, 51));
        tfResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblValor1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                        .addComponent(lblValor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfValor2)
                                    .addComponent(tfValor1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(tfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Calculadora calc = new Calculadora(
                Double.parseDouble(tfValor1.getText()),
                Double.parseDouble(tfValor2.getText())
        );  
                
        switch (cbOperacao.getSelectedIndex()) {
            case 0:
                calc.Somar(calc.getValor1(), calc.getValor2());
                break;
                
            case 1:
                calc.Subtrair(calc.getValor1(), calc.getValor2());
                break;
                
            case 2:
                calc.Multiplicar(calc.getValor1(), calc.getValor2());
                break;
                
             case 3:
                calc.Dividir(calc.getValor1(), calc.getValor2());
                break;
        }
        
        tfResultado.setText(Double.toString(calc.getResultado()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        tfValor1.setText("");
        tfValor2.setText("");
        tfResultado.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}
