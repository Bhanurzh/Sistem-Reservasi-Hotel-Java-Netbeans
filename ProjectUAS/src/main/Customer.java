/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aswan
 */
public class Customer extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st = null;
    DefaultTableModel dtm;
    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        ShowCustomers();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        ButtonEdit = new javax.swing.JButton();
        ButtonTambah = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        tfNohp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfAlamat = new javax.swing.JTextArea();
        dcTglLahir = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cbJeniskelamin = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(24, 118, 235));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/customer.png"))); // NOI18N
        jLabel1.setText("Manage Customer");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/back-button.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(24, 118, 235));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(24, 118, 235));
        jLabel2.setText("Nama Pelanggan");

        tfNama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tfNama.setForeground(new java.awt.Color(24, 118, 235));
        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(24, 118, 235));
        jLabel3.setText("No Hp");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 118, 235));
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(24, 118, 235));
        jLabel5.setText("Tanggal Lahir");

        CustomerTable.setBackground(new java.awt.Color(24, 118, 235));
        CustomerTable.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        CustomerTable.setForeground(new java.awt.Color(255, 255, 255));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "No HP", "Jenis Kelamin", "Alamat", "Tanggal Lahir"
            }
        ));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        ButtonEdit.setBackground(new java.awt.Color(24, 118, 235));
        ButtonEdit.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        ButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEdit.setText("Edit");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        ButtonTambah.setBackground(new java.awt.Color(24, 118, 235));
        ButtonTambah.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        ButtonTambah.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTambah.setText("Tambah");
        ButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTambahActionPerformed(evt);
            }
        });

        ButtonHapus.setBackground(new java.awt.Color(255, 0, 0));
        ButtonHapus.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        ButtonHapus.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHapus.setText("Hapus");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        tfNohp.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        tfNohp.setForeground(new java.awt.Color(24, 118, 235));
        tfNohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNohpActionPerformed(evt);
            }
        });

        tfAlamat.setColumns(20);
        tfAlamat.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        tfAlamat.setForeground(new java.awt.Color(24, 118, 235));
        tfAlamat.setRows(5);
        jScrollPane2.setViewportView(tfAlamat);

        dcTglLahir.setForeground(new java.awt.Color(24, 118, 235));
        dcTglLahir.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(24, 118, 235));
        jLabel7.setText("Alamat");

        cbJeniskelamin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cbJeniskelamin.setForeground(new java.awt.Color(24, 118, 235));
        cbJeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(24, 118, 235));
        jLabel8.setText("Search");

        tfSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfSearchCaretUpdate(evt);
            }
        });
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(24, 118, 235));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jButton1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dcTglLahir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(ButtonTambah)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtonEdit)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNohp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbJeniskelamin, javax.swing.GroupLayout.Alignment.LEADING, 0, 172, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(ButtonHapus)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(tfNohp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(cbJeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(dcTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonTambah)
                            .addComponent(ButtonEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonHapus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void ShowCustomers(){
        int column;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotels", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM customer");
            
            ResultSetMetaData rsd = rs.getMetaData();
            column = rsd.getColumnCount();
            
            dtm = (DefaultTableModel)CustomerTable.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                
                for(int i=1; i<=column; i++){
                    v2.add(rs.getString("id_pelanggan"));
                    v2.add(rs.getString("nama_pelanggan"));
                    v2.add(rs.getString("no_hp"));
                    v2.add(rs.getString("jenis_kelamin"));
                    v2.add(rs.getString("alamat"));
                    v2.add(rs.getString("tgl_lahir"));
                }
                dtm.addRow(v2);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void Search(){
        int column;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotels", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM customer WHERE nama_pelanggan like '"+tfSearch.getText()+"%'");
            
            ResultSetMetaData rsd = rs.getMetaData();
            column = rsd.getColumnCount();
            
            dtm = (DefaultTableModel)CustomerTable.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                
                for(int i=1; i<=column; i++){
                    v2.add(rs.getString("id_pelanggan"));
                    v2.add(rs.getString("nama_pelanggan"));
                    v2.add(rs.getString("no_hp"));
                    v2.add(rs.getString("jenis_kelamin"));
                    v2.add(rs.getString("alamat"));
                    v2.add(rs.getString("tgl_lahir"));
                }
                dtm.addRow(v2);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int cid;
    private void CountCustomers(){
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT Max(id_pelanggan) FROM customer");
            rs.next();
            cid = rs.getInt(1)+1;
            
        } catch (SQLException ex) {
            Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // TODO add your handling code here:
        if(tfNama.getText().isEmpty() || tfNohp.getText().isEmpty() || cbJeniskelamin.getSelectedIndex() == -1 || tfAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!");
        }else{
            try {
                String TheTglLahir = dcTglLahir.getDate().toString().substring(1, 14);
                CountCustomers();
                con = DriverManager.getConnection("jdbc:mysql://localhost/hotels", "root", "");
                PreparedStatement pres = con.prepareStatement("UPDATE customer set nama_pelanggan=?, no_hp=?, jenis_kelamin=?, alamat=?, tgl_lahir=? where id_pelanggan=?");
                
                pres.setInt(6, key);
                pres.setString(1, tfNama.getText().toString());
                pres.setString(2, tfNohp.getText().toString());
                pres.setString(3, cbJeniskelamin.getSelectedItem().toString());
                pres.setString(4, tfAlamat.getText().toString());
                pres.setString(5, TheTglLahir);
                
                int row = pres.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Pelanggan telah Diperbarui!");
                con.close();
                ShowCustomers();
                
            } catch (SQLException ex) {
                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void ButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTambahActionPerformed
        // TODO add your handling code here:
        if(tfNama.getText().isEmpty() || tfNohp.getText().isEmpty() || cbJeniskelamin.getSelectedIndex() == -1 || tfAlamat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!");
        }else{
            try {
                String TheTglLahir = dcTglLahir.getDate().toString().substring(1, 14);
                CountCustomers();
                con = DriverManager.getConnection("jdbc:mysql://localhost/hotels", "root", "");
                PreparedStatement pres = con.prepareStatement("INSERT INTO customer values(?,?,?,?,?,?)");
                
                pres.setInt(1, cid);
                pres.setString(2, tfNama.getText().toString());
                pres.setString(3, tfNohp.getText().toString());
                pres.setString(4, cbJeniskelamin.getSelectedItem().toString());
                pres.setString(5, tfAlamat.getText().toString());
                pres.setString(6, TheTglLahir);
                
                int row = pres.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Pelanggan telah Ditambahkan!");
                con.close();
                ShowCustomers();
                
            } catch (SQLException ex) {
                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonTambahActionPerformed

    private void tfNohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNohpActionPerformed

    int key = 0;
    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
        // TODO add your handling code here:
        if(key == 0){
            JOptionPane.showMessageDialog(this, "Pilih Pelanggan!");
        }else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/hotels", "root", "");
                PreparedStatement pres = con.prepareStatement("DELETE FROM customer where id_pelanggan = ?");
                pres.setInt(1, key);               
                int row = pres.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Pelanggan telah Dihapus!");
                con.close();
                ShowCustomers();
                
            } catch (SQLException ex) {
                Logger.getLogger(Room.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
        int MyIndex = CustomerTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        tfNama.setText(model.getValueAt(MyIndex, 1).toString());
        tfNohp.setText(model.getValueAt(MyIndex, 2).toString());
        cbJeniskelamin.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        tfAlamat.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_tfSearchActionPerformed

    private void jButton1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton1CaretPositionChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1CaretPositionChanged

    private void tfSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfSearchCaretUpdate
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_tfSearchCaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ShowCustomers();
        tfSearch.setText("");
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton ButtonTambah;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JComboBox<String> cbJeniskelamin;
    private com.toedter.calendar.JDateChooser dcTglLahir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNohp;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}