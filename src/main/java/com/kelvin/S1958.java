package com.kelvin;

public class S1958 {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        for (int k = 0; k < 8; ++k) {
            if (check(board, rMove, cMove, color, dx[k], dy[k])) {
                return true;
            }
        }
        return false;
    }

    public boolean check(char[][] board, int rMove, int cMove, char color, int dx, int dy) {
        int x = rMove + dx;
        int y = cMove + dy;
        int step = 1;
        while (x >= 0 && x < 8 && y >= 0 && y < 8) {
            if (step == 1) {
                if (board[x][y] == '.' || board[x][y] == color) {
                    return false;
                }
            } else {
                if (board[x][y] == '.') {
                    return false;
                }
                if (board[x][y] == color) {
                    return true;
                }
            }
            ++step;
            x += dx;
            y += dy;
        }
        return false;
    }

    public static void main(String[] args) {
        S1958 s1958 = new S1958();
        char[][] board = {{'.','.','.','B','.','.','.','.'},{'.','.','.','W','.','.','.','.'},{'.','.','.','W','.','.','.','.'},{'.','.','.','W','.','.','.','.'},{'W','B','B','.','W','W','W','B'},{'.','.','.','B','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','W','.','.','.','.'}};
        System.out.println(s1958.checkMove(board,4,3,'B'));
        char[][] board2 = {{'.','.','.','.','.','.','.','.'},{'.','B','.','.','W','.','.','.'},{'.','.','W','.','.','.','.','.'},{'.','.','.','W','B','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','B','W','.','.'},{'.','.','.','.','.','.','W','.'},{'.','.','.','.','.','.','.','B'}};
        System.out.println(s1958.checkMove(board2,4,4,'W'));
    }
}
