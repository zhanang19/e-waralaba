/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Brian R
 */
import connector.config;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class toko2 extends javax.swing.JPanel {

    /**
     * Creates new form toko2
     */
//    Connection connection = config.Connection();
//    Statement statement;
//    ResultSet resultSet;
    public int id_toko2;

    public toko2() {
        initComponents();
//        this.id_toko2 = id;
//        tampilBarang(id_toko2);
    }

    public JTable getTable_barang() {
        return table_barang;
    }
//
    public void setTable_barang(JTable table_barang, DefaultTableModel table) {
        table_barang.setModel(table);
    }
//    
//    
//
//    public void tampilBarang(int id) {
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("Kode Barang");
//        model.addColumn("Nama Barang");
//        model.addColumn("Jumlah Stok");
//        model.addColumn("Harga");
//        try {
//            String sql = "select * from barang b join tb_barangtokoo tb on b.kode_barang = tb.kode_barang where tb.id =" + id_toko2;
//            System.out.println(id_toko2);
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//
//            int no = 0;
//            while (resultSet.next()) {
//                no++;
//                model.addRow(new Object[]{
//                    resultSet.getString("kode_barang"), resultSet.getString("nama_barang"), resultSet.getString("jumlah"), resultSet.getString("harga")
//                });
//            }
//            table_barang.setModel(model);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_barang = new javax.swing.JTable();
        pencarian = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(690, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Jumlah Stok", "Harga"
            }
        ));
        jScrollPane1.setViewportView(table_barang);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 670, 440));

        pencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pencarianKeyPressed(evt);
            }
        });
        add(pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 200, -1));

        jLabel1.setText("Pencarian");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pencarianKeyPressed
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("Kode Barang");
//        model.addColumn("Nama Barang");
//        model.addColumn("Jumlah Stok");
//        model.addColumn("Harga");
//        try {
//            String sql = "select * from barang b join tb_barangtokoo tb on b.kode_barang = tb.kode_barang where tb.id ="+id_toko2+" and nama_barang like '%" + pencarian.getText() + "%'";
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//            
//            int no = 0;
//            while (resultSet.next()) {
//                no++;
//                model.addRow(new Object[]{
//                    resultSet.getInt("kode_barang"), resultSet.getString("nama_barang"), resultSet.getInt("jumlah_stok"), resultSet.getInt("harga")
//                });
//            }
//            table_barang.setModel(model);
//        } catch (Exception e) {
//            System.out.println("asdkljlasdjlkasdj");
//            System.out.println(e.getMessage());
//        }
    }//GEN-LAST:event_pencarianKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pencarian;
    private javax.swing.JTable table_barang;
    // End of variables declaration//GEN-END:variables
}
