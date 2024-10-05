/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.Profile;
/**
 *
 * @author Aniruddha
 */
public class CreateJPanel extends javax.swing.JPanel {
    Profile profile;
    /**
     * Creates new form CreateeJPanel
     */
    public CreateJPanel(Profile p) {
        profile=p;
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

        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblAddressLine1 = new javax.swing.JLabel();
        txtAddressLine1 = new javax.swing.JTextField();
        lblAddressLine2 = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        lblDateofBirth = new javax.swing.JLabel();
        txtDateofBirth = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        lblSex = new javax.swing.JLabel();
        lblVeteranStatus = new javax.swing.JLabel();
        txtVeteranStatus = new javax.swing.JTextField();
        txtTelephoneNumber = new javax.swing.JTextField();
        lblTelephoneNumber = new javax.swing.JLabel();
        lblPassportNumber = new javax.swing.JLabel();
        txtPassportNumber = new javax.swing.JTextField();
        txtFaxNumber = new javax.swing.JTextField();
        lblFaxNumber = new javax.swing.JLabel();
        txtSocialSecurityNumber = new javax.swing.JTextField();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        txtDLState = new javax.swing.JTextField();
        lblDLState = new javax.swing.JLabel();
        txtDLNumber = new javax.swing.JTextField();
        lblDLNumber = new javax.swing.JLabel();
        txtCounty = new javax.swing.JTextField();
        lblCounty = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        lblFirstName.setText("First Name");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setText("Last Name");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblPhone.setText("Phone");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lblAddressLine1.setText("Address Line 1");

        txtAddressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressLine1ActionPerformed(evt);
            }
        });

        lblAddressLine2.setText("Address Line 2");

        txtAddressLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressLine2ActionPerformed(evt);
            }
        });

        lblCity.setText("City");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblState.setText("State");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        lblZip.setText("Zip");

        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });

        lblCountry.setText("Country");

        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });

        lblDateofBirth.setText("Data of Birth");

        txtDateofBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateofBirthActionPerformed(evt);
            }
        });

        txtSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexActionPerformed(evt);
            }
        });

        lblSex.setText("Sex");

        lblVeteranStatus.setText("Veteran Status");

        txtVeteranStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVeteranStatusActionPerformed(evt);
            }
        });

        txtTelephoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneNumberActionPerformed(evt);
            }
        });

        lblTelephoneNumber.setText("Telephone Number");

        lblPassportNumber.setText("Passport Number");

        txtPassportNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportNumberActionPerformed(evt);
            }
        });

        txtFaxNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumberActionPerformed(evt);
            }
        });

        lblFaxNumber.setText("Fax Number");

        txtSocialSecurityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSocialSecurityNumberActionPerformed(evt);
            }
        });

        lblSocialSecurityNumber.setText("Social Security Number");

        txtDLState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDLStateActionPerformed(evt);
            }
        });

        lblDLState.setText("Drivers License State");

        txtDLNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDLNumberActionPerformed(evt);
            }
        });

        lblDLNumber.setText("Drivers License Number");

        txtCounty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountyActionPerformed(evt);
            }
        });

        lblCounty.setText("County");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Personal Profile");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblZip, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCounty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDLNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDLState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSocialSecurityNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFaxNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassportNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelephoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVeteranStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateofBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtVeteranStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDateofBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPassportNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtFaxNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDLState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtDLNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCounty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnSave)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateofBirth)
                    .addComponent(txtDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSex)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVeteranStatus)
                    .addComponent(txtVeteranStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephoneNumber)
                    .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine1)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassportNumber)
                    .addComponent(txtPassportNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine2)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaxNumber)
                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSocialSecurityNumber)
                    .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDLState)
                    .addComponent(txtDLState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDLNumber)
                    .addComponent(txtDLNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCounty)
                    .addComponent(txtCounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSave)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAddressLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine1ActionPerformed

    private void txtAddressLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine2ActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed

    private void txtDateofBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateofBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateofBirthActionPerformed

    private void txtSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexActionPerformed

    private void txtVeteranStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVeteranStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVeteranStatusActionPerformed

    private void txtTelephoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneNumberActionPerformed

    private void txtPassportNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportNumberActionPerformed

    private void txtFaxNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumberActionPerformed

    private void txtSocialSecurityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSocialSecurityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSocialSecurityNumberActionPerformed

    private void txtDLStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDLStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDLStateActionPerformed

    private void txtDLNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDLNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDLNumberActionPerformed

    private void txtCountyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String first_name= txtFirstName.getText();
        String last_name= txtLastName.getText();
        String email= txtEmail.getText();
        String phone= txtPhone.getText();
        String address_line_1= txtAddressLine1.getText();
        String address_line_2= txtAddressLine2.getText();
        String city= txtCity.getText();
        String state= txtState.getText();
        String zip= txtZip.getText();
        String country= txtCountry.getText();
        String date_of_birth= txtDateofBirth.getText();
        String sex= txtSex.getText();
        String veteran_status= txtVeteranStatus.getText();
        String telephone_number= txtTelephoneNumber.getText();
        String passport_number= txtPassportNumber.getText();
        String fax_number= txtFaxNumber.getText();
        String social_security_number= txtSocialSecurityNumber.getText();
        String drivers_license_state= txtDLState.getText();
        String drivers_license_number= txtDLNumber.getText();
        String county= txtCounty.getText();
        
        profile.setFirst_name(first_name);
        profile.setLast_name(last_name);
        profile.setEmail(email);
        profile.setPhone(phone);
        profile.setAddress_line_1(address_line_1);
        profile.setAddress_line_2(address_line_2);
        profile.setCity(city);
        profile.setState(state);
        profile.setZip(zip);
        profile.setCountry(country);
        profile.setDate_of_birth(date_of_birth);
        profile.setSex(sex);
        profile.setVeteran_status(veteran_status);
        profile.setTelephone_number(telephone_number);
        profile.setPassport_number(passport_number);
        profile.setFax_number(fax_number);
        profile.setSocial_security_number(social_security_number);
        profile.setDrivers_license_state(drivers_license_state);
        profile.setDrivers_license_number(drivers_license_number);
        profile.setCounty(county);
        
        JOptionPane.showMessageDialog(this, "Profile Saved!"," Success", JOptionPane.PLAIN_MESSAGE);
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtAddressLine1.setText("");
        txtAddressLine2.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtCountry.setText("");
        txtDateofBirth.setText("");
        txtSex.setText("");
        txtVeteranStatus.setText("");
        txtTelephoneNumber.setText("");
        txtPassportNumber.setText("");
        txtFaxNumber.setText("");
        txtSocialSecurityNumber.setText("");
        txtDLState.setText("");
        txtDLNumber.setText("");
        txtCounty.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblCounty;
    private javax.swing.JLabel lblDLNumber;
    private javax.swing.JLabel lblDLState;
    private javax.swing.JLabel lblDateofBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassportNumber;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVeteranStatus;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtCounty;
    private javax.swing.JTextField txtDLNumber;
    private javax.swing.JTextField txtDLState;
    private javax.swing.JTextField txtDateofBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtSocialSecurityNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtVeteranStatus;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}