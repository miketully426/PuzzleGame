//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company.pattern;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public abstract class PatternGame extends JFrame {
    JPanel rootPanel = new JPanel();
    JLabel gameResultLabel;
    Font titleFont = new Font("Helvetica", 1, 48);
    Font winloseFont = new Font("Helvetica", 0, 30);
    Font navFont = new Font("Helvetica", 0, 18);
    Font gameResultFont = new Font("Helvetica", 0, 24);
    Color DARK_GREEN = new Color(50, 150, 50);
    Color DARK_RED = new Color(200, 50, 50);
    List<Puzzle> puzzles = new ArrayList();

    public PatternGame() {
        this.rootPanel.setLayout(new BorderLayout());
        this.rootPanel.setBackground(Color.white);
        this.getContentPane().add(this.rootPanel, "Center");
        JLabel label = new JLabel("Pattern Matching");
        label.setFont(this.titleFont);
        label.setHorizontalAlignment(0);
        this.rootPanel.add(label, "North");
        this.gameResultLabel = new JLabel("Write for-loop code to solve each puzzle.");
        this.gameResultLabel.setFont(this.gameResultFont);
        this.gameResultLabel.setHorizontalAlignment(0);
        this.rootPanel.add(this.gameResultLabel, "South");
        this.runGame();
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(Color.LIGHT_GRAY);
        String[] names = new String[Puzzle.puzzles.length];

        for(int i = 0; i < Puzzle.puzzles.length; ++i) {
            names[i] = "Puzzle " + i;
            JPanel gameboard = new JPanel();
            gameboard.setBackground(Color.WHITE);
            gameboard.setLayout(new GridLayout(3, 1));
            GameArea puzzleGoal = new GameArea(names[i] + " Goal");
            puzzleGoal.setSequence(Puzzle.puzzles[i].goalSequence);
            gameboard.add(puzzleGoal);
            GameArea puzzleAnswer = new GameArea(names[i] + " Your Solution");
            puzzleAnswer.setSequence(Puzzle.puzzles[i].getSolutionSequence());
            gameboard.add(puzzleAnswer);
            JLabel winlose = new JLabel(Puzzle.puzzles[i].hadError ? "Error " + Puzzle.puzzles[i].getError().toString() : (Puzzle.puzzles[i].solved() ? " Matched!" : " Unfinished"));
            winlose.setFont(this.winloseFont);
            winlose.setHorizontalAlignment(0);
            winlose.setForeground(Puzzle.puzzles[i].solved() ? this.DARK_GREEN : this.DARK_RED);
            gameboard.add(winlose);
            tabbedPane.addTab(names[i], (Icon)null, gameboard, (String)null);
        }

        this.rootPanel.add(tabbedPane, "Center");
        this.setTitle("Pattern Matching");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    private void runGame() {
        try {
            this.puzzle0(Puzzle.puzzles[0]);
        } catch (Throwable var11) {
            Puzzle.puzzles[0].setError(var11);
        }

        try {
            this.puzzle1(Puzzle.puzzles[1]);
        } catch (Throwable var10) {
            Puzzle.puzzles[1].setError(var10);
        }

        try {
            this.puzzle2(Puzzle.puzzles[2]);
        } catch (Throwable var9) {
            Puzzle.puzzles[2].setError(var9);
        }

        try {
            this.puzzle3(Puzzle.puzzles[3]);
        } catch (Throwable var8) {
            Puzzle.puzzles[3].setError(var8);
        }

        try {
            this.puzzle4(Puzzle.puzzles[4]);
        } catch (Throwable var7) {
            Puzzle.puzzles[4].setError(var7);
        }

        try {
            this.puzzle5(Puzzle.puzzles[5]);
        } catch (Throwable var6) {
            Puzzle.puzzles[5].setError(var6);
        }

        try {
            this.puzzle6(Puzzle.puzzles[6]);
        } catch (Throwable var5) {
            Puzzle.puzzles[6].setError(var5);
        }

        try {
            this.puzzle7(Puzzle.puzzles[7]);
        } catch (Throwable var4) {
            Puzzle.puzzles[7].setError(var4);
        }

        try {
            this.puzzle8(Puzzle.puzzles[8]);
        } catch (Throwable var3) {
            Puzzle.puzzles[8].setError(var3);
        }

        try {
            this.puzzle9(Puzzle.puzzles[9]);
        } catch (Throwable var2) {
            Puzzle.puzzles[9].setError(var2);
        }

    }

    public abstract void puzzle0(Puzzle var1);

    public abstract void puzzle1(Puzzle var1);

    public abstract void puzzle2(Puzzle var1);

    public abstract void puzzle3(Puzzle var1);

    public abstract void puzzle4(Puzzle var1);

    public abstract void puzzle5(Puzzle var1);

    public abstract void puzzle6(Puzzle var1);

    public abstract void puzzle7(Puzzle var1);

    public abstract void puzzle8(Puzzle var1);

    public abstract void puzzle9(Puzzle var1);
}
