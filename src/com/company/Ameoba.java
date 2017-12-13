package com.company;


public class Ameoba {

    char [][] board = new char[3][3];

    public Ameoba() {
        init();
    }

    public void play(){
        //TODO
    }

    public void drawBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length ; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void init() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length ; j++) {
                board[i][j] = '_';
            }
        }
    }

    public boolean isCharacterWinner(char symbol) {
        return checkRow(symbol) || checkColumn(symbol) || checkDiagonalLeftToRight(symbol) || checkDiagonalRigthToLeft(symbol);
    }

    private boolean checkRow(char symbol){


        for (int i = 0; i < board.length ; i++) {

            boolean isSameCharacter = false;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    isSameCharacter = true;
                }
            }
        }
        
       return ;
    }

    private boolean checkColumn(char symbol) {
        
        
        
        return false;
    }

    private boolean checkDiagonalLeftToRight(char symbol) {
        return false;
    }

    private boolean checkDiagonalRigthToLeft(char symbol) {
        return false;
    }

}
