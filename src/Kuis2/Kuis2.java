/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author SMKTELKOM
 */
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Diskon = new javax.swing.JTextField();
        Hb1 = new javax.swing.JTextField();
        Hb2 = new javax.swing.JTextField();
        Hb3 = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnKeluar = new javax.swing.JButton();
        Hb4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Harga Barang 3");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 180, 100, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Harga Barang 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 100, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Harga Barang 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 100, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Diskon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 260, 100, 17);
        getContentPane().add(Diskon);
        Diskon.setBounds(140, 250, 140, 30);

        Hb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hb1ActionPerformed(evt);
            }
        });
        getContentPane().add(Hb1);
        Hb1.setBounds(140, 90, 140, 30);
        getContentPane().add(Hb2);
        Hb2.setBounds(140, 130, 140, 30);
        getContentPane().add(Hb3);
        Hb3.setBounds(140, 170, 140, 30);

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProses);
        btnProses.setBounds(40, 310, 80, 23);

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHapus);
        BtnHapus.setBounds(140, 310, 80, 23);

        BtnKeluar.setText("Keluar");
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKeluar);
        BtnKeluar.setBounds(240, 310, 70, 23);

        Hb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hb4ActionPerformed(evt);
            }
        });
        getContentPane().add(Hb4);
        Hb4.setBounds(140, 210, 140, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Harga Barang 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 100, 17);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 20, 100, 25);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 300, 140);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 350, 510);

        setSize(new java.awt.Dimension(363, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        Hasil.setText("");
        Hasil.setText("");
        Hasil.setText("");
        Hasil.setText("");
        Hasil.setText("");
        Hasil.setText("");
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        // TODO add your handling code here:
          dispose();
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        int harga1 = Integer.parseInt(Hb1.getText());
        int harga2 = Integer.parseInt(Hb2.getText());
        int harga3 = Integer.parseInt(Hb3.getText());
        int harga4 = Integer.parseInt(Hb4.getText());
        int diskon = Integer.parseInt(Diskon.getText());
        int total1;
        int total;
        int harga;
        
        harga = harga1+harga2+harga3+harga4;
        if(diskon == 0){
            total = harga;
        }
        else{
            total1 = (harga*diskon)/100;
            total = harga - total1;
        }
        
        Hasil.setText("Harga Barang 1 : Rp. "+harga1+"\nHarga Barang 2 : Rp. "+harga2+"\nHarga Barang 3 : Rp. "+harga3+
        "\nHarga Barang 4 : Rp. "+harga4+"\nDiskon : "+diskon+" %"+"\nTotal Harga : Rp. "+harga+"\nTotal Bayar : Rp. "+total);
                
        
    }//GEN-LAST:event_btnProsesActionPerformed

    private void Hb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hb1ActionPerformed

    private void Hb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hb4ActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JTextField Diskon;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Hb1;
    private javax.swing.JTextField Hb2;
    private javax.swing.JTextField Hb3;
    private javax.swing.JTextField Hb4;
    private javax.swing.JButton btnProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
