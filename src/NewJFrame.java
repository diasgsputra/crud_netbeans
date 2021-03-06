import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//import static sun.net.www.MimeTable.loadTable;

public class NewJFrame extends javax.swing.JFrame {

    static final String DBurl = "jdbc:mysql://localhost/panitia";
    static final String DBuser = "root";
    static final String DBpass = "";
    
    static Connection con;
    static Statement st;
    static ResultSet rs;
    
    ///////
    
    public NewJFrame() {
        initComponents();
        load_tabel();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tnim = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        binput = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        tnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnimActionPerformed(evt);
            }
        });

        binput.setText("Input");
        binput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binputActionPerformed(evt);
            }
        });

        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnama, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(tnim))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(binput)
                        .addGap(88, 88, 88)
                        .addComponent(bedit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bhapus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binput)
                    .addComponent(bedit)
                    .addComponent(bhapus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "NIM"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnimActionPerformed

    private void binputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binputActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection(DBurl,DBuser,DBpass);
        st = con.createStatement();
        st.executeUpdate("INSERT INTO baksos(nama,nim)"+
                "VALUES('"+ tnama.getText()+"','"+tnim.getText()+"')");
        JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan!","Hasil",
                JOptionPane.INFORMATION_MESSAGE);
        load_tabel();
        st.close();
        con.close();
        
        }
    catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Data gagal ditampilkan","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
    catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Driver tidak ditemukan","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
        
    }//GEN-LAST:event_binputActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection(DBurl,DBuser,DBpass);
        st = con.createStatement();
        String sql = "update baksos set nama = '"+tnama.getText()+
                "'"+", nim = '"+tnim.getText()+
                "' where nim = '"+
                tnim.getText()+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan!","Hasil",
                JOptionPane.INFORMATION_MESSAGE);
        
        st.close();
        con.close();
        kosong();
        load_tabel();
        
        }
    catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Data gagal ditampilkan","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
    catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Driver tidak diubah","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_beditActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = tabel.rowAtPoint(evt.getPoint());
        tnama.setText(tabel.getValueAt(row, 0).toString());
        tnim.setText(tabel.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tabelMouseClicked

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection(DBurl,DBuser,DBpass);
        st = con.createStatement();
        String sql = "delete from baksos where nim = '"+tnim.getText()+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus!","Hasil",
                JOptionPane.INFORMATION_MESSAGE);
        
        st.close();
        con.close();
        kosong();
        load_tabel();
        
        }
    catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Data gagal ditampilkan","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
    catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Driver tidak ditemukan","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
        
    }//GEN-LAST:event_bhapusActionPerformed
    
    private void kosong(){
        tnama.setText(null);
        tnim.setText(null);
    }
    
    private void load_tabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("NIM");
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(DBurl,DBuser,DBpass);
        st = con.createStatement();
        String sql = "select * from baksos";
        rs = st.executeQuery(sql);
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString(2),rs.getString(3)
        });
        }
        st.close();
        con.close();
        tabel.setModel(model);
    }
    catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Data gagal ditampilkan","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
    catch(ClassNotFoundException ex){
        JOptionPane.showMessageDialog(null, "Driver tidak ditemukan","Hasil",
        JOptionPane.INFORMATION_MESSAGE);
    }
        
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton binput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnim;
    // End of variables declaration//GEN-END:variables
}
