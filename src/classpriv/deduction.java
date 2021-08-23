/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpriv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.JTextComponent;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class deduction extends javax.swing.JInternalFrame {
    /**
     * Creates new form book
     */
       Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
    public   int day;
     String month;
    public int year;
    public deduction() {
        initComponents();
        con=DBConnect.connect();
        tablelord();
        clear();
        comment.requestFocus();
         comment.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
     amount.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
          TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
          JLabel headerLabel = (JLabel) rendererFromHeader;
headerLabel.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        tdetails.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        tdetails.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        tdetails.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
          
             Calendar cal = new GregorianCalendar();
             int day = cal.get(Calendar.DAY_OF_MONTH);
                int month=cal.get(Calendar.MONTH)+1;
                int year = cal.get(Calendar.YEAR);
               date.setText(year+":"+month+":"+day);
               
       
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        comment = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        save3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tdetails.setBackground(new java.awt.Color(17, 39, 37));
        tdetails.setFont(new java.awt.Font("Tahoma", Font.BOLD, 15));
        tdetails.setForeground(new java.awt.Color(255, 255, 255));
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "التاريخ", "المبلغ", "السبب", "الرقم "
            }
        ));
        tdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tdetails.setDropMode(javax.swing.DropMode.ON);
        tdetails.setFocusable(false);
        tdetails.setGridColor(new java.awt.Color(153, 153, 153));
        tdetails.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tdetails.setRowHeight(25);
        tdetails.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails.setShowVerticalLines(false);
        tdetails.getTableHeader().setReorderingAllowed(false);
        tdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(3).setMinWidth(150);
            tdetails.getColumnModel().getColumn(3).setPreferredWidth(150);
            tdetails.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 920, 280));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("المبلغ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 90, -1));

        amount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 60, 60));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("التاريخ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 80, -1));

        date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 180, 30));

        comment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                commentKeyPressed(evt);
            }
        });
        jPanel1.add(comment, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 230, 30));

        delete.setBackground(new java.awt.Color(98, 113, 146));
        delete.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("مسح");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 180, 50));

        save3.setBackground(new java.awt.Color(98, 113, 146));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setForeground(new java.awt.Color(255, 255, 255));
        save3.setText("حفظ");
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel1.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 180, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("السبب");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 130, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myback.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        id.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("id");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jPanel10.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        if(id.getText().trim().isEmpty())
        {
            if(comment.getText().trim().isEmpty() || amount.getText().trim().isEmpty() || date.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(amount, "من فضلك ادخل السبب و المبلغ");
            }
            else
            {
                try
                {
                    int amountt = Integer.parseInt(amount.getText());
                    String sql111 = "INSERT INTO mrahmed.deduction "
                    + "( amount,date,comment) VALUES ( '"+amountt+"', '"+date.getText()+"','"+comment.getText()+"')";
                    pst = (PreparedStatement)con.prepareStatement(sql111);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "تم ـم تسجيل العمليه بنجاح");
                    clear();
                    tablelord();

                }
                catch(Exception e )
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }
        else
        {
             try {
               
                int amountt = Integer.parseInt(amount.getText());
                String sqll = "UPDATE mrahmed.deduction SET amount = '"+amountt+"',comment='"+comment.getText()+"',date='"+date.getText()+"' WHERE idDeduction = '"+id.getText()+"'";
                pst=(PreparedStatement) con.prepareStatement(sqll);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "تم تعديل بيانات العمليه بنجاح");
               clear();
               tablelord();
            } catch (SQLException ex) {
                Logger.getLogger(placePrice.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_save3ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(id.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "من فضلك اختر العمليه ازالته ");

        }
        else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
            if(dialogResult == 0) {
                try {
                    String sql = "DELETE FROM mrahmed.deduction WHERE idDeduction='"+id.getText()+"'";
                    pst=(PreparedStatement) con.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(rootPane, " تم ازاله العمليه بنجاح");
                    tablelord();
                } catch (SQLException ex) {

                }
                clear();
            }
            else
            {

                JOptionPane.showMessageDialog(this, " تم الغاء العمليه");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void commentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commentKeyPressed

    }//GEN-LAST:event_commentKeyPressed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        int selectrowindex=tdetails.getSelectedRow();
        id.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        comment.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        amount.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        date.setText(tmodel.getValueAt(selectrowindex, 0).toString());

    }//GEN-LAST:event_tdetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField comment;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save3;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables
  
    public void tablelord()
    {
        try {
            String sqll = "select date,comment,amount,idDeduction from mrahmed.deduction ";
 pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                         rs.getString("date"),
                       rs.getString("amount"),
                        rs.getString("comment"),
                         rs.getString("idDeduction")
                       
                                };
                    model.addRow(row);
                    k++;
                }
                for(int i = k ;i<11;i++)
                {
                 Object rowData[] = {
                       "",
                     "",
                     "",
                     "",
                       };
                model.addRow(rowData);
                }
                
        }
        catch (SQLException ex) {
            
        }
    }
   
     public void clear()
 {
 amount.setText("");
 id.setText("");
 comment.setText("");
 

 
 }
           

}
