

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*; 
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;

public class appointmentreport implements ActionListener
{
    
    Connection con;

    ResultSet rs, rs1;

    Statement st, st1;

    PreparedStatement pst;
        String ids;
    JButton b1;
    static JTable table;

   String[] columnNames = {"Appointment ID", "Appointment Date", "Appointment Time","Doctor Name","Patient Name"};
      appointmentreport(Date sqlaDate)
    {
       JFrame p1 = new JFrame();
       


        p1.setLayout(new BoxLayout(p1.getContentPane(), BoxLayout.Y_AXIS));
       p1.getContentPane().setBackground(new Color(218,165,32));
    
//TableModel tm = new TableModel();

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames());

//table = new JTable(model);
  p1.getContentPane().setBackground(Color.black);
    
        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        
//String textvalue = textbox.getText();
  
        

        try {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
               
            pst = con.prepareStatement("select apid,adate,atime,dname,pname from appointment,doctor,patient where doctor.doct_id=appointment.doct_id and patient.pid=appointment.pid and adate=?");
             pst.setDate(1,sqlaDate); 
            ResultSet rs = pst.executeQuery();
System.out.println("hi");
            int i = 0;

            while(rs.next()) {

                int apid= rs.getInt("apid");

                java.sql.Date adate = rs.getDate("adate");

                java.sql.Time atime= rs.getTime("atime");
                String dname= rs.getString("dname");
              String pname= rs.getString("pname");
                model.addRow(new Object[]{apid, adate,atime,dname,pname});

                i++;

            }

          
    
        } catch (Exception ex) {
System.out.print(ex.getMessage());
            //JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        
        p1.add(scroll);
        
        b1=new JButton("Print");
        b1.addActionListener( this);
        p1.add(b1);
        p1.setBounds(10,10,500,200);
        p1.setVisible(true);
        p1.setLocation(700,300);
        p1.setSize(400, 300);
        p1.pack();
}
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
         PrinterJob pjob = PrinterJob.getPrinterJob();
    PageFormat pf = pjob.defaultPage();
    pjob.setPrintable(null, pf);

    if (pjob.printDialog()) {
      pjob.print();
    }
        }catch(Exception e){}

    }
    public static void main(String[] args) {
     //   new appointmentreport();
    }
}