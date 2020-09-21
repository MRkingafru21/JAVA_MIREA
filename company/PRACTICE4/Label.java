package com.company.PRACTICE4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label extends JFrame {
    int ACMilanScore = 0, RealMadridScore = 0;

    JButton ACMilan = new JButton();
    ImageIcon ACMilanIcon =
            new ImageIcon((new ImageIcon("image/ACM.png").getImage()
                    .getScaledInstance(250, 250, Image.SCALE_SMOOTH)));

    JButton RealMadrid = new JButton();
    ImageIcon RealMadridIcon =
            new ImageIcon(new ImageIcon("image/RM.png").getImage()
                    .getScaledInstance(250, 250, Image.SCALE_SMOOTH));

    JLabel winner = new JLabel("Winner: DRAW");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScore = new JLabel("N/A");
    JLabel ACMilanTeam = new JLabel("AC Milan");
    JLabel RealMadridTeam = new JLabel("Real Madrid");
    Font fnt = new Font("Ink Free", Font.ITALIC, 40);

    public void printWinner() {
        if (ACMilanScore < RealMadridScore) {
            winner.setText("Winner: Real Madrid");
        } else if (ACMilanScore > RealMadridScore) {
            winner.setText("Winner: AC Milan");
        } else {
            winner.setText("DRAW");
        }
    }//условие выведения победителя

    public void JLabelSettings(JLabel jlabel) {
        jlabel.setHorizontalAlignment(JLabel.CENTER);
        jlabel.setForeground(Color.PINK);
        jlabel.setFont(fnt);
    } // Метод для обработки полей winner,result,lastScore

    public void teamButton(JButton team, String teamName, Color color) {
        team.setText(teamName);
        team.setHorizontalTextPosition(JButton.CENTER);
        team.setForeground(color);
        team.setBackground(color.white);
        team.setFont(fnt);
    }// Метод обработки кнопок команд

    Label() {
        // Параметры окна
        super("ЛЕГЕНДАРНАЯ ЗАРУБА В ФУТБИК");
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(1280, 720));

        ACMilan.setIcon(ACMilanIcon);
        ACMilan.setFocusable(false);
        ACMilan.setBorderPainted(false);
        RealMadrid.setIcon(RealMadridIcon);
        RealMadrid.setFocusable(false);
        RealMadrid.setBorderPainted(false);

        add(ACMilan, BorderLayout.NORTH);
        ActionListener ACMilanListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ACMilanScore++;
                result.setText("Result: " + RealMadridScore + " X " + ACMilanScore);
                printWinner();
                lastScore.setText("Last score: AC Milan");
            }
        };
        teamButton(ACMilan, "AC Milan", Color.red);
        ACMilan.addActionListener(ACMilanListener);
        ACMilan.setVerticalTextPosition(JButton.TOP);

        add(RealMadrid, BorderLayout.SOUTH);
        ActionListener RealMadridListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RealMadridScore++;
                result.setText("Result: " + RealMadridScore + " X " + ACMilanScore);
                printWinner();
                lastScore.setText("Last score: Real Madrid");
            }
        };
        teamButton(RealMadrid, "Real Madrid", Color.yellow);
        RealMadrid.addActionListener(RealMadridListener);
        RealMadrid.setVerticalTextPosition(JButton.BOTTOM);
        
        add(winner, BorderLayout.WEST);
        JLabelSettings(winner);

        add(result, BorderLayout.CENTER);
        JLabelSettings(result);

        add(lastScore, BorderLayout.EAST);
        JLabelSettings(lastScore);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Label();
    }
}
