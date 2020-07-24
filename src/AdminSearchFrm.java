
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class AdminSearchFrm extends javax.swing.JFrame {

    /**
     * Creates new form SearchFrm
     */
    public AdminSearchFrm() {
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

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        edtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edtSname = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParent = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTeacher = new javax.swing.JTable();
        rbtnFoundation = new javax.swing.JRadioButton();
        rbtnIntermediate = new javax.swing.JRadioButton();
        rbtnSenior = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSubjects = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Search");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Date of Birth", "Gender", "Grade", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 576, 109));

        edtName.setColumns(10);
        getContentPane().add(edtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 56, -1, -1));

        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 59, -1, -1));

        jLabel2.setText("Surname:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 90, -1, -1));

        edtSname.setColumns(10);
        getContentPane().add(edtSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 87, -1, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 52, 93, 45));

        tblParent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Contact Number", "Address", "Children enrolled", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblParent);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 293, 576, 109));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 671, 106, 35));

        tblTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Grade", "Username", "Password"
            }
        ));
        jScrollPane3.setViewportView(tblTeacher);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 576, 107));

        rbtnFoundation.setText("Foundation phase");
        rbtnFoundation.setContentAreaFilled(false);
        rbtnFoundation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFoundationActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnFoundation, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 125, -1, -1));

        rbtnIntermediate.setText("Intermediate phase");
        rbtnIntermediate.setContentAreaFilled(false);
        rbtnIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnIntermediateActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnIntermediate, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 125, -1, -1));

        rbtnSenior.setText("Senior");
        rbtnSenior.setContentAreaFilled(false);
        rbtnSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSeniorActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnSenior, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 125, -1, -1));

        tblSubjects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Subject", "Phase", "Students enrolled", "Students rejected"
            }
        ));
        jScrollPane4.setViewportView(tblSubjects);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 545, 576, 108));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Used_chalk_board.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 610, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String fname = "";
        String fsname = "";
        
        if (!edtName.getText().equals("")){
            fname = edtName.getText();
        }
        
        if (!edtSname.getText().equals("")){
            fsname = edtSname.getText();
        }
        
        try {
            Main pro = new Main();
            pro.createConnection();
            
            Statement Sstmt = (Statement) Main.con.createStatement();
            String Ssql = "SELECT * FROM tblstudent WHERE (Name LIKE '%"+fname+"%' AND Surname LIKE '%"+fsname+"%')";
            ResultSet Srs = Sstmt.executeQuery(Ssql);

            Srs.beforeFirst();
            DefaultTableModel Stm = (DefaultTableModel)tblStudent.getModel();
            Stm.setRowCount(0);

            while (Srs.next()) {
                String id = Integer.toString(Srs.getInt("StudentID"));
                String name = Srs.getString("Name");
                String sname = Srs.getString("Surname");
                String dob = (Srs.getDate("DateOfBirth")).toString();
                String gender = Srs.getString("Gender");
                String grade = Integer.toString(Srs.getInt("Grade"));
                String pswd = Srs.getString("Password");
                
                String[] data = {id, name, sname, dob, gender, grade, pswd};
                
                Stm.addRow(data);
            }
            
            Statement Pstmt = (Statement) Main.con.createStatement();
            String Psql = "SELECT * FROM tblparent WHERE (Name LIKE '%"+fname+"%' AND Surname LIKE '%"+fsname+"%')";
            ResultSet Prs = Pstmt.executeQuery(Psql);

            Prs.beforeFirst();
            DefaultTableModel Ptm = (DefaultTableModel)tblParent.getModel();
            Ptm.setRowCount(0);

            while (Prs.next()) {
                String id = Integer.toString(Prs.getInt("ParentID"));
                String name = Prs.getString("Name");
                String sname = Prs.getString("Surname");
                String contact = Prs.getString("ContactNumber");
                String address = Prs.getString("Address");
                String enrolled = Integer.toString(Prs.getInt("NumberEnrolled"));
                String pswd = Prs.getString("Password");
                
                String[] data = {id, name, sname, contact, address, enrolled, pswd};
                
                Ptm.addRow(data);
            }
            
            Statement Tstmt = (Statement) Main.con.createStatement();
            String Tsql = "SELECT * FROM tblteacher WHERE (Name LIKE '%"+fname+"%' AND Surname LIKE '%"+fsname+"%')";
            ResultSet Trs = Tstmt.executeQuery(Tsql);

            Trs.beforeFirst();
            DefaultTableModel Ttm = (DefaultTableModel)tblTeacher.getModel();
            Ttm.setRowCount(0);

            while (Trs.next()) {
                String id = Integer.toString(Trs.getInt("TeacherID"));
                String name = Trs.getString("Name");
                String sname = Trs.getString("Surname");
                String grade = Integer.toString(Trs.getInt("Grade"));
                String uname = Trs.getString("Username");
                String pswd = Trs.getString("Password");
                
                String[] data = {id, name, sname, grade, uname, pswd};
                
                Ttm.addRow(data);
            }
            
            Statement SSstmt = (Statement) Main.con.createStatement();
            String SSsql = "SELECT * FROM subjectselection";
            ResultSet SSrs = SSstmt.executeQuery(SSsql);

            SSrs.beforeFirst();
            DefaultTableModel SStm = (DefaultTableModel)tblSubjects.getModel();
            SStm.setRowCount(0);

            while (SSrs.next()) {
                String id = Integer.toString(SSrs.getInt("subjectSelectionID"));
                String subject = SSrs.getString("Subject");
                String phase = SSrs.getString("Phase");
                String enrolled = Integer.toString(SSrs.getInt("Enrolled"));
                String rejected = Integer.toString(SSrs.getInt("Rejected")); 
                
                String[] data = {id, subject, phase, enrolled, rejected};
                
                SStm.addRow(data);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            new AdminDashboard().setVisible(true);  
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        
    }//GEN-LAST:event_btnBackActionPerformed

    private void rbtnFoundationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFoundationActionPerformed
        rbtnFoundation.setSelected(true);
        rbtnIntermediate.setSelected(false);
        rbtnSenior.setSelected(false);
        
        try {
            Main pro = new Main();
            pro.createConnection();
            
            Statement Sstmt = (Statement) Main.con.createStatement();
            String Ssql = "SELECT * FROM tblstudent WHERE (Grade > 0 AND Grade < 4)";
            ResultSet Srs = Sstmt.executeQuery(Ssql);

            Srs.beforeFirst();
            DefaultTableModel Stm = (DefaultTableModel)tblStudent.getModel();
            Stm.setRowCount(0);

            while (Srs.next()) {
                String id = Integer.toString(Srs.getInt("StudentID"));
                String name = Srs.getString("Name");
                String sname = Srs.getString("Surname");
                String dob = (Srs.getDate("DateOfBirth")).toString();
                String gender = Srs.getString("Gender");
                String grade = Integer.toString(Srs.getInt("Grade"));
                String pswd = Srs.getString("Password");
                
                String[] data = {id, name, sname, dob, gender, grade, pswd};
                
                Stm.addRow(data);
            }
            
            Statement Pstmt = (Statement) Main.con.createStatement();
            DefaultTableModel Ptm = (DefaultTableModel)tblParent.getModel();
            Ptm.setRowCount(0);
            
            Statement Tstmt = (Statement) Main.con.createStatement();
            String Tsql = "SELECT * FROM tblteacher WHERE (Grade > 0 AND Grade < 4)";
            ResultSet Trs = Tstmt.executeQuery(Tsql);

            Trs.beforeFirst();
            DefaultTableModel Ttm = (DefaultTableModel)tblTeacher.getModel();
            Ttm.setRowCount(0);

            while (Trs.next()) {
                String id = Integer.toString(Trs.getInt("TeacherID"));
                String name = Trs.getString("Name");
                String sname = Trs.getString("Surname");
                String grade = Integer.toString(Trs.getInt("Grade"));
                String uname = Trs.getString("Username");
                String pswd = Trs.getString("Password");
                
                String[] data = {id, name, sname, grade, uname, pswd};
                
                Ttm.addRow(data);
            }
            
            Statement SSstmt = (Statement) Main.con.createStatement();
            String SSsql = "SELECT * FROM subjectselection WHERE (Phase LIKE '6 - 9')";
            ResultSet SSrs = SSstmt.executeQuery(SSsql);

            SSrs.beforeFirst();
            DefaultTableModel SStm = (DefaultTableModel)tblSubjects.getModel();
            SStm.setRowCount(0);

            while (SSrs.next()) {
                String id = Integer.toString(SSrs.getInt("subjectSelectionID"));
                String subject = SSrs.getString("Subject");
                String phase = SSrs.getString("Phase");
                String enrolled = Integer.toString(SSrs.getInt("Enrolled"));
                String rejected = Integer.toString(SSrs.getInt("Rejected"));               
                String[] data = {id, subject, phase, enrolled, rejected};
                
                SStm.addRow(data);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnFoundationActionPerformed

    private void rbtnIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnIntermediateActionPerformed
        rbtnFoundation.setSelected(false);
        rbtnIntermediate.setSelected(true);
        rbtnSenior.setSelected(false);
        
        try {
            Main pro = new Main();
            pro.createConnection();
            
            Statement Sstmt = (Statement) Main.con.createStatement();
            String Ssql = "SELECT * FROM tblstudent WHERE (Grade > 3 AND Grade < 9)";
            ResultSet Srs = Sstmt.executeQuery(Ssql);

            Srs.beforeFirst();
            DefaultTableModel Stm = (DefaultTableModel)tblStudent.getModel();
            Stm.setRowCount(0);

            while (Srs.next()) {
                String id = Integer.toString(Srs.getInt("StudentID"));
                String name = Srs.getString("Name");
                String sname = Srs.getString("Surname");
                String dob = (Srs.getDate("DateOfBirth")).toString();
                String gender = Srs.getString("Gender");
                String grade = Integer.toString(Srs.getInt("Grade"));
                String pswd = Srs.getString("Password");
                
                String[] data = {id, name, sname, dob, gender, grade, pswd};
                
                Stm.addRow(data);
            }
            
            Statement Pstmt = (Statement) Main.con.createStatement();
            DefaultTableModel Ptm = (DefaultTableModel)tblParent.getModel();
            Ptm.setRowCount(0);
            
            Statement Tstmt = (Statement) Main.con.createStatement();
            String Tsql = "SELECT * FROM tblteacher WHERE (Grade > 3 AND Grade < 9)";
            ResultSet Trs = Tstmt.executeQuery(Tsql);

            Trs.beforeFirst();
            DefaultTableModel Ttm = (DefaultTableModel)tblTeacher.getModel();
            Ttm.setRowCount(0);

            while (Trs.next()) {
                String id = Integer.toString(Trs.getInt("TeacherID"));
                String name = Trs.getString("Name");
                String sname = Trs.getString("Surname");
                String grade = Integer.toString(Trs.getInt("Grade"));
                String uname = Trs.getString("Username");
                String pswd = Trs.getString("Password");
                
                String[] data = {id, name, sname, grade, uname, pswd};
                
                Ttm.addRow(data);
            }
            
            Statement SSstmt = (Statement) Main.con.createStatement();
            String SSsql = "SELECT * FROM subjectselection WHERE (Phase LIKE '10 - 14')";
            ResultSet SSrs = SSstmt.executeQuery(SSsql);

            SSrs.beforeFirst();
            DefaultTableModel SStm = (DefaultTableModel)tblSubjects.getModel();
            SStm.setRowCount(0);

            while (SSrs.next()) {
                String id = Integer.toString(SSrs.getInt("subjectSelectionID"));
                String subject = SSrs.getString("Subject");
                String phase = SSrs.getString("Phase");
                String enrolled = Integer.toString(SSrs.getInt("Enrolled"));
                String rejected = Integer.toString(SSrs.getInt("Rejected"));               
                String[] data = {id, subject, phase, enrolled, rejected};
                
                SStm.addRow(data);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnIntermediateActionPerformed

    private void rbtnSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSeniorActionPerformed
        rbtnFoundation.setSelected(false);
        rbtnIntermediate.setSelected(false);
        rbtnSenior.setSelected(true);
        
        try {
            Main pro = new Main();
            pro.createConnection();
            
            Statement Sstmt = (Statement) Main.con.createStatement();
            String Ssql = "SELECT * FROM tblstudent WHERE (Grade > 8)";
            ResultSet Srs = Sstmt.executeQuery(Ssql);

            Srs.beforeFirst();
            DefaultTableModel Stm = (DefaultTableModel)tblStudent.getModel();
            Stm.setRowCount(0);

            while (Srs.next()) {
                String id = Integer.toString(Srs.getInt("StudentID"));
                String name = Srs.getString("Name");
                String sname = Srs.getString("Surname");
                String dob = (Srs.getDate("DateOfBirth")).toString();
                String gender = Srs.getString("Gender");
                String grade = Integer.toString(Srs.getInt("Grade"));
                String pswd = Srs.getString("Password");
                
                String[] data = {id, name, sname, dob, gender, grade, pswd};
                
                Stm.addRow(data);
            }
            
            Statement Pstmt = (Statement) Main.con.createStatement();
            DefaultTableModel Ptm = (DefaultTableModel)tblParent.getModel();
            Ptm.setRowCount(0);
            
            Statement Tstmt = (Statement) Main.con.createStatement();
            String Tsql = "SELECT * FROM tblteacher WHERE (Grade > 8)";
            ResultSet Trs = Tstmt.executeQuery(Tsql);

            Trs.beforeFirst();
            DefaultTableModel Ttm = (DefaultTableModel)tblTeacher.getModel();
            Ttm.setRowCount(0);

            while (Trs.next()) {
                String id = Integer.toString(Trs.getInt("TeacherID"));
                String name = Trs.getString("Name");
                String sname = Trs.getString("Surname");
                String grade = Integer.toString(Trs.getInt("Grade"));
                String uname = Trs.getString("Username");
                String pswd = Trs.getString("Password");
                
                String[] data = {id, name, sname, grade, uname, pswd};
                
                Ttm.addRow(data);
            }
            
            Statement SSstmt = (Statement) Main.con.createStatement();
            String SSsql = "SELECT * FROM subjectselection WHERE (Phase LIKE '15 - 17')";
            ResultSet SSrs = SSstmt.executeQuery(SSsql);

            SSrs.beforeFirst();
            DefaultTableModel SStm = (DefaultTableModel)tblSubjects.getModel();
            SStm.setRowCount(0);

            while (SSrs.next()) {
                String id = Integer.toString(SSrs.getInt("subjectSelectionID"));
                String subject = SSrs.getString("Subject");
                String phase = SSrs.getString("Phase");
                String enrolled = Integer.toString(SSrs.getInt("Enrolled"));
                String rejected = Integer.toString(SSrs.getInt("Rejected"));               
                String[] data = {id, subject, phase, enrolled, rejected};
                
                SStm.addRow(data);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnSeniorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField edtName;
    private javax.swing.JTextField edtSname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rbtnFoundation;
    private javax.swing.JRadioButton rbtnIntermediate;
    private javax.swing.JRadioButton rbtnSenior;
    private javax.swing.JTable tblParent;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTable tblSubjects;
    private javax.swing.JTable tblTeacher;
    // End of variables declaration//GEN-END:variables
}
