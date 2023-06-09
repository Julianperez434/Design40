/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.xml.ws.Dispatch;

/**
 *
 * @author Julián E. Pérez
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
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

        BackgroundPanel = new javax.swing.JPanel();
        IconImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingText = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackgroundPanel.setBackground(new java.awt.Color(255, 102, 0));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(940, 484));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pnglogo.png"))); // NOI18N
        BackgroundPanel.add(IconImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("de Empleados.");
        BackgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));
        BackgroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 454, 940, 30));

        LoadingText.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        LoadingText.setForeground(new java.awt.Color(255, 255, 255));
        LoadingText.setText("Cargando...");
        BackgroundPanel.add(LoadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        LoadingValue.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setText("0%");
        BackgroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de Información para el manejo");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neobackground.jpg"))); // NOI18N
        BackgroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-630, -20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        
        try {
            
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.LoadingValue.setText(i +"%");
                
                if (i==10){
                    sp.LoadingText.setText("Abriendo los modulos...");
                }
                if (i==20){
                    sp.LoadingText.setText("Cargando los modulos...");
                }
                if (i==50){
                    sp.LoadingText.setText("Conectando con MySQL...");
                }
                if (i==70){
                    sp.LoadingText.setText("¡Conección exitosa!");
                }
                if (i==80){
                    sp.LoadingText.setText("Abriendo aplicación...");
                }
                sp.LoadingBar.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        sp.setVisible(false);
        sp.dispose();
        new loginForm().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel IconImage;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingText;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
