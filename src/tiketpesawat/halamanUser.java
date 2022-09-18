
package tiketpesawat;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class halamanUser extends javax.swing.JFrame {
    
    public Connection conn = koneksi.Koneksi();
    public Statement st1;
    public  PreparedStatement st2;
    public dataUser du = null;
    
    
    public String id_user, nama, alamat, telepon, jenisKelamin, dari2, tujuan2, tanggalBerangkat, harga2;
    
    public String getId(){
        return id_user;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public String getJk(){
        return jenisKelamin;
    }
    
    public String getDari() {
        return dari2;
    }
    
    public String getTujuan(){
        return tujuan2;
    }
    
    public String getTgl(){
        return tanggalBerangkat;
    }
    
    public String getHarga(){
        return harga2;
    }
    
    public halamanUser() {
        initComponents();
        tampilDataReservasi();
    }
    
    public void reset(){
        dataUser du = new dataUser();
        du.HU = this;
        txtIdUser.setText(null);
        txtNama.setText(null);
        txtAlamat.setText(null);
        txtTelepon.setText(null);
        comboJk.setSelectedItem(null);
        txtDari2.setText(null);
        txtTujuan2.setText(null);
        jDateTglBkt.setCalendar(null);
        txtHarga2.setText(null);
    }
    
    public void tampilDataReservasi(){
        DefaultTableModel tabelReservasi = new DefaultTableModel();
        tabelReservasi.addColumn("Kode_Reservasi");
        tabelReservasi.addColumn("No KTP");
        
        try {
            String sql = "SELECT * FROM reservasi";
            st2 = conn.prepareStatement(sql);
            ResultSet rs = st2.executeQuery();
            
            while(rs.next()){
                tabelReservasi.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                });
            }
            tReservasi.setModel(tabelReservasi);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void filterAngka(KeyEvent w){
        if (Character.isAlphabetic(w.getKeyChar())) {
            w.consume();
            JOptionPane.showMessageDialog(null, "Masukan Angka", "peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void jmlhKtp(KeyEvent k) {
        if (txtIdUser.getText().length() == 16) {
            k.consume();
            JOptionPane.showMessageDialog(null, "mohon maaf nomor ktp sudah maksimal", "peringatan", JOptionPane.WARNING_MESSAGE);
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLihatTiket = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDari2 = new javax.swing.JTextField();
        txtTujuan2 = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        txtIdUser = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        comboJk = new javax.swing.JComboBox<>();
        btnDftTiket = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtHarga2 = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tReservasi = new javax.swing.JTable();
        jDateTglBkt = new com.toedter.calendar.JDateChooser();
        btnReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman User");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Halaman User");

        btnLihatTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/tiket.png"))); // NOI18N
        btnLihatTiket.setText("Lihat Tiket");
        btnLihatTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatTiketActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tanggal Berangkat");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Telepon");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tujuan");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Dari");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Nama");

        txtDari2.setEditable(false);

        txtTujuan2.setEditable(false);

        txtTelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTeleponKeyTyped(evt);
            }
        });

        txtIdUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdUserKeyTyped(evt);
            }
        });

        comboJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perempuan", "Laki-laki" }));
        comboJk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJkActionPerformed(evt);
            }
        });

        btnDftTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/pesen-removebg-preview (1).png"))); // NOI18N
        btnDftTiket.setText("Pesan Tiket");
        btnDftTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDftTiketActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Harga");

        txtHarga2.setEditable(false);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/icon Exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("No KTP");

        tReservasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tReservasi);

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Data Reservasi User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelepon)
                    .addComponent(txtTujuan2)
                    .addComponent(txtDari2)
                    .addComponent(txtHarga2)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboJk, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateTglBkt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLihatTiket)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDftTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboJk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDari2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTujuan2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateTglBkt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLihatTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDftTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLihatTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatTiketActionPerformed
        // TODO add your handling code here:
        dataTiket2 dt = new dataTiket2();
        dt.HU = this;
        dt.setVisible(true);
        dt.setResizable(false);
    }//GEN-LAST:event_btnLihatTiketActionPerformed

    private void btnDftTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDftTiketActionPerformed
        // TODO add your handling code here:
        
        try {
            if (txtIdUser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "mohon maaf kolom No KTP tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Nama tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtAlamat.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Alamat tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(txtTelepon.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Telepon tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            } else if(comboJk.getSelectedItem().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Jenis kelamin tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            }else if(txtDari2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "mohon maaf kolom Dari, Tujuan, dan Harga tidak boleh kosong", "peringatan", JOptionPane.WARNING_MESSAGE);
            }else if(jDateTglBkt.getDate() == null){
                JOptionPane.showMessageDialog(this, "mohon maaf form tanggal berangkat belum diisi","peringatan",JOptionPane.INFORMATION_MESSAGE);
                jDateTglBkt.requestFocusInWindow();
            }else{
                String tampilan = "yyyy-MM-dd";
                SimpleDateFormat fm = new SimpleDateFormat(tampilan);
                String berangkat = String.valueOf(fm.format(jDateTglBkt.getDate()));
                String sql1 = "INSERT INTO customer VALUES ('"+txtIdUser.getText()+"','"+txtNama.getText()+"',"+ "'"+txtAlamat.getText()+"',"
                        + "'"+txtTelepon.getText()+"',"
                        + "'"+comboJk.getSelectedItem()+"',"
                        + "'"+txtDari2.getText()+"',"
                        + "'"+txtTujuan2.getText()+"','"+berangkat+"',"
                        + ""+"'"+txtHarga2.getText()+"')";
                st1 = conn.createStatement();
                int rs1 = st1.executeUpdate(sql1);
                JOptionPane.showMessageDialog(null, " Selamat Pemesanan Tiket Berhasil");
                JOptionPane.showMessageDialog(null, " Terima kasih telah mengunjungi di aplikasi kami");
            }
            
        } catch (Exception e) {
        }
        
        try {
            String sql2 = "INSERT INTO reservasi VALUES (?,?)";
            st2 = conn.prepareStatement(sql2);
            st2.setString(1, null);
            st2.setString(2, txtIdUser.getText());
            
            st2.executeUpdate();
            
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Mohon maaf kolom tanggal berangkat tidak boleh kosong", joptip);
        }
        tampilDataReservasi();
        reset();

    }//GEN-LAST:event_btnDftTiketActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtIdUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdUserKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
        jmlhKtp(evt);
    }//GEN-LAST:event_txtIdUserKeyTyped

    private void txtTeleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeleponKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
    }//GEN-LAST:event_txtTeleponKeyTyped

    private void comboJkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJkActionPerformed

    public void itemTerpilihUser(){
        
        dataTiket2 dt = new dataTiket2();
        dt.HU = this;
        txtDari2.setText(dari2);
        txtTujuan2.setText(tujuan2);
        txtHarga2.setText(harga2);
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
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDftTiket;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLihatTiket;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboJk;
    private com.toedter.calendar.JDateChooser jDateTglBkt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tReservasi;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtDari2;
    private javax.swing.JTextField txtHarga2;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtTujuan2;
    // End of variables declaration//GEN-END:variables
}
