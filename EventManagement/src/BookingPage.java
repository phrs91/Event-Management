
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sonu
 */
public class BookingPage extends javax.swing.JFrame {

    /**
     * Creates new form BookingPage
     */
    public BookingPage() {
        super("Booking Page");
        initComponents();
        
        
        
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
        jLabel2 = new javax.swing.JLabel();
        DayField = new javax.swing.JTextField();
        MonthField = new javax.swing.JTextField();
        YearField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RoomField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BookButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        EventName = new javax.swing.JTextField();
        CancelEvent = new javax.swing.JButton();
        MyBookings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 0, 14)); // NOI18N
        jLabel1.setText("Welcome To Booking Page ");

        jLabel2.setText("Enter Details");

        jLabel3.setText("Day");

        jLabel4.setText("Month");

        jLabel5.setText("Year");

        jLabel7.setText("Room Number");

        BookButton.setText("Book For My Event");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        BackButton.setText("<-");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Event Name");

        CancelEvent.setText("Cancel My Event");
        CancelEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelEventActionPerformed(evt);
            }
        });

        MyBookings.setText("My Bookings");
        MyBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyBookingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BackButton)
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(MyBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EventName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RoomField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(DayField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MonthField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(YearField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(99, 99, 99)))
                        .addGap(51, 51, 51))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(BookButton)
                        .addGap(64, 64, 64)
                        .addComponent(CancelEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MyBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(YearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(EventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(RoomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        try{
            int day=Integer.parseInt(DayField.getText());
        int month=Integer.parseInt(MonthField.getText());
        int year=Integer.parseInt(YearField.getText());
        int roomno=Integer.parseInt(RoomField.getText());
     //   String uname =UField.getText();
     String uname=Home.LogedUserName;
        String ename=EventName.getText();
         if(month<0||month>12||day<1||day>31||year<2016||(month==2&&day>=30))
            JOptionPane.showMessageDialog(null,"Invalid Date");
         else{
         Class.forName("com.mysql.jdbc.Driver");
         String conarg="jdbc:mysql://";
        conarg+=Home.Saddress;
        conarg+=":3306/sonupmandal";
 //Connection con=DriverManager.getConnection("jdbc:mysql://localhost":3306/sonupmandal",Home.UserName,"");  
                Connection con=DriverManager.getConnection(conarg,Home.UserName,Home.Password);
       // Connection con=DriverManager.getConnection("jdbc:mysql://Home.Sadress:3306/sonupmandal",Home.UserName,"");
        Statement stmt=con.createStatement();
        String query="";
        query="Select room from roomdetail";
        ResultSet rs1=stmt.executeQuery(query);
        boolean blag=false;
        while(rs1.next())
        {
           if(rs1.getInt(1)==roomno)
           {
               blag=true;
               break;
           }
        }
        if(blag)
        {
            query="SELECT room,username from bookings where Day='"+day+"' AND Month='"+month+"' AND Year='"+year+"'";
        ResultSet rs=stmt.executeQuery(query);
        boolean flag=false;
        String helduser="";
        while(rs.next())
        {
            System.out.println(rs.getString(1));
            if(Integer.parseInt(rs.getString(1))==roomno)
            {
                flag=true;
                helduser=rs.getString(2);
            }
        }
        if(!flag)
        {
           query="select status from users where username='"+uname+"'";
         rs=stmt.executeQuery(query);
         boolean blockeduser=false;
         while(rs.next())
         {
             if(rs.getInt(1)==1)
             {
                 blockeduser=true;
                 break;
             }
         }
         if(!blockeduser)
         {
             query="INSERT INTO bookings VALUES ( '"+roomno+"','"+day+"','"+month+"','"+year+"','"+uname+"','"+ename+"') ";
            int temp=stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Succesfully Booked Your Room");
         }
         else
             JOptionPane.showMessageDialog(null,"Sorry\nYou Are Blocked");
        }
        else
            JOptionPane.showMessageDialog(null,"Can't Book this room at this date\n This room is currently Booked by "+helduser+
                    "\n You Can Contact this user in case they want to sell their Bookings");
        }
        else
           JOptionPane.showMessageDialog(null,"This Room is not yet Available by the admin to book "); 
         }
        
        }catch(Exception e){System.out.println(e);}
        
        
    }//GEN-LAST:event_BookButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        UserHome uh=new UserHome();
        this.dispose();
        uh.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CancelEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelEventActionPerformed
        // TODO add your handling code here:
        try{
            int day=Integer.parseInt(DayField.getText());
        int month=Integer.parseInt(MonthField.getText());
        int year=Integer.parseInt(YearField.getText());
        int roomno=Integer.parseInt(RoomField.getText());
     String uname=Home.LogedUserName;
         if(month<0||month>12||day<1||day>31||year<2016||(month==2&&day>=30))
            JOptionPane.showMessageDialog(null,"Invalid Date");
         else{
         Class.forName("com.mysql.jdbc.Driver");
         String conarg="jdbc:mysql://";
        conarg+=Home.Saddress;
        conarg+=":3306/sonupmandal";
                Connection con=DriverManager.getConnection(conarg,Home.UserName,Home.Password);
        Statement stmt=con.createStatement();
        String query="";
        query="Select room from roomdetail";
        ResultSet rs1=stmt.executeQuery(query);
        boolean blag=false;
        while(rs1.next())
        {
           if(rs1.getInt(1)==roomno)
           {
               blag=true;
               break;
           }
        }
        if(blag)
        {
            query="SELECT room,username from bookings where Day='"+day+"' AND Month='"+month+"' AND Year='"+year+"'";
        ResultSet rs=stmt.executeQuery(query);
        boolean flag=false;
        String helduser="";
        while(rs.next())
        {
            System.out.println(rs.getString(1));
            if(Integer.parseInt(rs.getString(1))==roomno)
            {
                flag=true;
                helduser=rs.getString(2);
                
            }
        }
        if(flag)
        {
           System.out.println("helduser is "+helduser+"\nuname is "+uname);
            if(helduser.compareTo(uname)==0)
            {
                query="DELETE FROM bookings where Day='"+day+"' AND Month='"+month+"' AND Year='"+year+"' AND room='"+roomno+"'";
                int ddd=stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"You have Successfully Canceled your Room");
            }
            else
                JOptionPane.showMessageDialog(null,"You can't Cancel this room ");
            //My code ends
        }
        else
            JOptionPane.showMessageDialog(null,"This Room is not yet Booked at this date\nSo you cant Cancel");
        }
        else
           JOptionPane.showMessageDialog(null,"Invalid Room "); 
         }
        
        }catch(Exception e){System.out.println(e);}
        
        
    }//GEN-LAST:event_CancelEventActionPerformed

    private void MyBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyBookingsActionPerformed
        // TODO add your handling code here:
        String uname=Home.LogedUserName;
        try{
        Class.forName("com.mysql.jdbc.Driver");
         String conarg="jdbc:mysql://";
        conarg+=Home.Saddress;
        conarg+=":3306/sonupmandal";
        Connection con=DriverManager.getConnection(conarg,Home.UserName,Home.Password);
        String query="Select * from bookings where username='"+uname+"'";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        String outp="Room       Date         Username    Event\n";
        boolean flag=false;
        while(rs.next())
        {
            flag=true;
            outp+=rs.getString(1)+"       "+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4)+"   "+rs.getString(5)+"   "+rs.getString(6)+"\n";
        }
        if(flag)
        JOptionPane.showMessageDialog(null,outp);
        else
           JOptionPane.showMessageDialog(null,"You haven't Booked Any Event Yet");
        }catch(Exception e){System.out.println(e);}
        
    }//GEN-LAST:event_MyBookingsActionPerformed

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
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BookButton;
    private javax.swing.JButton CancelEvent;
    private javax.swing.JTextField DayField;
    private javax.swing.JTextField EventName;
    private javax.swing.JTextField MonthField;
    private javax.swing.JButton MyBookings;
    private javax.swing.JTextField RoomField;
    private javax.swing.JTextField YearField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
