package com.fealo.leetjava;

import sun.jvm.hotspot.memory.LinearAllocBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class N_Queen {

    private List<Integer> chessBoard;
    private Integer chessInitial = -1;
    private String initialValue = ".";
    private int QUEEN;

    public List<List<String>> solveNQueens(int n) {
        QUEEN = n;

        List<List<String>> arrayListList = new ArrayList<>(0);

        if (n <= 0 || n > 1 && n < 4) {
            return arrayListList;
        }

        chessBoard = new ArrayList<>(Collections.nCopies(n, chessInitial));

        int i = 0, j = 0;
        while (i < QUEEN) {
            while (j < QUEEN) {
                if (valid(i, j)) {
                    chessBoard.set(i, j);
                    j = 0;
                    break;
                } else {
                    ++j;
                }
            }

            if (chessBoard.get(i) == chessInitial) {
                if (i == 0) {
                    break;
                } else {
                    --i;
                    j = chessBoard.get(i) + 1;
                    chessBoard.set(i, chessInitial);
                    continue;
                }
            }

            if (i == QUEEN - 1) {
                List<String> list = new ArrayList<>(Collections.nCopies(n, ""));
                for (int x = 0; x < QUEEN; ++x) {
                    char[] chars = new char[QUEEN];
                    Arrays.fill(chars, '.');
                    chars[chessBoard.get(x)] = 'Q';

                    String s = new String(chars);
                    list.set(x, s);
                }
                arrayListList.add(list);

                j = chessBoard.get(i) + 1;
                chessBoard.set(i, chessInitial);
                continue;
            }

            ++i;
        }

        return arrayListList;
    }

    private boolean valid(int row, int col) {

        for (int i = 0; i < row; i++) {
            if (chessBoard.get(i) == col || Math.abs(row - i) == Math.abs(col - chessBoard.get(i)) ) {
                return false;
            }
        }

        return true;
    }

}
