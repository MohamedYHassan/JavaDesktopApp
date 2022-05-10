/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Frames.Panels;
import Frames.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import source.*;/**
 *
 * @author Mohamed Yousef
 */
public class ProductsUpdate extends javax.swing.JPanel {

    /**
     * Creates new form MarketingUpdate
     */
    public ProductsUpdate() {
        initComponents();
    }
    
    int oldId;
    
      protected void setPanelData(Products x) {
        jTextFieldQuantity.setText("" + x.getQuantity());
        jTextFieldName.setText("" + x.getName());
        jTextFieldID.setText("" + x.getId());
        jTextFieldDescription.setText("" + x.getDescription());
        jTextFieldPrice.setText("" + x.getPrice());
        jTextFieldExpiryMonth.setText("" + x.getMonth());
        jTextFieldExpiryYear.setText("" + x.getYear());
    }
        protected void resetPanelData() {
        jTextFieldQuantity.setText("");
        jTextFieldName.setText("");
        jTextFieldID.setText("");
        jTextFieldDescription.setText("");
        jTextFieldPrice.setText("");
        jTextFieldExpiryMonth.setText("");
        jTextFieldExpiryYear.setText("");
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jButton1 = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldExpiryMonth = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabelSuccessFail = new javax.swing.JLabel();
        jLabelSuccessOrFail = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelSuccessFailResult = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldExpiryYear = new javax.swing.JTextField();

        jLabel9.setText("jLabel9");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriptionActionPerformed(evt);
            }
        });

        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Description");

        jLabel4.setText("Quantity");

        jLabel5.setText("Price");

        jLabel6.setText("Expiry Date :");

        jLabel8.setText("Search by ID");

        jLabel7.setText("Month");

        jLabel11.setText("Year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPrice)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldExpiryMonth)
                                            .addComponent(jTextFieldExpiryYear, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                                .addGap(68, 68, 68)))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDescription, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabelSuccessFailResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSuccessFail))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabelSuccessOrFail)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelSuccessOrFail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSuccessFail)
                    .addComponent(jLabelSuccessFailResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldExpiryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldExpiryYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescriptionActionPerformed

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jLabelSuccessFailResult.setText("");
        jLabelSuccessFail.setText("");
         if(!jTextFieldSearch.getText().equals("")) {
            Products x = new Products();
            Products returned = x.searchProducts(Integer.parseInt(jTextFieldSearch.getText()));
            if (returned != null) {
               
                    setPanelData(returned);
                    oldId = (Integer.parseInt(jTextFieldID.getText()));
            }
            else {
                jLabelSuccessFailResult.setText("Not Found!");
                resetPanelData();
            }
        } else {
            jLabelSuccessFailResult.setText("Missing Required Field! Please Search for a Valid Product");
            resetPanelData(); }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jLabelSuccessFailResult.setText("");
        if(!jTextFieldSearch.getText().equals("")) {
            Products x = new Products();
            if(x.deleteProducts(Integer.parseInt(jTextFieldSearch.getText()))) {
                jLabelSuccessFail.setText("Deleted Successfully!");
                resetPanelData();
            } else 
                jLabelSuccessFail.setText("Failed to Delete!");
            
        } else 
            jLabelSuccessFailResult.setText("Missing Required Field! Please, Complete All Fields");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jLabelSuccessFailResult.setText("");
         if(!jTextFieldID.getText().equals("") && !jTextFieldName.getText().equals("") && !jTextFieldDescription.getText().equals("") && !jTextFieldQuantity.getText().equals("") && !jTextFieldPrice.getText().equals("") && !jTextFieldExpiryMonth.getText().equals("")) {
           InventoryEmployee x = new InventoryEmployee();
           x.setId(Integer.parseInt(jTextFieldID.getText()));
           x.setFname(jTextFieldName.getText());
           x.setLname(jTextFieldDescription.getText());
           x.setUserName(jTextFieldExpiryMonth.getText());
           x.setAge(Integer.parseInt(jTextFieldQuantity.getText()));
           x.setSalary(Double.parseDouble(jTextFieldPrice.getText())); 
            try {
                if(x.updateInventory(oldId,x)) {
                    jLabelSuccessFail.setText("Updated Successfully!");
                    
                    resetPanelData();
                } else
                    jLabelSuccessFail.setText("Failed to Update!");
            } catch (IOException ex) {
                Logger.getLogger(ProductsUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       else 
           jLabelSuccessFailResult.setText("Missing Required Fields! Please, Complete All Fields");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSuccessFail;
    private javax.swing.JLabel jLabelSuccessFailResult;
    private javax.swing.JLabel jLabelSuccessOrFail;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldExpiryMonth;
    private javax.swing.JTextField jTextFieldExpiryYear;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}