/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jooprima
 */
public class frmUtama extends javax.swing.JFrame {
    
    private void makecenter(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if(frameSize.height > screenSize.height){
            frameSize.height = screenSize.height;
        }
        if(frameSize.width > screenSize.width){
            frameSize.width = screenSize.width;
        }
        this.setLocation(
        (screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }

    /**
     * Creates new form frmUtama
     */
    public frmUtama() {
        initComponents();
        makecenter();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mAdmin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mPasien = new javax.swing.JMenu();
        mPasienBayi = new javax.swing.JMenuItem();
        mPasienIbu = new javax.swing.JMenuItem();
        mPasienMatiBayi = new javax.swing.JMenuItem();
        mPasienMatiIbu = new javax.swing.JMenuItem();
        mPenyakit = new javax.swing.JMenuItem();
        mKamar = new javax.swing.JMenuItem();
        mDokter = new javax.swing.JMenuItem();
        mTindakan = new javax.swing.JMenuItem();
        mImunisasi = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mRanapIbu = new javax.swing.JMenuItem();
        mRanapBayi = new javax.swing.JMenuItem();
        mRalanIbu = new javax.swing.JMenuItem();
        mRalanBayi = new javax.swing.JMenuItem();
        mLogout = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();

        jMenuItem14.setText("jMenuItem14");

        jMenuItem15.setText("jMenuItem15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Master");

        mAdmin.setText("Admin");
        mAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAdminActionPerformed(evt);
            }
        });
        jMenu1.add(mAdmin);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data");

        mPasien.setText("Pasien");

