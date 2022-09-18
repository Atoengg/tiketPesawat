
package tiketpesawat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dataTiket extends javax.swing.JFrame {

    public Connection conn = koneksi.Koneksi();
    public Statement st;
    public halamanAdmin FAB = null;
    public halamanUser HU = null;
    
    public dataTiket() {
        
        initComponents();
        tampilDataTiket();
    }

//    dataTiket(Object object, boolean closeble) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public final void tampilDataTiket(){
        DefaultTableModel tabelTiket = new DefaultTableModel();
        tabelTiket.addColumn("id_pesawat");
        tabelTiket.addColumn("Dari");
        tabelTiket.addColumn("Tujuan");
        tabelTiket.addColumn("Waktu");
        tabelTiket.addColumn("Harga");
        
        try {
            String sql = "SELECT * FROM pesawat";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                tabelTiket.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    
                });
            }
            tTiket.setModel(tabelTiket);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTiket = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar Tiket");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Tiket");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 550, 70));

        tTiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTiketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tTiketMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tTiket);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiketpesawat/gambar/Admin.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 550, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTiketMouseClicked
        // TODO add your handling code here:

        int tabelTiket = tTiket.getSelectedRow();
        
        FAB.id = tTiket.getValueAt(tabelTiket, 0).toString();
        FAB.dari1 = tTiket.getValueAt(tabelTiket, 1).toString();
        FAB.tujuan1 = tTiket.getValueAt(tabelTiket, 2).toString();
        FAB.waktu1 = tTiket.getValueAt(tabelTiket, 3).toString();
        FAB.harga1 = tTiket.getValueAt(tabelTiket, 4).toString();
        
        FAB.itemTerpilih();
        this.dispose();
        
    }//GEN-LAST:event_tTiketMouseClicked

    private void tTiketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTiketMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tTiketMouseEntered

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
            java.util.logging.Logger.getLogger(dataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tTiket;
    // End of variables declaration//GEN-END:variables
}
