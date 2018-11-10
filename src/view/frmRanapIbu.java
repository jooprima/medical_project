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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jooprima
 */
public class frmRanapIbu extends javax.swing.JDialog {
    
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
    private frmKamar kamar=new frmKamar(null,false);
    private frmDokter dokter=new frmDokter(null,false);
    private frmPenyakit penyakit=new frmPenyakit(null,false);
    private frmTindakan tindakan=new frmTindakan(null,false);

    /**
     * Creates new form frmRanapIbu
     */
    public frmRanapIbu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String[] judul={"Nomor","Nama Ibu","Tanggal Masuk","Tanggal Pulang",
            "Lama","Kamar","ICD","Nama Dokter","Tindakan","Suhu Tubuh","Tensi",
            "Hasil","Keterangan"
        };
        tabmode=new DefaultTableModel(judul,0);
        tabelRanapIbu.setModel(tabmode);
        tampil();
        makecenter();
        pasienibu.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(pasienibu.getData().getRowCount()!=-1){
                    txtRekamIbu.setText(pasienibu.getMode().getValueAt(pasienibu.getData().getSelectedRow(),0).toString());
                    txtCrRmIbu.setText(pasienibu.getMode().getValueAt(pasienibu.getData().getSelectedRow(),1).toString());
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
        
        kamar.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(kamar.getData().getRowCount()!=-1){
                    txtKodeKamar.setText(kamar.getMode().getValueAt(kamar.getData().getSelectedRow(),0).toString());
                    txtCrKamar.setText(kamar.getMode().getValueAt(kamar.getData().getSelectedRow(),1).toString());
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
        
        dokter.getData().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(dokter.getData().getRowCount()!=-1){
                    txtKodeDokter.setText(dokter.getModel().getValueAt(dokter.getData().getSelectedRow(),0).toString());
                    txtCrDokter.setText(dokter.getModel().getValueAt(dokter.getData().getSelectedRow(),1).toString());
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
                    txtCrIcd.setText(penyakit.getModel().getValueAt(penyakit.getData().getSelectedRow(),1).toString());
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
                    txtCrTindakan.setText(tindakan.getModel().getValueAt(tindakan.getData().getSelectedRow(),1).toString());
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

        jButton6 = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbBaru = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbCetak = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRanapIbu = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtRekamIbu = new javax.swing.JTextField();
        txtTglMasuk = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtCrRmIbu = new javax.swing.JTextField();
        txtTglPulang = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        txtKodeKamar = new javax.swing.JTextField();
        txtCrKamar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKodeIcd = new javax.swing.JTextField();
        txtCrIcd = new javax.swing.JTextField();
        tbCari = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtKodeDokter = new javax.swing.JTextField();
        txtCrDokter = new javax.swing.JTextField();
        txtKodeTindakan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCrTindakan = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtSuhuTubuh = new javax.swing.JTextField();
        txtTensi = new javax.swing.JTextField();
        txtHasil = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtKeterangan = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton6.setText("...");

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

        tbCetak.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbCetak.setText("Cetak");

        tbKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });

        tabelRanapIbu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelRanapIbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRanapIbuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRanapIbu);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("No. :");

        jButton1.setText("...");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA RAWAT INAP IBU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Kode Icd :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Kode Kamar :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Lama :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Tanggal Pulang :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tanggal Masuk :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("No. Rekam Ibu:");

