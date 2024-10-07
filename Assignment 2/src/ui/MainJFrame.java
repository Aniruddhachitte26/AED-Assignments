/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Person;
import ui.PersonManager.CreatePersonJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import model.PersonDirectory;
import ui.PersonManager.ListJPanel;
import ui.PersonManager.UpdateJPanel;

/**
 *
 * @author Aniruddha
 */
public class MainJFrame extends javax.swing.JFrame {

    private PersonDirectory personDirectory;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.personDirectory = new PersonDirectory();
        generateDemoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAddPerson = new javax.swing.JButton();
        btnListPerson = new javax.swing.JButton();
        txtSearchBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(102, 204, 255));

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnListPerson.setText("List Person");
        btnListPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListPersonActionPerformed(evt);
            }
        });

        btnSearch.setText("Search for Person");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Person Profile");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAddPerson)
                                .addComponent(btnListPerson)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddPerson, btnListPerson, btnSearch, txtSearchBox});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btnAddPerson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListPerson)
                .addGap(64, 64, 64)
                .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);
        userProcessContainer.getAccessibleContext().setAccessibleParent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed

        CreatePersonJPanel panel = new CreatePersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("CreatePersonJPanel", panel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        if (!txtSearchBox.getText().isBlank()) {
        String searchInput = txtSearchBox.getText();
        

        String firstName = searchInput; 
        String lastName = searchInput;  
        String streetName = searchInput; 
        
        Person foundPerson = personDirectory.searchPersonByName(firstName, lastName, streetName);
        
        if (foundPerson != null) {
            UpdateJPanel panel = new UpdateJPanel(userProcessContainer, personDirectory, foundPerson);
            userProcessContainer.add("UpdateJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Person not found.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please type a name or address to search", "Warning", JOptionPane.WARNING_MESSAGE);
    }
        
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnListPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListPersonActionPerformed
        // TODO add your handling code here:
        ListJPanel panel = new ListJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("ListJPanel", panel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListPersonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnListPerson;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField txtSearchBox;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    private void generateDemoData() {
        Person personA = personDirectory.addPerson();
        personA.setFirstName("John");
        personA.setLastName("Doe");
        personA.setSsn(123456789);
        personA.setAge(35);
        personA.setHstreet("123 Main St");
        personA.setHunitNumber(2);
        personA.setHcity("Boston");
        personA.setHstate("MA");
        personA.setHzipCode(20218);
        personA.setHphoneNumber(617588547);
        personA.setWstreet("456 Corporate Ave");
        personA.setWunitNumber(2);
        personA.setWcity("Cambridge");
        personA.setWstate("MA");
        personA.setWzipCode(20139);
        personA.setWphoneNumber(617555567);
        personA.setMonthlysalary(9000.25);

        Person personB = personDirectory.addPerson();
        personB.setFirstName("Jane");
        personB.setLastName("Smith");
        personB.setSsn(987654321);
        personB.setAge(28);
        personB.setHstreet("789 Elm St");
        personB.setHunitNumber(5);
        personB.setHcity("New York");
        personB.setHstate("NY");
        personB.setHzipCode(10001);
        personB.setHphoneNumber(2125551234);
        personB.setWstreet("300 Wall St");
        personB.setWunitNumber(4);
        personB.setWcity("New York");
        personB.setWstate("NY");
        personB.setWzipCode(10005);
        personB.setWphoneNumber(2125555675);
        personB.setMonthlysalary(6523.10);

        // Third person
        Person personC = personDirectory.addPerson();
        personC.setFirstName("Michael");
        personC.setLastName("Johnson");
        personC.setSsn(555666777);
        personC.setAge(42);
        personC.setHstreet("321 Oak Ave");
        personC.setHunitNumber(1);
        personC.setHcity("Los Angeles");
        personC.setHstate("CA");
        personC.setHzipCode(90001);
        personC.setHphoneNumber(310 - 555 - 7890);
        personC.setWstreet("900 Hollywood Blvd");
        personC.setWunitNumber(10);
        personC.setWcity("Los Angeles");
        personC.setWstate("CA");
        personC.setWzipCode(90028);
        personC.setWphoneNumber(323555987);
        personC.setMonthlysalary(8023.29);

        // Fourth person
        Person personD = personDirectory.addPerson();
        personD.setFirstName("Emily");
        personD.setLastName("Davis");
        personD.setSsn(112233445);
        personD.setAge(30);
        personD.setHstreet("456 Maple St");
        personD.setHunitNumber(7);
        personD.setHcity("Chicago");
        personD.setHstate("IL");
        personD.setHzipCode(60601);
        personD.setHphoneNumber(312 - 555 - 2460);
        personD.setWstreet("500 Michigan Ave");
        personD.setWunitNumber(12);
        personD.setWcity("Chicago");
        personD.setWstate("IL");
        personD.setWzipCode(60611);
        personD.setWphoneNumber(312555135);
        personD.setMonthlysalary(7500.86);

        // Fifth person
        Person personE = personDirectory.addPerson();
        personE.setFirstName("David");
        personE.setLastName("Brown");
        personE.setSsn(778899001);
        personE.setAge(50);
        personE.setHstreet("222 Pine St");
        personE.setHunitNumber(3);
        personE.setHcity("Houston");
        personE.setHstate("TX");
        personE.setHzipCode(77002);
        personE.setHphoneNumber(713555874);
        personE.setWstreet("100 Main St");
        personE.setWunitNumber(6);
        personE.setWcity("Houston");
        personE.setWstate("TX");
        personE.setWzipCode(77005);
        personE.setWphoneNumber(713555123);
        personE.setMonthlysalary(5666.66);
    }

}
