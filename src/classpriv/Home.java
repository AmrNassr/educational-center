/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpriv;

import java.io.File;
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
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    LoginForm l ;
    Connection con ;
    PreparedStatement pst ;
    ResultSet rs; 
    public String y; 
    public String type;
    public Home(String x) throws IOException {
        initComponents();
         con=DBConnect.connect();
        name11.setText(x);
        name11.setVisible(true);
        y=x;
        backuppp();
        Calendar cal = new GregorianCalendar();
        int dayy = cal.get(Calendar.DAY_OF_MONTH);
        if(dayy == 4 || dayy==3)
        {
         salary();
        }
      
        
        checkusertype();
       Attendance ad= new Attendance();
        jDesktopPane1.add(ad).setVisible(true);
        
        if( type2.getText().equals("admin") )
        {
            reportt.setEnabled(true);
            jButton4.setEnabled(true);
            jMenuItem10.setEnabled(true);
            jMenuItem13.setEnabled(true);
            jMenuItem14.setEnabled(true);
            jMenuItem27.setEnabled(true);
            jMenuItem19.setEnabled(true);
            jMenu5.setEnabled(true);
            jMenuItem28.setEnabled(true);
            jMenuItem15.setEnabled(true);
            
           
        }
       if(type2.getText().equals("financial")  )
        { 
            reportt.setEnabled(true);
        }
                
           
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        meall = new javax.swing.JButton();
        reportt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(17, 39, 37));
        jPanel1.setMaximumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setMinimumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(980, 750));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 970, 660));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/employee.png"))); // NOI18N
        jButton5.setText("الامتحانات");
        jButton5.setPreferredSize(new java.awt.Dimension(169, 89));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 220, 100));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Print_1.png"))); // NOI18N
        jButton4.setText("السلف");
        jButton4.setEnabled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(169, 89));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 220, 100));

        meall.setBackground(new java.awt.Color(204, 255, 255));
        meall.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        meall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attend00.png"))); // NOI18N
        meall.setText("الحضور");
        meall.setPreferredSize(new java.awt.Dimension(169, 89));
        meall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meallActionPerformed(evt);
            }
        });
        jPanel1.add(meall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 100));

        reportt.setBackground(new java.awt.Color(204, 255, 255));
        reportt.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        reportt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/payment-64.png"))); // NOI18N
        reportt.setText("الدفع");
        reportt.setEnabled(false);
        reportt.setPreferredSize(new java.awt.Dimension(169, 89));
        reportt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporttActionPerformed(evt);
            }
        });
        jPanel1.add(reportt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 220, 100));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-google-blog-search-64.png"))); // NOI18N
        jButton1.setText("حصه اضافي");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 100));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/student-100.png"))); // NOI18N
        jButton3.setText("الغياب");
        jButton3.setPreferredSize(new java.awt.Dimension(169, 89));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 220, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myback.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setMinimumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 720));

        type2.setForeground(new java.awt.Color(255, 255, 255));
        type2.setText("jLabel1");
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 150, 30));

        name11.setBackground(new java.awt.Color(204, 153, 0));
        name11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name11.setForeground(new java.awt.Color(255, 255, 255));
        name11.setText("jLabel2");
        jPanel1.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 30));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("الرئيسية");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setText("اضافه طالب");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setText("اضافه موظف");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem6.setText("اضافه مجموعه");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem5.setText("اضافه صف");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem4.setText("اضافه معهد");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem10.setText("اضافه مستخدم");
        jMenuItem10.setEnabled(false);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenu5.setText("BarCode");
        jMenu5.setEnabled(false);
        jMenu5.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem19.setText("مميز");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenu1.add(jMenu5);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setText("اغلاق");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("حجز");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem7.setText("حجز الطلاب");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem8.setText("اضافه مجموعه حجز");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("الغياب");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem12.setText("تقرير الغياب ");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("الحصص");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem17.setText("عدد الحصص");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("امتحانات");
        jMenu6.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem16.setText("اضافه امتحان");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuItem22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem22.setText("تقرير الامتحانات ");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem22);

        jMenuItem23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem23.setText("تقرير امتحان مجموعه ");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem23);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("تقرير شهري");
        jMenu7.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem20.setText("مجموعه");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenuItem26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem26.setText("طالب");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem26);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("الحسابات");
        jMenu8.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem13.setText("اسعار الحصص");
        jMenuItem13.setEnabled(false);
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem13);

        jMenuItem28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem28.setText("سعر المذكره");
        jMenuItem28.setEnabled(false);
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem28);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem14.setText("دخل المعاهد");
        jMenuItem14.setEnabled(false);
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem14);

        jMenuItem27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem27.setText(" المصروفات و الخصومات");
        jMenuItem27.setEnabled(false);
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem27);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem15.setText("تقرير مصروفات");
        jMenuItem15.setEnabled(false);
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("بحث");
        jMenu9.setAlignmentX(0.0F);
        jMenu9.setAlignmentY(0.0F);
        jMenu9.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItem25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem25.setText("الطلاب");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem25);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDesktopPane1.removeAll();
       exam addd = new exam();
       jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void meallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meallActionPerformed
        jDesktopPane1.removeAll();
        Attendance addd = new Attendance();
       jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_meallActionPerformed

    private void reporttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporttActionPerformed
        try{
            jDesktopPane1.removeAll();
           pay addd = new pay();
            jDesktopPane1.add(addd).setVisible(true);
        }
        catch(Exception e)
        {
        }

    }//GEN-LAST:event_reporttActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            jDesktopPane1.removeAll();
            advancelesson addd = new advancelesson();
            jDesktopPane1.add(addd).setVisible(true);
        } 
        catch(Exception e)
        {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            jDesktopPane1.removeAll();
           reportr addd = new reportr();
           jDesktopPane1.add(addd).setVisible(true);
        }
         catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            jDesktopPane1.removeAll();
            advancepayment addd = new advancepayment();
           jDesktopPane1.add(addd).setVisible(true);
        }
         catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
