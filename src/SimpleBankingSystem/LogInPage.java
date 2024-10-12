/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleBankingSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jowie james
 */
public class LogInPage extends javax.swing.JFrame {

    String usersFilePath = "C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\LoginApp\\LoginApp\\UsersAccount.txt";
    String AdminsFilePath = "C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\LoginApp\\LoginApp\\AdminAccount.txt";
    ArrayList<String> all_Auname = new ArrayList<>();
    ArrayList<String> all_emails = new ArrayList<>();
    ArrayList<String> all_BankNO = new ArrayList<>();
    ArrayList<String> all_Passcode = new ArrayList<>();
    Map<String, String> BankNANDownames = new HashMap<>();
    Map<String, String> AusernamesANDpasscode = new HashMap<>();
    Map<String, String> usernamesANDpasscode = new HashMap<>();

    public LogInPage() {
        initComponents();

        getUsers();
        for (String uname : all_BankNO) {

            System.out.println(uname);
        }

    }

    public void getUsers() {

        File f = new File(usersFilePath);
        String bankNo = "";
        String passcode = "";

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();
            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(": ");
                if (row[0].equals("Name")) {
                    bankNo = row[1];
                    all_emails.add(bankNo);
                } else if (row[0].equals("Passcode")) {
                    passcode = row[1];
                }
                if (!bankNo.equals("") && !passcode.equals("")) {
                    usernamesANDpasscode.put(bankNo, passcode);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LogPasscode = new javax.swing.JPasswordField();
        jSignIn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSignuo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SImple Banking System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Sign In");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("User No.");

        LogUsername.setBackground(new java.awt.Color(255, 255, 255));
        LogUsername.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 16)); // NOI18N
        LogUsername.setForeground(new java.awt.Color(51, 51, 51));
        LogUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Passcode");

        LogPasscode.setBackground(new java.awt.Color(255, 255, 255));
        LogPasscode.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        LogPasscode.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jSignIn.setBackground(new java.awt.Color(63, 106, 145));
        jSignIn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jSignIn.setForeground(new java.awt.Color(255, 255, 255));
        jSignIn.setText("SIGN IN");
        jSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignInActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Futura Md BT", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Login to Your Account");

        jSignuo.setBackground(new java.awt.Color(255, 255, 255));
        jSignuo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jSignuo.setForeground(new java.awt.Color(88, 146, 199));
        jSignuo.setText("Sign Up");
        jSignuo.setBorder(null);
        jSignuo.setBorderPainted(false);
        jSignuo.setContentAreaFilled(false);
        jSignuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignuoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Don't have an Account?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LogUsername)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(LogPasscode, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSignuo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogPasscode, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(jSignuo)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo (1)_1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simple Banking System");

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel6))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignInActionPerformed
        //SIGN IN BUTTON

        File a = new File(AdminsFilePath);
        File b = new File(usersFilePath);
        String usrname = LogUsername.getText();
        String pass = String.valueOf(LogPasscode.getPassword());
        String Uname = "";
        String Ustreet = "";
        String Ucity = "";
        String Uemail = "";
        String Ubal = "";
        String Uphone = "";
        

        if (usrname.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out the fields");
        } else {
            if (usrname.contains("admin") && pass.contains("admin123")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                AdminDashboard ad = new AdminDashboard();
                ad.setVisible(true);
                this.dispose();

            } else {
                //Read user acc
                try {
                    FileReader fr = new FileReader(b);
                    BufferedReader br = new BufferedReader(fr);

                    String[] userData;
                    String currentBankNo = "";
                    String currentPasscode = "";

                    while (br.ready()) {
                        String line = br.readLine();
                        userData = line.split(": "); // Initialize userData here
                        if (userData.length > 1) { // Check if userData is initialized
                            if (userData[0].equals("BankNo")) {
                                currentBankNo = userData[1];
                            } else if (userData[0].equals("Passcode")) {
                                currentPasscode = userData[1];
                            } else if (userData[0].equals("Name")) {
                                Uname = userData[1];
                            } else if (userData[0].equals("Street")) {
                                Ustreet = userData[1];
                            } else if (userData[0].equals("City")) {
                                Ucity = userData[1];
                            } else if (userData[0].equals("PhoneN")) {
                                Uphone = userData[1];
                            } else if (userData[0].equals("Email")) {
                                Uemail = userData[1];
                            } else if (userData[0].equals("Balance")) {
                                Ubal = userData[1];
                            }
                        }
                        if (!currentBankNo.isEmpty() && !currentPasscode.isEmpty()) {
                            if (currentBankNo.equals(usrname) && currentPasscode.equals(pass)) {
                                // Display success message and open the new window

                                MightFinal mf = new MightFinal();
                                mf.Format.setText(currentBankNo);
                                mf.checkBal.setText(Ubal);
                                mf.dBankNo.setText(currentBankNo);
                                mf.wBankNo.setText(currentBankNo);
                                mf.cFName.setText(Uname);
                                mf.dCName.setText(Uname);
                                mf.WdpFName.setText(Uname);
                                mf.AccName.setText(Uname);
                                mf.AccStreet.setText(Ustreet);
                                mf.AccCity.setText(Ucity);
                                mf.AccEmail.setText(Uemail);
                                mf.AccPhoneN.setText(Uphone);
                                mf.AccBankNo.setText(currentBankNo);
                                mf.DdpBal.setText(Ubal);
                                mf.WdpBal.setText(Ubal);

                                JOptionPane.showMessageDialog(this, "Login Successful!");
                                mf.setVisible(true);
                                this.dispose();
                                return;
                            } else {
                                currentBankNo = "";
                                currentPasscode = "";
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(this, "Something Error. Please try again!");

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                } catch (IOException ex) {
                    Logger.getLogger(LogInPage.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
            }

        }


    }//GEN-LAST:event_jSignInActionPerformed

    private void jSignuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignuoActionPerformed
        CreateAcc ca = new CreateAcc();
        ca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSignuoActionPerformed

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
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField LogPasscode;
    public javax.swing.JTextField LogUsername;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jSignIn;
    private javax.swing.JButton jSignuo;
    // End of variables declaration//GEN-END:variables
}