        mPasienBayi.setText("Pasien Bayi");
        mPasienBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPasienBayiActionPerformed(evt);
            }
        });
        mPasien.add(mPasienBayi);

        mPasienIbu.setText("Pasien Ibu");
        mPasienIbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPasienIbuActionPerformed(evt);
            }
        });
        mPasien.add(mPasienIbu);

        mPasienMatiBayi.setText("Pasien Mati Bayi");
        mPasienMatiBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPasienMatiBayiActionPerformed(evt);
            }
        });
        mPasien.add(mPasienMatiBayi);

        mPasienMatiIbu.setText("Pasien Mati Ibu");
        mPasienMatiIbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPasienMatiIbuActionPerformed(evt);
            }
        });
        mPasien.add(mPasienMatiIbu);

        jMenu2.add(mPasien);

        mPenyakit.setText("Penyakit");
        mPenyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPenyakitActionPerformed(evt);
            }
        });
        jMenu2.add(mPenyakit);

        mKamar.setText("Kamar");
        mKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mKamarActionPerformed(evt);
            }
        });
        jMenu2.add(mKamar);

        mDokter.setText("Dokter");
        mDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDokterActionPerformed(evt);
            }
        });
        jMenu2.add(mDokter);

        mTindakan.setText("Tindakan");
        mTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTindakanActionPerformed(evt);
            }
        });
        jMenu2.add(mTindakan);

        mImunisasi.setText("Imunisasi");
        mImunisasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mImunisasiActionPerformed(evt);
            }
        });
        jMenu2.add(mImunisasi);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Perawatan");

        mRanapIbu.setText("Rawat Inap Ibu");
        mRanapIbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRanapIbuActionPerformed(evt);
            }
        });
        jMenu3.add(mRanapIbu);

        mRanapBayi.setText("Rawat Inap Bayi");
        mRanapBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRanapBayiActionPerformed(evt);
            }
        });
        jMenu3.add(mRanapBayi);

        mRalanIbu.setText("Rawat Jalan Ibu");
        mRalanIbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRalanIbuActionPerformed(evt);
            }
        });
        jMenu3.add(mRalanIbu);

        mRalanBayi.setText("Rawat Jalan Bayi");
        mRalanBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRalanBayiActionPerformed(evt);
            }
        });
        jMenu3.add(mRalanBayi);

        jMenuBar1.add(jMenu3);

        mLogout.setText("Keluar");

        jMenuItem18.setText("Logout");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        mLogout.add(jMenuItem18);

        jMenuBar1.add(mLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAdminActionPerformed
        // TODO add your handling code here:
        frmAdmin admin=new frmAdmin(this,false);
        admin.setVisible(true);
    }//GEN-LAST:event_mAdminActionPerformed

    private void mPasienBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPasienBayiActionPerformed
        // TODO add your handling code here:
        frmPasienBayi pasienBayi=new frmPasienBayi(this,false);
        pasienBayi.setVisible(true);
    }//GEN-LAST:event_mPasienBayiActionPerformed

    private void mPasienIbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPasienIbuActionPerformed
        // TODO add your handling code here:
        frmPasienIbu pasienIbu=new frmPasienIbu(this,false);
        pasienIbu.setVisible(true);
    }//GEN-LAST:event_mPasienIbuActionPerformed

    private void mPasienMatiBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPasienMatiBayiActionPerformed
        // TODO add your handling code here:
        frmPasienMatiBayi pasienMatiBayi=new frmPasienMatiBayi(this,false);
        pasienMatiBayi.setVisible(true);
    }//GEN-LAST:event_mPasienMatiBayiActionPerformed

    private void mPasienMatiIbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPasienMatiIbuActionPerformed
        // TODO add your handling code here:
        frmPasienMatiIbu pasienMatiIbu=new frmPasienMatiIbu(this,false);
        pasienMatiIbu.setVisible(true);
    }//GEN-LAST:event_mPasienMatiIbuActionPerformed

    private void mPenyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPenyakitActionPerformed
        // TODO add your handling code here:
        frmPenyakit penyakit=new frmPenyakit(this,false);
        penyakit.setVisible(true);
    }//GEN-LAST:event_mPenyakitActionPerformed

    private void mKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mKamarActionPerformed
        // TODO add your handling code here:
        frmKamar kamar=new frmKamar(this,false);
        kamar.setVisible(true);
    }//GEN-LAST:event_mKamarActionPerformed

    private void mDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDokterActionPerformed
        // TODO add your handling code here:
        frmDokter dokter=new frmDokter(this,false);
        dokter.setVisible(true);
    }//GEN-LAST:event_mDokterActionPerformed

    private void mTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTindakanActionPerformed
        // TODO add your handling code here:
        frmTindakan tindakan=new frmTindakan(this,false);
        tindakan.setVisible(true);
    }//GEN-LAST:event_mTindakanActionPerformed

    private void mImunisasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mImunisasiActionPerformed
        // TODO add your handling code here:
        frmImunisasi imunisasi=new frmImunisasi(this,false);
        imunisasi.setVisible(true);
    }//GEN-LAST:event_mImunisasiActionPerformed

    private void mRanapIbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRanapIbuActionPerformed
        // TODO add your handling code here:
        frmRanapIbu ranapIbu=new frmRanapIbu(this,false);
        ranapIbu.setVisible(true);
    }//GEN-LAST:event_mRanapIbuActionPerformed

    private void mRanapBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRanapBayiActionPerformed
        // TODO add your handling code here:
        frmRanapBayi ranapBayi=new frmRanapBayi(this,false);
        ranapBayi.setVisible(true);
    }//GEN-LAST:event_mRanapBayiActionPerformed

    private void mRalanIbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRalanIbuActionPerformed
        // TODO add your handling code here:
        frmRalanIbu ralanIbu=new frmRalanIbu(this,false);
        ralanIbu.setVisible(true);
    }//GEN-LAST:event_mRalanIbuActionPerformed

    private void mRalanBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRalanBayiActionPerformed
        // TODO add your handling code here:
        frmRalanBayi ralanBayi=new frmRalanBayi(this,false);
        ralanBayi.setVisible(true);
    }//GEN-LAST:event_mRalanBayiActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

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
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem mAdmin;
    private javax.swing.JMenuItem mDokter;
    private javax.swing.JMenuItem mImunisasi;
    private javax.swing.JMenuItem mKamar;
    private javax.swing.JMenu mLogout;
    private javax.swing.JMenu mPasien;
    private javax.swing.JMenuItem mPasienBayi;
    private javax.swing.JMenuItem mPasienIbu;
    private javax.swing.JMenuItem mPasienMatiBayi;
    private javax.swing.JMenuItem mPasienMatiIbu;
    private javax.swing.JMenuItem mPenyakit;
    private javax.swing.JMenuItem mRalanBayi;
    private javax.swing.JMenuItem mRalanIbu;
    private javax.swing.JMenuItem mRanapBayi;
    private javax.swing.JMenuItem mRanapIbu;
    private javax.swing.JMenuItem mTindakan;
    // End of variables declaration//GEN-END:variables
}
