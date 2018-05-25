/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.toedter.calendar.JDateChooser;
import connector.config;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brian R
 */
public class toko1 extends javax.swing.JPanel {

    Connection connection = config.Connection();
    Statement statement;
    ResultSet resultSet;

    public toko1() {
        initComponents();
    }

    public JTextField getId_penjualan() {
        return id_penjualan;
    }

    public void setId_penjualan(String id_penjualan) {
        this.id_penjualan.setText(id_penjualan);
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public JButton getBtnSimpan() {
        return btnSimpan;
    }

    public JButton getBtnUbah() {
        return btnUbah;
    }

    public JTextField getJumlah_terjual() {
        return jumlah_terjual;
    }

    public JDateChooser Tanggal() {
        tanggal.setDateFormatString("yyyy-MM-dd");
        return this.tanggal;
    }

    public String getTanggal(JDateChooser a) {
        String tanggal = ((JTextField) a.getDateEditor().getUiComponent()).getText();
        return tanggal;
    }

    public void setJumlah_terjual(String jumlah_terjual) {
        this.jumlah_terjual.setText(jumlah_terjual);
    }

    public void setDdToko(String ddToko) {
        this.ddToko.addItem(ddToko);
    }

    public JComboBox<String> getDdToko() {
        return ddToko;
    }

    public JTable getTable_penjualan() {
        return table_penjualan;
    }

    public void setTabelToko1(DefaultTableModel tabel) {
        this.table_penjualan.setModel(tabel);
    }

    public void setTabel(JTable t, DefaultTableModel tabel) {
        t.setModel(tabel);
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
        jumlah_terjual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_penjualan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ddToko = new javax.swing.JComboBox<>();
        tanggal = new com.toedter.calendar.JDateChooser();
        id_penjualan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(690, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tanggal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel2.setText("Barang");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jumlah_terjual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_terjualActionPerformed(evt);
            }
        });
        add(jumlah_terjual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 110, -1));

        table_penjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Kode Barang", "Tanggal", "Jumlah Terjual"
            }
        ));
        table_penjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_penjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_penjualan);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 77, 410, 470));

        jLabel3.setText("Jumlah Terjual");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSimpan.png"))); // NOI18N
        btnSimpan.setBorderPainted(false);
        btnSimpan.setContentAreaFilled(false);
        add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, -1));

        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnUbah.png"))); // NOI18N
        btnUbah.setBorderPainted(false);
        btnUbah.setContentAreaFilled(false);
        add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 130, -1));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnReset.png"))); // NOI18N
        btnReset.setToolTipText("");
        btnReset.setBorderPainted(false);
        btnReset.setContentAreaFilled(false);
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, -1));

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnHapus.png"))); // NOI18N
        btnHapus.setBorderPainted(false);
        btnHapus.setContentAreaFilled(false);
        add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 130, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 170, -1));

        jLabel4.setText("Pencarian");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        add(ddToko, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 130, -1));

        tanggal.setDateFormatString("yyyy-MM-dd");
        add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, -1));
        add(id_penjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, -1));

        jLabel5.setText("Id");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jumlah_terjualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_terjualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_terjualActionPerformed

    private void table_penjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_penjualanMouseClicked
        int baris = table_penjualan.getSelectedRow();
        id_penjualan.setText(table_penjualan.getModel().getValueAt(baris, 0).toString());
        tanggal.setDate(Date.valueOf(table_penjualan.getModel().getValueAt(baris, 2).toString()));
        jumlah_terjual.setText(table_penjualan.getModel().getValueAt(baris, 3).toString());
    }//GEN-LAST:event_table_penjualanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> ddToko;
    private javax.swing.JTextField id_penjualan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jumlah_terjual;
    private javax.swing.JTable table_penjualan;
    private com.toedter.calendar.JDateChooser tanggal;
    // End of variables declaration//GEN-END:variables
}
