
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TicTacToe extends javax.swing.JFrame  {
    
    private String startGame="X";
    private int xcount=0;
    private int ocount=0;

    
    /**
     * Creates new form TicTacToe
     */
    
    
    public TicTacToe() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
        
        
    }

    private void gameScore()
    {
        player1.setText(String.valueOf(xcount));
        player2.setText(String.valueOf(ocount));    
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
             startGame="O";
             
        }
        else
        {
             startGame="X";
        }
            
            }
    private void winningGame()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1==("X") && b2==("X") && b3==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
            
        }
        
         if(b4==("X") && b5==("X") && b6==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton4.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton6.setBackground(Color.CYAN);
            
        }
          if(b7==("X") && b8==("X") && b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton7.setBackground(Color.CYAN);
            jButton8.setBackground(Color.CYAN);
            jButton9.setBackground(Color.CYAN);
            
        }
            if(b1==("X") && b4==("X") && b7==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton1.setBackground(Color.MAGENTA);
            jButton4.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
            
        }
             if(b2==("X") && b5==("X") && b8==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton2.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton8.setBackground(Color.PINK);
        }
              if(b3==("X") && b6==("X") && b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton3.setBackground(Color.MAGENTA);
            jButton6.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
        }
               if(b1==("X") && b5==("X") && b9==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton1.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton9.setBackground(Color.PINK);
        }
                if(b3==("X") && b5==("X") && b7==("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            jButton3.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton7.setBackground(Color.CYAN);
        }
                if(b1==("O") && b2==("O") && b3==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
            
        }
        
                 if(b4==("O") && b5==("O") && b6==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton4.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton6.setBackground(Color.CYAN);
            
        }
          if(b7==("O") && b8==("O") && b9==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton7.setBackground(Color.CYAN);
            jButton8.setBackground(Color.CYAN);
            jButton9.setBackground(Color.CYAN);
            
        }
            if(b1==("O") && b4==("O") && b7==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton1.setBackground(Color.MAGENTA);
            jButton4.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
            
        }
             if(b2==("O") && b5==("O") && b8==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton2.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton8.setBackground(Color.PINK);
        }
              if(b3==("O") && b6==("O") && b9==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton3.setBackground(Color.MAGENTA);
            jButton6.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
        }
               if(b1==("O") && b5==("O") && b9==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton1.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton9.setBackground(Color.PINK);
        }
                if(b3==("O") && b5==("O") && b7==("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            jButton3.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton7.setBackground(Color.CYAN);
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

        jLabel1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        panel4 = new java.awt.Panel();
        jButton2 = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        jButton3 = new javax.swing.JButton();
        panel6 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        panel7 = new java.awt.Panel();
        player1 = new javax.swing.JLabel();
        panel8 = new java.awt.Panel();
        jButton4 = new javax.swing.JButton();
        panel9 = new java.awt.Panel();
        jButton5 = new javax.swing.JButton();
        panel10 = new java.awt.Panel();
        jButton6 = new javax.swing.JButton();
        panel11 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        panel12 = new java.awt.Panel();
        player2 = new javax.swing.JLabel();
        panel15 = new java.awt.Panel();
        jButton7 = new javax.swing.JButton();
        panel16 = new java.awt.Panel();
        jButton8 = new javax.swing.JButton();
        panel17 = new java.awt.Panel();
        jButton9 = new javax.swing.JButton();
        panel14 = new java.awt.Panel();
        jreset = new javax.swing.JButton();
        panel13 = new java.awt.Panel();
        jexit = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tic Tac Toe");
        panel1.add(jLabel2, java.awt.BorderLayout.NORTH);

        panel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        panel3.setBackground(new java.awt.Color(102, 102, 102));
        panel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel3.add(jButton1, java.awt.BorderLayout.CENTER);

        panel2.add(panel3);

        panel4.setBackground(new java.awt.Color(102, 102, 102));
        panel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel4.add(jButton2, java.awt.BorderLayout.CENTER);

        panel2.add(panel4);

        panel5.setBackground(new java.awt.Color(102, 102, 102));
        panel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel5.add(jButton3, java.awt.BorderLayout.CENTER);

        panel2.add(panel5);

        panel6.setBackground(new java.awt.Color(102, 102, 102));
        panel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel3.setText("Player X:");
        panel6.add(jLabel3, java.awt.BorderLayout.CENTER);

        panel2.add(panel6);

        panel7.setBackground(new java.awt.Color(102, 102, 102));
        panel7.setLayout(new java.awt.BorderLayout());

        player1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel7.add(player1, java.awt.BorderLayout.CENTER);

        panel2.add(panel7);

        panel8.setBackground(new java.awt.Color(102, 102, 102));
        panel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel8.add(jButton4, java.awt.BorderLayout.CENTER);

        panel2.add(panel8);

        panel9.setBackground(new java.awt.Color(102, 102, 102));
        panel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel9.add(jButton5, java.awt.BorderLayout.CENTER);

        panel2.add(panel9);

        panel10.setBackground(new java.awt.Color(102, 102, 102));
        panel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panel10.add(jButton6, java.awt.BorderLayout.CENTER);

        panel2.add(panel10);

        panel11.setBackground(new java.awt.Color(102, 102, 102));
        panel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel5.setText("Player O:");
        panel11.add(jLabel5, java.awt.BorderLayout.CENTER);

        panel2.add(panel11);

        panel12.setBackground(new java.awt.Color(102, 102, 102));
        panel12.setLayout(new java.awt.BorderLayout());

        player2.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        player2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel12.add(player2, java.awt.BorderLayout.CENTER);

        panel2.add(panel12);

        panel15.setBackground(new java.awt.Color(102, 102, 102));
        panel15.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel15.add(jButton7, java.awt.BorderLayout.CENTER);

        panel2.add(panel15);

        panel16.setBackground(new java.awt.Color(102, 102, 102));
        panel16.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel16.add(jButton8, java.awt.BorderLayout.CENTER);

        panel2.add(panel16);

        panel17.setBackground(new java.awt.Color(102, 102, 102));
        panel17.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 80)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panel17.add(jButton9, java.awt.BorderLayout.CENTER);

        panel2.add(panel17);

        panel14.setBackground(new java.awt.Color(102, 102, 102));
        panel14.setLayout(new java.awt.BorderLayout());

        jreset.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jreset.setText("Reset");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        panel14.add(jreset, java.awt.BorderLayout.CENTER);

        panel2.add(panel14);

        panel13.setBackground(new java.awt.Color(102, 102, 102));
        panel13.setLayout(new java.awt.BorderLayout());

        jexit.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        panel13.add(jexit, java.awt.BorderLayout.CENTER);

        panel2.add(panel13);

        panel1.add(panel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton1.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton1.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
        winningGame();
          
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

         jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton3.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton3.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
          winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed

        frame =new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic Tac Toe",
             JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION);
        {
            System.exit(0);
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jexitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton2.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton3.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
          winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton4.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton4.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
          winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

         jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton5.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton5.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
          winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton6.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton6.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
          winningGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

         jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton7.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton7.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
  winningGame();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton8.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton8.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
          winningGame();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

 jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
             jButton9.setForeground(Color.GREEN);
             
             
        }
        else
        {
             jButton9.setForeground(Color.BLUE);
        }
            
        choose_a_Player();
          winningGame();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
          jButton1.setText(null);
          jButton2.setText(null);
          jButton3.setText(null);
          jButton4.setText(null);
          jButton5.setText(null);
          jButton6.setText(null);
          jButton7.setText(null);
          jButton8.setText(null);
          jButton9.setText(null);
          
          jButton1.setBackground(Color.LIGHT_GRAY);
          jButton2.setBackground(Color.LIGHT_GRAY);
          jButton3.setBackground(Color.LIGHT_GRAY);
          
          jButton4.setBackground(Color.LIGHT_GRAY);
          jButton5.setBackground(Color.LIGHT_GRAY);
          jButton6.setBackground(Color.LIGHT_GRAY);
          
          jButton7.setBackground(Color.LIGHT_GRAY);
          jButton8.setBackground(Color.LIGHT_GRAY);
          jButton9.setBackground(Color.LIGHT_GRAY);
          
          
        // TODO add your handling code here:
    }//GEN-LAST:event_jresetActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jreset;
    private java.awt.Panel panel1;
    private java.awt.Panel panel10;
    private java.awt.Panel panel11;
    private java.awt.Panel panel12;
    private java.awt.Panel panel13;
    private java.awt.Panel panel14;
    private java.awt.Panel panel15;
    private java.awt.Panel panel16;
    private java.awt.Panel panel17;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    // End of variables declaration//GEN-END:variables
}
