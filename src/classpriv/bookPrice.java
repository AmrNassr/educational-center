/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpriv;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author amnassar
 */

public class bookPrice extends javax.swing.JFrame {
 Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
    public bookPrice() {
        initComponents();
        con=DBConnect.connect();
        comboxfromcombo1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmclass = new javax.swing.JComboBox();
        cancle = new javax.swing.JButton();
        price = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        setUndecorated(true);

        jPanel1.setMaximumSize(new java.awt.Dimension(530, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(530, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "الثالث الثانوي" }));
        jPanel1.add(cmclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 230, 30));

        cancle.setBackground(new java.awt.Color(98, 113, 146));
        cancle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cancle.setForeground(new java.awt.Color(255, 255, 255));
        cancle.setText("اغلاق");
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });
        jPanel1.add(cancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 30));

        price.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 70, 30));

        save.setBackground(new java.awt.Color(98, 113, 146));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 120, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("السعر");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 130, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" الصف");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/64586a0ad51dc03.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(530, 550));
        jLabel1.setMinimumSize(new java.awt.Dimension(530, 550));
        jLabel1.setPreferredSize(new java.awt.Dimension(530, 550));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 260));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 70, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(458, 261));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
       
        this.dispose();
    }//GEN-LAST:event_cancleActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if( id.getText().trim().isEmpty() && !price.getText().trim().isEmpty() )
            {
                 try
           {
               int amountt = Integer.parseInt(price.getText());
                 String sql111 = "INSERT INTO mrahmed.bookprice "
                         + "( bookpricee, bookname) VALUES ( '"+amountt+"', '"+cmclass.getSelectedItem().toString()+"')";
                        pst = (PreparedStatement)con.prepareStatement(sql111);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "تم ـم تسجيل سعر المذكره بنجاح");
           
           }
                 catch(Exception e )
                 {
                      JOptionPane.showMessageDialog(null, e);
                 }
            }
        if(!id.getText().trim().isEmpty() && !price.getText().trim().isEmpty())
        {
            try {
                String classs = cmclass.getSelectedItem().toString();
                int amountt = Integer.parseInt(price.getText());
                String sqll = "UPDATE mrahmed.bookprice SET bookpricee = '"+amountt+"' WHERE idbookprice = '"+id.getText()+"'";
                pst=(PreparedStatement) con.prepareStatement(sqll);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "تم تعديل بيانات سعر المذكره بنجاح");
                price.setText("");
                cmclass.setSelectedIndex(0);
            } catch (SQLException ex) {
                Logger.getLogger(bookPrice.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        }
       
        
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancle;
    private javax.swing.JComboBox cmclass;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField price;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

          public void comboxfromcombo1()
      {
        
          
                   cmclass.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();
                price.setText(""); id.setText("");
                Object item = event.getItem();
                     try {
             String sql="SELECT bookpricee  FROM mrahmed.bookprice "
                     + "where bookname='"+cmclass.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 price.setText(rs.getString("bookpricee"));
                 

                if (event.getStateChange() == ItemEvent.SELECTED) {
                    price.setText(rs.getString("bookpricee"));
              
                }

                if (event.getStateChange() == ItemEvent.DESELECTED) {
                    
                }
  
             }

         } catch (SQLException ex) {
             
         }
                     try{
                         if(price.getText().equals(""))
                         {}
                         else
                         {
                             String sql="SELECT idbookprice  FROM mrahmed.bookprice where bookname='"+cmclass.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 id.setText(rs.getString("idbookprice"));
                 price.setText("");
             }
                         }
                     }
                     
                     catch(Exception e )
                             {
                             
                             }
                     
              
         }
        });
       
      }
}
