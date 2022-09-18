
package tiketpesawat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class halamanAdmin extends javax.swing.JFrame {
    
    public Connection conn = koneksi.Koneksi();
    public Statement st;

    public String id, dari1, tujuan1, waktu1, harga1;
    
    public String getId(){
        return id;
    }
    
    public String getDari(){
        return dari1;
    }
    
    public String getTujuan(){
        return tujuan1;
    }
    
    public String getWaktu(){
        return waktu1;
    }
    
    public String getHarga(){
        return harga1;
    }
    
    public halamanAdmin() {
        initComponents();
        
    }
    
    public void filterAngka(KeyEvent w){
        if (Character.isAlphabetic(w.getKeyChar())) {
            w.consume();
            JOptionPane.showMessageDialog(null, "Masukan Angka", "peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDari = new javax.swing.JTextField();
        txtWaktu = new javax.swing.JTextField();
        txtTujuan = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        btnDftrTiket = new javax.swing.JButton();
        btnTambahTiket = new javax.swing.JButton();
        btnHpsTiket = new javax.swing.JButton();
        btnEditTiket = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDftrUser = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Halaman Admin");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Olah Tiket");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Harga");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Dari");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Waktu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Tujuan");

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtWaktu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWaktuKeyTyped(evt);
            }
        });

        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });

        btnDftrTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/tiket.png"))); // NOI18N
        btnDftrTiket.setText("Data Tiket");
        btnDftrTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDftrTiketActionPerformed(evt);
            }
        });

        btnTambahTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/tambah.png"))); // NOI18N
        btnTambahTiket.setText("Tambah Tiket");
        btnTambahTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahTiketActionPerformed(evt);
            }
        });

        btnHpsTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/hapus.png"))); // NOI18N
        btnHpsTiket.setText("Hapus Tiket");
        btnHpsTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHpsTiketActionPerformed(evt);
            }
        });

        btnEditTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/edit.png"))); // NOI18N
        btnEditTiket.setText("Edit Tiket");
        btnEditTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTiketActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDftrUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/Profile.png"))); // NOI18N
        btnDftrUser.setText("Data User");
        btnDftrUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDftrUserActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/icon Exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDftrTiket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHpsTiket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDftrUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTambahTiket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWaktu, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDftrTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHpsTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDftrUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDftrTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDftrTiketActionPerformed
        // TODO add your handling code here:
//        boolean closeble = true;
        
        dataTiket FDB = new dataTiket();
        FDB.FAB = this;
        FDB.setVisible(true);
        FDB.setResizable(false);
        
        
        
    }//GEN-LAST:event_btnDftrTiketActionPerformed

    private void btnTambahTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahTiketActionPerformed
        // TODO add your handling code here:
        try {
            if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "mohon maaf Id kolom tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtDari.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Dari tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtTujuan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Tujuan tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtWaktu.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Waktu tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtHarga.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Harga tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else{
                String sql = "INSERT INTO pesawat VALUES ('"+txtId.getText()+"','"+txtDari.getText()+"','"+txtTujuan.getText()+"','"+txtWaktu.getText()+"','"+txtHarga.getText()+"')";
                st = conn.createStatement();
                int rs = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Penyimpanan Tiket Berhasil");
                reset();
                dataTiket FDB = new dataTiket();
                FDB.FAB = this;
                FDB.setVisible(true);
                FDB.setResizable(false);
            }
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
        }
   
    }//GEN-LAST:event_btnTambahTiketActionPerformed

    private void btnHpsTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHpsTiketActionPerformed
        // TODO add your handling code here:
        try {
            if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "mohon maaf Id kolom tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtDari.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Dari tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtTujuan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Tujuan tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtWaktu.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Waktu tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtHarga.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Harga tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                String sql = "delete from pesawat where id_pesawat = '"+txtId.getText()+"'";
                st = conn.createStatement();
                int rs = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Tiket Berhasil Dihapus");
                
                reset();
        
                dataTiket FDB = new dataTiket();
                FDB.FAB = this;
                FDB.setVisible(true);
                FDB.setResizable(false);
            }
            
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHpsTiketActionPerformed

    private void btnEditTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTiketActionPerformed
        // TODO add your handling code here:
        try {
            if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "mohon maaf kolom Id tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtDari.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Dari tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtTujuan.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Tujuan tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtWaktu.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Waktu tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtHarga.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Harga tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                String sql = "UPDATE pesawat SET id_pesawat = '"+txtId.getText()+"', dari = '"+txtDari.getText()+"', tujuan = '"+txtTujuan.getText()+"', waktu = '"+txtWaktu.getText()+"', harga = '"+txtHarga.getText()+"' WHERE id_pesawat = '"+txtId.getText()+"'";
                st = conn.createStatement();
                int rs = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Tiket berhasil di Edit");
                reset();
                dataTiket FDB = new dataTiket();
                FDB.FAB = this;
                FDB.setVisible(true);
                FDB.setResizable(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEditTiketActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDftrUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDftrUserActionPerformed
        // TODO add your handling code here:
        dataUser du = new dataUser();
        du.FAB = this;
        du.setVisible(true);
        du.setResizable(false);
    }//GEN-LAST:event_btnDftrUserActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtWaktuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWaktuKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
    }//GEN-LAST:event_txtWaktuKeyTyped

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
    }//GEN-LAST:event_txtHargaKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
    }//GEN-LAST:event_txtIdKeyTyped

    public void reset(){
        dataTiket FDB = new dataTiket();
        FDB.FAB = this;
        txtId.setText(null);
        txtDari.setText(null);
        txtTujuan.setText(null);
        txtWaktu.setText(null);
        txtHarga.setText(null);
    }
    
    public void itemTerpilih(){
        dataTiket FDB = new dataTiket();
        FDB.FAB = this;
        txtId.setText(id);
        txtDari.setText(dari1);
        txtTujuan.setText(tujuan1);
        txtWaktu.setText(waktu1);
        txtHarga.setText(harga1);
    }
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
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDftrTiket;
    private javax.swing.JButton btnDftrUser;
    private javax.swing.JButton btnEditTiket;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHpsTiket;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambahTiket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTujuan;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
