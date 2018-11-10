/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jooprima
 */
public class frmRalanIbu extends javax.swing.JDialog {
    
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
    
    DefaultTableModel tabmode;
    private frmPasienIbu pasienibu=new frmPasienIbu(null,false);
    private frmDokter dokter=new frmDokter(null,false);
    private frmPenyakit penyakit=new frmPenyakit(null,false);
    private frmTindakan tindakan=new frmTindakan(null,false);

    /**
     * Creates new form frmRalanIbu
     */
    public frmRalanIbu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"Nomor","Tanggal","Nama Ibu","Dokter","ICD","Tindakan","Suhu Tubuh",
            "Tensi","Hasil","Keterangan","Biaya"
        };
        tabmode=new DefaultTableModel(judul,0);
        tabelRalanIbu.setModel(tabmode);
        tampil();
        makecenter();
        pasienibu.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(pasienibu.getData().getRowCount()!=-1){
                    txtNoRekamIbu.setText(pasienibu.getMode().getValueAt(pasienibu.getData().getSelectedRow(),0).toString());
                    txtCariRmIbu.setText(pasienibu.getMode().getValueAt(pasienibu.getData().getSelectedRow(),1).toString());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}
            

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
        dokter.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(dokter.getData().getRowCount()!=-1){
                    txtKodeDokter.setText(dokter.getModel().getValueAt(dokter.getData().getSelectedRow(),0).toString());
                    txtCariDokter.setText(dokter.getModel().getValueAt(dokter.getData().getSelectedRow(),1).toString());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
        penyakit.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(penyakit.getData().getRowCount()!=-1){
                    txtKodeIcd.setText(penyakit.getModel().getValueAt(penyakit.getData().getSelectedRow(),0).toString());
                    txtCariIcd.setText(penyakit.getModel().getValueAt(penyakit.getData().getSelectedRow(),1).toString());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
        tindakan.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(tindakan.getData().getRowCount()!=-1){
                    txtKodeTindakan.setText(tindakan.getModel().getValueAt(tindakan.getData().getSelectedRow(),0).toString());
                    txtCariTindakan.setText(tindakan.getModel().getValueAt(tindakan.getData().getSelectedRow(),1).toString());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtKodeIcd = new javax.swing.JTextField();
        txtKodeDokter = new javax.swing.JTextField();
        txtNoRekamIbu = new javax.swing.JTextField();
        txtCariIcd = new javax.swing.JTextField();
        txtCariDokter = new javax.swing.JTextField();
        txtCariRmIbu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKodeTindakan = new javax.swing.JTextField();
        txtSuhuTubuh = new javax.swing.JTextField();
        txtKeterangan = new javax.swing.JTextField();
        txtHasil = new javax.swing.JTextField();
        txtTensi = new javax.swing.JTextField();
        txtCariTindakan = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtBiaya = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        tbSimpan = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbBaru = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRalanIbu = new javax.swing.JTable();
        tbCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA RAWAT JALAN IBU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Kode Dokter :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("No. Rekam Ibu :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tanggal :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("No. :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Kode Icd :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("...");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("...");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("...");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Hasil :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tensi :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Suhu Tubuh :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Kode TIndakan :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Keterangan :");

        txtTensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTensiActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("...");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Biaya :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Keyword :");

        tbSimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });

        tbKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });

        tbCetak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbCetak.setText("Cetak");

        tbEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });

        tbBaru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbBaru.setText("Baru");
        tbBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBaruActionPerformed(evt);
            }
        });

        tbHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });

        tabelRalanIbu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRalanIbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRalanIbuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRalanIbu);

        tbCari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbCari.setText("Cari");
        tbCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtKodeDokter)
                                            .addComponent(txtKodeIcd)
                                            .addComponent(txtNoRekamIbu))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCariDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCariIcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCariRmIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))))
                                    .addComponent(txtNo)
                                    .addComponent(txtTanggal)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbCetak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbKeluar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbCari)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtKodeTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCariTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSuhuTubuh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHasil, txtKeterangan, txtSuhuTubuh, txtTensi});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbBaru, tbCetak, tbEdit, tbHapus, tbKeluar, tbSimpan});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCariDokter, txtCariIcd, txtCariRmIbu, txtKodeDokter, txtKodeIcd, txtNoRekamIbu});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNoRekamIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtKodeDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCariDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtKodeIcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCariIcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCariRmIbu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtKodeTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCariTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSuhuTubuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbSimpan)
                    .addComponent(tbEdit)
                    .addComponent(tbBaru)
                    .addComponent(tbHapus)
                    .addComponent(tbCetak)
                    .addComponent(tbKeluar)
                    .addComponent(tbCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTensiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTensiActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().executeUpdate("insert into rawat_jl_ibu values"+
                    "('"+txtNo.getText()+
                    "','"+txtTanggal.getText()+
                    "','"+txtNoRekamIbu.getText()+
                    "','"+txtKodeDokter.getText()+
                    "','"+txtKodeIcd.getText()+
                    "','"+txtKodeTindakan.getText()+
                    "','"+txtSuhuTubuh.getText()+
                    "','"+txtTensi.getText()+
                    "','"+txtHasil.getText()+
                    "','"+txtKeterangan.getText()+
                    "','"+txtBiaya.getText()+"')");
            tampil();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            Statement rs=koneksi.createStatement();
            rs.execute("update rawat_jl_ibu set tanggal= '" +
                    txtTanggal.getText() + "' ,no_rm_ibu='" +
                    txtNoRekamIbu.getText() + "' ,kd_dokter='" +
                    txtKodeDokter.getText() + "' ,kd_icd='" +
                    txtKodeIcd.getText() + "' ,kd_tindakan='" +
                    txtKodeTindakan.getText() + "' ,suhu_tubuh='" +
                    txtSuhuTubuh.getText() + "' ,tensi='" +
                    txtTensi.getText() + "' ,hasil='" +
                    txtHasil.getText() + "' ,Keterangan='" +
                    txtKeterangan.getText() + "' ,biaya='" +
                    txtBiaya.getText() + "' where no= '" +
                    txtNo.getText() + "'");
            tampil();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from rawat_jl_ibu where no= '" +
                    txtNo.getText()+"'");
            tampil();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBaruActionPerformed
        // TODO add your handling code here:
        txtNo.setText("");
        txtTanggal.setText("");
        txtNoRekamIbu.setText("");
        txtKodeDokter.setText("");
        txtKodeIcd.setText("");
        txtKodeTindakan.setText("");
        txtSuhuTubuh.setText("");
        txtTensi.setText("");
        txtHasil.setText("");
        txtKeterangan.setText("");
        txtBiaya.setText("");
        
    }//GEN-LAST:event_tbBaruActionPerformed

    private void tbCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCariActionPerformed
        int row=tabmode.getRowCount();
        for (int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select * from rawat_jl_ibu where no like '%"+
                    txtCari.getText()+"%' or tanggal like '%"+
                    txtCari.getText()+"%' or no_rm_ibu like '%"+
                    txtCari.getText()+"%' or kd_dokter like '%"+
                    txtCari.getText()+"%' or kd_icd like '%"+
                    txtCari.getText()+"%' or kd_tindakan like '%"+
                    txtCari.getText()+"%' or suhu_tubuh like '%"+
                    txtCari.getText()+"%' or tensi like '%"+
                    txtCari.getText()+"%' or hasil like '%"+
                    txtCari.getText()+"%' or keterangan like '%"+
                    txtCari.getText()+"%' or biaya like '%"+
                    txtCari.getText()+"%'");
            while(rs.next()){
                String[] data={rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8),
                    rs.getString(9), rs.getString(10),
                    rs.getString(11)
                };
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbCariActionPerformed

    private void tabelRalanIbuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRalanIbuMouseClicked
        // TODO add your handling code here:
        int i=tabelRalanIbu.getSelectedRow();
        if(i>-1){
            txtNo.setText(tabmode.getValueAt(i, 0).toString());
            txtTanggal.setText(tabmode.getValueAt(i, 1).toString());
            txtCariRmIbu.setText(tabmode.getValueAt(i, 2).toString());
            txtCariDokter.setText(tabmode.getValueAt(i, 3).toString());
            txtCariIcd.setText(tabmode.getValueAt(i, 4).toString());
            txtCariTindakan.setText(tabmode.getValueAt(i, 5).toString());
            txtSuhuTubuh.setText(tabmode.getValueAt(i, 6).toString());
            txtTensi.setText(tabmode.getValueAt(i, 7).toString());
            txtHasil.setText(tabmode.getValueAt(i, 8).toString());
            txtKeterangan.setText(tabmode.getValueAt(i, 9).toString());
            txtBiaya.setText(tabmode.getValueAt(i, 10).toString());
        }
    }//GEN-LAST:event_tabelRalanIbuMouseClicked

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
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRalanIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRalanIbu dialog = new frmRalanIbu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRalanIbu;
    private javax.swing.JButton tbBaru;
    private javax.swing.JButton tbCari;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCariDokter;
    private javax.swing.JTextField txtCariIcd;
    private javax.swing.JTextField txtCariRmIbu;
    private javax.swing.JTextField txtCariTindakan;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtKodeDokter;
    private javax.swing.JTextField txtKodeIcd;
    private javax.swing.JTextField txtKodeTindakan;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNoRekamIbu;
    private javax.swing.JTextField txtSuhuTubuh;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTensi;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        int row=tabmode.getRowCount();
        for(int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_jl_ibu.no,rawat_jl_ibu.tanggal,"
                    + "pasien_ibu.nm_pasien,dokter.nm_dokter,penyakit.nama_penyakit,tindakan.nama_tindakan,"
                    + "rawat_jl_ibu.suhu_tubuh,rawat_jl_ibu.tensi,rawat_jl_ibu.hasil,rawat_jl_ibu.keterangan,"
                    + "rawat_jl_ibu.biaya from rawat_jl_ibu inner join pasien_ibu on rawat_jl_ibu.no_rm_ibu=pasien_ibu.no_rm_ibu "
                    + "inner join dokter on rawat_jl_ibu.kd_dokter=dokter.kd_dokter inner join penyakit on rawat_jl_ibu.kd_icd=penyakit.kd_icd "
                    + "inner join tindakan on rawat_jl_ibu.kd_tindakan=tindakan.kd_tindakan");
            while(rs.next()){
                String[] data={rs.getString(1),rs.getString(2),
                    rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),
                    rs.getString(7),rs.getString(8),
                    rs.getString(9),rs.getString(10),
                    rs.getString(11)
                };
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
