/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class BorrowBooks extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rst=null;
    PreparedStatement books=null;
    PreparedStatement brr=null;
    PreparedStatement brr2=null;
    public BorrowBooks() {
        initComponents();
        showData1();
    }
    
    void fine()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
    }
    
    void showData1()
    {
        try
        {
            String sql = "SELECT * FROM tbl_books WHERE bookAvailability='Available'";
            conn = ConnDB.getConnection();
            books = conn.prepareStatement(sql);
            rst = books.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rst));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        txtStudNum = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnConfirm1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Student Number:");

        jLabel2.setText("Name:");

        btnConfirm.setBackground(new java.awt.Color(51, 255, 51));
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        txtName.setToolTipText("");

        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "bookID", "accessionNumber", "bookName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable2PropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnConfirm1.setBackground(new java.awt.Color(255, 102, 102));
        btnConfirm1.setText("CANCEL");
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStudNum, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnConfirm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(120, 120, 120)
                                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStudNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(219, 219, 219))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar c = Calendar.getInstance();
        String oldDate = sdf.format(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 3);   
        String newDate = sdf.format(c.getTime());  
        
        int rows = jTable2.getRowCount();
        
        String studnum = txtStudNum.getText();
        String name = txtName.getText();
        
        if(rows > 2 || rows == 0)
        {
            JOptionPane.showMessageDialog(null,"Maximum of 2 books and minimum of 1 to borrow.");
        }
        else if(studnum.equals("") && name.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Student number or Name are empty.");
        }
        else if(rows == 1)
        {
            try {
            String acc1 = jTable2.getModel().getValueAt(0, 1).toString();
            String sql = "insert into tbl_transactions (StudentNumber, StudentName, DateBorrowed, DateReturn, Fine, Status) values(?,?,?,?,0,'Pending')";
            String sql2 = "UPDATE tbl_books SET bookAvailability='Borrowed' WHERE accessionNum=?";
            String sql3 = "insert into tbl_borrowed (StudentNumber, book1) values(?,?)";
            conn = ConnDB.getConnection();
            books = conn.prepareStatement(sql);
            brr = conn.prepareStatement(sql2);
            brr2 = conn.prepareStatement(sql3);
            
            books.setString(1, txtStudNum.getText());
            books.setString(2, txtName.getText());
            books.setString(3, oldDate);
            books.setString(4, newDate);
            
            brr.setString(1, acc1);
            
            brr2.setString(1, txtStudNum.getText());
            brr2.setString(2, acc1);
            
            books.execute();
            brr.execute();
            brr2.execute();
            showData1();

            JOptionPane.showMessageDialog(null, "Success!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if(rows == 2)
        {
            try {
            String acc1 = jTable2.getModel().getValueAt(0, 1).toString();
            String acc2 = jTable2.getModel().getValueAt(1, 1).toString();
            String sql = "insert into tbl_transactions (StudentNumber, StudentName, DateBorrowed, DateReturn, Fine, Status) values(?,?,?,?,0,'Pending')";
            String sql2 = "UPDATE tbl_books SET bookAvailability='Borrowed' WHERE accessionNum=? AND accessionNum=?";
            String sql3 = "insert into tbl_borrowed (StudentNumber, book1, book2) values(?,?,?)";
            conn = ConnDB.getConnection();
            books = conn.prepareStatement(sql);
            brr = conn.prepareStatement(sql2);
            brr2 = conn.prepareStatement(sql3);
            
            books.setString(1, txtStudNum.getText());
            books.setString(2, txtName.getText());
            books.setString(3, oldDate);
            books.setString(4, newDate);
            
            brr.setString(1, acc1);
            brr.setString(2, acc2);

            brr2.setString(1, txtStudNum.getText());
            brr2.setString(2, acc1);
            brr2.setString(3, acc2);
            
            books.execute();
            brr.execute();
            brr2.execute();
            showData1();
            JOptionPane.showMessageDialog(null, "Success!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
            txtStudNum.setText("");
            txtName.setText("");
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index [] = jTable1.getSelectedRows();
        TableModel model = jTable1.getModel();
        DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
        
        Object [] row = new Object[3];
        
        for(int i = 0; i < index.length; i++)
        {
            row[0] = jTable1.getValueAt(index[i], 0);
            row[1] = jTable1.getValueAt(index[i], 1);
            row[2] = jTable1.getValueAt(index[i], 2);
            
            model2.addRow(row);
        }
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int[] rows = jTable2.getSelectedRows();
        for(int i=0;i<rows.length;i++)
        {
        model.removeRow(rows[i]-i);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2PropertyChange

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        this.dispose();
        new MenuForm().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirm1ActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudNum;
    // End of variables declaration//GEN-END:variables
}