        tbCari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbCari.setText("Cari");
        tbCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCariActionPerformed(evt);
            }
        });

        jButton3.setText("...");

        jButton4.setText("...");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Kode Tindakan :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Kode Dokter :");

        jButton5.setText("...");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Hasil :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Tensi :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Suhu Tubuh :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Keterangan :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Keyword :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtRekamIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCrRmIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))
                                            .addComponent(txtTglPulang, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtKodeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCrKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(21, 21, 21)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtKodeDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCrDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtKodeTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCrTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5))
                                    .addComponent(txtTensi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSuhuTubuh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtKodeIcd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCrIcd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
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
                        .addComponent(tbKeluar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbCari)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRekamIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(txtCrRmIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtKodeDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCrDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtKodeTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCrTindakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtSuhuTubuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTglPulang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKodeKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCrKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel14)
                    .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKodeIcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCrIcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbCari)
                    .addComponent(tbSimpan)
                    .addComponent(tbEdit)
                    .addComponent(tbBaru)
                    .addComponent(tbHapus)
                    .addComponent(tbCetak)
                    .addComponent(tbKeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().executeUpdate("insert into rawat_inap_ibu values"+
                "('"+txtNo.getText()+
                "','"+txtRekamIbu.getText()+
                "','"+txtTglMasuk.getText()+
                "','"+txtTglPulang.getText()+
                "','"+txtLama.getText()+
                "','"+txtKodeKamar.getText()+
                "','"+txtKodeIcd.getText()+
                "','"+txtKodeDokter.getText()+
                "','"+txtKodeTindakan.getText()+
                "','"+txtSuhuTubuh.getText()+
                "','"+txtTensi.getText()+
                "','"+txtHasil.getText()+
                "','"+txtKeterangan.getText()+"')");
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
            rs.execute("update rawat_inap_ibu set no_rm_ibu= '"+
                txtRekamIbu.getText() + "' ,tgl_masuk='" +
                txtTglMasuk.getText() + "' ,tgl_pulang='" +
                txtTglPulang.getText() + "' ,lama='" +
                txtLama.getText() + "' ,kd_kamar='" +
                txtKodeKamar.getText() + "' ,kd_icd='" +
                txtKodeIcd.getText() + "' ,kd_dokter='" +
                txtKodeDokter.getText() + "' ,kode_tindakan='" +
                txtKodeTindakan.getText() + "' ,suhu_tubuh='" +
                txtSuhuTubuh.getText() + "' ,tensi='" +
                txtTensi.getText() + "' ,hasil='" +
                txtHasil.getText() + "' ,keterangan='" +
                txtKeterangan.getText() + "' ,where no='" +
                txtNo.getText() + "'");
            tampil();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBaruActionPerformed
        // TODO add your handling code here:
        txtNo.setText("");
        txtRekamIbu.setText("");
        txtTglMasuk.setText("");
        txtTglPulang.setText("");
        txtLama.setText("");
        txtKodeKamar.setText("");
        txtKodeIcd.setText("");
        txtKodeDokter.setText("");
        txtKodeTindakan.setText("");
        txtSuhuTubuh.setText("");
        txtTensi.setText("");
        txtHasil.setText("");
        txtKeterangan.setText("");
    }//GEN-LAST:event_tbBaruActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            koneksi.createStatement().execute("delete from rawat_inap_ibu where no= '" +
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

    private void tabelRanapIbuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRanapIbuMouseClicked
        // TODO add your handling code here:
        int i=tabelRanapIbu.getSelectedRow();
        if(i<-1){
            txtNo.setText(tabmode.getValueAt(i, 0).toString());
            txtCrRmIbu.setText(tabmode.getValueAt(i, 0).toString());
            txtTglMasuk.setText(tabmode.getValueAt(i, 0).toString());
            txtTglPulang.setText(tabmode.getValueAt(i, 0).toString());
            txtLama.setText(tabmode.getValueAt(i, 0).toString());
            txtCrKamar.setText(tabmode.getValueAt(i, 0).toString());
            txtCrIcd.setText(tabmode.getValueAt(i, 0).toString());
            txtCrDokter.setText(tabmode.getValueAt(i, 0).toString());
            txtCrTindakan.setText(tabmode.getValueAt(i, 0).toString());
            txtSuhuTubuh.setText(tabmode.getValueAt(i, 0).toString());
            txtTensi.setText(tabmode.getValueAt(i, 0).toString());
            txtHasil.setText(tabmode.getValueAt(i, 0).toString());
            txtKeterangan.setText(tabmode.getValueAt(i, 0).toString());
        }
    }//GEN-LAST:event_tabelRanapIbuMouseClicked

    private void tbCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCariActionPerformed
        int row=tabmode.getRowCount();
        for(int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            // TODO add your handling code here:
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select * from rawat_inap_ibu where no like '%"+
                txtCari.getText()+"%' or no_rm_bayi like '%"+
                txtCari.getText()+"%' or tgl_masuk like '%"+
                txtCari.getText()+"%' or tgl_pulang like '%"+
                txtCari.getText()+"%' or lama like '%"+
                txtCari.getText()+"%' or kd_kamar like '%"+
                txtCari.getText()+"%' or kd_icd like '%"+
                txtCari.getText()+"%' or kd_dokter like '%"+
                txtCari.getText()+"%' or kode_tindakan like '%"+
                txtCari.getText()+"%' or suhu_tubuh like '%"+
                txtCari.getText()+"%' or tensi like '%"+
                txtCari.getText()+"%' or hasil like '%"+
                txtCari.getText()+"%' or keterangan like '%"+
                txtCari.getText()+"%'");
            while(rs.next()){
                String[] data={rs.getString(1),rs.getString(2),
                    rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),
                    rs.getString(7),rs.getString(8),
                    rs.getString(9),rs.getString(10),
                    rs.getString(11),rs.getString(12),
                    rs.getString(13)
                };
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tbCariActionPerformed

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
            java.util.logging.Logger.getLogger(frmRanapIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRanapIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRanapIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRanapIbu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRanapIbu dialog = new frmRanapIbu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelRanapIbu;
    private javax.swing.JButton tbBaru;
    private javax.swing.JButton tbCari;
    private javax.swing.JButton tbCetak;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtCrDokter;
    private javax.swing.JTextField txtCrIcd;
    private javax.swing.JTextField txtCrKamar;
    private javax.swing.JTextField txtCrRmIbu;
    private javax.swing.JTextField txtCrTindakan;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtKodeDokter;
    private javax.swing.JTextField txtKodeIcd;
    private javax.swing.JTextField txtKodeKamar;
    private javax.swing.JTextField txtKodeTindakan;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtRekamIbu;
    private javax.swing.JTextField txtSuhuTubuh;
    private javax.swing.JTextField txtTensi;
    private javax.swing.JTextField txtTglMasuk;
    private javax.swing.JTextField txtTglPulang;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
        int row=tabmode.getRowCount();
        for(int i=0;i<row;i++){
            tabmode.removeRow(0);
        }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/medica","root","");
            ResultSet rs=koneksi.createStatement().executeQuery("select rawat_inap_ibu.no, pasien_ibu.nm_pasien, "
                    + "rawat_inap_ibu.tgl_masuk, rawat_inap_ibu.tgl_pulang, rawat_inap_ibu.lama, "
                    + "kamar.nm_kamar, penyakit.nama_penyakit, dokter.nm_dokter, tindakan.nama_tindakan, "
                    + "rawat_inap_ibu.suhu_tubuh, rawat_inap_ibu.tensi, rawat_inap_ibu.hasil, "
                    + "rawat_inap_ibu.keterangan from rawat_inap_ibu "
                    + "inner join pasien_ibu on rawat_inap_ibu.no_rm_ibu=pasien_ibu.no_rm_ibu "
                    + "inner join kamar on rawat_inap_ibu.kd_kamar=kamar.kd_kamar "
                    + "inner join penyakit on rawat_inap_ibu.kd_icd=penyakit.kd_icd "
                    + "inner join dokter on rawat_inap_ibu.kd_dokter=dokter.kd_dokter "
                    + "inner join tindakan on rawat_inap_ibu.kode_tindakan=tindakan.kode");
            while(rs.next()){
                String[] data={rs.getString(1),rs.getString(2),
                    rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),
                    rs.getString(7),rs.getString(8),
                    rs.getString(9),rs.getString(10),
                    rs.getString(11),rs.getString(12),
                    rs.getString(13)
                };
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
 }

