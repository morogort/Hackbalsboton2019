/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Login_Controller;

/**
 *
 * @author edgar
 */
public class QuestionValidate extends javax.swing.JFrame {
    private String email;
    /**
     * Creates new form QuestionValidate
     */
    public QuestionValidate(String email) {
        this.email = email;
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

        questionsFields = new javax.swing.JComboBox<>();
        answerField = new javax.swing.JTextField();
        validateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionsFields.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuantas veces lloraste en el semestre?", "¿Quieres darte de baja?", "¿Cuantas materias reprobaste?", "¿Eres feliz?" }));

        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.setText("Answer");
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        validateButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        validateButton.setText("Validate");
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tamil MN", 0, 24)); // NOI18N
        jLabel1.setText("Please enter the correct answer to the security question");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionsFields, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(validateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(questionsFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(validateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(168, 168, 168))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed

    private void validateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonActionPerformed
        if (new Login_Controller().validateQuestion(email, answerField.getText(), questionsFields.getSelectedIndex())){
            new NewPassword(email).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_validateButtonActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> questionsFields;
    private javax.swing.JButton validateButton;
    // End of variables declaration//GEN-END:variables
}
