/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundone;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author zjx5013
 */
public class MenuView extends JFrame {
    MenuController parentController;


    /**
     * Creates new form MenuView
     */
    public MenuView(MenuController parentController) {
        this.parentController = parentController;
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton1 = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        instructionsLabel = new javax.swing.JLabel();
        i1Label = new javax.swing.JLabel();
        i2Label = new javax.swing.JLabel();
        i3Label = new javax.swing.JLabel();
        leaderboardLabel = new javax.swing.JLabel();
        lbName1Label = new javax.swing.JLabel();
        lbPts1Label = new javax.swing.JLabel();
        lbScore1Label = new javax.swing.JLabel();
        lbName2Label = new javax.swing.JLabel();
        lbPts2Label = new javax.swing.JLabel();
        lbScore2Label = new javax.swing.JLabel();
        lbName3Label = new javax.swing.JLabel();
        lbPts3Label = new javax.swing.JLabel();
        lbScore3Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startButton1.setText("Start Game");
        startButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButton1ActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setText("Munchers");

        nameLabel1.setText("Please enter your nickname here:");

        instructionsLabel.setText("Instructions:");

        i1Label.setText("The object of the game is to, out of all of the numbers on screen, select the prime numbers.");

        i2Label.setText("Earn points by selecting prime numbers, lose points for selecting non-prime numbers.");

        i3Label.setText("The game ends when all of the prime numbers have been selected.");

        leaderboardLabel.setText("Leaderboard");

        lbName1Label.setText("AAA");

        lbPts1Label.setText("pts");

        lbScore1Label.setText("0");

        lbName2Label.setText("AAA");

        lbPts2Label.setText("pts");

        lbScore2Label.setText("0");

        lbName3Label.setText("AAA");

        lbPts3Label.setText("pts");

        lbScore3Label.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(i3Label)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(i1Label)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(nameLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName1Label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbName2Label)
                                    .addComponent(lbName3Label))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbScore3Label)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbPts3Label))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbScore2Label)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbPts2Label)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbScore1Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbPts1Label)))
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(titleLabel)
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(startButton1)
                                    .addComponent(i2Label))
                                .addGap(27, 27, 27))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(instructionsLabel)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(leaderboardLabel)
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(i1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(i2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(i3Label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton1))
                .addGap(18, 18, 18)
                .addComponent(leaderboardLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbScore1Label)
                    .addComponent(lbPts1Label)
                    .addComponent(lbName1Label))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbScore2Label)
                    .addComponent(lbPts2Label)
                    .addComponent(lbName2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName3Label)
                    .addComponent(lbScore3Label)
                    .addComponent(lbPts3Label))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButton1ActionPerformed
        parentController.startGame();
    }//GEN-LAST:event_startButton1ActionPerformed
    public String getUsername(){
    String username=this.nameField.getText();
    return username;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel i1Label;
    private javax.swing.JLabel i2Label;
    private javax.swing.JLabel i3Label;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JLabel lbName1Label;
    private javax.swing.JLabel lbName2Label;
    private javax.swing.JLabel lbName3Label;
    private javax.swing.JLabel lbPts1Label;
    private javax.swing.JLabel lbPts2Label;
    private javax.swing.JLabel lbPts3Label;
    private javax.swing.JLabel lbScore1Label;
    private javax.swing.JLabel lbScore2Label;
    private javax.swing.JLabel lbScore3Label;
    private javax.swing.JLabel leaderboardLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JButton startButton1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public void populateLeaderboard(Score[] highScores) {
        lbName1Label.setText(highScores[0].getName());
        lbName2Label.setText(highScores[1].getName());
        lbName3Label.setText(highScores[2].getName());
        lbScore1Label.setText(highScores[0].getPoints());
        lbScore2Label.setText(highScores[1].getPoints());
        lbScore3Label.setText(highScores[2].getPoints());
    }
    
    public JTextField getNameField()
    {
        return this.nameField;
    }
    
    public void setNameField(String s)
    {
        this.nameField.setText(s);
    }
}
