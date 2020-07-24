
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class ParentDashboard extends javax.swing.JFrame {

    /**
     * Creates new form ParentDashboard
     */
    public ParentDashboard() {
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
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParent = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parent Dashboard");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("All relatives");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setText("Strudent:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setText("Parents:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 353, 138, -1));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Grade"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 585, 105));

        tblParent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Contact No.", "Password"
            }
        ));
        jScrollPane2.setViewportView(tblParent);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 229, 585, 106));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Used_chalk_board.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        try {
            new Login().setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Main pro = new Main();
            pro.createConnection();
            
            Statement Sstmt = (Statement) Main.con.createStatement();
            String Ssql = "SELECT `tblstudent`.`StudentID`, `tblstudent`.`Name`, `tblstudent`.`Surname`, `tblstudent`.`Grade`\n" +
                        "FROM `parent_student` LEFT JOIN `tblstudent` \n" +
                        "ON `parent_student`.`FK_studentID` = `tblstudent`.`StudentID`\n" +
                        "WHERE `parent_student`.`FK_parentID` = "+Login.ID+"";
            ResultSet Srs = Sstmt.executeQuery(Ssql);
            Srs.beforeFirst();
            DefaultTableModel Stm = (DefaultTableModel)tblStudent.getModel();
            Stm.setRowCount(0);

            while (Srs.next()) {
                String Sid = Integer.toString(Srs.getInt("StudentID"));
                String Sname = Srs.getString("Name");
                String Ssname = Srs.getString("Surname");
                String Sgrade = Integer.toString(Srs.getInt("Grade"));
                
                String[] Sdata = {Sid, Sname, Ssname, Sgrade};
                
                Stm.addRow(Sdata);
            }
            
            Statement Pstmt = (Statement) Main.con.createStatement();
            String Psql = "Select * FROM tblparent WHERE ParentID = "+Login.ID+"";
            ResultSet Prs = Pstmt.executeQuery(Psql);
            Prs.beforeFirst();
            DefaultTableModel Ptm = (DefaultTableModel)tblParent.getModel();
            Ptm.setRowCount(0);

            while (Prs.next()) {
                String Pid = Integer.toString(Prs.getInt("ParentID"));
                String Pname = Prs.getString("Name");
                String Psname = Prs.getString("Surname");
                String Pcont = Prs.getString("ContactNumber");
                String Ppswd = Prs.getString("Password");
                
                String[] Pdata = {Pid, Pname, Psname, Pcont, Ppswd};
                
                Ptm.addRow(Pdata);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDeleteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblParent;
    private javax.swing.JTable tblStudent;
    // End of variables declaration//GEN-END:variables
}