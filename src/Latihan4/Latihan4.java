/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author SMK TELKOM
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        btnGrup = new javax.swing.ButtonGroup();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdb1 = new javax.swing.JRadioButton();
        rdb2 = new javax.swing.JRadioButton();
        cb2 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, -1));
        getContentPane().add(Absen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Biodata Siswa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 20, 136, 28);

        btnGrup.add(rdb1);
        rdb1.setText("RPL");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });
        jPanel1.add(rdb1);
        rdb1.setBounds(110, 130, 50, 23);

        btnGrup.add(rdb2);
        rdb2.setText("TKJ");
        jPanel1.add(rdb2);
        rdb2.setBounds(190, 130, 50, 23);

        cb2.setText("Teknisi");
        jPanel1.add(cb2);
        cb2.setBounds(240, 170, 80, 23);

        cb4.setText("Designer");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        jPanel1.add(cb4);
        cb4.setBounds(240, 200, 80, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(250, 240, 51, 23);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 320, 260, 96);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Hasil");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 290, 60, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Jurusan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 130, 50, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Hobi");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 170, 26, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Absen");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 90, 50, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 60, 40, 17);

        cb1.setText("Programming");
        jPanel1.add(cb1);
        cb1.setBounds(110, 170, 100, 23);

        cb3.setText("Animator");
        jPanel1.add(cb3);
        cb3.setBounds(110, 200, 100, 23);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(70, 240, 70, 23);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus);
        btnHapus.setBounds(160, 240, 70, 23);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 390, 450));

        setSize(new java.awt.Dimension(384, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String nama = Nama.getText();
        String absen = Absen.getText();
        String jurusan;
        String hobi="";
        
        if (rdb1.isSelected())
            jurusan = "RPL";
        else if(rdb2.isSelected())
            jurusan = "TKJ";
        else
            jurusan = "";
        
        if(cb1.isSelected())
            hobi+= cb1.getText()+", ";
        if(cb2.isSelected())
            hobi+= cb2.getText()+", ";
        if(cb3.isSelected())
            hobi+= cb3.getText()+", ";
        if(cb4.isSelected())
            hobi+= cb4.getText()+", ";
        
        Hasil.setText("Nama Siswa : "+nama+"\nAbsen Siswa : "+absen+"\nJurusan Siswa : "+jurusan+"\nHobi Siswa : "+hobi);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        Hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        btnGrup.clearSelection();
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb1ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGrup;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
