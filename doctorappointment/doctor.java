/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author aarti
 */
public class doctor extends javax.swing.JFrame {

    /**
     * Creates new form product
     */
    int supid;
    int ptid;
    public doctor() {
        initComponents();
       getContentPane().setBackground(Color.black);
    
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
            Statement stmt = conn.createStatement();
        
            if(conn!=null)
              System.out.println("Connection successful..");
            
            Statement ps1 = conn.createStatement();
                    
            
             
            ResultSet rs=ps1.executeQuery(" select max(doct_id) from doctor");
            int cnt=0;
            while(rs.next())
            {
              
                cnt=rs.getInt(1);
            }
            cnt++;
            didtext.setText(String.valueOf(cnt));
             ps1.close();
      
             conn.close();
            }
            catch(Exception e1)
            {
                
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

        jLabel1 = new javax.swing.JLabel();
        didtext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dnametext = new javax.swing.JTextField();
        qualitext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        feestext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresstext = new javax.swing.JTextArea();
        contacttext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gendercombo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Doctort ID");

        didtext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Doctor Name");

        dnametext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        qualitext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Qualification");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 255, 255));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Fees");

        feestext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Address");

        addresstext.setColumns(20);
        addresstext.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        addresstext.setRows(5);
        jScrollPane1.setViewportView(addresstext);

        contacttext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Contact Number");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("Gender");

        gendercombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gendercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(44, 44, 44)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(feestext, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(dnametext, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addComponent(qualitext, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(contacttext, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(didtext)
                                .addComponent(gendercombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(didtext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacttext, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(gendercombo))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qualitext, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feestext, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
           
        
            if(conn!=null)
              System.out.println("Connection successful..");
            
              boolean   contactresult= contacttext.getText().matches("[+-]?([0-9]*[.])?[0-9]+");
            boolean   feeresult= feestext.getText().matches("[+-]?([0-9]*[.])?[0-9]+");
            if(dnametext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter doctor name");
            }
            
            else if(addresstext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter address");
            }
            else if(contacttext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter contact number");
            }
             else if(contacttext.getText().length()!=10)
            {
                JOptionPane.showMessageDialog(this, "Please enter 10 digits in contact number");
            }
             else if(gendercombo.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(this, "Please select gender");
            }
             else if(contactresult==false)
             {
              JOptionPane.showMessageDialog(this, "Please enter only digits in contact");   
 
             }
              else if(qualitext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter price");
            }
            else if(feestext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter fee");
            }  
            else if(feeresult==false)
             {
              JOptionPane.showMessageDialog(this, "Please enter only digits in fee");   
 
             }
            else
            {
            PreparedStatement ps1 = conn.prepareStatement("update doctor set dname=?,dadd=?,dcontact=?,gender=?,qualification=?,dfees=? where doct_id=?");
           int dno=Integer.parseInt(didtext.getText());
            String dname=dnametext.getText();
            String address=addresstext.getText();
            long contact=Long.parseLong(contacttext.getText());
            String gender=(String)gendercombo.getSelectedItem();
             String quali=qualitext.getText();           
            double fee=Double.parseDouble(feestext.getText());
            
       
	     ps1.setInt(7,dno); 
             ps1.setString(1,dname);
             ps1.setString(2,address);
             ps1.setLong(3,contact);
             ps1.setString(4,gender);
             ps1.setString(5,quali);             
             ps1.setDouble(6,fee);
            
             ps1.executeUpdate();
             
         
             ps1.close();
             JOptionPane.showMessageDialog(this,"record updated");
             conn.close();
             new doctor().setVisible(true);
             dispose();
            }
            }
            catch(Exception e1)
            {
                System.out.println("error"+e1.getMessage());
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
           
        
            if(conn!=null)
              System.out.println("Connection successful..");
            
            PreparedStatement ps1 = conn.prepareStatement("delete from doctor where doct_id=?");
             boolean   cidresult= didtext.getText().matches("[0-9]");
              if(cidresult==false)
             {
              JOptionPane.showMessageDialog(this, "Please enter only digits in doctor ID");   
 
             }
            int pno=Integer.parseInt(didtext.getText());
            
             
             ps1.setInt(1,pno);  
             
             int d=ps1.executeUpdate();
             if(d==0)
             {
               JOptionPane.showMessageDialog(this,"record not found");  
             }
             else
             {
               JOptionPane.showMessageDialog(this,"record deleted");  
               new doctor().setVisible(true);
                dispose();
             }
             ps1.close();
             
             conn.close();
             
            }
            catch(Exception e1)
            {
                System.out.println("error"+e1.getMessage());
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
           
        
            if(conn!=null)
              System.out.println("Connection successful..");
            
            PreparedStatement ps1 = conn.prepareStatement("select * from doctor where doct_id=?");
            int dno=Integer.parseInt(didtext.getText());                 
	    
             ps1.setInt(1,dno);  
             
         
            ResultSet rs=ps1.executeQuery();
            if(!rs.isBeforeFirst() && rs.getRow() == 0)
            {
               JOptionPane.showMessageDialog(this,"record not found");
          
            }
            while(rs.next())
            {
                dnametext.setText(rs.getString("dname"));
                qualitext.setText(rs.getString("qualification"));
                contacttext.setText(String.valueOf(rs.getLong("dcontact")));
              
                addresstext.setText(rs.getString("dadd"));
                gendercombo.setSelectedItem(rs.getString("gender"));
                feestext.setText(String.valueOf(rs.getDouble("dfees")));
             }
            }
            catch(Exception e1)
            {
                System.out.println("error"+e1.getMessage());
            }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
           
        
            if(conn!=null)
              System.out.println("Connection successful..");
            
            boolean   contactresult= contacttext.getText().matches("[+-]?([0-9]*[.])?[0-9]+");
            boolean   feeresult= feestext.getText().matches("[+-]?([0-9]*[.])?[0-9]+");
            if(dnametext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter doctor name");
            }
            
            else if(addresstext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter address");
            }
            else if(contacttext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter contact number");
            }
             else if(contacttext.getText().length()!=10)
            {
                JOptionPane.showMessageDialog(this, "Please enter 10 digits in contact number");
            }
             else if(gendercombo.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(this, "Please select gender");
            }
             else if(contactresult==false)
             {
              JOptionPane.showMessageDialog(this, "Please enter only digits in contact");   
 
             }
              else if(qualitext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter price");
            }
            else if(feestext.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Please enter fee");
            }  
            else if(feeresult==false)
             {
              JOptionPane.showMessageDialog(this, "Please enter only digits in fee");   
 
             }
            else
            {
            PreparedStatement ps1 = conn.prepareStatement("insert into doctor values(?,?,?,?,?,?,?)");
            int dno=Integer.parseInt(didtext.getText());
            String dname=dnametext.getText();
            String address=addresstext.getText();
            long contact=Long.parseLong(contacttext.getText());
            String gender=(String)gendercombo.getSelectedItem();
             String quali=qualitext.getText();           
            double fee=Double.parseDouble(feestext.getText());
            
       
	     ps1.setInt(1,dno); 
             ps1.setString(2,dname);
             ps1.setString(3,address);
             ps1.setLong(4,contact);
             ps1.setString(5,gender);
             ps1.setString(6,quali);             
             ps1.setDouble(7,fee);
            
             ps1.executeUpdate();
             
         
             ps1.close();
             JOptionPane.showMessageDialog(this,"record saved");
             conn.close();
             new doctor().setVisible(true);
             dispose();
            }
            }
            catch(Exception e1)
            {
                System.out.println("error"+e1.getMessage());
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addresstext;
    private javax.swing.JTextField contacttext;
    private javax.swing.JTextField didtext;
    private javax.swing.JTextField dnametext;
    private javax.swing.JTextField feestext;
    private javax.swing.JComboBox<String> gendercombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qualitext;
    // End of variables declaration//GEN-END:variables
}