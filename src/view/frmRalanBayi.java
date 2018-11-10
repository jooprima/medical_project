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
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jooprima
 */
public class frmRalanBayi extends javax.swing.JDialog {
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
    private frmPasienBayi pasienbayi=new frmPasienBayi(null, false);
    private frmDokter dokter=new frmDokter(null, false);
    private frmPenyakit penyakit=new frmPenyakit(null, false);
    private frmTindakan tindakan=new frmTindakan(null, false);
    private frmImunisasi imunisasi=new frmImunisasi(null, false);
    

    /**
     * Creates new form frmRalanBayi
     */
    public frmRalanBayi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"Nomor","Tanggal","Rekam Bayi"," Nama Dokter","ICD","Tindakan",
            "Suhu Tubuh","Tensi","Hasil","Keterangan","Imunisasi","Imun Ke-"
        };
        tabmode=new DefaultTableModel(judul,0);
        tabelRalanBayi.setModel(tabmode);
        tampil();
        makecenter();
        pasienbayi.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(pasienbayi.getData().getRowCount()!=-1){
                    txtNoRmBayi.setText(pasienbayi.getModel().getValueAt(pasienbayi.getData().getSelectedRow(),0).toString());
                    txtCariBayi.setText(pasienbayi.getModel().getValueAt(pasienbayi.getData().getSelectedRow(),1).toString());
            }
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent me) {}
        
        });
        
        dokter.getData().addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(dokter.getData().getRowCount()!=-1){
                    txtKdDokter.setText(dokter.getModel().getValueAt(dokter.getData().getSelectedRow(),0).toString());
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

            @Override
            public void mouseDragged(MouseEvent e) {}

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        
        penyakit.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(penyakit.getData().getRowCount()!=-1){
                    txtKdicd.setText(penyakit.getModel().getValueAt(penyakit.getData().getSelectedRow(),0).toString());
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
        
        imunisasi.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(imunisasi.getData().getRowCount()!=-1){
                    txtKdImunisasi.setText(imunisasi.getModel().getValueAt(imunisasi.getData().getSelectedRow(),0).toString());
                    txtCariImunisasi.setText(imunisasi.getModel().getValueAt(imunisasi.getData().getSelectedRow(),1).toString());
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
                    txtKdTindakan.setText(tindakan.getModel().getValueAt(tindakan.getData().getSelectedRow(),0).toString());
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
        jLabel7 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtNoRmBayi = new javax.swing.JTextField();
        txtKdTindakan = new javax.swing.JTextField();
        txtCariBayi = new javax.swing.JTextField();
        txtKdDokter = new javax.swing.JTextField();
        txtKdicd = new javax.swing.JTextField();
        txtCariIcd = new javax.swing.JTextField();
        txtCariDokter = new javax.swing.JTextField();
        txtCariTindakan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSuhuTubuh = new javax.swing.JTextField();
        txtTensi = new javax.swing.JTextField();
        txtHasil = new javax.swing.JTextField();
        txtKeterangan = new javax.swing.JTextField();
        txtKdImunisasi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCariImunisasi = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtImunke = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbBaru = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRalanBayi = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        tbCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA RAWAT JALAN BAYI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Kode Tindakan :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Kode Dokter :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Kode icd :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Tanggal :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("No_rm_Bayi :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("No. :");

        txtNoRmBayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoRmBayiActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Suhu Tubuh :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Tensi :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Hasil :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Keterangan :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Kode Imunisasi :");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Imun ke- :");

        tbSimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });

        tbEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });

        tbHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });

        tbBaru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbBaru.setText("Baru");
        tbBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBaruActionPerformed(evt);
            }
        });

        tbCetak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbCetak.setText("Cetak");

        tbKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });

        tabelRalanBayi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRalanBayi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRalanBayiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRalanBayi);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Keyword :");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbCetak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbKeluar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtKdTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCariTindakan))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtKdDokter)
                                            .addComponent(txtKdicd))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCariDokter, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                            .addComponent(txtCariIcd)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtNoRmBayi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCariBayi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(245, 245, 245))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSuhuTubuh)
                                    .addComponent(txtTensi)
                                    .addComponent(txtHasil)
                                    .addComponent(txtKeterangan)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtKdImunisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCariImunisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5))
                                    .addComponent(txtImunke)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbCari)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbBaru, tbCetak, tbEdit, tbHapus, tbKeluar, tbSimpan});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKdDokter, txtKdTindakan, txtKdicd, txtNoRmBayi});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSuhuTubuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNoRmBayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCariBayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel10)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCariDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel11)
                    .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKdicd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCariIcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel12)
                    .addComponent(txtKdImunisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCariImunisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKdTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCariTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel13)
                    .addComponent(txtImunke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbSimpan)
                    .addComponent(tbEdit)
                    .addComponent(tbHapus)
                    .addComponent(tbBaru)
                    .addComponent(tbCetak)
                    .addComponent(tbKeluar)
                    .addComponent(jLabel14)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCariActionPerformed
        int row=tabmode.getRowCount();
        for(int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select * from rawat_jl_bayi where no like '%"+
                    txtCari.getText()+"%' or tanggal like '%"+
                    txtCari.getText()+"%' or no_rm_bayi like '%"+
                    txtCari.getText()+"%' or kd_dokter like '%"+
                    txtCari.getText()+"%' or kd_icd like '%"+
                    txtCari.getText()+"%' or kd_tindakan like '%"+
                    txtCari.getText()+"%' or suhu_tubuh like '%"+
                    txtCari.getText()+"%' or tensi like '%"+
                    txtCari.getText()+"%' or hasil like '%"+
                    txtCari.getText()+"%' or keterangan like '%"+
                    txtCari.getText()+"%' or kd_imunisasi like '%"+
                    txtCari.getText()+"%' or imunke like '%"+
                    txtCari.getText()+"%'");
            while(rs.next()){
                String[] data={rs.getString(1),rs.getString(2),
                    rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),
                    rs.getString(7),rs.getString(8),
                    rs.getString(9),rs.getString(10),
                    rs.getString(11),rs.getString(12),
                };
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbCariActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from rawat_jl_bayi where no= '" +
                    txtNo.getText()+"'");
            tampil();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbHapusActionPerformed

    private void txtNoRmBayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoRmBayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoRmBayiActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().executeUpdate("insert into rawat_jl_bayi values"+
                    "('"+txtNo.getText()+
                    "','"+txtTanggal.getText()+
                    "','"+txtNoRmBayi.getText()+
                    "','"+txtKdDokter.getText()+
                    "','"+txtKdicd.getText()+
                    "','"+txtKdTindakan.getText()+
                    "','"+txtSuhuTubuh.getText()+
                    "','"+txtTensi.getText()+
                    "','"+txtHasil.getText()+
                    "','"+txtKeterangan.getText()+
                    "','"+txtKdImunisasi.getText()+
                    "','"+txtImunke.getText()+"')");
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
            rs.execute("update rawat_jl_bayi set tanggal= '" +
                    txtTanggal.getText() + "' ,no_rm_bayi='" +
                    txtNoRmBayi.getText() + "' ,kd_dokter='" +
                    txtKdDokter.getText() + "' ,kd_icd='" +
                    txtKdicd.getText() + "' ,kd_tindakan='" +
                    txtKdTindakan.getText() + "' ,suhu_tubuh='" +
                    txtSuhuTubuh.getText() + "' ,tensi='" +
                    txtTensi.getText() + "' ,hasil='" +
                    txtHasil.getText() + "' ,keterangan='" +
                    txtKeterangan.getText() + "' ,kd_imunisasi='" +
                    txtKdImunisasi.getText() + "' ,imunke='" +
                    txtImunke.getText() + "' where no= '" +
                    txtNo.getText() + "'");
            tampil();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBaruActionPerformed
        // TODO add your handling code here:
        txtNo.setText("");
        txtTanggal.setText("");
        txtNoRmBayi.setText("");
        txtKdDokter.setText("");
        txtKdicd.setText("");
        txtKdTindakan.setText("");
        txtSuhuTubuh.setText("");
        txtTensi.setText("");
        txtHasil.setText("");
        txtKeterangan.setText("");
        txtKdImunisasi.setText("");
        txtImunke.setText("");
    }//GEN-LAST:event_tbBaruActionPerformed

    private void tabelRalanBayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRalanBayiMouseClicked
        // TODO add your handling code here:
        int i=tabelRalanBayi.getSelectedRow();
        if(i>-1){
            txtNo.setText(tabmode.getValueAt(i, 0).toString());
            txtTanggal.setText(tabmode.getValueAt(i, 1).toString());
            txtNoRmBayi.setText(tabmode.getValueAt(i, 2).toString());
            txtKdDokter.setText(tabmode.getValueAt(i, 3).toString());
            txtKdicd.setText(tabmode.getValueAt(i, 4).toString());
            txtKdTindakan.setText(tabmode.getValueAt(i, 5).toString());
            txtSuhuTubuh.setText(tabmode.getValueAt(i, 6).toString());
            txtTensi.setText(tabmode.getValueAt(i, 7).toString());
            txtHasil.setText(tabmode.getValueAt(i, 8).toString());
            txtKeterangan.setText(tabmode.getValueAt(i, 9).toString());
            txtKdImunisasi.setText(tabmode.getValueAt(i, 10).toString());
            txtImunke.setText(tabmode.getValueAt(i, 11).toString());
        }
    }//GEN-LAST:event_tabelRalanBayiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pasienbayi.setLocationRelativeTo(null);
        pasienbayi.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dokter.setLocationRelativeTo(null);
        dokter.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        penyakit.setLocationRelativeTo(null);
        penyakit.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tindakan.setLocationRelativeTo(null);
        tindakan.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        imunisasi.setLocationRelativeTo(null);
        imunisasi.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRalanBayi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRalanBayi dialog = new frmRalanBayi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRalanBayi;
    private javax.swing.JButton tbBaru;
    private javax.swing.JButton tbCari;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCariBayi;
    private javax.swing.JTextField txtCariDokter;
    private javax.swing.JTextField txtCariIcd;
    private javax.swing.JTextField txtCariImunisasi;
    private javax.swing.JTextField txtCariTindakan;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtImunke;
    private javax.swing.JTextField txtKdDokter;
    private javax.swing.JTextField txtKdImunisasi;
    private javax.swing.JTextField txtKdTindakan;
    private javax.swing.JTextField txtKdicd;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNoRmBayi;
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
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_jl_bayi.no, rawat_jl_bayi.tanggal, "
                    + "pasien_bayi.no_rm_bayi, dokter.nm_dokter, penyakit.nama_penyakit,"
                    + "tindakan.nama_tindakan, rawat_jl_bayi.suhu_tubuh, rawat_jl_bayi.tensi,"
                    + "rawat_jl_bayi.hasil, rawat_jl_bayi.keterangan, imunisasi.nm_imunisasi,"
                    + "rawat_jl_bayi.imunke from rawat_jl_bayi inner join pasien_bayi on rawat_jl_bayi.no_rm_bayi="
                    + "pasien_bayi.no_rm_bayi inner join dokter on rawat_jl_bayi.kd_dokter=dokter.kd_dokter "
                    + "inner join penyakit on rawat_jl_bayi.kd_icd=penyakit.kd_icd inner join tindakan on "
                    + "rawat_jl_bayi.kd_tindakan=tindakan.kode inner join imunisasi on "
                    + "rawat_jl_bayi.kd_imunisasi=imunisasi.id_imunisasi");
            while(rs.next()){
                String[] data={rs.getString(1),rs.getString(2),
                    rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),
                    rs.getString(7),rs.getString(8),
                    rs.getString(9),rs.getString(10),
                    rs.getString(11),rs.getString(12)
            };
            tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
