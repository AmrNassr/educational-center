
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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class pay extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
       Connection con ;
    PreparedStatement pst ;
    ResultSet rs;
    public   int day;
    public int month;
    // String month;
    public int year;
    public String datefrom;
            public String dateto;
            int lessonPricee;
    public pay() {   initComponents();
        con=DBConnect.connect();
        tablelord();
              Calendar cal = new GregorianCalendar();
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month=cal.get(Calendar.MONTH)+1;
                int year = cal.get(Calendar.YEAR);
               date.setText(year+":"+month+":"+day);
               if(month==12)
               {
                   month=1;
                   year++;
               }
                datefrom=date.getText();
               
               System.out.println(date.getText());
        name();
        serial();
        clear();
        comboxfromcombo();
        name.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
         nolesson.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
           serial.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
           AutoCompleteDecorator.decorate(serial);
           AutoCompleteDecorator.decorate(name);
           TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
           JLabel headerLabel = (JLabel) rendererFromHeader;
           headerLabel.setHorizontalAlignment(JLabel.CENTER);
           DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
           centerRenderer.setHorizontalAlignment( JLabel.CENTER );
           tdetails.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
           tdetails.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
          
       
 
       nolesson.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                lessonprice();
                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
  
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            
               
            }
        });
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        nolesson = new javax.swing.JTextField();
        nolesson1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        name = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        serial = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        التوقيت = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        classs = new javax.swing.JTextField();
        nolesson2 = new javax.swing.JTextField();

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
        tdetails.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tdetails.setForeground(new java.awt.Color(255, 255, 255));
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "تاريخ الدفع", "نقدي", "عدد الحصص", "اسم الطالب", "الرقم التسلسلي"
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
            tdetails.getColumnModel().getColumn(1).setMinWidth(100);
            tdetails.getColumnModel().getColumn(1).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(1).setMaxWidth(100);
            tdetails.getColumnModel().getColumn(4).setMinWidth(100);
            tdetails.getColumnModel().getColumn(4).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 920, 280));

        date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("jLabel1");
        jPanel10.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 340, 60));

        nolesson.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(nolesson, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 230, 30));

        nolesson1.setEditable(false);
        nolesson1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nolesson1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nolesson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolesson1ActionPerformed(evt);
            }
        });
        jPanel10.add(nolesson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 60, 60));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("عدد الحصص المتاحه");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 210, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("نقدي");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        amount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 90, 30));

        name.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        name.setForeground(new java.awt.Color(102, 0, 0));
        name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        name.setEnabled(false);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nameMouseReleased(evt);
            }
        });
        jPanel10.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("اسم الطالب");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 160, -1));

        serial.setEditable(true);
        serial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        serial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serialMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                serialMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                serialMouseReleased(evt);
            }
        });
        jPanel10.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 230, 30));

        save.setBackground(new java.awt.Color(98, 113, 146));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("اضافه");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel10.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 180, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("كود الطالب");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 160, -1));

        التوقيت.setBackground(new java.awt.Color(255, 255, 255));
        التوقيت.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        التوقيت.setForeground(new java.awt.Color(255, 255, 255));
        التوقيت.setText("عدد الحصص");
        jPanel10.add(التوقيت, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 180, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myback.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jLabel2.setMaximumSize(new java.awt.Dimension(1370, 690));
        jLabel2.setMinimumSize(new java.awt.Dimension(1370, 690));
        jLabel2.setPreferredSize(new java.awt.Dimension(1370, 690));
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 690));

        serialid.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        serialid.setForeground(new java.awt.Color(255, 255, 255));
        serialid.setText("jLabel1");
        jPanel10.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        classs.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel10.add(classs, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 30));

        nolesson2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nolesson2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolesson2ActionPerformed(evt);
            }
        });
        jPanel10.add(nolesson2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 30));

        jTabbedPane1.addTab("مميز", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        int x  =  Integer.parseInt(nolesson.getText());

        String namee = name.getSelectedItem().toString();
        String seriall = serial.getSelectedItem().toString();
        String amountt = amount.getText();
        String nolessons = nolesson.getText();
        int y = Integer.parseInt(amount.getText());

        if( nolesson.getText().trim().isEmpty() || amount.getText().trim().isEmpty() ||serial.getSelectedItem().toString().trim().isEmpty()|| name.getSelectedItem().toString().trim().isEmpty() )
        {
            JOptionPane.showMessageDialog(this, " من فضلك ادخل كود الطاب و وعدد الحصص و النقدي");
        }
        else
        {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العمليه", "تاكيد العمليه", dialogButton);
            if(dialogResult == 0) {
                try{
                    String sql = "INSERT INTO mrahmed.pay (serial,name, date, nolesson,amount) VALUES"
                    + " ('"+seriall+"','"+namee+"','"+date.getText()+"','"+x+"','"+y+"')";
                    pst = (PreparedStatement)con.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "تم اضافه الحصص بنجاح");

                    clear();
                    tablelord();

                }
                catch(Exception e ){
                    JOptionPane.showMessageDialog(null,"خطا فالاضافه");
                }

                try{

                    String sql = "SELECT serial,nolesson  FROM mrahmed.attendance where serial='"+seriall+"'";
                    pst=(PreparedStatement) con.prepareStatement(sql);
                    rs=pst.executeQuery();
                    if (rs.next())
                    {
                        int k  = x+Integer.parseInt(rs.getString("nolesson"));
                        try {
                            String sqlll = "UPDATE mrahmed.attendance SET nolesson='"+k+"' where serial='"+seriall+"'";
                            pst=(PreparedStatement) con.prepareStatement(sqlll);
                            pst.executeUpdate();
                            clear();
                            tablelord();

                        } catch (SQLException ex) {

                        }
                    }
                    else
                    {
                        try{
                            String sq = "INSERT INTO mrahmed.attendance (serial,name, nolesson) VALUES('"+seriall+"','"+namee+"','"+x+"')";
                            pst = (PreparedStatement)con.prepareStatement(sq);
                            pst.execute();
                            clear();
                            tablelord();

                        }
                        catch(Exception e ){
                            JOptionPane.showMessageDialog(null,"خطا فالاضافه");
                        }
                    }
                }

                catch(Exception e ){
                    JOptionPane.showMessageDialog(null,"خطا فالحصص");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(this, " تم الغاء العمليه");
            }
        }

    }//GEN-LAST:event_saveActionPerformed

    private void serialMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serialMouseReleased

    }//GEN-LAST:event_serialMouseReleased

    private void serialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serialMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialMousePressed

    private void serialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_serialMouseEntered

    private void nameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nameMouseReleased

    private void nolesson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolesson1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nolesson1ActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        /*        DefaultTableModel tmodel =(DefaultTableModel)tdetails.getModel();
        int selectrowindex=tdetails.getSelectedRow();
        serial.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        serialid.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        name.setSelectedItem(tmodel.getValueAt(selectrowindex, 3).toString());
        nolesson.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        amount.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        date.setText(tmodel.getValueAt(selectrowindex, 0).toString());*/

    }//GEN-LAST:event_tdetailsMouseClicked

    private void nolesson2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolesson2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nolesson2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField classs;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox name;
    private javax.swing.JTextField nolesson;
    private javax.swing.JTextField nolesson1;
    private javax.swing.JTextField nolesson2;
    private javax.swing.JButton save;
    private javax.swing.JComboBox serial;
    private javax.swing.JLabel serialid;
    private javax.swing.JTable tdetails;
    private javax.swing.JLabel التوقيت;
    // End of variables declaration//GEN-END:variables
  public void tablelord()
    {
        try {
            String sqll = "SELECT serial,name,nolesson,amount,date FROM mrahmed.pay where serial LIKE 'PN-%'";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
            DefaultTableModel model =(DefaultTableModel)tdetails.getModel(); 
                model.setRowCount(0);
               int k=0;
                while (rs.next())
                {
                   
                    Object row[] = {
                        rs.getString("date"),
                        
                        rs.getString("amount"),
                        rs.getString("nolesson"),
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

 

 serial.setSelectedIndex(0);
 name.setSelectedIndex(0);
 nolesson.setText("");
 serialid.setText("");
 amount.setText("");

 
 }
             public void serial()
   {
        try {
             String sql="SELECT serial FROM mrahmed.privatestudents order by CONVERT(replace(serial,'PN-',''),UNSIGNED INTEGER) ASC";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String name = rs.getString("serial");
                
                serial.addItem(name);
  
             }

         } catch (SQLException ex) {
             
         }
   }
           
              public void lessonprice()
              {
                  String llkl= nolesson.getText();
                  nolesson2.setText(llkl);
                  try {
             String sql="SELECT lessonpricee  FROM mrahmed.lessonprice "
                     + "where classname='الثالت الثانوي'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                int xxx= Integer.parseInt(rs.getString("lessonpricee"));
                int nol = Integer.parseInt(nolesson2.getText());
                 lessonPricee=xxx*nol;
                 
                 amount.setText(""+lessonPricee);
                 nolesson2.setVisible(false);
             }

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(amount, ex);
             
         }
              }
 public void name()
         
   {
        try {
             String sql="SELECT name  FROM mrahmed.privatestudents ";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String namee = rs.getString("name");
                
                name.addItem(namee);
  
             }

         } catch (SQLException ex) {
             
         }
   }
        public void comboxfromcombo()
      {
                   serial.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                 try {
             String sql="SELECT nolesson  FROM mrahmed.attendance where serial='"+serial.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                 nolesson1.setText(rs.getString("nolesson"));

                if (event.getStateChange() == ItemEvent.SELECTED) {
                    nolesson1.setText(rs.getString("nolesson"));
              
                }

                if (event.getStateChange() == ItemEvent.DESELECTED) {
                    
                }
  
             }
             else
             {
                  nolesson1.setText("0");
             }

         } catch (SQLException ex) {
             
         }
                 try {
             String sql="SELECT name  FROM mrahmed.privatestudents where serial='"+serial.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 name.setSelectedItem(rs.getString("name"));

                if (event.getStateChange() == ItemEvent.SELECTED) {
                    name.setSelectedItem(rs.getString("name"));
              
                }

                if (event.getStateChange() == ItemEvent.DESELECTED) {
                    
                }
  
             }

         } catch (SQLException ex) {
             
         }
         }
        });
       
      }
        
         public void classs()
      {
                   serial.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                JComboBox cmsupplier = (JComboBox) event.getSource();

                Object item = event.getItem();
                
                 try {
             String sql="SELECT class  FROM mrahmed.privatestudents where serial='"+serial.getSelectedItem().toString()+"'";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                 classs.setText(rs.getString("class"));
                 

                if (event.getStateChange() == ItemEvent.SELECTED) {
                    classs.setText(rs.getString("class"));
              
                }

                if (event.getStateChange() == ItemEvent.DESELECTED) {
                    
                }
  
             }

         } catch (SQLException ex) {
             
         }
         }
        });
                 
                 
       
      }
}
