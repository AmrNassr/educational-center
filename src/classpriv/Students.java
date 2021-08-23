/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpriv;

import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author amnassar
 */
public final class Students extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
       Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
    
   
    public Students() {
        initComponents();
        con=DBConnect.connect();
          privateauto_id();
           privateGroups();
        privatetablelord();
        clear();
            TableCellRenderer rendererFromHeader = tdetails1.getTableHeader().getDefaultRenderer();
JLabel headerLabel = (JLabel) rendererFromHeader;
headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails1.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
         tdetails1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
         tdetails1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
         tdetails1.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
         tdetails1.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
         tdetails1.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
         tdetails1.getColumnModel().getColumn(6).setCellRenderer( centerRenderer );
         setBookPrice();
         
          
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdetails1 = new javax.swing.JTable();
        autoserial1 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        cmclass1 = new javax.swing.JComboBox();
        cmgroup1 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        txtpaper = new javax.swing.JTextField();
        pphone1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        phone1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialid1 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel1.setMinimumSize(new java.awt.Dimension(970, 690));
        jPanel1.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tdetails1.setBackground(new java.awt.Color(17, 39, 37));
        tdetails1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails1.setForeground(new java.awt.Color(255, 255, 255));
        tdetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "المذكرات", "المجموعه", "رقم ولي الامر", "رقم الهاتف", "الصف", "اسم الطالب", "الرقم التسلسلي"
            }
        ));
        tdetails1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails1.setRowHeight(25);
        tdetails1.setRowMargin(2);
        tdetails1.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetails1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tdetails1);
        if (tdetails1.getColumnModel().getColumnCount() > 0) {
            tdetails1.getColumnModel().getColumn(0).setHeaderValue("المذكرات");
            tdetails1.getColumnModel().getColumn(1).setMinWidth(400);
            tdetails1.getColumnModel().getColumn(1).setPreferredWidth(400);
            tdetails1.getColumnModel().getColumn(1).setMaxWidth(400);
            tdetails1.getColumnModel().getColumn(6).setMinWidth(100);
            tdetails1.getColumnModel().getColumn(6).setPreferredWidth(100);
            tdetails1.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 920, 280));

        autoserial1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        autoserial1.setForeground(new java.awt.Color(255, 255, 255));
        autoserial1.setText("لإثسف");
        jPanel1.add(autoserial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 60));

        delete1.setBackground(new java.awt.Color(98, 113, 146));
        delete1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        delete1.setForeground(new java.awt.Color(255, 255, 255));
        delete1.setText("مسح");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel1.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 180, 50));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("المجموعه");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 160, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("الاسم");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 160, -1));

        name1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 230, 30));

        cmclass1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "الثالث الثانوي" }));
        cmclass1.setEnabled(false);
        cmclass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmclass1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmclass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 230, 30));

        cmgroup1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(cmgroup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 230, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("المذكرات");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 160, -1));

        save1.setBackground(new java.awt.Color(98, 113, 146));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setForeground(new java.awt.Color(255, 255, 255));
        save1.setText("حفظ");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel1.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 180, 40));

        txtpaper.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtpaper.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpaper.setText("0");
        jPanel1.add(txtpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 50, 40));

        pphone1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(pphone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 230, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("تليفون ولي الامر");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 180, -1));

        phone1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 230, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("الصف");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 160, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("رقم التليفون");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 160, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myback.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        serialid1.setForeground(new java.awt.Color(255, 255, 255));
        serialid1.setText("Seriallllllllll");
        jPanel1.add(serialid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        try
        {
            int Paper = Integer.parseInt(txtpaper.getText());
            if(serialid1.getText().trim().isEmpty())
            {

                String namee = name1.getText();
                String groups = cmgroup1.getSelectedItem().toString();
                String classs = cmclass1.getSelectedItem().toString();
                String phonee = phone1.getText();
                String pphonee = pphone1.getText();
                String seriall =autoserial1.getText();

                if( name1.getText().trim().isEmpty() || cmgroup1.getSelectedItem().toString().trim().isEmpty() || cmclass1.getSelectedItem().toString().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(this, " من فضلك ادخل اسم الطاب و مجموعه الطالب و الصف");
                }
                else
                {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                    if(dialogResult == 0) {
                        try{
                            String sql = "INSERT INTO mrahmed.privatestudents (paper,class,name, phone, pphone,groupp,serial) VALUES"
                            + " ('"+Paper+"','"+classs+"','"+namee+"','"+phonee+"','"+pphonee+"','"+groups+"','"+seriall+"')";
                            pst = (PreparedStatement)con.prepareStatement(sql);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "تم اضافه الطالب بنجاح");

                            clear();
                            privatetablelord();
                            privateauto_id();

                        }
                        catch(Exception e ){
                            JOptionPane.showMessageDialog(null,e);
                        }

                    }
                    else
                    {JOptionPane.showMessageDialog(this, " تم الغاء العمليه");

                    }
                }
            }
            else
            {

                String namee = name1.getText();
                String group = cmgroup1.getSelectedItem().toString();
                String classs = cmclass1.getSelectedItem().toString();
                String phonee = phone1.getText();
                String pphonee = pphone1.getText();
                String serial = autoserial1.getText();

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
                if(dialogResult == 0) {
                    try {

                        String sql = "UPDATE mrahmed.privatestudents SET paper='"+Paper+"', class='"+classs+"',name='"+namee+"', groupp='"+group+"', phone='"+phonee+"', pphone='"+pphonee+"'  WHERE serial='"+serialid1.getText()+"'";
                        pst=(PreparedStatement) con.prepareStatement(sql);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "تم تعديل بيانات الطالب بنجاح");
                        clear();
                        privatetablelord();

                    } catch (SQLException ex) {

                    }
                }
                else
                {JOptionPane.showMessageDialog(this, " تم الغاء العمليه");

                }
            }
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(this, "مبلغ المذكره غير صحيح");
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void cmclass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmclass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmclass1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        if(serialid1.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "من فضلك اختر الطالب المراد ازالته ");

        }
        else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
            if(dialogResult == 0) {
                try {
                    String sql = "DELETE FROM mrahmed.privatestudents WHERE serial='"+serialid1.getText()+"'";
                    pst=(PreparedStatement) con.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(rootPane, " تم ازاله الطالب بنجاح");
                    privatetablelord();
                } catch (SQLException ex) {

                }
                clear();
            }
            else
            {

                JOptionPane.showMessageDialog(this, " تم الغاء العمليه");
            }
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void tdetails1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetails1MouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails1.getModel();
        //bid,name, price, publisher, book_type, b_code, date, category
        int selectrowindex=tdetails1.getSelectedRow();
        serialid1.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        name1.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        cmclass1.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        phone1.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        pphone1.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        cmgroup1.setSelectedItem(tmodel.getValueAt(selectrowindex, 1).toString());
        txtpaper.setText(tmodel.getValueAt(selectrowindex, 0).toString());

    }//GEN-LAST:event_tdetails1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autoserial1;
    private javax.swing.JComboBox cmclass1;
    private javax.swing.JComboBox cmgroup1;
    private javax.swing.JButton delete1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField pphone1;
    private javax.swing.JButton save1;
    private javax.swing.JLabel serialid1;
    private javax.swing.JTable tdetails1;
    private javax.swing.JTextField txtpaper;
    // End of variables declaration//GEN-END:variables
 public void privatetablelord()
    {
        try {
            String sqll = "SELECT paper,serial,name,class,phone,pphone,groupp FROM mrahmed.privatestudents";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails1.getModel(); 
                model.setRowCount(0);
              
                while (rs.next())
                {
                    Object row[] = {
                           rs.getString("paper"),
                      rs.getString("groupp"),
                         rs.getString("pphone"),
                       rs.getString("phone"),
                       rs.getString("class"),
                        rs.getString("name"),
                        rs.getString("serial"),
                                };
                    model.addRow(row);
                    
                }
        }
        catch (SQLException ex) {
            
        }
    }
     public void clear()
 {
 name1.setText("");  
 phone1.setText("");
 pphone1.setText("");
 serialid1.setText("");
 txtpaper.setText("");


 
 }
    
 
        public void privateauto_id(){

         try {
             String sql = "SELECT serial FROM mrahmed.privatestudents where idstudents=(select max(idstudents)FROM mrahmed.privatestudents )";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 String rnno=rs.getString("serial");
                 int co=rnno.length();
                 String txt=rnno.substring(0,3);
                 String num = rnno.substring(3,co);
                 int n = Integer.parseInt(num);
                 n++;
                 String snum=Integer.toString(n);
                 String ftxt=txt+snum;
                 autoserial1.setText(ftxt);
             }
             else
             {
                 autoserial1.setText("PN-1");
             }
         } catch (SQLException ex) {
            
         }
    
}
       
   
         public void privateGroups()
   {
        try {
             String sql="SELECT groupname  FROM mrahmed.groups where type = 'اساسي' ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("groupname");
                
                cmgroup1.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }

    private void setBookPrice() {
        try {
             String sql="SELECT bookpricee FROM mrahmed.bookprice where bookname='"+cmclass1.getSelectedItem()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String bookprice = rs.getString("bookpricee");
                
                txtpaper.setText(bookprice);
  
             }

         } catch (SQLException ex) {
             
         }
    }
 
         

     
}