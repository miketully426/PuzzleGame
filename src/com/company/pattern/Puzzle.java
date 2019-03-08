//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company.pattern;

public class Puzzle {
    static String[] puzzleSequences = new String[]{"BBBBBO", "ROYGBPROYGBPROYGBP", "BBBBBBBBBBBBBBB", "BOBOBOBO", "BOBOBOBOP", "PBOBOBOBOP", "OBOBOBOP", "GBOGBOGBOGBOPBOPBOPBOPBO", "RBOBOBOGPYPYPYR", "YRBOBOBOBOGYRBOBOBOBOGYRBOBOBOBOGYRBOBOBOBOG"};
    static Puzzle[] puzzles;
    String goalSequence;
    StringBuffer solutionSequence;
    Throwable error = null;
    boolean hadError = false;

    static {
        puzzles = new Puzzle[puzzleSequences.length];

        for(int i = 0; i < puzzleSequences.length; ++i) {
            puzzles[i] = new Puzzle(puzzleSequences[i]);
        }

    }

    private Puzzle(String goal) {
        this.goalSequence = goal;
        this.solutionSequence = new StringBuffer();
    }

    public void setError(Throwable t) {
        this.hadError = true;
        this.error = t;
    }

    public boolean solved() {
        return this.solutionSequence.toString().equals(this.goalSequence);
    }

    public String getSolutionSequence() {
        return this.solutionSequence.toString();
    }

    public boolean hadError() {
        return this.hadError;
    }

    public Throwable getError() {
        return this.error;
    }

    public void red() {
        this.solutionSequence.append("R");
    }

    public void orange() {
        this.solutionSequence.append("O");
    }

    public void yellow() {
        this.solutionSequence.append("Y");
    }

    public void green() {
        this.solutionSequence.append("G");
    }

    public void blue() {
        this.solutionSequence.append("B");
    }

    public void purple() {
        this.solutionSequence.append("P");
    }
}
