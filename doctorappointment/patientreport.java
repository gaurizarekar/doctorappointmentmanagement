

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*; 
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;

public class patientreport implements ActionListener
{
    
    Connection con;

    ResultSet rs, rs1;

    Statement st, st1;

    PreparedStatement pst;
        String ids;
    JButton b1;
    static JTable table;

    String[] columnNames = {"Patient ID", "Name", "Address","Contact Number"};
    patientreport()
    {
       JFrame p1 = new JFrame();
       


        p1.setLayout(new BoxLayout(p1.getContentPane(), BoxLayout.Y_AXIS));
       p1.getContentPane().setBackground(Color.black);
    
//TableModel tm = new TableModel();

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames());

//table = new JTable(model);
   
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
               
            pst = con.prepareStatement("select * from patient");

            ResultSet rs = pst.executeQuery();
System.out.println("hi");
            int i = 0;

            while(rs.next()) {

                int supid= rs.getInt("pid");

                String sname = rs.getString("pname");

                long contact= rs.getLong("pcontact");
                String address= rs.getString("padd");
              
                model.addRow(new Object[]{supid, sname,address,contact});

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
        new patientreport();
    }
}