/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpriv;

import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */

public final class reportr extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
       Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
     public String y ;
     public String date ; 
    
   
    public reportr() {
        initComponents();
        con=DBConnect.connect();
         
        tablelord();
        clear();
        privateGroups();
     day.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
          month.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
           year.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
           Calendar cal = new GregorianCalendar();
            int dayy = cal.get(Calendar.DAY_OF_MONTH);
                int monthh=cal.get(Calendar.MONTH)+1;
                int yearr = cal.get(Calendar.YEAR);
                  day.setText(Integer.toString(dayy));
                    month.setText(Integer.toString(monthh));
                year.setText(Integer.toString(yearr));
            TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
            TableCellRenderer rendererFromHeaderr = tdetails2.getTableHeader().getDefaultRenderer();
JLabel headerLabel = (JLabel) rendererFromHeader;
JLabel headerLabel2 = (JLabel) rendererFromHeaderr;
headerLabel.setHorizontalAlignment(JLabel.CENTER);
headerLabel2.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tdetails.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
         tdetails.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
         tdetails2.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
         tdetails2.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
          tdetails2.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
           tdetails2.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
         
          
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdetails2 = new javax.swing.JTable();
        cmgroup = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        s4 = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        delete4 = new javax.swing.JButton();
        delete5 = new javax.swing.JButton();
        day = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
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
        jPanel10.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tdetails.setBackground(new java.awt.Color(17, 39, 37));
        tdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails.setForeground(new java.awt.Color(255, 255, 255));
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "الاسم", "رقم"
            }
        ));
        tdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails.setRowHeight(25);
        tdetails.setRowMargin(2);
        tdetails.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(1).setMinWidth(70);
            tdetails.getColumnModel().getColumn(1).setPreferredWidth(70);
            tdetails.getColumnModel().getColumn(1).setMaxWidth(70);
            tdetails.getColumnModel().getColumn(1).setHeaderValue("المرتب");
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 400, 280));

        tdetails2.setBackground(new java.awt.Color(17, 39, 37));
        tdetails2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails2.setForeground(new java.awt.Color(255, 255, 255));
        tdetails2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "رقم ولي الامر", "رقم الهاتف", "الاسم", "رقم"
            }
        ));
        tdetails2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails2.setRowHeight(25);
        tdetails2.setRowMargin(2);
        tdetails2.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetails2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tdetails2);
        if (tdetails2.getColumnModel().getColumnCount() > 0) {
            tdetails2.getColumnModel().getColumn(2).setMinWidth(200);
            tdetails2.getColumnModel().getColumn(2).setPreferredWidth(200);
            tdetails2.getColumnModel().getColumn(2).setMaxWidth(200);
            tdetails2.getColumnModel().getColumn(3).setMinWidth(50);
            tdetails2.getColumnModel().getColumn(3).setPreferredWidth(50);
            tdetails2.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jPanel10.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 470, 280));

        cmgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel10.add(cmgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 230, 30));

        save.setBackground(new java.awt.Color(98, 113, 146));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("غياب / حضور");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel10.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 180, 40));

        month.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 60, 30));

        year.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 60, 30));

        s4.setBackground(new java.awt.Color(255, 255, 255));
        s4.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("سنه");
        jPanel10.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 60, -1));

        s.setBackground(new java.awt.Color(255, 255, 255));
        s.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setText("شهر");
        jPanel10.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 60, -1));

        a1.setBackground(new java.awt.Color(255, 255, 255));
        a1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 255, 255));
        a1.setText("حضور");
        jPanel10.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 100, 50));

        s3.setBackground(new java.awt.Color(255, 255, 255));
        s3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("غياب");
        jPanel10.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 60, -1));

        s1.setBackground(new java.awt.Color(255, 255, 255));
        s1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("/");
        jPanel10.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 10, -1));

        s2.setBackground(new java.awt.Color(255, 255, 255));
        s2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("/");
        jPanel10.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 10, -1));

        delete4.setBackground(new java.awt.Color(98, 113, 146));
        delete4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        delete4.setForeground(new java.awt.Color(255, 255, 255));
        delete4.setText("طباعه");
        delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete4ActionPerformed(evt);
            }
        });
        jPanel10.add(delete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 180, 50));

        delete5.setBackground(new java.awt.Color(98, 113, 146));
        delete5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        delete5.setForeground(new java.awt.Color(255, 255, 255));
        delete5.setText("تقرير");
        delete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete5ActionPerformed(evt);
            }
        });
        jPanel10.add(delete5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 180, 50));

        day.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 60, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("مجموعه");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 100, -1));

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("يوم ");
        jPanel10.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 60, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myback.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        jTabbedPane1.addTab("مميز", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
  date = year.getText()+"-"+month.getText()+"-"+day.getText();
            System.out.println(date);
             String groupp = cmgroup.getSelectedItem().toString();
            
           
        try {
            String sqll = "SELECT serial,name,phone,pphone FROM mrahmed.privatestudents \n" +
"where groupp='"+groupp+"'  \n" +
"AND serial not in\n" +
"(SELECT serial FROM mrahmed.studentattendance where groupp='"+groupp+"'  \n" +
" and date = '"+date+"')";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails2.getModel(); 
                model.setRowCount(0);
              int x = 1;
             int q = 1 ;
                while (rs.next())
                    
                {
                    String qq= Integer.toString(q);
                    Object row[] = {
                   
                         rs.getString("pphone"),
                       rs.getString("phone"),
                       rs.getString("name"),
                        qq,
                            };
                    model.addRow(row);
                    x++;
                    q++;
                    
                }
                if(x>=11)
                {
                }
                else
                {
                for(int z = x ;z<11;z++)
                {
                 Object rowData[] = {
                       "", "", "","","",
                       };
                model.addRow(rowData);
                }
        }
        }
        catch (SQLException ex) {
            
        }
        try {
            String sqll = "SELECT name FROM mrahmed.studentattendance WHERE date = '"+date+"' and groupp = '"+groupp+"'";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
              int x = 1;
             int q = 1 ;
                while (rs.next())
                    
                {
                    String qq= Integer.toString(q);
                    Object row[] = {
                   
                         rs.getString("name"),
                    
                      
                       
                            };
                    model.addRow(row);
                    x++;
                    q++;
                    
                }
                if(x>=11)
                {
                }
                else
                {
                for(int z = x ;z<11;z++)
                {
                 Object rowData[] = {
                       "", "", "","","",
                       };
                model.addRow(rowData);
                }
        }
        }
        catch (SQLException ex) {
            
        }
    
    }//GEN-LAST:event_saveActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        int selectrowindex=tdetails.getSelectedRow();
   
    }//GEN-LAST:event_tdetailsMouseClicked

    private void tdetails2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetails2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tdetails2MouseClicked

    private void delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete4ActionPerformed
          String groupp=cmgroup.getSelectedItem().toString();
        date = year.getText()+"-"+month.getText()+"-"+day.getText();
     InputStream in=null;
      try {
          
         
          String reportpath ="D:\\meal\\MrHossamReport\\private2.jasper";
    Map<String,Object> para = new HashMap<String,Object>();
            para.put("group", groupp);
            para.put("date",date );
           

            JasperPrint j = JasperFillManager.fillReport(reportpath, para,con);
            JasperViewer.viewReport(j,false);
      }
     catch (JRException ex) {
         JOptionPane.showMessageDialog(rootPane,  ex);
             // Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, "لم يتم تسجيل حضور اي طالب اليوم");
        } finally {
        }   
    }//GEN-LAST:event_delete4ActionPerformed

    private void delete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete5ActionPerformed
         String groupp=cmgroup.getSelectedItem().toString();
        String date1 = year.getText()+"-"+month.getText()+"-"+day.getText();
     InputStream in=null;
      try {
          
          
          String reportpath="D:\\meal\\MrHossamReport\\report6.jasper";
    Map<String,Object> para = new HashMap<String,Object>();
            para.put("group", groupp);
            para.put("date",date1 );
           

            JasperPrint j = JasperFillManager.fillReport(reportpath, para,con);
            JasperViewer.viewReport(j,false);
      }
     catch (JRException ex) {
            Logger.getLogger(reportr.class.getName()).log(Level.SEVERE, null, "بم يسجل غياب اي طالب اليوم");
        } finally {
        }    
    }//GEN-LAST:event_delete5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel a1;
    private javax.swing.JComboBox cmgroup;
    public javax.swing.JTextField day;
    private javax.swing.JButton delete4;
    private javax.swing.JButton delete5;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField month;
    private javax.swing.JLabel s;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JButton save;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    private javax.swing.JTable tdetails2;
    public javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables

   public void tablelord()
    {
       
    }
     public void clear()
 {

 
 cmgroup.setSelectedIndex(0);

 
 }
        public void privateGroups()
   {
        try {
             String sql="SELECT GroupName  FROM mrahmed.groups where type = 'اساسي' ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("GroupName");
                
                cmgroup.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
    
           

         
   
     
}
