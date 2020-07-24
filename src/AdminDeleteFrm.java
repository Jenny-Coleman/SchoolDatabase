
import java.sql.PreparedStatement;
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
public class AdminDeleteFrm extends javax.swing.JFrame {

    /**
     * Creates new form DeleteFrm
     */
    public AdminDeleteFrm() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParent = new javax.swing.JTable();
        btnReload = new javax.swing.JButton();
        btnSDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnPDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTeacher = new javax.swing.JTable();
        btnTDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        edtName = new java.awt.TextField();
        edtSname = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Delete");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel3.setText("Surname:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Date of Birth", "Gender", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 660, 106));

        tblParent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Contact Number", "Address", "Children Enrolled"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblParent);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 263, 660, 106));

        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        getContentPane().add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 107, -1));

        btnSDelete.setText("Delete Selected Student");
        btnSDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 174, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 107, -1));

        btnPDelete.setText("Delete Selected Parent");
        btnPDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 174, -1));

        tblTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Grade"
            }
        ));
        jScrollPane3.setViewportView(tblTeacher);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, 660, 104));

        btnTDelete.setText("Delete Selected Teacher");
        btnTDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnTDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 174, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 107, -1));

        edtName.setColumns(10);
        getContentPane().add(edtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 100, -1));

        edtSname.setColumns(10);
        getContentPane().add(edtSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Used_chalk_board.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Main pro = new Main();
            pro.createConnection();
            
            Statement Sstmt = (Statement) Main.con.createStatement();
            String Ssql = "SELECT * FROM tblstudent";
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
                
                String[] data = {id, name, sname, dob, gender, grade};
                
                Stm.addRow(data);
            }
            
            Statement Pstmt = (Statement) Main.con.createStatement();
            String Psql = "SELECT * FROM tblparent";
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
                
                String[] data = {id, name, sname, contact, address, enrolled};
                
                Ptm.addRow(data);
            }
            
            Statement Tstmt = (Statement) Main.con.createStatement();
            String Tsql = "SELECT * FROM tblteacher";
            ResultSet Trs = Tstmt.executeQuery(Tsql);

            Trs.beforeFirst();
            DefaultTableModel Ttm = (DefaultTableModel)tblTeacher.getModel();
            Ttm.setRowCount(0);

            while (Trs.next()) {
                String id = Integer.toString(Trs.getInt("TeacherID"));
                String name = Trs.getString("Name");
                String sname = Trs.getString("Surname");
                String grade = Integer.toString(Trs.getInt("Grade"));
                
                String[] data = {id, name, sname, grade};
                
                Ttm.addRow(data);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDeleteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        try {
            Main pro = new Main();
            pro.createConnection();
            
            Statement Sstmt = (Statement) Main.con.createStatement();
            String Ssql = "SELECT * FROM tblstudent";
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
                
                String[] data = {id, name, sname, dob, gender, grade};
                
                Stm.addRow(data);
            }
            
            Statement Pstmt = (Statement) Main.con.createStatement();
            String Psql = "SELECT * FROM tblparent";
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
                
                String[] data = {id, name, sname, contact, address, enrolled};
                
                Ptm.addRow(data);
            }
            
            Statement Tstmt = (Statement) Main.con.createStatement();
            String Tsql = "SELECT * FROM tblstudent";
            ResultSet Trs = Sstmt.executeQuery(Tsql);

            Trs.beforeFirst();
            DefaultTableModel Ttm = (DefaultTableModel)tblTeacher.getModel();
            Stm.setRowCount(0);

            while (Srs.next()) {
                String id = Integer.toString(Srs.getInt("TeacherID"));
                String name = Srs.getString("Name");
                String sname = Srs.getString("Surname");
                String grade = Integer.toString(Srs.getInt("Grade"));
                
                String[] data = {id, name, sname, grade};
                
                Ttm.addRow(data);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDeleteFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnSDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDeleteActionPerformed
        try {                
            int row = tblStudent.getSelectedRow();
            DefaultTableModel model= (DefaultTableModel)tblStudent.getModel();            
            int id = Integer.parseInt(model.getValueAt(row, 0).toString());
            
            int input = JOptionPane.showConfirmDialog(null,
                "You are about to delete the selected student", "Warning",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            if (input == 0){
                Main pro = new Main();
                pro.createConnection();
                
                String sql = "DELETE FROM tblstudent WHERE StudentID = ?";
                PreparedStatement pstmt = Main.con.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Student deleted");
                
                Main.con.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Student " + e);
        }
    }//GEN-LAST:event_btnSDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            new AdminDashboard().setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDeleteActionPerformed
        try {
            int row = tblParent.getSelectedRow();
            DefaultTableModel model= (DefaultTableModel)tblParent.getModel();            
            String id = (model.getValueAt(row, 0).toString());
            
            int input = JOptionPane.showConfirmDialog(null,
                "You are about to delete the selected parent", "Warning",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            if (input == 0){
                Main pro = new Main();
                pro.createConnection();
                
                
                String sql = "DELETE FROM tblparent WHERE ParentID = ?";
                PreparedStatement pstmt = Main.con.prepareStatement(sql);
                pstmt.setString(1, id);
                pstmt.executeUpdate();
                pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Parent deleted");
                
                Main.con.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Parent " + e);
        }
    }//GEN-LAST:event_btnPDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String fname = edtName.getText();
        String fsname = edtSname.getText();
        
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
                
                String[] data = {id, name, sname, dob, gender, grade};
                
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
                
                String[] data = {id, name, sname, contact, address, enrolled};
                
                Ptm.addRow(data);
            }
            
            Statement Tstmt = (Statement) Main.con.createStatement();
            String Tsql = "SELECT * FROM tblstudent WHERE (Name LIKE '%"+fname+"%' AND Surname LIKE '%"+fsname+"%')";
            ResultSet Trs = Sstmt.executeQuery(Tsql);

            Trs.beforeFirst();
            DefaultTableModel Ttm = (DefaultTableModel)tblTeacher.getModel();
            Stm.setRowCount(0);

            while (Trs.next()) {
                String id = Integer.toString(Trs.getInt("TeacherID"));
                String name = Trs.getString("Name");
                String sname = Trs.getString("Surname");
                String grade = Integer.toString(Trs.getInt("Grade"));
                
                String[] data = {id, name, sname, grade};
                
                Ttm.addRow(data);
            }
            
            Main.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnTDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTDeleteActionPerformed
        try {                
            int row = tblTeacher.getSelectedRow();
            DefaultTableModel model= (DefaultTableModel)tblTeacher.getModel();            
            int id = Integer.parseInt(model.getValueAt(row, 0).toString());
            
            int input = JOptionPane.showConfirmDialog(null,
                "You are about to delete the selected Teacher", "Warning",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            if (input == 0){
                Main pro = new Main();
                pro.createConnection();
                
                String sql = "DELETE FROM tblteacher WHERE TeacherID = ?";
                PreparedStatement pstmt = Main.con.prepareStatement(sql);
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Teacher deleted");
                
                Main.con.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Teacher " + e);
        }
    }//GEN-LAST:event_btnTDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPDelete;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTDelete;
    private java.awt.TextField edtName;
    private java.awt.TextField edtSname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblParent;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTable tblTeacher;
    // End of variables declaration//GEN-END:variables
}
