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
public final class Attendance extends javax.swing.JInternalFrame {
private static final String ENTER_ACTION = "enterAction";
    /**
     * Creates new form book
     */
       Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
    public   int day;
    int num = 1;
    //public int month;
     String month;
     public String d ; 
    public int year;
    public String GroupException;
    public Attendance() {
        initComponents();
        con=DBConnect.connect();
        privategroupppp();
        clear();   
        
         nolesson.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       
           TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
          JLabel headerLabel = (JLabel) rendererFromHeader;
headerLabel.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
           tdetails.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
          
             Calendar cal = new GregorianCalendar();
             int day = cal.get(Calendar.DAY_OF_MONTH);
                int month=cal.get(Calendar.MONTH)+1;
                int year = cal.get(Calendar.YEAR);
               date.setText(year+":"+month+":"+day);
        d = date.getText().toString();
        
       
        
        
        
    seria2.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                name2();
                nolessoon();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(seria2.getText().trim().isEmpty() || seria2.getText().equals(""))
            {
                
            }
                else
            {
                name2(); 
                nolessoon();
            }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                name2();
                nolessoon();
            }
        });
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        nolesson = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        group2 = new javax.swing.JComboBox();
        seria2 = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        save3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        save2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();

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
                {null, null, null},
                {null, null, ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "المجموعه", "اسم الطالب", "الرقم التسلسلي"
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
            tdetails.getColumnModel().getColumn(2).setMinWidth(150);
            tdetails.getColumnModel().getColumn(2).setPreferredWidth(150);
            tdetails.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 920, 280));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("عدد الحصص المتاحه");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 210, -1));

        nolesson.setEditable(false);
        nolesson.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nolesson.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nolesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolessonActionPerformed(evt);
            }
        });
        jPanel1.add(nolesson, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 60, 60));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("اسم المجموعه");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 160, -1));

        group2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        group2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        group2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                group2MouseReleased(evt);
            }
        });
        jPanel1.add(group2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 310, 30));

        seria2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                seria2MouseReleased(evt);
            }
        });
        seria2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                seria2KeyPressed(evt);
            }
        });
        jPanel1.add(seria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 140, 30));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 180, 30));

        name2.setEditable(false);
        name2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name2KeyPressed(evt);
            }
        });
        jPanel1.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 230, 30));

        save3.setBackground(new java.awt.Color(98, 113, 146));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setForeground(new java.awt.Color(255, 255, 255));
        save3.setText("استثناء");
        save3.setEnabled(false);
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel1.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("اسم الطالب");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 130, -1));

        save2.setBackground(new java.awt.Color(98, 113, 146));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setForeground(new java.awt.Color(255, 255, 255));
        save2.setText("تسجيل حضور");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel1.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("كود الطالب");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 130, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myback.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        serialid.setForeground(new java.awt.Color(255, 255, 255));
        serialid.setText("jLabel1");
        jPanel1.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jTabbedPane1.addTab("مميز", jPanel1);

        jPanel10.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 960, 660));

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

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
       
  
    }//GEN-LAST:event_tdetailsMouseClicked

    private void nolessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolessonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nolessonActionPerformed

    private void group2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_group2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_group2MouseReleased

    private void seria2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seria2KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER) 
{
       if(group2.getSelectedItem().toString().trim().isEmpty() || seria2.getText().trim().isEmpty())
{
    JOptionPane.showMessageDialog(rootPane, "من فضلك ادخل كود الطالب");
}
   else
   {
        if(nolesson.getText().equals("0") || nolesson.getText().equals("-1")  )
            
{
      JOptionPane.showMessageDialog(rootPane, "الطالب لا يملك عدد حصص لا يمكنه تسجيل الحضور");
     
       save3.setEnabled(true);
}
        else if (nolesson.getText().equals("-2"))
        {
            save3.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "الطالب لا يملك عدد حصص لا يمكنه تسجيل الحضور واستخدم مره الاتاحه");
      seria2.setText("");
      seria2.requestFocus();
        }
        else
{
    save3.setEnabled(false);
    try{
        String groupp = group2.getSelectedItem().toString();
        String seriall = seria2.getText();
        String namee = name2.getText();
        int x = Integer.parseInt(nolesson.getText());
        String sqlllll = "select * from mrahmed.privatestudents where groupp='"+groupp+"' AND serial = '"+seriall+"' ";
        pst=(PreparedStatement) con.prepareStatement(sqlllll);
        rs=pst.executeQuery();
        if(rs.next())
        {
            
            try{
            String sqll1 = "SELECT date,groupp,serial FROM mrahmed.studentattendance "
                    + " WHERE serial='"+seriall+"' AND date='"+date.getText()+"' AND groupp='"+groupp+"'";
            pst=(PreparedStatement) con.prepareStatement(sqll1);
            rs=pst.executeQuery();
            
            if (rs.next())
            {
                tablelord();
                JOptionPane.showMessageDialog(null, "تم تسجيل جضور الطالب من قبل"); 
                clear();
                seria2.requestFocus();
                seria2.setText("");
            }
            else
            {
                try{
                    
                    String sql = "INSERT INTO mrahmed.studentattendance(name,serial,groupp,date) VALUES('"+namee+"','"+seriall+"','"+groupp+"','"+date.getText()+"')";
                    pst = (PreparedStatement)con.prepareStatement(sql);
                    pst.execute();
                    tablelord();
                    attendance();
                    JOptionPane.showMessageDialog(null, "تم تسجيل حضور الطالب بنجاح");
                    
                    clear();
                    seria2.requestFocus();
                    seria2.setText("");
                    
                    
                }
                catch(Exception e ){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            
        }
    
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else
        { 
             int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "هذا الطلب غير مقيد بهذه المجموعه هل اسمح بدخول الطالب ؟", "تاكيد العمليه", dialogButton);
                if(dialogResult == 0) {
                    try{
                        String sqllll = "SELECT groupp FROM mrahmed.privatestudents where serial= '"+seriall+"' ";
        pst=(PreparedStatement) con.prepareStatement(sqllll);
        rs=pst.executeQuery();
        if(rs.next())
        {
            GroupException=rs.getString("groupp");
            
        }
                    }
                    catch(Exception e)
                    {
                    }
                    try{
                        String sqll1 = "SELECT date,groupp,serial FROM mrahmed.studentattendance "
                                + " WHERE serial='"+seriall+"' AND date='"+date.getText()+"' AND groupp='"+GroupException+"'";
                        pst=(PreparedStatement) con.prepareStatement(sqll1);
                        rs=pst.executeQuery();
                        
                        if (rs.next())
                        {
                            tablelord();
                            JOptionPane.showMessageDialog(null, "تم تسجيل جضور الطالب من قبل");
                            clear();
                            seria2.requestFocus();
                            seria2.setText("");
                        }
                        else
                        {
                            try{
                                
                                String sql = "INSERT INTO mrahmed.studentattendance(name,serial,groupp,date) VALUES('"+namee+"','"+seriall+"','"+GroupException+"','"+date.getText()+"')";
                                pst = (PreparedStatement)con.prepareStatement(sql);
                                pst.execute();
                                tablelord();
                                attendance();
                                JOptionPane.showMessageDialog(null, "تم تسجيل حضور الطالب بنجاح");
                                
                                clear();
                                seria2.requestFocus();
                                seria2.setText("");
                                
                                
                            }
                            catch(Exception e ){
                                JOptionPane.showMessageDialog(null,e);
                            }
                        }
                        
                    }
                    
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
                
        }
                else
                {
                     clear();
                                seria2.requestFocus();
                                seria2.setText("");
                }
        }
        
    }
    catch(SQLException ex)
    {
        ex.printStackTrace();
    }
    
}
        
   }
}
    }//GEN-LAST:event_seria2KeyPressed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
   if(group2.getSelectedItem().toString().trim().isEmpty() || seria2.getText().trim().isEmpty())
{
    JOptionPane.showMessageDialog(rootPane, "من فضلك ادخل كود الطالب");
}
   else
   {
        if(nolesson.getText().equals("0")||nolesson.getText().equals("-1") )
            
{
      JOptionPane.showMessageDialog(rootPane, "الطالب لا يملك عدد حصص لا يمكنه تسجيل الحضور");
     
       save3.setEnabled(true);
}
        else if (nolesson.getText().equals("-2"))
        {
            save3.setEnabled(false);
            JOptionPane.showMessageDialog(rootPane, "الطالب لا يملك عدد حصص لا يمكنه تسجيل الحضور واستخدم مره الاتاحه");
      seria2.setText("");
      seria2.requestFocus();
        }
        else
{
    save3.setEnabled(false);
    try{
        String groupp = group2.getSelectedItem().toString();
        String seriall = seria2.getText();
        String namee = name2.getText();
        int x = Integer.parseInt(nolesson.getText());
        String sqlllll = "select * from mrahmed.privatestudents where groupp='"+groupp+"' AND serial = '"+seriall+"' ";
        pst=(PreparedStatement) con.prepareStatement(sqlllll);
        rs=pst.executeQuery();
        if(rs.next())
        {
            
            try{
            String sqll1 = "SELECT date,groupp,serial FROM mrahmed.studentattendance "
                    + " WHERE serial='"+seriall+"' AND date='"+date.getText()+"' AND groupp='"+groupp+"'";
            pst=(PreparedStatement) con.prepareStatement(sqll1);
            rs=pst.executeQuery();
            
            if (rs.next())
            {
                tablelord();
                JOptionPane.showMessageDialog(null, "تم تسجيل جضور الطالب من قبل"); 
                clear();
                seria2.requestFocus();
                seria2.setText("");
            }
            else
            {
                try{
                    
                    String sql = "INSERT INTO mrahmed.studentattendance(name,serial,groupp,date) VALUES('"+namee+"','"+seriall+"','"+groupp+"','"+date.getText()+"')";
                    pst = (PreparedStatement)con.prepareStatement(sql);
                    pst.execute();
                    tablelord();
                    attendance();
                    JOptionPane.showMessageDialog(null, "تم تسجيل حضور الطالب بنجاح");
                    
                    clear();
                    seria2.requestFocus();
                    seria2.setText("");
                    
                    
                }
                catch(Exception e ){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            
        }
    
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else
        { 
             int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "هذا الطلب غير مقيد بهذه المجموعه هل اسمح بدخول الطالب ؟", "تاكيد العمليه", dialogButton);
                if(dialogResult == 0) {
                    try{
                        String sqllll = "SELECT groupp FROM mrahmed.privatestudents where serial= '"+seriall+"' ";
        pst=(PreparedStatement) con.prepareStatement(sqllll);
        rs=pst.executeQuery();
        if(rs.next())
        {
            GroupException=rs.getString("groupp");
            
        }
                    }
                    catch(Exception e)
                    {
                    }
                    try{
                        String sqll1 = "SELECT date,groupp,serial FROM mrahmed.studentattendance "
                                + " WHERE serial='"+seriall+"' AND date='"+date.getText()+"' AND groupp='"+GroupException+"'";
                        pst=(PreparedStatement) con.prepareStatement(sqll1);
                        rs=pst.executeQuery();
                        
                        if (rs.next())
                        {
                            tablelord();
                            JOptionPane.showMessageDialog(null, "تم تسجيل جضور الطالب من قبل");
                            clear();
                            seria2.requestFocus();
                            seria2.setText("");
                        }
                        else
                        {
                            try{
                                
                                String sql = "INSERT INTO mrahmed.studentattendance(name,serial,groupp,date) VALUES('"+namee+"','"+seriall+"','"+GroupException+"','"+date.getText()+"')";
                                pst = (PreparedStatement)con.prepareStatement(sql);
                                pst.execute();
                                tablelord();
                                attendance();
                                JOptionPane.showMessageDialog(null, "تم تسجيل حضور الطالب بنجاح");
                                
                                clear();
                                seria2.requestFocus();
                                seria2.setText("");
                                
                                
                            }
                            catch(Exception e ){
                                JOptionPane.showMessageDialog(null,e);
                            }
                        }
                        
                    }
                    
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
                
        }
                else
                {
                     clear();
                                seria2.requestFocus();
                                seria2.setText("");
                }
        }
        
    }
    catch(SQLException ex)
    {
        ex.printStackTrace();
    }
    
}
        
   }
    }//GEN-LAST:event_save2ActionPerformed

    private void name2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name2KeyPressed
       
    }//GEN-LAST:event_name2KeyPressed

    private void seria2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seria2MouseReleased
       
    }//GEN-LAST:event_seria2MouseReleased

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
 if (nolesson.getText().equals("-2"))
        {
            JOptionPane.showMessageDialog(rootPane, "الطالب لا يملك عدد حصص لا يمكنه تسجيل الحضور واستخدم مره الاتاحه");
      seria2.setText("");
      seria2.requestFocus();
      save3.setEnabled(false);
        }
 else
         {
        
        try{
        String groupp = group2.getSelectedItem().toString();
        String seriall = seria2.getText();
        String namee = name2.getText();
        int x = Integer.parseInt(nolesson.getText());
        String sqlllll = "select * from mrahmed.privatestudents where groupp='"+groupp+"' AND serial = '"+seriall+"' ";
        pst=(PreparedStatement) con.prepareStatement(sqlllll);
        rs=pst.executeQuery();
        if(rs.next())
        {
            try{
            String sqll1 = "SELECT date,groupp,serial FROM mrahmed.studentattendance "
                    + " WHERE serial='"+seriall+"' AND date='"+d+"' AND groupp='"+groupp+"'";
            pst=(PreparedStatement) con.prepareStatement(sqll1);
            rs=pst.executeQuery();
            
            if (rs.next())
            {
                tablelord();
                JOptionPane.showMessageDialog(null, "تم تسجيل جضور الطالب من قبل"); 
                save3.setEnabled(false);
                clear();
                seria2.requestFocus();
                seria2.setText("");
            }
            else
            {
                try{
                    
                    String sql = "INSERT INTO mrahmed.studentattendance(name,serial,groupp,date) VALUES('"+namee+"','"+seriall+"','"+groupp+"','"+d+"')";
                    pst = (PreparedStatement)con.prepareStatement(sql);
                    pst.execute();
                    tablelord();
                    attendance();
                    JOptionPane.showMessageDialog(null, "تم تسجيل حضور الطالب بنجاح");
                    save3.setEnabled(false);
                    clear();
                    seria2.requestFocus();
                    seria2.setText("");
                    
                    
                }
                catch(Exception e ){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            
        }
    
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
        else
        {  JOptionPane.showMessageDialog(rootPane, "كود الطالب لا بنتمي لهذه المجموعه");
        seria2.setText("");
        save3.setEnabled(false);
                }
        
    }
    catch(SQLException ex)
    {
        ex.printStackTrace();
    }        
         }
    }//GEN-LAST:event_save3ActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    public javax.swing.JComboBox group2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField nolesson;
    private javax.swing.JButton save2;
    private javax.swing.JButton save3;
    private javax.swing.JTextField seria2;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables

    public void tablelord()
    {
        try {
            String sqll = "select serial,name,groupp from mrahmed.studentattendance "
                    + "where date='"+date.getText()+"' AND groupp='"+group2.getSelectedItem().toString()+"'";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int k = 0;
                while (rs.next())
                {
                    Object row[] = {
                         rs.getString("groupp"),
                       rs.getString("name"),
                        rs.getString("serial"),
                        
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
    
 nolesson.setText("");
 serialid.setText("");

 
 }

            public void name2()
   {
        try {
             String sql="SELECT name  FROM mrahmed.privatestudents where serial= '"+seria2.getText()+"' ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                name2.setText( rs.getString("name"));
               
             }
             else
             {
               seria2.requestFocus();
             }
            

         } catch (SQLException ex) {
         }
   }
 public void privategroupppp()
   {
        try {
             String sql="SELECT groupname  FROM mrahmed.groups where type='اساسي' ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String namee = rs.getString("groupname");
                
                group2.addItem(namee);
  
             }

         } catch (SQLException ex) {
             
         }
   }

       
         public void nolessoon()
         {
              try {
             String sql="SELECT nolesson  FROM mrahmed.attendance where serial='"+seria2.getText()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 nolesson.setText(rs.getString("nolesson"));
               
           }
             else
             {
                  nolesson.setText("0");
             }
         } catch (SQLException ex) {
             
         }
         }
        public void attendance()
         {
             String seriall = seria2.getText();
        
                    
                      try {
                    String sqlll = "UPDATE mrahmed.attendance SET nolesson=nolesson-1 where serial='"+seriall+"'";
                    pst=(PreparedStatement) con.prepareStatement(sqlll);
                    pst.executeUpdate();
                } catch (SQLException ex) {

                }
         }  

}
