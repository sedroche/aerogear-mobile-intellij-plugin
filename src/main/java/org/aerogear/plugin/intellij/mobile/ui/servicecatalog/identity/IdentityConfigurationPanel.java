package org.aerogear.plugin.intellij.mobile.ui.servicecatalog.identity;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * This class is generated by and can be edited using the Netbeans GUI Builder.
 * To edit this file, open the ServicePanel.form file in the NetBeans GUI Builder.
 * To view the generated source code, choose Source within the Netbeans GUI Builder.
 */
public class IdentityConfigurationPanel extends javax.swing.JPanel {

    /**
     * Creates new form KeycloakConfiguration
     */
    public IdentityConfigurationPanel() {
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

        projectName = new javax.swing.JLabel();
        projectSelector = new javax.swing.JComboBox<>();
        username = new javax.swing.JLabel();
        usernameValue = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordValue = new javax.swing.JTextField();

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(700, 400));

        projectName.setText("* Add to Project");

        projectSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "myproject" }));
        projectSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectSelectorActionPerformed(evt);
            }
        });

        username.setText("* Keycloak admin username");

        usernameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameValueActionPerformed(evt);
            }
        });

        password.setText("* Keycloak admin password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectName)
                            .addComponent(username)
                            .addComponent(password))
                        .addGap(0, 498, Short.MAX_VALUE))
                    .addComponent(usernameValue)
                    .addComponent(passwordValue))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(projectName)
                .addGap(18, 18, 18)
                .addComponent(projectSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(username)
                .addGap(18, 18, 18)
                .addComponent(usernameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void projectSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectSelectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectSelectorActionPerformed

    private void usernameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameValueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordValue;
    private javax.swing.JLabel projectName;
    private javax.swing.JComboBox<String> projectSelector;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameValue;
    // End of variables declaration//GEN-END:variables

    public JTextField getPasswordValue() {
        return passwordValue;
    }

    public JComboBox<String> getProjectSelector() {
        return projectSelector;
    }

    public JTextField getUsernameValue() {
        return usernameValue;
    }
}
