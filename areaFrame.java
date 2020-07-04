package tictactoe;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author serca
 */
public class areaFrame extends javax.swing.JFrame {

    public static int countTurn=0;
    public static int userWon=0;
    public static int pcWon=0;

    public static void scoreBoard()
    {
        jLabel5.setText(Integer.toString(userWon));
        jLabel4.setText(Integer.toString(pcWon));
    }
    
    public static void winnerCheck()
    {

        Boolean gameOver=true;
        String pc="O";
        String user="X";
        while(gameOver)
            {      
                if(jB1.getText().equalsIgnoreCase(user) && jB2.getText().equalsIgnoreCase(user) && jB3.getText().equalsIgnoreCase(user))
                {
                    jB1.setBackground(Color.green);
                    jB2.setBackground(Color.green);
                    jB3.setBackground(Color.green);
                    userWon++;
                    JOptionPane.showMessageDialog(null, "user won");
                    gameOver=false;
                    newGame();

                }    
                if(jB4.getText().equalsIgnoreCase(user) && jB5.getText().equalsIgnoreCase(user) && jB6.getText().equalsIgnoreCase(user))
                {
                    jB4.setBackground(Color.green);
                    jB5.setBackground(Color.green);
                    jB6.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "user won");
                    userWon++;
                    gameOver=false;
                    newGame();
                }   
                if(jB7.getText().equalsIgnoreCase(user) && jB8.getText().equalsIgnoreCase(user) && jB9.getText().equalsIgnoreCase(user))
                {
                    jB7.setBackground(Color.green);
                    jB8.setBackground(Color.green);
                    jB9.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "user won");
                    userWon++;
                    gameOver=false;
                    newGame();
                }
                if(jB1.getText().equalsIgnoreCase(user) && jB4.getText().equalsIgnoreCase(user) && jB7.getText().equalsIgnoreCase(user))
                {
                    jB1.setBackground(Color.green);
                    jB4.setBackground(Color.green);
                    jB7.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "user won");
                    userWon++;
                    gameOver=false;
                    newGame();
                }  
                if(jB2.getText().equalsIgnoreCase(user) && jB5.getText().equalsIgnoreCase(user) && jB8.getText().equalsIgnoreCase(user))
                {
                    jB2.setBackground(Color.green);
                    jB5.setBackground(Color.green);
                    jB8.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "user won");
                    userWon++;
                    gameOver=false;
                    newGame();
                }
                if(jB3.getText().equalsIgnoreCase(user) && jB6.getText().equalsIgnoreCase(user) && jB9.getText().equalsIgnoreCase(user))
                {
                    jB3.setBackground(Color.green);
                    jB6.setBackground(Color.green);
                    jB9.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "user won");
                    userWon++;
                    gameOver=false;
                    newGame();
                }
                if(jB1.getText().equalsIgnoreCase(user) && jB5.getText().equalsIgnoreCase(user) && jB9.getText().equalsIgnoreCase(user))
                {
                    jB1.setBackground(Color.green);
                    jB5.setBackground(Color.green);
                    jB9.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "user won");
                    userWon++;
                    gameOver=false;
                    newGame();
                } 
                if(jB3.getText().equalsIgnoreCase(user) && jB5.getText().equalsIgnoreCase(user) && jB7.getText().equalsIgnoreCase(user))
                {
                    jB3.setBackground(Color.green);
                    jB5.setBackground(Color.green);
                    jB7.setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "user won");
                    userWon++;
                    gameOver=false;
                    newGame();
                }
                
                
                if(jB1.getText().equalsIgnoreCase(pc) && jB2.getText().equalsIgnoreCase(pc) && jB3.getText().equalsIgnoreCase(pc))
                {
                    jB1.setBackground(Color.red);
                    jB2.setBackground(Color.red);
                    jB3.setBackground(Color.red);
                    pcWon++;
                    JOptionPane.showMessageDialog(null, "pc won");                 
                    gameOver=false;
                    newGame();
                }    
                if(jB4.getText().equalsIgnoreCase(pc) && jB5.getText().equalsIgnoreCase(pc) && jB6.getText().equalsIgnoreCase(pc))
                {
                    jB4.setBackground(Color.red);
                    jB5.setBackground(Color.red);
                    jB6.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "pc won");
                    pcWon++;
                    gameOver=false;
                    newGame();
                }   
                if(jB7.getText().equalsIgnoreCase(pc) && jB8.getText().equalsIgnoreCase(pc) && jB9.getText().equalsIgnoreCase(pc))
                {
                    jB7.setBackground(Color.red);
                    jB8.setBackground(Color.red);
                    jB9.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "pc won");
                    pcWon++;
                    gameOver=false;
                    newGame();
                }
                if(jB1.getText().equalsIgnoreCase(pc) && jB4.getText().equalsIgnoreCase(pc) && jB7.getText().equalsIgnoreCase(pc))
                {
                    jB1.setBackground(Color.red);
                    jB4.setBackground(Color.red);
                    jB7.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "pc won");
                    pcWon++;
                    gameOver=false;
                    newGame();
                }  
                if(jB2.getText().equalsIgnoreCase(pc) && jB5.getText().equalsIgnoreCase(pc) && jB8.getText().equalsIgnoreCase(pc))
                {
                    jB2.setBackground(Color.red);
                    jB5.setBackground(Color.red);
                    jB8.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "pc won");
                    pcWon++;
                    gameOver=false;
                    newGame();
                }
                if(jB3.getText().equalsIgnoreCase(pc) && jB6.getText().equalsIgnoreCase(pc) && jB9.getText().equalsIgnoreCase(pc))
                {
                    jB3.setBackground(Color.red);
                    jB6.setBackground(Color.red);
                    jB9.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "pc won");
                    pcWon++;
                    gameOver=false;
                    newGame();
                }
                if(jB1.getText().equalsIgnoreCase(pc) && jB5.getText().equalsIgnoreCase(pc) && jB9.getText().equalsIgnoreCase(pc))
                {
                    jB1.setBackground(Color.red);
                    jB5.setBackground(Color.red);
                    jB9.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "pc won");
                    pcWon++;
                    gameOver=false;
                    newGame();
                } 
                if(jB3.getText().equalsIgnoreCase(pc) && jB5.getText().equalsIgnoreCase(pc) && jB7.getText().equalsIgnoreCase(pc))
                {
                    jB3.setBackground(Color.red);
                    jB5.setBackground(Color.red);
                    jB7.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "pc won");
                    pcWon++;
                    gameOver=false;
                    newGame(); 
                }                  
                else
                {    
                    break;
                }
            }
         if(countTurn==9)
        {
            JOptionPane.showMessageDialog(null, "TIE!");
            newGame();
        }
        areaFrame.scoreBoard();
        
   
        

    }        
    
    public static void newGame()
    {
        jB1.setText("");
        jB2.setText("");
        jB3.setText("");
        jB4.setText("");
        jB5.setText("");
        jB6.setText("");
        jB7.setText("");
        jB8.setText("");
        jB9.setText("");
        jB1.setBackground(Color.LIGHT_GRAY);
        jB2.setBackground(Color.LIGHT_GRAY);
        jB3.setBackground(Color.LIGHT_GRAY);
        jB4.setBackground(Color.LIGHT_GRAY);
        jB5.setBackground(Color.LIGHT_GRAY);
        jB6.setBackground(Color.LIGHT_GRAY);
        jB7.setBackground(Color.LIGHT_GRAY);
        jB8.setBackground(Color.LIGHT_GRAY);
        jB9.setBackground(Color.LIGHT_GRAY);
        countTurn=0;
        
    }
    
    public static void buttonClicked(JButton button)
    {
         
        while(button.getText().equals(""))
        {
            if(countTurn%2==0)
            {
                button.setText("X");
                countTurn++;
            }   
        }


    }
    public static void pcTurn()
    {        
            if(countTurn%2==1 && countTurn<9)
            {
                countTurn++;
                while(true)
                {
                    int pcRandom = (int)(1+Math.random()*8);
                    
                    if(pcRandom==1 && jB1.getText().equals(""))
                    {
                        jB1.setText("O");
                        break;
                    }
                    if(pcRandom==2 && jB2.getText().equals(""))
                    {
                        jB2.setText("O");
                        break;
                    }
                    if(pcRandom==3 && jB3.getText().equals(""))
                    {
                        jB3.setText("O");
                        break;
                    }
                    if(pcRandom==4 && jB4.getText().equals(""))
                    {
                        jB4.setText("O");
                        break;
                    }
                    if(pcRandom==5 && jB5.getText().equals(""))
                    {
                        jB5.setText("O");
                        break;
                    }
                    if(pcRandom==6 && jB6.getText().equals(""))
                    {
                        jB6.setText("O");
                        break;
                    }
                    if(pcRandom==7 && jB7.getText().equals(""))
                    {
                        jB7.setText("O");
                        break;
                    }
                    if(pcRandom==8 && jB8.getText().equals(""))
                    {
                        jB8.setText("O");
                        break;
                    }
                    if(pcRandom==9 && jB9.getText().equals(""))
                    {
                        jB9.setText("O");
                        break;
                    }                    
                }
            }
        
    }        
    
    public areaFrame() {
        initComponents();
        scoreBoard();
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB2 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jB2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        jB4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PLAYER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("       SCOREBOARD");

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(51, 255, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jB7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jB8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2)))
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
            buttonClicked(jB2);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
            buttonClicked(jB9);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
            buttonClicked(jB5);
            pcTurn();        
            winnerCheck();              
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
            buttonClicked(jB1);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
            buttonClicked(jB3);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
            buttonClicked(jB4);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
            buttonClicked(jB6);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
            buttonClicked(jB7);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
            buttonClicked(jB8);
            pcTurn();
            winnerCheck();
    }//GEN-LAST:event_jB8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    jB1.setText("");
        jB2.setText("");
        jB3.setText("");
        jB4.setText("");
        jB5.setText("");
        jB6.setText("");
        jB7.setText("");
        jB8.setText("");
        jB9.setText("");
        jB1.setBackground(Color.LIGHT_GRAY);
        jB2.setBackground(Color.LIGHT_GRAY);
        jB3.setBackground(Color.LIGHT_GRAY);
        jB4.setBackground(Color.LIGHT_GRAY);
        jB5.setBackground(Color.LIGHT_GRAY);
        jB6.setBackground(Color.LIGHT_GRAY);
        jB7.setBackground(Color.LIGHT_GRAY);
        jB8.setBackground(Color.LIGHT_GRAY);
        jB9.setBackground(Color.LIGHT_GRAY);
        countTurn=0;
        jLabel4.setText("0");
        jLabel5.setText("0");
        pcWon=0;
        userWon=0;
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(areaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(areaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(areaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(areaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new areaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JButton jB1;
    static javax.swing.JButton jB2;
    static javax.swing.JButton jB3;
    static javax.swing.JButton jB4;
    static javax.swing.JButton jB5;
    static javax.swing.JButton jB6;
    static javax.swing.JButton jB7;
    static javax.swing.JButton jB8;
    static javax.swing.JButton jB9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    static javax.swing.JLabel jLabel4;
    static javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
