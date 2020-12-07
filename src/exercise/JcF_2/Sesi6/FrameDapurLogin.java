/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.JcF_2.Sesi6;

import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author WH
 */
public class FrameDapurLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameDapurLogin
     */
    int coba;
    String folderData = "D:/java/exercise/src/exercise/jcf_2/Sesi6/";
    String userName, pass, emailMasuk;
    String adminEmail = "admin@home.com";

    public FrameDapurLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        labelImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldPassword = new javax.swing.JTextField();
        labelForgetPassword = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exercise/JcF_2/Sesi4/image/Steak-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(labelImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cridentials"));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Username : ");

        textFieldUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldUserNameFocusLost(evt);
            }
        });
        textFieldUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldUserNameKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Password : ");

        textFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldPasswordFocusLost(evt);
            }
        });
        textFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldPasswordKeyTyped(evt);
            }
        });

        labelForgetPassword.setForeground(new java.awt.Color(51, 51, 255));
        labelForgetPassword.setText("Forgot Password ?");
        labelForgetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelForgetPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelForgetPasswordMouseClicked(evt);
            }
        });

        buttonLogin.setMnemonic('L');
        buttonLogin.setText("Login");
        buttonLogin.setEnabled(false);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldUserName)
                    .addComponent(textFieldPassword)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelForgetPassword)
                        .addGap(26, 26, 26)
                        .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelForgetPassword)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        loginAttempt();
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void loginAttempt() {
        userName = textFieldUserName.getText();
        pass = textFieldPassword.getText();
        boolean hasil = searchDatabase(true);
        if (hasil) {
            JOptionPane.showMessageDialog(null, "Selamat Datang pada Aplikasi Kami",
                    "System", JOptionPane.ERROR_MESSAGE);
        } else {
            coba++;
            if (coba < 3) {
            } else {
                JOptionPane.showMessageDialog(null, "Limit 3x login error!",
                        "Administrator Notification", JOptionPane.ERROR_MESSAGE);
                kirimEmail(adminEmail);
                System.exit(0);
            }
        }
    }

    private void kirimEmail(String emailIn) {
        String to = emailIn;
        String from = "pengirim@sini.com";
        String username = from;
        String pass = "katakunci";

        // konfigurasi smtp server
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

// Get the default Session object.
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, pass);
            }
        });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Judul disini");
            message.setText("Text pesan didalam email");
            Transport.send(message);

            System.out.println("Sent message sukses....");
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }
}

private boolean searchDatabase(boolean checkPasswordIn) {
        String data, dataHasilBaca[];
        boolean userTerdaftar = false;
        boolean hasilKetemu = false;
        // baca
        File fileUser = new File(folderData + "user.inf");
        try {
            FileReader bacaFile = new FileReader(fileUser);
            BufferedReader buff = new BufferedReader(bacaFile);
            while ((data = buff.readLine()) != null) {
                dataHasilBaca = data.split(",");
                if (userName.equals(dataHasilBaca[0])) {
                    userTerdaftar = true;
                    // checkPasswordIn...true : bila login benar dan lanjut cek password
                    if (checkPasswordIn) {
                        if (pass.equals(dataHasilBaca[1])) {
                            hasilKetemu = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Password anda salah", "System", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        // checkPasswordIn...false : bila login benar dan password lupa 
                        // (tanpa cek pssw hanya cek login)
                        if (emailMasuk.equals(dataHasilBaca[2])) {
                            hasilKetemu = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Email registered Login not found!",
                                    "System", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                } else {
                    userTerdaftar = false;
                }
            }
            buff.close();
            if (!userTerdaftar) {
                JOptionPane.showMessageDialog(null, "Nama anda belum terdaftar pada sistem", "System", JOptionPane.ERROR_MESSAGE);
            }
            return hasilKetemu;

        





} catch (Exception ex) {
            Logger.getLogger(FrameDapurLogin.class



.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void textFieldUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldUserNameFocusGained
        textFieldUserName.setBackground(Color.yellow);
    }//GEN-LAST:event_textFieldUserNameFocusGained

    private void textFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPasswordFocusGained
        textFieldPassword.setBackground(Color.yellow);
    }//GEN-LAST:event_textFieldPasswordFocusGained

    private void textFieldUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldUserNameFocusLost
        textFieldUserName.setBackground(null);
    }//GEN-LAST:event_textFieldUserNameFocusLost

    private void textFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldPasswordFocusLost
        textFieldPassword.setBackground(null);
    }//GEN-LAST:event_textFieldPasswordFocusLost

    private void textFieldUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUserNameKeyTyped
        toggleButtonLogin();
    }//GEN-LAST:event_textFieldUserNameKeyTyped

    private void textFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPasswordKeyTyped
        toggleButtonLogin();
    }//GEN-LAST:event_textFieldPasswordKeyTyped

    private void labelForgetPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForgetPasswordMouseClicked
        userName = textFieldUserName.getText();
        emailMasuk = JOptionPane.showInputDialog("Masukkan email anda :");
        if (searchDatabase(false)) {
            kirimEmail(emailMasuk);
            System.out.println("kirim email password");
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_labelForgetPasswordMouseClicked

    private void toggleButtonLogin() {
        // klu kosong button login disable
        if (isEmpty(textFieldUserName) && isEmpty(textFieldPassword)) {
            buttonLogin.setEnabled(false);
        } else {
            buttonLogin.setEnabled(true);
        }
    }

    private boolean isEmpty(JTextField compIn) {
        return !(compIn.getText().length() > 1);
    }

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
            java.util.logging.Logger.getLogger(FrameDapurLogin.class



.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        





} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDapurLogin.class



.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        





} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDapurLogin.class



.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        





} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDapurLogin.class



.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDapurLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelForgetPassword;
    private javax.swing.JLabel labelImage;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldUserName;
    // End of variables declaration//GEN-END:variables
}