try {
            jDesktopPane1.removeAll();
            Students addd = new Students();
           jDesktopPane1.add(addd).setVisible(true);
        }
         catch(Exception e)
        {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
             LoginForm l = new LoginForm();
             l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         
                addplace l = new addplace();
             l.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
          addclass m = new addclass();
             m.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       jDesktopPane1.removeAll();
            employee addd = new employee();
           jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
          try {
            jDesktopPane1.removeAll();
            Groups addd = new Groups();
            jDesktopPane1.add(addd).setVisible(true);
        } 
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
         try {
            jDesktopPane1.removeAll();
            bookgroup addd = new bookgroup();
            jDesktopPane1.add(addd).setVisible(true);
        } 
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         try {
            jDesktopPane1.removeAll();
            studentbook addd = new studentbook();
            jDesktopPane1.add(addd).setVisible(true);
        } 
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
         NoattendanceReport2 m = new NoattendanceReport2();
             m.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
         Presultreport m = new Presultreport();
             m.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
 exams m = new exams();
             m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        reportNooflesson m = new reportNooflesson();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
      
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
      pBarCode m= new pBarCode();
      m.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        Pgroupresult m = new Pgroupresult();
        m.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        GroupAttendance m = new GroupAttendance();
        m.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
     
        jDesktopPane1.removeAll();
            searchstudent addd = new searchstudent();
            jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       jDesktopPane1.removeAll();
        addUser addd = new addUser();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
           classprice m = new classprice();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        placePrice m = new placePrice();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
       jDesktopPane1.removeAll();
        deduction addd = new deduction();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        studentFollowUp m = new studentFollowUp();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        accountReport m = new accountReport();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
 bookPrice m = new bookPrice();
        m.setVisible(true);        
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton meall;
    private javax.swing.JLabel name11;
    public javax.swing.JButton reportt;
    private javax.swing.JLabel type2;
    // End of variables declaration//GEN-END:variables

   public void checkusertype()
   {
         try {
            String sqll = "SELECT type from mrahmed.users WHERE username='"+name11.getText()+"'";
              pst=(PreparedStatement) con.prepareStatement(sqll);
            rs=pst.executeQuery();
         while (rs.next())
                {
                 type=rs.getString("type");
                 type2.setText(type);
                }
        }
        catch (SQLException ex) {
            
        }
   }
   public void backuppp()
   {
          String x = "D:meal/MrHossamReport/mat";
        Process p = null;
       try{
           Runtime runtime = Runtime.getRuntime();
           p=runtime.exec("C:/Program Files (x86)/MySQL/MySQL Server 5.6/bin/mysqldump.exe -uroot -proot --add-drop-database -B mrahmed -r"+x+".jasper");
           int processComplete = p.waitFor();
           
           }
       catch(Exception e )
       {
           
       }
   }

    private void salary() {
       try {
             String sql="SELECT serial FROM mrahmed.advanceamount";
             pst=(PreparedStatement) con.prepareStatement(sql);
             rs=pst.executeQuery();
             while(rs.next()){
                String serial = rs.getString("serial");
                  try {
                     String sqll = "UPDATE mrahmed.advanceamount SET remaining=(select employee.salary from employee where employee.serial=advanceamount.serial) WHERE advanceamount.serial='"+serial+"'";
                    pst=(PreparedStatement) con.prepareStatement(sqll);
                    pst.executeUpdate();

                } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(null,ex);
                }
                
  
             }

         } catch (SQLException ex) {
             
         }
    }
}
